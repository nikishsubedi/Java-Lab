package MultiThreading;
public class yieldMethod {
    public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                Thread.yield(); // give other threads a chance to run
            }
        });

        Thread t2 = new Thread(() -> {
            for (char i = 'a'; i <= 'd'; i++) {
                System.out.println("Thread 2: " + i);
                Thread.yield(); // give other threads a chance to run
            }
        });

        t1.start();
        t2.start();
    }
}

//public class yieldMethod implements Runnable {
//    
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            Thread.yield();
//            System.out.println(Thread.currentThread().getName() + " is running");
//        }
//    }
//    
//    public static void main(String[] args) {
//        yieldMethod ty = new yieldMethod();
//        
//        Thread t1 = new Thread(ty);
//        Thread t2 = new Thread(ty);
//        
//        t1.start();
//        t2.start();
//    }
//}

