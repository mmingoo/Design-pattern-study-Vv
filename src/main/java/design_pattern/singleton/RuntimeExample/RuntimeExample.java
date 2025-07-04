package design_pattern.singleton.RuntimeExample;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // 메모리 용량
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
