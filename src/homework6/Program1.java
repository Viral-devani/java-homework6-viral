package homework6;

/*Declare two instance variables,one instance method,Call both instance variables into the instance method inside the print statement.
Declare the Main method.Call the above instance method into the Main method and Run the program*/

public class Program1 {
    int a = 100;
    int b = 200;

    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.myFirstmethod();

    }

    void myFirstmethod() {
        System.out.println(a);
        System.out.println(b);


    }

}

