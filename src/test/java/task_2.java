
public class task_2 {
    public static void main(String[] args) {
        String w = "Hello";
        char[] array = w.toCharArray();

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j <array.length; j++){
                if (array[i] == array[j]){
                    System.out.println("Повторяющийся символ = " + array[i]);
                    return;
                }
            }
        }
    }
}