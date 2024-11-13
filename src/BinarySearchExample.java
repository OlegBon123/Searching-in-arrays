import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 7, 8, 9};

        int key = 5;

        System.out.println("Результат бінарного пошуку (власна реалізація):");
        int result = binarySearch(array, key);
        if (result == -1) {
            System.out.println("Елемент не знайдений.");
        } else {
            System.out.println("Елемент знайдений за індексом: " + result);
        }

        System.out.println("\nПорівняння з бібліотечним методом Arrays.binarySearch:");
        int libraryResult = Arrays.binarySearch(array, key);
        if (libraryResult == -1) {
            System.out.println("Елемент не знайдений.");
        } else {
            System.out.println("Елемент знайдений за індексом: " + libraryResult);
        }

        key = 6;

        System.out.println("\nПеревірка відсутнього елемента:");

        int resultAbsent = binarySearch(array, key);
        if (resultAbsent == -1) {
            System.out.println("Елемент не знайдений (власна реалізація).");
        } else {
            System.out.println("Елемент знайдений за індексом: " + resultAbsent);
        }

        int libraryResultAbsent = Arrays.binarySearch(array, key);
        if (libraryResultAbsent == -1) {
            System.out.println("Елемент не знайдений (бібліотечний метод).");
        } else {
            System.out.println("Елемент знайдений за індексом: " + libraryResultAbsent);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
