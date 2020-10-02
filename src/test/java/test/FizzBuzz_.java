package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzz_ {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
        assertThat(fizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_3() {
        assertThat(fizzBuzz.of(3)).isEqualTo("fizz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_5() {
        assertThat(fizzBuzz.of(5)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_15() {
        assertThat(fizzBuzz.of(15)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("fizzbuzz");
    }

    private class FizzBuzz {
        public String of(int number) {
            if(isMultilpleOfFifthteen(number)) return "fizzbuzz";
            return !isMultilpleOfThree(number) ? !isMultilpleOfFive(number) ? String.valueOf(number) : "buzz" : "fizz";
        }

        private boolean isMultilpleOfFifthteen(int number) {
            return number % 3 == 0 && number % 5 == 0;
        }

        private boolean isMultilpleOfFive(int number) {
            return number % 5 == 0;
        }

        private boolean isMultilpleOfThree(int number) {
            return number % 3 == 0;
        }

    }


}
