public class FizzBuzz {

    public static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(0);
        }
    }
}
