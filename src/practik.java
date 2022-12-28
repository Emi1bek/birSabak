import java.util.Scanner;

public class practik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namber1 = sc.nextInt();
        int namber2 = sc.nextInt();
        //int a =1;

        while (namber1++ < namber2) {
            if (namber1 % 2 != 0) {
                System.out.println(namber1);
            }
        }
    }
}




