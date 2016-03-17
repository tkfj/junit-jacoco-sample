package my.sample;

public class Calculator {

    public int callMultiply(int x, int y) {
        System.out.println("call multiply");
        return multiply(x, y);
    }

    public int callDevide(int x, int y) {
        System.out.println("call devide");
        return devide(x, y);
    }

    private int multiply(int x, int y) {
        return x * y;
    }

    private int devide(int x, int y) {

        if (y == 0) {
            throw new IllegalArgumentException("devide by 0.");
        }

        return x / y;
    }
}
