package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import java.time.LocalDateTime;

// 6. Post 클래스 (기존과 동일)
class Post {
    private String title;
    private LocalDateTime createdDateTime;
    
    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }
    
    public String getTitle() {
        return title;
    }
    
    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}
