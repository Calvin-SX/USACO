import java.util.*;
import java.io.*;

public class cowgymnastics {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("gymnastics.in"));
		int practices = in.nextInt();
		int cows = in.nextInt();
		int[][] rankings = new int[practices][cows];
		for(int i = 0; i < rankings.length; i++) {
			for(int j = 0; j < rankings[0].length; j++) {
				rankings[i][j] = in.nextInt();
				//System.out.print(rankings[i][j]);
			}
			//System.out.println("");
			
		}
		//System.out.println(rankings.length);
		//System.out.println(rankings[0].length);
	
		in.close();

		int total = 0;
		
		boolean firstisfirst = true;
		int Ifirst = 0;
		int Isecond = 0;
		
		for(int first = 0; first < rankings[0].length - 1; first++) {
			for(int second = first + 1; second < rankings[0].length; second++) {
				for(int i = 1; i < rankings.length; i++) {
					for(int j = 0; j < rankings[0].length; j++) {
						if(rankings[i][j] == rankings[0][first]) {
							Ifirst = j;
						}
						if(rankings[i][j] == rankings[0][second]) {
							Isecond = j;
						}
					}
					if(Isecond < Ifirst) {
						firstisfirst = false;
						break;
					}
				}
				if(firstisfirst == true) {
					total++;
				}
				else {
					firstisfirst = true;
				}
			}
		}
		PrintWriter out = new PrintWriter(new File("gymnastics.out"));
		System.out.println(total);
		out.println(total);
		out.close();
	}
}