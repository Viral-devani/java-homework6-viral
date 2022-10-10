package homework6;

/*Declare two static variables
 Declare one static method
 Call both static variables into the static method inside the print statement.
 Declare the Main method. Call the static method into the Main method*/
public class Program2 {
    static int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        firstMethod();

    }

    public static void firstMethod() {
        System.out.println(a);
        System.out.println(b);
    }


}
