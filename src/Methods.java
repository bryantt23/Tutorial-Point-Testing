
public class Methods {

	public int square(int x) {
		return x*x;
	}
	
	public int countA(String s) {
		int res=0;
		for(char c: s.toCharArray()) {
			if(c=='a' || c=='A') {
				res++;
			}
		}
		return res;
	}

}
