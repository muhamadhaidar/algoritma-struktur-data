public class insertionsort {
    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Array Sebelum diurutkan: ");
        printArray(unsortedArray);

        insertionSort(unsortedArray);

        System.out.print("Array Setelah diurutkan: ");
        printArray(unsortedArray);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Pindahkan elemen-elemen yang lebih besar dari key ke posisi satu index di depannya
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Tempatkan key pada posisi yang tepat
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}