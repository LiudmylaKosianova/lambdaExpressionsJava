import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.*;

public class FunctionalExercise {
    public static void main(String[] args) {
        Predicate<Integer> posNum = (num) -> num>=0;
        System.out.println("This number is positive: " + posNum.test(-3));

        Function<Integer, String> converter;
        converter = (num)-> Integer.toString(num);
        System.out.println("Length of 982 is: "+ converter.apply(982));

        Consumer<String> myConsumer = (s) -> System.out.println("I received as an argument: " + s);
        myConsumer.accept("mandarins");

        Supplier<String> mySupplier = () -> "try to use Supplier";
        System.out.println(mySupplier.get());
    }
}
