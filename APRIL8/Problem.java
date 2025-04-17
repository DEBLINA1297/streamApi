package APRIL8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem {
//    Create a fixed thread pool of size 3. Submit 3 tasks. Each task prints
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        executor.submit(()-> System.out.println("Task 1 is running"));
        executor.submit(()-> System.out.println("Task 2 is running"));
        executor.submit(()-> System.out.println("Task 3 is running"));
//        executor.execute(new Runnable() {
//            public void run() {
//                System.out.println("Asynchronous task");
//            }
//        });
        executor.shutdown();
    }
}
