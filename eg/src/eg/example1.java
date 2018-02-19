package eg;

public class example1 {

	public static void main(String[] args) {
		
		if (endsly("Helloly"));
		System.out.println("true!");

	}

	public static boolean endsly(String input) {
		System.out.println(input.length());
		boolean endsLY = false;
				if	(input.substring(input.length()-2, input.length()).contains("ly")) {
					endsLY = true; 
				}
		return endsLY;
	}
}

