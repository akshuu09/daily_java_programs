class Example1 extends Thread
{
	 public static void main(String[] args) {
    Example1 thread = new Example1();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}