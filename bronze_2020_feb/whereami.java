import java.util.*;
import java.io.*;

public class whereami {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("whereami.in"));
		int length = input.nextInt();
		String paint = input.next();
		input.close();
		
		int sh = length;
		String tester = "";
		String others = "";
		boolean repeat = false;
		for(int i = 0; i < paint.length(); i++) { //shrink the testing length.
			for(int j = 0; j <= i; j++) { // different starting points.
				tester = paint.substring(j, j + sh);
				others = paint.substring(j + 1, paint.length());
				if(others.contains(tester)) {
					repeat = true;
					break;
				}
			}
			if(repeat == true) break;
			else sh--;
		}
		sh++;
		PrintWriter output = new PrintWriter(new File("whereami.out"));
		System.out.println(sh);
		output.println(sh);
		output.close();
	}
}
