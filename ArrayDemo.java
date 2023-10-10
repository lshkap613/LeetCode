package genericArray;

public class ArrayDemo {

	public static void main(String[] args) {
		// initialize size variable
		int size = 5;
		
		// create instance of GenericArray
		GenericArray ga = new GenericArray(size);
		
		// Set all 5 values
		ga.set(0,1);
		ga.set(1,2);
		ga.set(2,3);
		ga.set(3,4);
		ga.set(4,5);
		
		// print out each value of array
		System.out.println("GenericArray of integers:");
		System.out.println("The values are:");
		for(int i = 0; i < 5; i++) {
			Object value = ga.get(i);
			System.out.print(value + " ");
		}
		
		// modify array values
		ga.set(1, 9);
		ga.set(3, 8);
		
		// check array size
		Object arraySize = ga.size();
		System.out.println("\nThe size of the array is: " + arraySize);
		
		// Check if array is empty
		System.out.println("True or False: The array is empty.");
		boolean isEmpty = ga.isEmpty();
		System.out.println(isEmpty);
		
		// now testing the functionality of the GenericArray
		// for Strings:
		
		GenericArray stringGa = new GenericArray(3);
		
		// set String values
		stringGa.set(0, "One");
		stringGa.set(1, "Two");
		stringGa.set(2, "Three");
		
		// Generic Array for Strings
		System.out.println("\nGenericArray of Strings:");
		
		// Check if array is empty
		System.out.println("True or False: The array is empty.");
		boolean stringIsEmpty = stringGa.isEmpty();
		System.out.println(stringIsEmpty);
		
		// check array size
		Object stringArraySize = stringGa.size();
		System.out.println("\nThe size of the array is: " + stringArraySize);
		
		// Print out each value of the array
		System.out.println("The values are:");
		for(int j = 0; j < 3; j++) {
			Object value = stringGa.get(j);
			System.out.print(value + " ");
		}
		
		
		

	}

}
