package algorithmcomparison;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		final int algorithms = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Set size of the dataset (10^size):");
		double size = Math.pow(10, sc.nextInt());
		sc.close();
		
		// Create a random dataset of given size
		System.out.println("Creating a random dataset of size " + size + ("..."));
		int[] dataset = Data.createData(size);
		
		// Pass dataset to different sorting algorithms
		System.out.println("Passing dataset to sorting algorithms...");
		
		Runnable r1 = new Heapsort(dataset);
		Runnable r2 = new Quicksort(dataset);
		Runnable r3 = new Mergesort(dataset);
		Runnable r4 = new Insertionsort(dataset);
		Runnable r5 = new Bubblesort(dataset);
		
		ExecutorService pool = Executors.newFixedThreadPool(algorithms);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
		while (!pool.isTerminated()) {}
		
		System.out.println("Algorithms completed");
		System.exit(0);
	}
}
