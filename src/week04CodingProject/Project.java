package week04CodingProject;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};//declared and initialized array ages
		 //System.out.print(findLastElement(ages));;
		System.out.println("The difference for ages is:");
		findDifference(ages);
		
		System.out.println("The average for ages is:");
		findAverage(ages);
		
		int[] ages2 = new int[9];
		ages2[0] = 3;
		ages2[1] = 6;
		ages2[2] = 9;
		ages2[3] = 12;
		ages2[4] = 15;
		ages2[5] = 18;
		ages2[6] = 21;
		ages2[7] = 24;
		ages2[8] = 27;
		System.out.println("The difference for ages2 is:");
		findDifference(ages2);
		System.out.println("The average for ages2 is:");
		findAverage(ages2);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double nameLength = 0;
		for(int i = 0; i < names.length; i++) {
			int z = names[i].length();
			nameLength = nameLength + z;
		}
		System.out.println("The average number of letters is " + nameLength / names.length);
		
		
	}//end of main

	public static void findDifference(int[] x) {//since the same thing has to be completed more than once, created a method to handle it
		int result = 0;//variable to store the value that iterates in the loop
		for(int i = 0; i < x.length; i++) {
			result = x[i];//x is the placeholder for the int arrays, i is the value we iterate over to access the indexes

		}
		System.out.println(result - x[0]);
		
	}//end of findDifference
	
	public static void findAverage(int[]x) {
		double sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		double avg = sum / x.length;
		System.out.println(avg);
	}//end of findAverage
	
	
}//end of class
