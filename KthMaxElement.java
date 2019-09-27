package tests;

public class KthMaxElement {

    // find kth max element
    int maxElement(int[] arr, int k) {
        int[] max = new int[k];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < max.length; j++) {
                if (arr[i] > max[j]) {
                    max[j] = arr[i];
                    break;
                }
            }
        }
        return max[k];
    }
}
