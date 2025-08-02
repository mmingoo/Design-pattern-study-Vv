package design_pattern.behavioral_Patterns.chain_of_reponsibilities.after;

import design_pattern.behavioral_Patterns.chain_of_reponsibilities.before.Request;

public class PrintRequestHandler extends RequestHandler {
    PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void setNextHandler(Request request) {
        System.out.println("출력 과정중입니다.");
        super.setNextHandler(request);
    }
}
