package design_pattern.behavioral_Patterns.chain_of_reponsibilities.after;

import design_pattern.behavioral_Patterns.chain_of_reponsibilities.before.Request;

public class AuthRequestHandler extends RequestHandler{

    AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void setNextHandler(Request request){
        System.out.println("인증 과정중입니다");
        super.setNextHandler(request);
    }
}
