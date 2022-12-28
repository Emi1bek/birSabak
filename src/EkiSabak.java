import java.util.Scanner;

public class EkiSabak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
//
        double sum1 = a+b+c;
        double sum2 = a*b*c;
        double sum3 = (sum1/3);
      System.out.printf("кошкондо: %.0f",sum1);
      System.out.println(" ");
        System.out.println(" ");
      System.out.printf("кобойткондо: %.0f",sum2);
      System.out.println(" ");
      System.out.println("Арифметикалык орточо саны: " +sum3 );


    }
}
