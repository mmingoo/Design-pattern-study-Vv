package design_pattern.behavioral_Patterns.templete.after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("/Users/admin/Desktop/공부/디자인 패턴/design_pattern/src/main/java/design_pattern/behavioral_Patterns/templete/after/number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
