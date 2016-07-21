public class Compress {
	/*
	 * input: a;aaab2%%%%aggga
	 * output: a;3ab24%a3ga
	 */
	public static String compress(String S){
		String c = "";
		char carac[] = new char[S.length()];
		carac = S.toCharArray();
		
		for(int i=0; i<carac.length; i++){
			int j=i+1; 
			int n = 0;
			while(j<carac.length ){
				char a = carac[i];
				char b = carac[j];
				if(a == b){
					n += 1;
					j += 1;
				}else
					j = carac.length;
			}
			
			i += n;
			
			if(n >0)
				c += n +1  + Character.toString(carac[i]);
			else
				c += Character.toString(carac[i]);
			
			n = 0;
		}
		
		return c;
	}
	public static void main(String[] args) {
		String S = "a;aaab2%%%%aggga";
		//String S = "a;aaabbbbba%%$%12311";
		System.out.println(compress(S));
	}

}
