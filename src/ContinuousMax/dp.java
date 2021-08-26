package ContinuousMax;

public class dp {
	public static int mcss_nfs(int arr[])
	{
		int n = arr.length;
		int b[] = new int[n];
		b[0] = arr[0];
 		int max = Integer.MIN_VALUE;
		
		int i;
		for(i=1; i<n; i++){
			b[i] = Math.max(0, b[i-1]) + arr[i];
			max = Math.max(b[i], max);
			} 
		return max;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={-7, 4, -3, 6, 3, -8, 3, 4};
		
		
		
			System.out.println(mcss_nfs(arr));
		
	}
}
	
	
