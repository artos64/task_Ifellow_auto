import java.util.Scanner;

public class BaseConverter {
    static Scanner noscanner = new Scanner(System.in);

    public static void main(String[] args) {
        convert();
}
    private static void convert(){
        System.out.println("Открыта программа конвертации из градусов Цельсия в Фаренгейты или Кельвины.");
        char choice = ' ';
        do {
            System.out.println("Введите значение градусов Цельсия:");
            double celsius = noscanner.nextInt();
            System.out.println("Выберите в какую единицу температуры осуществить конвертацию:\n 1. Фаренгейты\n 2. Кельвины");
            choice = noscanner.next().charAt(0);
            switch (choice) {
                case '1':
                    System.out.println("Значение в градусах Фаренгейта: " + ((celsius * 9 / 5) + 32));
                    break;
                case '2':
                    System.out.println("Значение в градусах Кельвина: " + (celsius + 273.15));
                    break;
                default:
                    System.out.println("Введите корректное значение");
                    break;
            }
            System.out.println("Для изменения значения в градусах Цельсия нажмите на 'Y'");
            System.out.println("Для выхода из программы нажмите 'T'");
            choice = noscanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        if (choice == 'T' || choice == 't') {
            System.out.println("Программа завершена, хорошего дня!");
        }
    }
}
