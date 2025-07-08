package design_pattern.creational_patterns.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser("mingoo");
        githubRepository.setName("live_coding");

        GithubIssue issue1 = new GithubIssue(githubRepository);
        issue1.setId(1);
        issue1.setTitle("first commit");

        GithubIssue issue2 = issue1.clone();
        issue2.setTitle("Second commit");

        System.out.println(issue2 == issue1);  // 수정: issue1과 비교
        System.out.println(issue2.getTitle().equals(issue1.getTitle()));
    }
}