

public class mergeSort {
		
		public static void MergeSort(int arr[] , int low , int high)
		{
			int a =0,b = 0;
			int mid = ( low + high ) / 2;
			System.out.println("mid°ª= "+ mid + "/low°ª=" + low + "/hi°ª =" + high);
		
			if(low >= high)
				{
				
				return;
				}
				MergeSort(arr, low, mid);
				MergeSort(arr, mid + 1, high);
				merge.merge(arr, low, mid, high);
				
			
			
			
		}

}