import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskFour {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10, 20 + 1);
            myList.add(randomNum*randomNum);
        }
        for(Integer object:myList){
            System.out.println(Math.sqrt(object));
        }
    }
}
