package strings;

public class StringCount {

	
	public static void main(String[] args) {
		
		
		String name="Chandu";
		
		char ch='a';
		char[] a = name.toCharArray();
		
		int count=0;
		for(int i=0;i<a.length;i++) {
		if(a[i]=='a') {
			count ++;
		}
		}
		System.out.println(count);
	}
}
