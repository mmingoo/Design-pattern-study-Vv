package design_pattern.behavioral_Patterns.itertator.after;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    Iterator<Post> posts;

    RecentPostIterator(List<Post> posts){
        Collections.sort(posts, (p1,p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.posts = posts.iterator();
    }
    @Override
    public boolean hasNext() {
        return this.posts.hasNext();
    }

    @Override
    public Post next() {
        return this.posts.next();
    }
}
