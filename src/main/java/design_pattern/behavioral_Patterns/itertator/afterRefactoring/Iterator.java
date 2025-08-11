package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

// 1. Iterator 인터페이스
interface Iterator<T> {
    T getNext();
    boolean hasNext();
}
