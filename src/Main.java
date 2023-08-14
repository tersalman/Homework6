public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int a = 1 ; a <= 10 ; a++) {
            System.out.println(a);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int a = 10 ; a >= 0 ; a--) {
            System.out.println(a);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for (int a = 0 ; a <= 17 ; a+=2) {
            System.out.println(a);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int a = 10 ; a >= -10 ; a--) {
            System.out.println(a);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904 ; i <= 2096 ; i+=4){
            System.out.println(i  + "год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+=7){
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1 ; i <= 512 ; i*=2){
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int accumulation = 0;
        int month = 0;

        for (int i = 0 ; i < 12 ; i++){
            month += 1;
            accumulation = accumulation + 29000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей");
        }
    }

    public static void task9 () {
        System.out.println("Задача 9");
        int accumulation = 29000;
        double total = 0;

        for (int i = 1 ; i <= 12 ; i++){
            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10 () {
        System.out.println("Задача 10");
        int number = 0;
        int factor = 2;
        int result = 0;
        for (int i= 1; i<=10; i++){
            number = number + 1;
            result = number * factor;
            System.out.println(factor + "*" + number + " =" + result);
        }
    }
}