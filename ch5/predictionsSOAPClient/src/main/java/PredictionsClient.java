import java.util.List;

import clientSOAP.ClientHandlerResolver;
import clientSOAP.Prediction;
import clientSOAP.PredictionsSOAP;
import clientSOAP.PredictionsSOAPService;
import clientSOAP.VerbosityException_Exception;

public class PredictionsClient {
    public static void main(String[] args) throws VerbosityException_Exception {
        if (args.length < 2) {
            System.err.println("Usage: PredictionsClient <name> <key>");
            return;
        }
        new PredictionsClient().runTests(args[0] , args[1]);
    }

    private void deleteTest(PredictionsSOAP port , int id) {
        this.msg("deleteTest");
        String res = port.delete(id);
        System.out.println(res);
    }

    private void getAllTest(PredictionsSOAP port) {
        this.msg("getAll");
        List<Prediction> preds = port.getAll();
        for (Prediction pred : preds)
            System.out.println(String.format("%2d: " , pred.getId()) + pred.getWho() + " predicts: " + pred.getWhat());
    }

    private void getOneTest(PredictionsSOAP port) {
        this.msg("getOne (31)");
        System.out.println(port.getOne(31).getWhat());
    }

    private void getTests(PredictionsSOAP port) {
        this.getAllTest(port);
        this.getOneTest(port);
    }

    private void msg(String s) {
        System.out.println("\n" + s + "\n");
    }

    private void postTest(PredictionsSOAP port) throws VerbosityException_Exception {
        this.msg("postTest");
        String who = "Freddy";
        String what = "foo foo foo foo foo foo foo foo foo foo foo foo foo foo foo foo.";
        String res = port.create(who , what);
        System.out.println(res);
    }

    private void putTest(PredictionsSOAP port) throws VerbosityException_Exception {
        this.msg("putTest -- here's the record to be edited");
        this.getOneTest(port);
        this.msg("putTest results");
        String who = "FooBarBaz";
        String what = null; // shouldn't change
        int id = 0;
        String res = port.edit(id , who , what);
        System.out.println(res);
        System.out.println("Confirming:");
        Prediction p = port.getOne(31);
        System.out.println(p.getWho());
        System.out.println(p.getWhat());
    }

    private void runTests(String name , String key) throws VerbosityException_Exception {
        PredictionsSOAPService service = new PredictionsSOAPService();
        service.setHandlerResolver(new ClientHandlerResolver(name , key));
        PredictionsSOAP port = service.getPredictionsSOAPPort();

        this.getTests(port);
        this.deleteTest(port , 33); // delete the just POSTed prediction
        this.getAllTest(port); // confirm the POST
        this.putTest(port);
        this.getAllTest(port);
        this.postTest(port);
        this.getAllTest(port);
    }
}
