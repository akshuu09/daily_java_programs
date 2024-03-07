// Q:- how does the constructor know that the control has to be return from constructor
//--> with the help of "return" statement.  
public class ConstructorExample2 {
    ConstructorExample2()
    {
        System.out.println("Inside Const 0 arg");

        return;
    }
      void m2()
    {
        System.out.println("Inside m2 method");
    }
    public static void main(String[] args) {
        ConstructorExample2 obj1 = new ConstructorExample2();
       obj1.m2();
    }
}
