package design_pattern.behavioral_Patterns.chain_of_reponsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
