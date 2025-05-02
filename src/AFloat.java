package arbitraryarithmetic;

import java.math.BigDecimal; //Represents arbitrary-precision numbers.

import java.math.MathContext;//used to specify the precission and rounding behaviour.

import java.math.RoundingMode;//rules for rounding.

public class AFloat implements Arithmetic<AFloat> {

    private BigDecimal number;
    
    // creating a default constructor
    public AFloat(){
        this.number=BigDecimal.ZERO;
    }

    //20-digit precision and half up rounding
    private static final MathContext mc = new MathContext(20, RoundingMode.HALF_UP);

    //Constructor AFloat(String s) that initializes the instance by the number whose string representation is given by ’s’.
    public AFloat(String s) {
        this.number = new BigDecimal(s, mc);
    }

    //copy constructor
    public AFloat(AFloat other) {
        this.number = other.number.round(mc);
    }

    //parse(String s) - a static function that returns an instance of AFloat class.
    public static AFloat parse(String s) {
        return new AFloat(s);
    }

    private AFloat(BigDecimal number) {
        this.number = number.round(mc); 
    }

    //arithmetic operations
    public AFloat add(AFloat other) {
        return new AFloat(this.number.add(other.number, mc));
    }
    public AFloat subtract(AFloat other) {
        return new AFloat(this.number.subtract(other.number, mc));
    }

    public AFloat multiply(AFloat other) {
        return new AFloat(this.number.multiply(other.number, mc));
    }

    public AFloat divide(AFloat other) {
        if (other.number.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return new AFloat(this.number.divide(other.number, mc));
    }

    @Override
    public String toString() {
        return number.stripTrailingZeros().toPlainString();
    }
}
