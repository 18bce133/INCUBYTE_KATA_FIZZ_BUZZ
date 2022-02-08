public class FizzBuzz {
    private final int x;

    public FizzBuzz(int x) {
        this.x = x;
    }

    public String give() {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        } else if (x % 5 == 0) {
            return "Buzz";
        } else if (x % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(x);
        }
    }
}
