import java.util.ArrayList;
import java.util.List;
// Asteriks, Obeliks, Pandemix are just the names for increments
        //Square
public class TaskSix {
    public static void main(String[] args) {
        for (int asteriks = 0; asteriks < 8; asteriks++) {
            for (int obeliks = 0; obeliks < 8; obeliks++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Separator
        System.out.println("---------------");

        //Hollow Square
        for (int asteriks = 0; asteriks < 5; asteriks++) {
            for (int obeliks = 0; obeliks < 8; obeliks++) {
                if (asteriks == 0 || asteriks == 4 || obeliks == 0 || obeliks == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Separator
        System.out.println("---------------");

        //Cascade
        for (int asteriks = 1; asteriks <=7; asteriks++)
        {
            for (int obeliks = 1; obeliks <=7; obeliks++)
            {
                if (obeliks <= asteriks)
                    System.out.print("*");
                }
                System.out.println();
            }
        //Separator
        System.out.println("---------------");

        //Triangle
        for (int asteriks = 1; asteriks <=10; asteriks +=2) {
            for (int pandemix = 0; pandemix <(4 - asteriks /2); pandemix++){
                System.out.print(" ");
            }
            for (int obeliks = 0; obeliks<asteriks; obeliks++) {
                    System.out.print("*");
            }
            System.out.println("");
        }
        //Separator
        System.out.println("---------------");
        }
    }
