public class selectionsort {
    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Array Sebelum diurutkan: ");
        printArray(unsortedArray);

        selectionSort(unsortedArray);

        System.out.print("Array Setelah diurutkan: ");
        printArray(unsortedArray);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Temukan nilai minimum dalam sisa array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar nilai minimum dengan nilai pada posisi i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}