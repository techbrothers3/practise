class GFG
{

    static final int n = 3;

    // Function to find the sum of all  
    // possible submatrices of a given Matrix  
    static int matrixSum(int arr[][])
    {
        // Varialbe to store  
        // the required sum  
        int sum = 0;

        // Nested loop to find the number  
        // of submatrices, each number belongs to  
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {

                // Number of ways to choose  
                // from top-left elements  
                int top_left = (i + 1) * (j + 1);

                // Number of ways to choose  
                // from bottom-right elements  
                int bottom_right = (n - i) * (n - j);
                sum += (top_left * bottom_right * arr[i][j]);
                System.out.println(sum);
            }
        }

        return sum;
    }

    // Driver Code  
    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matrixSum(arr));
    }
}

// This code contributed by Rajput-Ji 