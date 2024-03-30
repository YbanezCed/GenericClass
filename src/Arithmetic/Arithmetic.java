package Arithmetic;

class Arithmetic<FirstNum extends Number, SecondNum extends Number> {
    private final double num1;
    private final double num2;

    public Arithmetic(FirstNum num1, SecondNum num2) {
        this.num1 = num1.doubleValue();
        this.num2 = num2.doubleValue();
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    public double getMin() {
        return Math.min(num1, num2);
    }

    public double getMax() {
        return Math.max(num1, num2);
    }
}
