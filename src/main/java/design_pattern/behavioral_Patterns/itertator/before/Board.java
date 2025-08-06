package design_pattern.behavioral_Patterns.itertator.before;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
