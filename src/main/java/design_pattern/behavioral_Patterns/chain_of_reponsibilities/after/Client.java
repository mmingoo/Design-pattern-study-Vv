package design_pattern.behavioral_Patterns.chain_of_reponsibilities.after;


import design_pattern.behavioral_Patterns.chain_of_reponsibilities.before.Request;

public class Client {

    RequestHandler requestHandler;
    Client(RequestHandler requestHandler){
        this.requestHandler = requestHandler;
    }

    public void doWork(){
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.setNextHandler(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
