
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,3,2,6};
		
	
	
		int max1 = 0;
		int max2 = 0;
		int mid = ((arr.length-1)/2);
		int[] arr1 = new int[mid +1];
		int[] arr2 = new int[arr.length-(mid+1)];
		for(int i = 0; i <= mid ; i++)
		{
			arr1[i] = arr[i];
		}
		int k = 0;
		for(int i = mid+1 ; i<arr.length ;i++)
		{
			arr2[k] = arr[i];
			k++;
		}

		for(int i =0; i < arr2.length; i ++)
		{
			if(arr1[i] > max1)
			{
				max1 = arr1[i];
			}
			if(arr2[i] > max2)
			{
				max2 = arr2[i];
			}
		}
		System.out.println("x"+max1);
		System.out.println("x"+max2);
		if(max1 > max2)
		{
			System.out.println(max1);
		}
		else System.out.println(max2);
		
	}

}
