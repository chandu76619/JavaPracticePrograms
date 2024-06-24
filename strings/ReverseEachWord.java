package strings;

public class ReverseEachWord {

	
	public static void main(String[] args) {
		
		
		String name="Hello chandu";
		
		String [] a=name.split(" ");
		
		for(int i=0;i<a.length;i++) {
			
			String x=a[i];
			
			StringBuffer sb=new StringBuffer(x);
			sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
