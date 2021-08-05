package com.generics;

public class PrintArra {
public static <E> void toprint(E[] inputArray) {
	for(E element : inputArray) {
		System.out.printf("%s", element);
	}
	System.out.println();
}

public static void main(String[] args) {
	Integer[] intArray = {1, 2, 3, 4, 5 };
	Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
	Character[] charArray = {'h','e', 'l', 'l', 'o'};
	
	PrintArray.toPrint(intArray);
	PrintArray.toPrint(doubleArray);
	PrintArray.toPrint(charArray);
  }
}
