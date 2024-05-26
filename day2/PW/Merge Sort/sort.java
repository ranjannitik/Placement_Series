public class sort {
    public static void merge(int[] arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;
        int[] ans = new int[high-low+1];
        int i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                ans[i++] = arr[left++];
            } else {
                ans[i++] = arr[right++];
            }
        }

        while (left <= mid) {
            ans[i++] = arr[left++];
        }

        while (right <= high) {
            ans[i++] = arr[right++];
        }

        // Copy the merged elements back to the original array
        for (i = 0; i < ans.length; i++) {
            arr[low+ i] = ans[i];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, high, mid);
        }
    }

    public static void main(String[] args) {
        int arr[] = {14, 2, 1, 44, 12, 1};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);

        // Print the sorted array after sorting is done
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
