package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import javax.management.monitor.StringMonitor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");
        
        System.out.println("=== 기본 순회 (등록순) ===");
        Iterator<Post> iterator = board.createIterator();
        while (iterator.hasNext()) {
            Post post = iterator.getNext();
            System.out.println(post.getTitle());
        }
        
        System.out.println("\n=== 최신순 순회 ===");
        Iterator<Post> recentIterator = board.createRecentIterator();
        while (recentIterator.hasNext()) {
            Post post = recentIterator.getNext();
            System.out.println(post.getTitle());
        }

    }
}