//main
public class BinSearch {
    public static int binSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int recBinSearch(int[] arr, int target) {
        return recBinSearch(arr, target, 0, arr.length - 1);
    }

    public static int recBinSearch(int [] arr, int target, int left, int right){
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        else if(arr[mid] < target) {
            return recBinSearch(arr, target, mid + 1, right);
        }
        else {
            return recBinSearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 5;

        int result = binSearch(arr, target);
        int recResult = recBinSearch(arr, target);

        System.out.println("1. Элемент найден на позиции: " + (result + 1));
        System.out.println("2. Элемент найден на позиции: " + (recResult + 1));

    }
}