public class MaximumDiff
{
    /* The function assumes that there are at least two
       elements in array.
       The function returns a negative value if the array is
       sorted in decreasing order.
       Returns 0 if elements are equal  */
	
	
	// find the maximum difference between two elements where i<j then a[i]<a[j]
    static int maxDiff(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr_size; i++)
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
       
        int arr[] = {7,9,5,4,9,2};
        
        int size = arr.length;
        System.out.println(MaximumDiff.maxDiff(arr, size));
        
    }
}