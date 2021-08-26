package ContinuousMax;



public class bfsSort {
	public static int mcss_nfs(int a[])
	{
		int max = 0;
		int i=0;
		int j =0;
		int cnt = 0;
		for(i = 0; i<a.length-1; i++)
		{
			int sum = 0;	
			
			for(j = i;j< a.length-1; j++)
			{
				sum += a[j];
				if(sum > max)
				{
					max = sum;
					//low = i;
					//high = j;
					
				}
				cnt ++;
			}
		}
		System.out.println(cnt);
		return max;
	}public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={-7, 4, -3, 6, 3, -8, 3, 4};
		
		
		
			System.out.println(mcss_nfs(arr));
		
 	}

}
