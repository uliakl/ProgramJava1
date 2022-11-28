import java.util.Scanner;


public class Q12W {
    public static void main(String[] args) {

   /*
   Составить программу,
    которая уменьшает первое введенное число в два раза,
    если оно больше второго введенного числа.
        */

        int x;
        int y;

        System.out.println("Введите число x ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        System.out.println("Введите число y ");
        Scanner input2 = new Scanner(System.in);
        y = input2.nextInt();

       if(x>y)
       {
           System.out.println("Условие выполнено " + x/2);
       }
        if(x<=y)
        {
            System.out.println("Условие не выполнено");
        }


    }

}
