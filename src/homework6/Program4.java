package homework6;

/*1.Declare two instance and two static variables.
 2.Declare one instance method.
 3.Declare one static method.
 4.Call all four instance and static variables into both instance and static methods inside the print statement.
 5. Declare the Main method.
 6.Call both instance and static methods into the Main method*/

public class Program4 {
    int a = 6;
    String b = "Week";
    static String c = "Howework";
    static String d = "Viral";

    public static void main(String[] args) {
        Program4 obj =new Program4();
        obj.myFirstmethod();
        myStaticmethod();


    }

    public void myFirstmethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Program4.c);
        System.out.println(Program4.d);
    }

    public static void myStaticmethod() {
        Program4 obj=new Program4();
        System.out.println(obj.a);
        Program4 program4 =new Program4();
        System.out.println(program4.b);
        System.out.println(c);
        System.out.println(d);




    }


}


