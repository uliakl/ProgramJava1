import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /* Известны площадикругаиквадрата.
                Определить:
        1.уместитсяликругвквадрате?
        2.уместитсяликвадратвкруге? */

        System.out.println("Введите площадь квадрата = ");
        Scanner input = new Scanner(System.in);
        double sk = Double.parseDouble(input.nextLine());
        double diag = Math.sqrt(2*sk);
        System.out.println("Диагональ квадрата = " + diag);

        System.out.println("Введите площадь круга: ");
        Scanner input2 = new Scanner(System.in);
        double so = Double.parseDouble(input2.nextLine());
        double diam = 2 * Math.sqrt(so/Math.PI);
        System.out.println("Диаметр круга = " + diam);

        if (diam <= diag)
            System.out.println("Круг впишется в квадрат");
        else
            System.out.println("Квадрат впишется в круг");
    }
}
