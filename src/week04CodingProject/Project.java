package week04CodingProject;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};//declared and initialized array ages
		 //System.out.print(findLastElement(ages));;
		System.out.print("The difference for ages is ");
		findDifference(ages);
	
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
		System.out.print("The difference for ages2 is ");
		findDifference(ages2);
	
	}//end of main

	public static void findDifference(int[] x) {//since the same thing has to be completed more than once, created a method to handle it
		int result = 0;//variable to store the value that iterates in the loop
		for(int i = 0; i < x.length; i++) {
			result = x[i];//x is the placeholder for the int arrays, i is the value we iterate over to access the indexes

		}
		System.out.println(result - x[0]);
		//return result;
	}
}//end of class
