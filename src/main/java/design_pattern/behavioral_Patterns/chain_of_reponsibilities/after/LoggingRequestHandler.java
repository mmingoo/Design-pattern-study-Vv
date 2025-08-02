package design_pattern.behavioral_Patterns.chain_of_reponsibilities.after;

import design_pattern.behavioral_Patterns.chain_of_reponsibilities.before.Request;

public class LoggingRequestHandler extends RequestHandler {

    LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void setNextHandler(Request request) {
        System.out.println("로깅");
        super.setNextHandler(request);
    }
}