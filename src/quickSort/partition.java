package quickSort;

public class partition {
	public static int partition(int arr[],int low,int high)
	{
		System.out.println("low = " +low +" " +"high = " +high +" ");
		int i = low;
		int j = high +1;
		for (int ji=0; ji < arr.length ; ji++)
		{
			System.out.print(arr[ji] + " ");
		}
		System.out.println("\n");
		while (true) {
			while (arr[++i] < arr[low]) {
				if (i == high) break;
			}
			while (arr[low] < arr[--j]) {
				if (j == low) break;
			}
			if (i >= j) break;
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	
		int tmp = arr[low];
		arr[low] = arr[j];
		arr[j] = tmp;
		System.out.println("p = " + j);
		return j;
	}
}
