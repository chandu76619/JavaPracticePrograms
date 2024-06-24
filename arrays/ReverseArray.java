package arrays;

public class ReverseArray {

	
	public static void main(String[] args) throws Exception {
		
		int a[]= {1,2,8,5,6,7};
		/*	
		int temp=0;
		
		for(int i=0;i<a.length/2;i++) {
			
			temp=a[i];
			
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		for(int n:a) {
			System.out.println(n);
		}
		*/
		
		int start=0;
		int end=a.length-1;
		
		
		
		while(start<end) {
			
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
