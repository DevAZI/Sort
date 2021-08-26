package ContinuousMax;

public class mergeSort {
	public static int mcss_rec(int a[], int low, int high)
	{
		if(low == high)
		{
			return a[low];
		}
		 
		int mid=(low + high)/2;
	
		int left_sum = mcss_rec(a,low,mid);
		int right_sum = mcss_rec(a,mid+1,high);
		
		int sum = 0;
		int lsum = 0;
		int rsum=0;
		int two_sided_sum = 0;
		lsum  = sum = a[mid];
		for(int i = mid -1; i >= low ;--i )
		{
			sum += a[i];
			if(sum > lsum)
			{
				lsum = sum;
			}
		}
		for(int i = mid +1; i <= high ; ++i )
		{
			sum += a[i];
			if(sum > rsum)
			{
				rsum= sum;
			}
		}
		two_sided_sum = lsum + rsum;
		return max(left_sum, right_sum,two_sided_sum);

	}

	public static int max(int left_sum, int right_sum, int two_sided_sum) {
		// TODO Auto-generated method stub
		int max = 0;
		if(right_sum < left_sum && right_sum < two_sided_sum)
		{
			 max  = right_sum;
		}
		else if(left_sum < right_sum && left_sum < two_sided_sum)
		{
			 max = left_sum;
		}
		else   max = two_sided_sum;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, -1, 2, 0, -1, -1, 3, 1, 2, 0, 2,
				-1, 0, -2, -1, 0, 1 };
		
		System.out.println(mcss_rec(arr, 0 , arr.length-1));
	}
}

