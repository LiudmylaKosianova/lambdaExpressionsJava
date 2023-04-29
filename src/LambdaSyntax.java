interface Calculate{
    public void divide();
}
interface Robot{
    public String talks(String name);
}

interface RedCats{
    public String concatenate (String a, String b, String c);
}
public class LambdaSyntax {
    public static void main(String[] args) {
        int a = 120;
        int b = 3;
//        Calculate sheep = new Calculate() {
//            @Override
//            public void divide() {
//                int answer = a / b;
//                System.out.println("answer is: " + answer);
//            }
//        };
//        sheep.divide();

        Calculate sheep = () -> {
            System.out.println("answer is: " + a / b);
        };
        sheep.divide();
        Robot robot = name -> {return "Hi " + name;
        };
        System.out.println(robot.talks("Ophelia"));

        RedCats myCats = (y, j, k) -> {
            return y + j + k;
        };
        System.out.println(myCats.concatenate("M","E","W"));

    }
}
