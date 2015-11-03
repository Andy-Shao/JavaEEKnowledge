package clientSOAP;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class IdLogicalHandler implements LogicalHandler<LogicalMessageContext>{

    @SuppressWarnings({ "rawtypes" , "unchecked" })
    @Override
    public boolean handleMessage(LogicalMessageContext context) {
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if(outbound){ //request?
            LogicalMessage msg = context.getMessage();
            try {
                JAXBContext jaxbCtx = JAXBContext.newInstance("clientSOAP");
                Object payload = msg.getPayload(jaxbCtx);
                if(payload instanceof JAXBElement){
                    Object value = ((JAXBElement)payload).getValue();
                    int id = 0;
                    boolean getOne, edit, delete;
                    getOne = edit = delete = false;
                    if(value.toString().contains("GetOne")){
                        id = ((GetOne) value).getArg0();
                        getOne = true;
                    } else if(value.toString().contains("Edit")){
                        id = ((Edit) value).getArg0();
                        edit = true;
                    } else if(value.toString().contains("Delete")){
                        id = ((Delete) value).getArg0();
                        delete = true;
                    } else return true;//GetAll or Create
                    
                    //id id more than 0, nothing to do
                    if(id > 0) return true;
                    if(getOne || edit || delete){
                        //if id equals 0 then can't fix it
                        if(id == 0) throw new RuntimeException("ID cannot be zero!");
                        int newId = Math.abs(id);
                        //update the new id
                        if(getOne) ((GetOne) value).setArg0(newId);
                        else if(edit) ((Edit) value).setArg0(newId);
                        else if(delete) ((Delete) value).setArg0(newId);
                        ((JAXBElement) payload).setValue(value);
                        msg.setPayload(payload, jaxbCtx);
                    }
                }
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

}
