package predictions;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
@HandlerChain(file = "../../../WEB-INF/serviceHandler.xml")
public class PredictionsSOAP {
    private static final int maxLength = 16;
    private static final Predictions predictions = new Predictions();
    private ServletContext sCtx;
    @Resource
    private WebServiceContext wsCtx;

    @WebMethod
    public String create(String who , String what) throws VerbosityException {
        int count = this.wordCount(what);
        if (count > PredictionsSOAP.maxLength) throw new VerbosityException(count + " is too verbose!" , "Max words: "
            + PredictionsSOAP.maxLength);
        this.init();
        Prediction p = new Prediction();
        p.setWho(who);
        p.setWhat(what);
        int id = PredictionsSOAP.predictions.addPrediction(p);
        String msg = "Prediction " + id + " created.";
        return msg;
    }

    @WebMethod
    public String delete(int id) {
        this.init();
        String msg = "Prediction " + id + " not found.";
        Prediction p = PredictionsSOAP.predictions.getPrediction(id);
        if (p != null) {
            PredictionsSOAP.predictions.getMap().remove(id);
            msg = "Prediction " + id + " removed.";
        }
        return msg;
    }

    @WebMethod
    public String edit(int id , String who , String what) throws VerbosityException {
        int count = this.wordCount(what);
        if (count > PredictionsSOAP.maxLength) throw new VerbosityException(count + " is too verbose!" , "Max words: "
            + PredictionsSOAP.maxLength);
        this.init();
        String msg = "Prediction " + id + " not found.";
        Prediction p = PredictionsSOAP.predictions.getPrediction(id);
        if (p != null) {
            if (who != null) p.setWho(who);
            if (what != null) p.setWhat(what);
            msg = "Prediction " + id + " updated.";
        }
        return msg;
    }

    @WebMethod
    public List<Prediction> getAll() {
        this.init();
        return PredictionsSOAP.predictions.getPredictions();
    }

    @WebMethod
    public Prediction getOne(int id) {
        this.init();
        return PredictionsSOAP.predictions.getPrediction(id);
    }

    private void init() {
        if (this.wsCtx == null) throw new RuntimeException("DI failed on wsCtx!");
        if (this.sCtx == null) { // ServletContext not yet set?
            MessageContext mCtx = this.wsCtx.getMessageContext();
            this.sCtx = (ServletContext) mCtx.get(MessageContext.SERVLET_CONTEXT);
            PredictionsSOAP.predictions.setServletContext(this.sCtx);
        }
    }

    private int wordCount(String words) {
        if (words == null) return -1;
        return words.trim().split("\\s+").length;
    }
}