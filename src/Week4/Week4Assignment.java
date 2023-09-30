package Week4;

public class Week4Assignment {
	public static void main(String[] args) {
	
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    //	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	System.out.println("1a: Subtract first element from the last element");
	System.out.println(ages[ages.length - 1] - ages[0]);
	
    //	b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	System.out.println("1b: Repeat subtract first value from the last");
	int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 7};
	System.out.println(ages2[ages2.length - 1] - ages2[0]);

    //	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	System.out.println("1c: Calculate the average age");
	int sum = 0;
	for (int age : ages){
		sum += age;
	}
	System.out.println(sum / ages.length);
	System.out.println();
	
//	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	System.out.println("2a: Calculate the average number of letters per name");
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    //  a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
    int nameSum = 0;
	for (String name : names) {
		nameSum += name.length();
	}
	System.out.println(nameSum / names.length);
	
    //	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	System.out.println("2b: Iterate through the array again and concatenate all the names together");
//	create a variable to put the final result in
	String result = "";
//	for every string in the array give it a name of name 
	for (String name : names){
//		if the name is equal to the last variable in the array
		if (name == names[names.length -1]) {
//			add it to the result string without a space
			result += name;
			} else {
//				add the name to the result string with a space
				result += (name + " ");
			}
		}
		System.out.println(result);
	System.out.println();
//	3. How do you access the last element of any array?
	System.out.println("3: Access last element of any array");
	System.out.println("The Example: ages[ages.length - 1] uses the array name ages and the length of the array minus one to get the last index ");
	System.out.println();
	
//	4. How do you access the first element of any array?
    System.out.println("4: Access the first element of any array");
	System.out.println("The Example: ages[0] uses the array name ages and the index 0");
	System.out.println();
	
//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	System.out.println("5: nameLengths");
	System.out.println();
	
//	create new int array that is as long as the names array
	int[] nameLengths = new int[names.length];
//	loop gets each 
	for (String name : names) {
		System.out.println(name + ": " +name.length());	
	}
//	loop gets the position and the length
	for (int i = 0; i < names.length; i++) {
//		creates the new array
		nameLengths[i] = names[i].length();
		System.out.println(i + ": " +nameLengths[i]);
	}
//	loop gets each length from previously created nameLengths.  same as nameLengths[i]
	for (int num : nameLengths) {
		System.out.println(num);
	}

//	System.out.println(nameLengths);  Arrays don't print like this. This returns the memory location of the variable  
	System.out.println();
	
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("6: Sum of nameLengths array: ");
		int sumResult = 0;
		for (int number : nameLengths) {
			sumResult += number;
		}
		System.out.println(sumResult);
	System.out.println();
	
//	7.
	System.out.println("7: word concatenated to itself n number of times: " +wordRepeat("word", 3));
	System.out.println();
	
//	8.	
	System.out.println("8: Returns a full name: " + returnName("Ann-Marie", "Orozco"));
	System.out.println();
	
//	9. 
	System.out.println("9: Sum is greater than 100: " + greatThan100(209));
	System.out.println();
	
// 10.
	double[] doubArray = {1.0, 8.0, 9.0, 8.0, 6.0, 7.0};
	System.out.println("10: Return the avgerage of an double array: " + getAvg(doubArray));
	System.out.println();
	
//	11.
	double[] first = {1.0, 8.0, 9.0, 8.0, 6.0, 7.0};
	double[] second = {5.0, 8.0, 3.0, 8.0, 7.0, 3.0};
	System.out.println("11 Return True if first avgerage is greater: " + firstArrayAvgGrater(first, second));
	System.out.println(); 
	
//	12.
	System.out.println("12: Will Buy a drink: " + willBuyDrink(true, 11.00));
	System.out.println();
	
//	13.
    System.out.println("13 ");
	System.out.println();
	
	}
	
//	THE METHODS:
	
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	static String wordRepeat(String word, int n) {
			String newString = "";
			for (int i = 0; i < n; i++) {
				newString += word;
			}
			return newString;	
	}
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String returnName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}
	
//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean greatThan100(int num) {
		if (num > 100) {
			return true;
		} 
		return false;
	}
	
//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double getAvg(double[] array) {
		int sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length;
	}
	
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstArrayAvgGrater(double[] first, double[] second) {
		double sum1 = 0;
		for (double num : first) {
			sum1 += num;
		}
		double avg1 = sum1/ first.length;
		
		double sum2 = 0;
		for (double num : second) {
			sum2 += num;
		}
		double avg2 = sum2/ second.length;
		
		if (avg1 > avg2) {
			return true;
		} 
		return false;
	}
	
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (moneyInPocket > 10.50 && isHotOutside == true){
			return true;
		}
		return false; 
	}
	
//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	
	
}
