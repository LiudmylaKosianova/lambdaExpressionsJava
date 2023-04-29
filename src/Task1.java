import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //print without lambda
        for(Integer number : numbers){
            System.out.println(number);
        }
        //print with lambda
        numbers.forEach( (number) -> System.out.println("with lambda: " + number));
        //replace with random and print with lambda
        Random random = new Random();
        numbers.forEach( (element) -> {
            element = random.nextInt(11);
            System.out.println("replaced with random: "+ element);
        }
        );

        //create a thread
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("my thread works");
            }
        };
        Thread myThread = new Thread(run);
        myThread.start();

        //create a thread with lambda
        Thread myThreadL = new Thread( () -> System.out.println("my thread works with lambda"));
        myThreadL.start();

    }

}
