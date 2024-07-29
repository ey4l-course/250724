public class SomethingIsWrong {
    public static void main(String[] args) {
        // Rectangle myRect;                 Rectangle is not a valid data type
        Rectangle myRect = new Rectangle();     //added Instanciation of class "Rectangle"
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is: " + myRect.area());
        }
}
