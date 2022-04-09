package algorithmcomparison;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Set size of the dataset (10^size):");
		double size = Math.pow(10, sc.nextInt());
		
		// Create a random dataset of given size
		System.out.println("Creating a random dataset of size " + size + ("..."));
		int[] dataset = Data.createData(size);
		
		// Pass dataset to different sorting algorithms
		// Maybe do this asyncronically??
		System.out.println("Passing dataset to sorting algorithms...");
		Heapsort.sort(dataset);
		
		System.out.println("Algorithms completed");
		System.out.println("Application done! Exiting...");
		System.exit(0);
	}

}
