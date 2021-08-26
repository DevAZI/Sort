
public class merge {

	public static void merge(int arr[], int low , int mid, int high)
	{
		int i = low;
		int j = mid +1;
		int k = low;
		int m1;
		int m2;
////////////////////
		
		  int temp[] = new int [arr.length];
		  while(k <= high) {
		  
		  if(i>mid) {
			  temp[k++] = arr[j++];
			  
		  }
		  else if(j > high) {
			  temp[k++] = arr[i++];
			 
		  } 
		  else if(arr[i] > arr[j]) {
			  temp[k++] = arr[j++];
			  
		  }
		  else {
			  temp[k++] = arr[i++];
		  }
		  }
		 
		for(int index = low ; index < k ; index ++)
		{
			arr[index] = temp[index];
			System.out.print(" "  + arr[i] + " ");
		}
		System.out.println("\n");
		
	}
	
}