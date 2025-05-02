package arbitraryarithmetic;

public interface Arithmetic<T> {
    T add(T other);
    T subtract(T other);
    T multiply(T other);
    T divide(T other) throws ArithmeticException;
}