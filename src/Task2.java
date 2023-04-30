import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
interface Generic<T>{
    T test (T t);
}

public class Task2 {
    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food(1, "Starter", 5.0f));
        foodList.add(new Food(2, "Salad", 6.0f));
        foodList.add(new Food(3, "Bice", 5.7f));
        foodList.add(new Food(4, "Olives", 8.9f));

        Collections.sort(foodList, (f1, f2) -> {
            return f1.name.compareTo(f2.name);
        });

        foodList.forEach(food -> System.out.print("By name: "+ food.id + "; "));
        System.out.println();

        Collections.sort(foodList, (a, b) -> {
            return Float.compare(a.price,b.price);
        });

        foodList.forEach(food -> System.out.print("By price: "+ food.id + "; "));
        System.out.println();

        //filter food that has particular price

        Stream<Food> filteredF = foodList.stream().filter(p -> p.price < 6.0f);
        filteredF.forEach((ff) -> System.out.println("Filtered: "+ff.id));

        Generic<String> reverse = (str) -> {
            String answer = "";
            for(int i = str.length() - 1; i >=0; i--){
                answer += str.charAt(i);
            }
            return answer;
        };
        System.out.println(reverse.test("Taormina"));

        Generic<Integer> factorial = n -> {
            int answer = 1;
            for(int i = 1; i<= n; i++){
                answer = i*answer;
            }
            return answer;
        };
        System.out.println(factorial.test(3));

    }
}
