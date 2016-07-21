import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class SparceArray {

	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens())
				tk=new StringTokenizer(br.readLine());
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int Q = 0;
		ArrayList<String> sl = new ArrayList<String>();
		ArrayList<Integer> fq = new ArrayList<Integer>(); 
		
		for(int i= 0; i<N; i++){
			sl.add(sc.next());
		}
		Q = sc.nextInt();
		
		for(int i= 0; i<Q; i++){
			int f = 0;
			String q = sc.next();
			for(int j= 0; j<sl.size(); j++){
				if(sl.get(j).equals(q))
					f += 1;;
			}
			fq.add(f);
		}
		for(int i= 0; i<Q; i++){
			System.out.println(fq.get(i));
		}
	}
}
