package homework6;

/*Declare one instance and one static variable.
  Declare one instance method.
  Declare one static method.
  Call both instance and static variables into both instance and static methods inside the print statement.
  Declare the Main method.
  Call both instance and static methods into the Main method*/

public class Program3 {
    int a = 6;
    static String b = "Homework";

    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.myMethod();
        myStaticMethod();

    }

    public void myMethod() {
        System.out.println(a);
        System.out.println(Program3.b);

    }

    public static void myStaticMethod() {
        Program3 program3 = new Program3();
        System.out.println(program3.a);
        System.out.println(b);


    }

}


