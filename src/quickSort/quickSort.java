package quickSort;

public class quickSort {
	public static void quickSort(int arr[], int low, int high)
	{
		System.out.println("¤±low = " +low +" " +"high = " +high +" ");
	if(low >= high) return;
	int pivot = partition.partition(arr,low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr,pivot+1,high);
	}
}
