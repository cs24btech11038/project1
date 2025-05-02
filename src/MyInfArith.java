package arbitraryarithmetic;
import arbitraryarithmetic.AInteger;
import arbitraryarithmetic.AFloat;

public class MyInfArith {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("input: <int|float> <add|sub|mul|div> <op1> <op2>");
            return;
        }

        String type = args[0];
        String operation = args[1];
        String op1 = args[2];
        String op2 = args[3];

        switch (type) {
            case "int":
                processOperation(new AInteger(op1), new AInteger(op2), operation);
                break;

            case "float":
                processOperation(new AFloat(op1), new AFloat(op2), operation);
                break;

            default:
                System.out.println("Invalid type. Use 'int' or 'float'.");
        }
    }

    private static <T extends Arithmetic<T>> void processOperation(T a, T b, String operation) {
        T result;

        try {
            switch (operation) {
                case "add": result = a.add(b); break;
                case "sub": result = a.subtract(b); break;
                case "mul": result = a.multiply(b); break;
                case "div": result = a.divide(b); break;
                default:
                    System.out.println("Invalid operation. Use add, sub, mul, or div.");
                    return;
            }
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


