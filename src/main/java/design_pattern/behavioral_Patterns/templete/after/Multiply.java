package design_pattern.behavioral_Patterns.templete.after;

public class Multiply extends FileProcessor {
    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        if (result == 0) {
            return number;  // 첫 번째 숫자는 그대로 반환
        }
        return result * number;  // 두 번째부터는 곱셈
    }
}