import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        int age;
        boolean passport;

        System.out.println("Сколько Вам лет?");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        System.out.println("Паспорт с собой?");
        Scanner input2 = new Scanner(System.in);
        String pass = input2.nextLine();

        if(pass.equals("да"))
        { passport = true;}
        else
        {passport = false;}


        boolean x;
        x = (age >= 18)&(passport == true);

        if((age >= 18)&(passport == true))
        { System.out.println("Кредит одобрен");}
        else
        {System.out.println("Невозможно выдать кредит");}

        }
}
