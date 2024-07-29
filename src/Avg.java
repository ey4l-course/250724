import java.util.Scanner;

public class Avg {
    static int[] inpt = new int[3];

    public static double calc(int[] inpt){
        int sum = 0;
        for (int i = 0; i < inpt.length; i ++){
            sum += inpt[i];
        }
        return sum / 3;
    }

    public static void printavg(double avg){
        System.out.println("The average is: " + avg);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            for ( int i = 0; i < inpt.length; i ++){
                System.out.println("Please enter number:");
                inpt[i] = s.nextInt();
            }
        }
        printavg(calc(inpt));
    }
}
