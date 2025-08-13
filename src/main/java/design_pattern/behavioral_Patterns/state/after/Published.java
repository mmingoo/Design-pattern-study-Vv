package design_pattern.behavioral_Patterns.state.after;


public class Published implements State{
    OnlineCourse onlineCourse;


    public Published(OnlineCourse onlineCourse){
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review ,Student student){
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.addStudent(student);

    }

}
