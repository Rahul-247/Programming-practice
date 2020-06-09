

class MyThread extends Thread{
	
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	public void run() {
		System.out.println("No-arg run");
	}
	
	public void run(int i) {
		System.out.println("int-arg run "+i);
	}
	
	
}
public class OverLoad_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("Main Thread");

	}

}
