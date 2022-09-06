import java.util.function.*;

public class Calculator {
    static Supplier <Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (a,b) -> a + b;
    BinaryOperator<Integer> minus = (a,b) -> a - b;
    BinaryOperator<Integer> multiply = (a,b) -> a * b;
    BinaryOperator<Integer> devide = (a,b) -> {
       if (b != 0) {
           return (a / b);
       } else {
           System.out.println("Вы пытаетесь делить на ноль. А этого делать нельзя!");
           return 0;
       }
    };

    UnaryOperator<Integer> pow = a -> a * a;
    // срабатывает без ошибок
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
