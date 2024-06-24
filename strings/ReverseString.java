package strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="java";
		
		char[] a = name.toCharArray();
	
		char start=0;
		char end=(char) (a.length-1);
		
		while(start<end) {
			
			char temp=a[start];
			a[start]=a[end];
			
			a[end]=temp;
			
			start ++;
			end --;
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
		
		}
	}
}
