public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double c = calculator.summa(10, 11);
        Calculator calculator1 = new Calculator();
        double d = calculator1.minus(33, 5);
        Calculator calculator2 = new Calculator();
        double e = calculator2.multiply(6, 8);
        Calculator calculator3 = new Calculator();
        double f = calculator3.divide(9, 10);
        System.out.println(c + "\n" + d + "\n" + e + "\n" + f);
    }

}
