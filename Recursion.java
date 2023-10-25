
public class Recursion {

	public static void main(String[] args) {
		System.out.println(sum_of_digits(1364));
		System.out.println(countdown(8));
		
		System.out.println(reverse_string("Hello"));
		
		int[] ints = { 1,4, 6, 9};
		int searchInt = 6;
		System.out.println(searchInt + " is found at index " + recursiveSearch(ints, searchInt));
		
	}
	

	public static int sum_of_digits(int posInt) {
		if (posInt/10 == 0) { // check if no digits left to lop off (besides first)
			return posInt; // if so, sum of digits is the one-digit number itself
		}
		
		int lop_off_digit = posInt/10; // using integer division
		int last_digit = posInt - lop_off_digit*10;
		int sumDigits = last_digit + sum_of_digits(lop_off_digit);
		
		
		return sumDigits;
	}
	
	
	public static String countdown(int posInt) {
		if (posInt == 1) {
			return "1";
		}
		
		int newNum = posInt - 1;
		return posInt + ", " + (countdown(newNum));
	}

	
	public static String reverse_string(String string) {
		if (string.length() == 1) {
			return string;
		}
		
		char[] char_array = string.toCharArray();
		
		char last_letter = char_array[char_array.length - 1];
				
		String newString = "";
		for (int i=0; i<char_array.length - 1; i++) {
			newString += Character.toString(char_array[i]);
		}
		
		return last_letter + reverse_string(newString);
	
	}
	
	public static int recursiveSearch(int [] ints, int searchInt) {
		int indexTracker = 0;
		
		if (ints[0] == searchInt) {
			return indexTracker;
		}
		
		int[] transferArray = new int[ints.length - 1];
		for (int i = 1; i< ints.length; i++) {
			transferArray[i-1] = ints[i]; 
		}
		
		indexTracker ++;
		
		return indexTracker + recursiveSearch(transferArray, searchInt);
		
	}
	
	
}
