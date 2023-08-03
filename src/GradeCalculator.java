import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int runningSum = 0;
        int totalInputs = 0;

        while (true) {
            System.out.println("Please Input an Number!");
            int currentUserGuess = userInput.nextInt();

            if (currentUserGuess < 0) {
                System.out.println("Well Done!");
                break;
            }

            if (currentUserGuess > 100) {
                System.out.println("Please Input a Number less than 100.");
                continue;
            }
            runningSum += currentUserGuess;
            totalInputs++;
        }

        if ( totalInputs > 0) {
            int averageGrade = runningSum / totalInputs;

            if (averageGrade > 90) {
                System.out.println(averageGrade + " Excellent Work!");
            } else if (averageGrade > 80) {
                System.out.println(averageGrade + "Good Job!");
            } else if (averageGrade > 70) {
                System.out.println(averageGrade + " Keep it up");
            } else if (averageGrade > 60) {
                System.out.println(averageGrade + " Let's work hard to get those grades up!");
            }


        }
    }
}

