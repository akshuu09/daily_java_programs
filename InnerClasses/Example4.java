class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Example4 {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}