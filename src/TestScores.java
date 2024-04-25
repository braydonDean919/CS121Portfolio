import java.util.*;
public class TestScores {
    public static char getLetterGrade(int percentGrade){
        char letterGrade;
        if (percentGrade >= 90){
        letterGrade = 'A';
        } else if (percentGrade >= 80) {
            letterGrade = 'B';
        } else if (percentGrade >= 70) {
            letterGrade = 'C';
        } else if (percentGrade >= 60) {
            letterGrade = 'D';
        } else{
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public static void printGrades(char[] letterGrade, int[] scores){
        System.out.println("Score     Grade");
        for (int i = 0; i < letterGrade.length; i++) {
            System.out.println("  " + scores[i] + "       " + letterGrade[i]);
        }
    }
    public static int getHighestScore(int[] scores){
        int high = 0;
        for(int score : scores){
            if (score > high){
                high = score;
            }
        }
        return high;
    }
    public static double getAverageScore(int[] scores){
        double average = 0;
        for(int score : scores){
            average += (double) score;
        }
        average /= scores.length;
        return average;
    }
    public static int getLowestScore(int[] scores){
        int low = scores[0];
        for(int score : scores){
            if (score < low){
                low = score;
            }
        }
        return low;
    }
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         Random rand = new Random();
         final int SIZE = rand.nextInt(3, 10);
         int [] scores = new int[SIZE];
         char [] letterGrades = new char[SIZE];
         System.out.println("Enter your " + SIZE + " test results.");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter test score " + (i+1) + ":");
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < SIZE; i++) {
           letterGrades[i] = getLetterGrade(scores[i]);
        }
        printGrades(letterGrades, scores);
        System.out.println("The highest score is " + getHighestScore(scores));
        System.out.println("The lowest score is " + getLowestScore(scores));
        System.out.println("The average score is " + getAverageScore(scores));
    }
}
