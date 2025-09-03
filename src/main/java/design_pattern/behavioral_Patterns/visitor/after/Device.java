package design_pattern.behavioral_Patterns.visitor.after;

public interface Device {
    // 얘네들이 구체적인 비지터들(매개변수로 객체들을 지정함)
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
