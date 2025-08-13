package design_pattern.behavioral_Patterns.state.after;

import design_pattern.behavioral_Patterns.observer.before.ChatServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OnlineCourse {

    State state = new Draft(this);

    List<String> reviews = new ArrayList<>();
    List<Student> students = new ArrayList<>();



    public OnlineCourse(List<String> reviews, List<Student> students) {
        this.reviews = reviews;
        this.students = students;
    }

    public void addReview(String review, Student student){
        this.state.addReview(review, student);
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public State getState(){
        return this.state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }
}
