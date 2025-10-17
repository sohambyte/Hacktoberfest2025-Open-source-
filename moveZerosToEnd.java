public static void moveZerosToEnd(int[] arr) {
    int count = 0; // Count of non-zero elements
    for (int num : arr) {
        if (num != 0) arr[count++] = num;
    }
    while (count < arr.length) {
        arr[count++] = 0;
    }
}
