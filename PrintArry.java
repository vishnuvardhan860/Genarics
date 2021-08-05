package com.generics;

public class PrintArry<T> {
	
	private T[] inputArry;
	
	public PrintArry(T[] inputArry) {
		this.inputArry = inputArry;
	}
	public void toPrint() {
		PrintArry.toPrint(this.inputArry);
	}
	
	public static <E> void toPrint(E[] inputArry) {
		for(E element : inputArry) {
			System.out.printf("%s",element);
		}
	}

public static void main(String[] args) {
	 Integer [] intArry = {1,2,3,4,5};
     Double  [] doubleArray ={1.1,2.2,3.3,4.4,5.5};
     Character [] charArry ={'h','e','f','e'};
     
     new PrintArry(intArry).toPrint(charArry);
     PrintArray.toPrint(doubleArray);
     PrintArray.toPrint(charArry);
     
  }	
}