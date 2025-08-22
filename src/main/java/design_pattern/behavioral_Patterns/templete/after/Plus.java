package design_pattern.behavioral_Patterns.templete.after;

public class Plus extends FileProcessor {
    public Plus(String path) {
        super(path);
    }

    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
