import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String [] names = new String[3];
        int [] numbers = new int[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name.");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
        }
        System.out.printf("%-14s %s\n", "Name", "Number");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-14s %s\n", names[i], numbers[i]);
        }
    }
}
