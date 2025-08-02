package design_pattern.behavioral_Patterns.chain_of_reponsibilities.after;

import design_pattern.behavioral_Patterns.chain_of_reponsibilities.before.Request;

public abstract class RequestHandler {

    RequestHandler nextHandler;

    RequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void setNextHandler(Request request){
        if(this.nextHandler != null){
            nextHandler.setNextHandler(request);
        }
    }


}
