import java.util.Scanner;

public class uroki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intVar = sc.nextInt();
        int intVar1 = 0;
        int sum=0;
        while (intVar>=intVar1){
            sum=(intVar1*(intVar1+1)/2);
            intVar1++;

        }
        System.out.println(sum);
    }
}
