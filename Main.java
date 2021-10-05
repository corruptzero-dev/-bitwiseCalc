package task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int result;
        System.out.println("Побитовый калькулятор.\nСписок операций: ");
        System.out.println("""
                1. 'ИЛИ'
                2. 'И'
                3. 'Исключающее ИЛИ'
                4. 'НЕ'
                5. 'Логический сдвиг вправо'
                6. 'Логический сдвиг влево'
                """);

        System.out.print("Выберите операцию(1-6): ");
        int operation = scanner.nextInt();
        System.out.println();
        if (operation>=1 && operation<=3){
            System.out.print("Введите первое число: ");
            firstNum = scanner.nextInt();
            System.out.print("Введите второе число: ");
            secondNum = scanner.nextInt();
        } else if (operation == 4){
            System.out.print("Введите число: ");
            firstNum = scanner.nextInt();
            secondNum = 0;
        } else if (operation == 5) {
            System.out.print("Введите число: ");
            firstNum = scanner.nextInt();
            System.out.print("Введите количество: ");
            secondNum = scanner.nextInt();
        } else if (operation == 6){
            System.out.print("Введите число: ");
            firstNum = scanner.nextInt();
            System.out.print("Введите количество: ");
            secondNum = scanner.nextInt();
        } else {
            firstNum = 0;
            secondNum = 0;
        }
        if (firstNum==0 && secondNum==0){
            System.out.println("Повторите попытку.");
        } else {
            result = switch (operation) {
                case 1 -> firstNum | secondNum;
                case 2 -> firstNum & secondNum;
                case 3 -> firstNum ^ secondNum;
                case 4 -> ~firstNum;
                case 5 -> firstNum >> secondNum;
                case 6 -> firstNum << secondNum;
                default -> throw new IllegalStateException("Неизвестная операция: " + operation);
            };
            System.out.println("Результат: " + result);
        }
    }
}
