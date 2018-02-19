
public class example1 {

	public static void main(String[] args) {
		
		if (endsly("Helloly"));
		System.out.println("true!");

	}

	public static boolean endsly(String input) {
		boolean endsLY = false;
				if	(input.substring(input.length(), input.length()-2).contains("ly")) {
					endsLY = true; 
				}
		return endsLY;
	}
}
