import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MissingWords {
	/*
	 * Input are two strings, string A and B.
	 * Return B missing words of A
	 */
	
	public static String missing(String A, String B){
		String wnp = "";	//words present
		String a [] = new String[A.length()];
		String b [] = new String[B.length()];
		
		a = A.split(" ");
		b = B.split(" ");
		int i = 0, j = 0;
		
		while(i<a.length  &  j<b.length){
			if(a[i].equals(b[j]) ){
				i += 1;
				j += 1;
			}else{
				wnp += a[i] + " ";
				i += 1;
			}
		}
		return wnp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String A = "I am using Hacker Rank So I am Happy";
		String B = "I  Happy";
		System.out.println(missing(A,B));
	}
}
