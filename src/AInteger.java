package arbitraryarithmetic;
import java.math.BigInteger;

public class AInteger implements Arithmetic<AInteger> {
    private BigInteger number;

    public AInteger(BigInteger number) {
        this.number = number;
    }

    //Default constructor AInteger() that initializes the instance with value 0.

    public AInteger() {
        this.number = BigInteger.ZERO;
    }

    //Constructor AInteger(String s) that initializes the instance by the integer whose string representation is given by ’s’.

    public AInteger(String s) {
        this.number = new BigInteger(s);
    }

    // Copy constructor.

    public AInteger(AInteger other) {
        this(other.number); 
    }

    //parse(String s) - a static function that returns an instance of AInteger class.

    public static AInteger parse(String s) {
        return new AInteger(s);
    }

    // integer arithmetic operators.

    public AInteger add(AInteger other) {
        return new AInteger(this.number.add(other.number));
    }
    
    public AInteger subtract(AInteger other) {
        return new AInteger(this.number.subtract(other.number));
    }

    public AInteger multiply(AInteger other) {
        return new AInteger(this.number.multiply(other.number));
    }

    public AInteger divide(AInteger other) {
        if (other.number.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new AInteger(this.number.divide(other.number));
    }

    
    @Override
    public String toString() {
        return number.toString();
    }
}