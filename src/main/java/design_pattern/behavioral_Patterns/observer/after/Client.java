package design_pattern.behavioral_Patterns.observer.after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        // 발신자는 user1
        //오징어게임을 구독한 사람들에게 메세지 전송
        chatServer.sendMessage(user1, "오징어게임", "아.. 이름이 기억났어.. 일남이야.. 오일남");

        //발신자는 user2
        //디자인 패턴을 구독한 사람들에게 메세지 전송
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");


        chatServer.unregister("디자인패턴", user2);

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 장, 단점 보는 중");
    }
}
