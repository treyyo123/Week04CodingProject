package week04CodingProject;

public class Stuff {
	public static void findDifference(int[] x) {//since the same thing has to be completed more than once, created a method to handle it

		int result = 0;//variable to store the value that iterates in the loop
		for(int i = 0; i < x.length; i++) {
			result = x[i];//x is the placeholder for the int arrays, i is the value we iterate over to access the indexes

		}
		System.out.println(result - x[0]);
		
	}//end of findDifference
	
	
	
	
	
	
	
	
}
