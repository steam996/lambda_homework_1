public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(6, 2);
        int b = calc.minus.apply(5,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        System.out.println(calc.abs.apply(-5));
    }
}