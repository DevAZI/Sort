package quickSort;

public class qSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={100, 34, 189, 56, 150, 140, 9, 123};
		
		quickSort.quickSort(arr, 0, arr.length-1);
		for (int i=0; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
 	}

}
