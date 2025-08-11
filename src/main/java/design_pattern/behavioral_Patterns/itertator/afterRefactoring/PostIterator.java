package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import java.util.ArrayList;
import java.util.List;

// 3. ConcreteIterator - 기본 순회
class PostIterator implements Iterator<Post> {
    private List<Post> posts;
    private int currentIndex = 0;
    
    public PostIterator(List<Post> posts) {
        this.posts = new ArrayList<>(posts); // 복사본 생성
    }
    
    @Override
    public Post getNext() {
        if (hasNext()) {
            return posts.get(currentIndex++);
        }
        return null;
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < posts.size();
    }
}