package design_pattern.creational_patterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class GithubIssue implements Cloneable{
    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    @Override
    public GithubIssue clone() throws CloneNotSupportedException {
        // 얕은 복사
//        return (GithubIssue)super.clone();

        // 깊은 복사
        GithubIssue githubIssue_clone = new GithubIssue(this.repository);
        githubIssue_clone.setId(this.id);
        githubIssue_clone.setTitle(this.title);

        return githubIssue_clone;

    }


    // 객체 비교를 위한 equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    // 객체 비교를 위한 hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
