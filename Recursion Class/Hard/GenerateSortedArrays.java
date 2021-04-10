package Hard;

import java.util.Scanner;

public class GenerateSortedArrays {

	public static void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n,
			int len, boolean flag)
	{
		if (flag)
		{
			
			if (len != 0)
				printArr(C, len + 1);

		
			for (int k = i; k < m; k++)
			{
				if (len == 0)
				{
				
					C[len] = A[k];

					generateUtil(A, B, C, k + 1, j, m, n, len, !flag);
				}
			
				else if (A[k] > C[len])
				{
						C[len + 1] = A[k];
						generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag);
				}
			}
		}
	
		else
		{
			for (int l = j; l < n; l++)
			{
				if (B[l] > C[len])
				{
					C[len + 1] = B[l];
					generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag);
				}
			}
		}
	}

	public static void generate(int A[], int B[], int m, int n)
	{
		int C[] = new int[m + n];
	
		generateUtil(A, B, C, 0, 0, m, n, 0, true);
	}

public static	void printArr(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args)
	{

	Scanner scn = new Scanner(System.in);	
      int n = scn.nextInt();
	  int m = scn.nextInt();
      int A[] = new int[n];
      for (int i = 0; i < n; i++) {
			A[i] = scn.nextInt();
		}
		int B[] = new int[m];
		for (int i = 0; i < m; i++) {
			B[i] = scn.nextInt();
		}
		generate(A, B, n, m);
	}
}
