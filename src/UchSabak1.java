import java.util.Scanner;

public class UchSabak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3х значную цифр: ");
        int obVariable = sc.nextInt();
        int birVariable = obVariable/100;
        int ekiVariable = (obVariable%100)/10;
        int uchVariable = ((obVariable%100)%10)/1;
        System.out.println(birVariable + "," + ekiVariable + "," + uchVariable);

    }
}