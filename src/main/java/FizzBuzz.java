import java.io.OutputStream;
import java.io.PrintStream;

public class FizzBuzz {
    private final int x;
    PrintStream out;
    public FizzBuzz(int x, PrintStream printStream) {
        this.x = x;
        this.out = printStream;
    }

    public String give(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    public void printall() {
        for (int i = 1; i <= x; i++) {
            out.println(give(i));
        }
    }
}
