import java.util.Scanner;

public class UchSabak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chas: ");
        double chasVariable = sc.nextDouble();
        System.out.println("Vvedite min: ");
        double minVariable = sc.nextDouble();
        System.out.println("Vvedite sec: ");
        double secVariable = sc.nextDouble();

        double sumVariable = ((chasVariable*3600)+(minVariable*60)+(secVariable*1));

        System.out.printf("Жооб: %.0f",sumVariable);
        System.out.println(" ");

    }
}
