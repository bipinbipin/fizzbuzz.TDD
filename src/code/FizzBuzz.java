package code;

/**
 * Created by Bipin on 4/20/2016.
 */
public class FizzBuzz {

    public FizzBuzz() {}

    public String evaluate(int number) {

        if (isMultipleOf3(number) && isMultipleOf5(number))
            return "FizzBuzz";
        else if (isMultipleOf3(number))
            return "Fizz";
        else if (isMultipleOf5(number))
            return "Buzz";
        else
            return Integer.toString(number);

    }

    public static boolean isMultipleOf3(int number) {
        return (0 == number % 3) ? true : false;
    }

    public static boolean isMultipleOf5(int number) {
        return (0 == number % 5) ? true : false;
    }
}
