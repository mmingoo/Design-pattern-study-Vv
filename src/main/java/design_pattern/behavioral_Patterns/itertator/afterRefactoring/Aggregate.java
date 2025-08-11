package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

// 2. Aggregate 인터페이스
interface Aggregate<T> {
    Iterator<T> createIterator();
}