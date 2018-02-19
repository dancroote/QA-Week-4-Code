package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"
	public String doubleChar(String input) {
		String returnWord = "";
		for (int i=0; i<input.length(); i++) {
			returnWord = returnWord + input.charAt(i) + input.charAt(i);
		}
		return returnWord; 
	}
	
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

//public String getSandwich(String input) throws StringIndexOutOfBoundsException  { 
	//	for (int i =0; i<input.length(); i++) {
		//	if (input.substring(i,i+5).contains("bread")) {
		//		input.replace(input.substring(0,i+5), "");    
		//}
	//}
		//for (int j =0; j<input.length(); j++) {  
		//	if (input.substring(j,j+5).contains("bread")) {
		//}
	//}
	//	return input;
	//}
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

public boolean evenlySpaced(int a, int b, int c) {
		
		boolean trueOrFalse = false;
		int diff1, diff2 = 0;
		int numBig = 0, numMed = 0, numSma =0;  
		
		if (a>b && b>c) { numBig = a; } else if (a>c && c>b) {numBig = a;}
		if (b>a && a>c) { numBig = b; } else if (b>c && c>a) {numBig = b;}
		if (c>b && b>a) { numBig = c; } else if (c>a && a>b) {numBig = c;}

		

		if (a>b && a<c) { numMed = a; } else if (a>c && a<b) {numMed = a;}
		if (b>a && b<c) { numMed = b; } else if (b>c && b<a) {numMed = b;}
		if (c>b && c<a) { numMed = a; } else if (a<c && c>b) {numMed = c;}
		
		if (a<b && a<c) { numSma = a; }
		if (b<a && b<c) { numSma = b; }
		if (c<b && c<a) { numSma = c; }
		
		diff1 = numBig - numMed;
		diff2 = numMed - numSma;
		if (diff1<0) diff1 = -diff1;
		if (diff1<0) diff2 = -diff2;
		
		if (diff1 == diff2 || diff1 == -diff2) {
			trueOrFalse = true;  
		}
		return trueOrFalse;
	}

	

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		return "";
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		return -1;
	}

}
