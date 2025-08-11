package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import java.util.ArrayList;
import java.util.List;

// 5. ConcreteA
//
// ggregate
class Board implements Aggregate<Post> {
    private List<Post> posts = new ArrayList<>();
    
    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
    
    public List<Post> getPosts() {
        return new ArrayList<>(posts); // 복사본 반환으로 캡슐화
    }
    
    @Override
    public Iterator<Post> createIterator() {
        return new PostIterator(this.posts); // 기본 이터레이터
    }
    
    // 추가: 최신순 이터레이터 생성 메서드
    public Iterator<Post> createRecentIterator() {
        return new RecentPostIterator(this.posts);
    }
}