import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class FizzBuzzTest {

    @Test
    void test_for_multiple_of_three() {
        FizzBuzz fizzbuzz = new FizzBuzz(3, printStream);
        Assertions.assertThat(fizzbuzz.give(3)).isEqualTo("Fizz");
    }

    @Test
    void test_for_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5, printStream);
        Assertions.assertThat(fizzbuzz.give(5)).isEqualTo("Buzz");
    }

    @Test
    void test_for_multiple_of_combine() {
        FizzBuzz fizzbuzz = new FizzBuzz(15, printStream);
        Assertions.assertThat(fizzbuzz.give(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void test_for_no_multiple() {
        FizzBuzz fizzbuzz = new FizzBuzz(7, printStream);
        Assertions.assertThat(fizzbuzz.give(7)).isEqualTo("7");
    }

    @Mock
    PrintStream printStream;
    @Test
    void test_print_all_fizz_budd_till_n() {
        FizzBuzz fizzBuzz = new FizzBuzz(15, printStream);
        fizzBuzz.printall();
        verify(printStream, times(1)).println("FizzBuzz");
        verify(printStream, times(4)).println("Fizz");
        verify(printStream, times(2)).println("Buzz");
    }

}
