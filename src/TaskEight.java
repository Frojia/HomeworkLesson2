public class TaskEight {
    public static void main(String[] args) {
        for (int a=1; a<=100; a++){
            if (a % 3 == 0 && a % 5 == 0 && a% 2!=0){
                System.out.println(a);
            }
        }
    }
}
