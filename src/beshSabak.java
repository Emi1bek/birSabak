import java.util.Scanner;

public class beshSabak {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String strVar = sc.nextLine();
        // тапшырма----баштаылыш----19122022-----------
        // 1-100 го чейнки 7 менен аяктаган сандарды чыгар
//        int b =1;
//        for (int i = 0; i <100 ; i++) {
//            if(((i-7)%10)==0){
//                System.out.println(i);
//            }
//        }
        // тапшырма-------аягы--------19122022---------



        // тапшырма-------<Башы>--------19122022---------
        //Игра «Угадай число» на Java
//        int UnknownNumber, UserNumber, TrysCount = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
//        UnknownNumber = (int)Math.floor(Math.random() * 100);
//        do {
//            TrysCount++;
//            System.out.print("Введите ваше число: ");
//            UserNumber = input.nextInt();
//            if (UserNumber > UnknownNumber)
//                System.out.println("Моё число меньше.");
//            else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");	else System.out.println("Вы угадали!");
//        } while (UserNumber != UnknownNumber);
//        System.out.println("Количество попыток: " + TrysCount);
// тапшырма-------<Аягы>--------19122022---------
//            Scanner input = new Scanner(System.in);
//        double procent = 100/0.3;
//        int a=0, b=0;
//        while (a>procent) {
//
//            System.out.print("Какой этаж: ");
//            int etazh = input.nextInt();
//            System.out.print("Кг: ");
//            int kg = input.nextInt();
//
//            if (kg < 200 && etazh <= 100) {
//                for (int i = 1; i <= etazh; i++) {
//                    System.out.println("Лифт на " + i);
//                }
//            } else {
//                System.out.println("Слишком много веса! ");
//            }
//            a++;
////        }
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = (int) (Math.random()*(-225+350)) + 1;
//
//         if (b >10 & 100>b){
//             for (int i = -10; i > -100; i--) {
//                 System.out.println(i);
//
//             }
//             for (int i = 10; i < 100; i++) {
//                 System.out.println(i);
//
//             }
//         }
//         else {
//             System.out.println("больше"+b);
//         }
        Scanner input = new Scanner(System.in);
        System.out.println("Выведите цисло");
        int varInt = input.nextInt();
        double a = Math.sqrt(varInt);
        System.out.println(a);
        double sum = varInt/(varInt/3);
        System.out.println(sum);




    }
}
