package week04CodingProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};//declared and initialized array ages
		 
		System.out.println("1a) The difference for ages is: " + (ages[ages.length - 1] - ages[0]));
		
				/*
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

i. Make sure that there are 9 elements of type int in this new array.  

ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 */
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
		System.out.println("1b) The difference for ages2 is: " + (ages2[ages2.length - 1] - ages2[0]));
		
		/*
		 * c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		System.out.println("1c) The average for ages is: " + findAverage(ages));//created method findAverage to perform average calculations
		System.out.println("1c) The average for ages2 is: " + findAverage(ages2));
		
		/*
		 *2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. 
		 */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		/*
		 * a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 */
		
		double nameLengthAvg = 0;
		for(int i = 0; i < names.length; i++) {
			int z = names[i].length();
			nameLengthAvg = nameLengthAvg + z;
		}
		System.out.println("2a) The average number of letters is " + nameLengthAvg / names.length);
		
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		
		String concatNames = "";//created concatNames to store the value of name as they iterate thru the loop
		for(String name : names) {
			concatNames = concatNames + " " + name;
		}
		System.out.println("2b) " + concatNames);
		
		/*
		 * 3. How do you access the last element of any array?
		 */
		
		System.out.println("3) " + ages[ages.length - 1]);//[ages.length - 1] sets the index value as the length of the array - 1 since the indexes start counting at zero
		
		/*
		 * 4. How do you access the first element of any array?
		 */
		
		System.out.println("4) " + ages[0]);//arrays are zero based meaning the first value starts at index 0
		
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[6];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("5)" + Arrays.toString(nameLengths));
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 */
		int sumOfNames = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			sumOfNames = sumOfNames + nameLengths[i];
		}
		System.out.println("6) " + sumOfNames);
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
			System.out.println("7) " + helloConcat("Hello", 3));
		 
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		 */
			System.out.println("8) " + fullName("Ron", "Weasley"));
		 
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		 	
		int[] notTrue = {6, 51, 12};	
		 System.out.println("9) " + sumGreater100(ages));
		 System.out.println("9) " + sumGreater100(notTrue));	
			
		/*
		 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
		 
		 double[] decimals = {12.65, 9.13, 54.99, 34.05};
		 System.out.println("10) " + accidentallyDidThisAlready(decimals));
		 
		 /*
		  * 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		  */
		 
		 double[] decimals2 = {1.15, 9.32, 4.67};
		 System.out.println("11) " + isFirstGreater(decimals, decimals2));
		 
		 /*
		  * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		  */
		 
		 		double cashOnHand = 9.25;
		 		 Boolean isHotOutside = true;
		 		 System.out.println("12) " + willBuyDrink(isHotOutside, cashOnHand));
		 
		 		 double walletStuff = 20.07;
		 		 Boolean prettyWarmToday = false;
		 		 System.out.println("12) " + willBuyDrink(prettyWarmToday, walletStuff));
		 		 System.out.println("12) " + willBuyDrink(isHotOutside, walletStuff));
		 		 
		 /*
		  * 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		  */
		 
		 List<String> tvGuide = new ArrayList<>();
		 tvGuide.add("The Simpsons");
		 tvGuide.add("Law & Order");
		 tvGuide.add("Aerial America");
		 tvGuide.add("The News");
		 tvGuide.add("Bob's Burgers");
		 tvGuide.add("Family Guy");
		 tvGuide.add("Big Bang Theory");
		 tvGuide.add("Impractical Jokers");
		 tvGuide.add("The Walking Dead");
		 
		 System.out.print("13) ");
		 whatToWatch(tvGuide);
		 
	}//end of main

	public static String helloConcat(String word, int n) {//question 7
		String concat = "";
		for(int i = 0; i < n; i++) {
			concat += word;
		}
		return concat;
	}//end of helloConcat
	
	public static String fullName(String firstName, String lastName) {//question 8
		String comboName = firstName + " " + lastName;
		return comboName;
			}//end of fullName
	
	public static Boolean sumGreater100(int[] p) {//question 9
		int sum = 0;
		for(int i = 0; i < p.length; i++) {
			sum = sum + p[i];
		}
		if(sum > 100) {
			return true;
		} else {
			return false;
		}
	}//end of sumGreater100
	
	public static double accidentallyDidThisAlready(double[] g) {//question 10
		double sum = 0;
		for(int i = 0; i < g.length; i++) {
			sum = sum + g[i];
		}
		double avg = sum / g.length;
		return avg;
	}//end of accidentallyDidThisAlready
	
	public static Boolean isFirstGreater(double[] a, double[] b) {//question 11
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double avg = sum / a.length;
		
		double sum2 = 0;
		for(int i = 0; i < b.length; i++) {
			sum2 = sum2 + b[i];
		}
		double avg2 = sum2 / b.length;
		
		if(avg > avg2) {
			return true;
		}else {
			return false;
		}
	}//isFirstGreater
	
	public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {//question 12
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}//end of isHotOutside
	
	public static void whatToWatch(List<String> x) {//question 13 this method takes a list of shows and tells you what to watch in order of preference, if preferred shows are on. if none of the preferred shows are on then it tells you to get off the couch and do something worthwhile. i created it because sometimes we all need that extra motivation to get up and get active, unless something really really good is on tv.
		if(x.contains("Football")) {
			System.out.println("Watch football");
		}else if(x.contains("Bob's Burgers")) {
			System.out.println("Watch Bob's Burgers");
		}else if(x.contains("Impractical Jokers")) {
			System.out.println("Watch Impractical Jokers");
		}else {
			System.out.println("Go do something productive!");
		}
	}//end of whatToWatch
	
	public static double findAverage(int[] x) {
		double sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		double avg = sum / x.length;
		return avg;
	}//end of findAverage
	
	
}//end of class
