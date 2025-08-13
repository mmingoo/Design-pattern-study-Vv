package design_pattern.behavioral_Patterns.state.after;

public interface State {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
