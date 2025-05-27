package codechef.problem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DigitalClockandCountDown {

    public static Scanner scanner = new Scanner(System.in); // Moved to static field
    public static  boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        while (flag == true) {
            System.out.print("Choose an option (1:Digital Clock, 2:Countdown Timer): ");
            String choice = scanner.nextLine().trim();
            userChoice(choice);
        }
    }

    public static boolean userChoice(String choice) throws InterruptedException {
        String c = choice;
        switch (c){
            case "1": digitalClock();
                      break;
            case "2":
                System.out.print("Enter the number of seconds to countdown: ");
                int n = scanner.nextInt();
                countdownTimer(n);
                break;
            default:
                System.out.println("Invalid choice");
                return flag = false;
        }
        return false;
    }

    public static void digitalClock() {
        while (true){
            LocalTime localTime = LocalTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            String time = localTime.format(dateTimeFormatter);
            System.out.println("Digital clock: "+time);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Error ! "+e.getMessage());
            }
        }

    }

    public static void countdownTimer(int seconds) throws InterruptedException {
        System.out.println("Countdown Timer started!");
        System.out.println("Time remaing: "+" seconds.");
        while (flag == true){
            if (seconds != 0){
                System.out.print(seconds+" ");
                seconds--;
                Thread.sleep(1000);
            }
            else {
                System.out.println("\nTime's up!");
                flag = false;
            }
        }
    }
}
