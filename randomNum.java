import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        int min=10, max=30; //range
        System.out.println(Math.random()*(max-min+1)+min);

        //ramdom int between 0 to 10
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble(10));
        System.out.println(random.nextBoolean());
    }
}
