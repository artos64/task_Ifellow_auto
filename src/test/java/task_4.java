import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        System.out.println("Открыта программа вычисления угола между часовой и минутной стрелками часов");

        Scanner in = new Scanner(System.in);

        int hours = -1, minutes=-1;

        while(hours<0 || hours>12) {
            System.out.print("Пожалуйста введите часы (1-12): ");
            hours = in.nextInt();
        }

        while (minutes<0 || minutes>60){
            System.out.print("Пожалуйста введите минуты (0-60): ");
            minutes = in.nextInt();
        }

        double angelHour = hours*30;

        double angelMinutes = minutes*6;

        if(angelHour==360) angelHour=0;
        if(angelMinutes==360) angelMinutes=0;

        double diffAngel = Math.abs(angelHour-angelMinutes);

        if(diffAngel>180){
            System.out.println(360-diffAngel);
        }else{
            System.out.println(diffAngel);
        }
    }
}
