import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        for(Integer number : numbers){
            System.out.println(number);
        }

        numbers.forEach( (number) -> System.out.println("with lambda: " + number));

    }

}
