public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задача 2
        System.out.println("Задача 2");
        int clientOS_2 = 0;
        int clientDeviceYear = 2015;
        if (clientOS_2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS_2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            int deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                int deliveryTime = 2;
                System.out.println("Потребуется дней: " + deliveryTime);
            } else {
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    int deliveryTime = 3;
                    System.out.println("Потребуется дней: " + deliveryTime);
                }
            }
        }

        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}