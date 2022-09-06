import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("задание 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("задание 4");
        for (int i = 10; i >= -10; i -- ) {
            System.out.println(i);
        }
        System.out.println("задание 1.2");
        for (int i = 1904 ; i <= 2096 ; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("задание 2.2");
        for (int i = 7; i <= 98 ; i += 7) {
        System.out.println(i);
        }
        System.out.println("задание 3.2");
        for (int i = 1; i <=512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("задание 1.3");
        int salary = 29000;
        int total = 0;
        for (int i = 1 ; i <= 12 ; i ++ ) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна  " + total + " рублей");

        }
        System.out.println("задание 2.3");
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1 ; i <= 12 ; i ++ ) {
            total2 += salary2/100;
            total2 += salary2;
            System.out.println("Месяц " + i + ", сумма накоплений равна  " + total2 + " рублей");

        }


    }
}

