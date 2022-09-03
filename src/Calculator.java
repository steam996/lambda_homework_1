import java.util.function.*;

public class Calculator {
    static Supplier <Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (a,b) -> a + b;
    BinaryOperator<Integer> minus = (a,b) -> a - b;
    BinaryOperator<Integer> multiply = (a,b) -> a * b;
    BinaryOperator<Integer> devide = (a,b) -> a / b;

    UnaryOperator<Integer> pow = a -> a * a;
    // условие тернарного оператора должно быть заключено в скобки
    UnaryOperator<Integer> abs = x -> (x > 0) ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
