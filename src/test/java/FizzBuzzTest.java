import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


    @Test
    public void test_for_multiple_of_three() {
        FizzBuzz fizzbuzz = new FizzBuzz(3);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("Fizz");
    }

    @Test
    public void test_for_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("Buzz");
    }

    @Test
    public void test_for_multiple_of_combine() {
        FizzBuzz fizzbuzz = new FizzBuzz(15);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("FizzBuzz");
    }

    @Test
    public void test_for_no_multiple() {
        FizzBuzz fizzbuzz = new FizzBuzz(7);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("7");
    }


}
