package APRIL8;

import java.util.concurrent.*;

public class Problem1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Define the Callable task
        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
//                Thread.sleep(1000);
                sum += i;
            }
            return sum;
        };

        // Create ExecutorService
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the task and get a Future
        Future<Integer> future = executor.submit(sumTask);

        // Get the result
        int result = future.get();

        // Print the result
       System.out.println("Sum from 1 to 100 is: " + result);

        // Shut down the executor
        executor.shutdown();
    }
    }

