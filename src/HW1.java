import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Student sam = new Student("Sam", 1);
        Student john = new Student("John", 2);
        sam.setAddress("90210 Beverly hills, CA");
        sam.setPhone("Unlisted");
        john.setAddress("50780 Main st. NYC, NY");
        john.setPhone("+1-212-555-1312");
        System.out.println(sam + "\n" + john);


        //Used same class written for excersize 1

        Rectangle myNewRectangle = new Rectangle();
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter rectangle height:");
        myNewRectangle.height = s.nextInt();
        System.out.println("Please enter rectangle width:");
        myNewRectangle.width = s.nextInt();
        System.out.printf("\n\nThe area of your rectangle is: %d\n\n", myNewRectangle.area());

    }
}