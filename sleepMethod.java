package MultiThreading;

public class sleepMethod implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Thread is going to sleep for 3 seconds.");
			Thread.sleep(3000);
			System.out.println("Thread has woken up after 3 seconds.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		sleepMethod se = new sleepMethod();
		Thread t1 = new Thread(se);
		t1.start();
	}
}
