package design_pattern.behavioral_Patterns.templeteMethod.after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
