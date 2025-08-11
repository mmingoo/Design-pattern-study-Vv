package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 4. ConcreteIterator - 최신순 순회
class RecentPostIterator implements Iterator<Post> {
    private List<Post> posts;
    private int currentIndex = 0;
    
    public RecentPostIterator(List<Post> posts) {
        this.posts = new ArrayList<>(posts); // 복사본 생성
        // 최신순으로 정렬 (날짜 내림차순)
        Collections.sort(this.posts,
            (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
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