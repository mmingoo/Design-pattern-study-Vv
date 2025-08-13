package design_pattern.behavioral_Patterns.state.after;

import design_pattern.behavioral_Patterns.state.after.OnlineCourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    private Set<OnlineCourse> onlineCourses = new HashSet<>();


    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return this.onlineCourses.contains(onlineCourse);
    }

    public void addPrivate(OnlineCourse onlineCourse) {
        this.onlineCourses.add(onlineCourse);
    }
}
