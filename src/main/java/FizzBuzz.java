public class FizzBuzz {

    private static final int FIZZ = 3;
    private static final int BUZZ = 5;

    public static String fizzbuzz(int n) {
        String resultado = fizz(n) + buzz(n);
        return resultado.isEmpty() ? String.valueOf(n) : resultado;
    }

    public static String fizz(int n) {
        return n % FIZZ == 0 ? "Fizz" : "";
    }

    public static String buzz(int n) {
        return n % BUZZ == 0 ? "Buzz" : "";
    }

}
