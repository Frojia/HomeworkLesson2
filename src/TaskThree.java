import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskThree {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10, 20 + 1);
           myList.add(randomNum); //мы добавляем новое значение к нашему массиву (add добавляет новое значение)
       }
        // For Each
        for(Integer object:myList){
            System.out.println(object);

        }
        // Separator
        System.out.println("__________");

        //For
        for (int b = 0; b < myList.size(); b++ ) {
            System.out.println(myList.get(b));
        }
    }
}