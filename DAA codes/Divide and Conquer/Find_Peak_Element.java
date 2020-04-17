package Divide_and_Conquer;

public class Find_Peak_Element {
	
	// Recursive function to find peak element of the array
		public static int findPeakElement(int[] A, int left, int right)
		{
			// find mid element
			int mid = (left + right) / 2;

			// check if mid element is greater than its neighbors
			if ((mid == 0 || A[mid - 1] <= A[mid]) &&
					(mid == A.length - 1 || A[mid + 1] <= A[mid])) {
				return mid;
			}

			// If the left neighbor of mid is greater than the mid element,
			// then find the peak recursively in the left sub-array
			if (mid - 1 >= 0 && A[mid - 1] > A[mid]) {
				return findPeakElement(A, left, mid - 1);
			}

			// If the right neighbor of mid is greater than the mid element,
			// then find the peak recursively in the right sub-array
			return findPeakElement(A, mid + 1, right);
		}

		// main function
		public static void main(String[] args)
		{
			int[] A = { 1, 9, 10, 2, 5, 6 };

			int index = findPeakElement(A, 0, A.length - 1);
			System.out.println("The peak element is " + A[index]);

		}

}
