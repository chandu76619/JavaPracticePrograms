package strings;

public class ReverseStringAnother {

	
	public static void main(String[] args) {
		
		String name="chandu";
		
		String str="";
		
		for(int i=name.length()-1;i>=0;i--) {
			String rev=str+name.charAt(i);
			System.out.print(rev);
		}
	}
}
