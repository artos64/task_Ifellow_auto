import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите длину массива:");
        int lengthArray = scanner.nextInt();
        System.out.println(lengthArray);

        double[] array = new double[lengthArray];

        for (int i = 0; i<array.length; i++){
            array[i] = Math.random();
            System.out.println("Элемент "+i+": "+array[i]);
        }

        double min_value = array[0];
        double max_value = array[0];
        double sum = 0;

        for (double v : array) {
            if (min_value > v) {
                min_value = v;
            }
            if (max_value < v) {
                max_value = v;
            }
            sum += v;
        }

        System.out.println("Минимальное значение: " + min_value);
        System.out.println("Максимальное значение: " + max_value);
        System.out.println("Среднее значение: " + sum/lengthArray);
    }
}

