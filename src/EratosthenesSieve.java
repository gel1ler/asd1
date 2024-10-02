//B1
import java.util.Arrays;
import java.util.Scanner;

public class EratosthenesSieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        boolean[] arr = new boolean[target + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        for (int i = 2; Math.pow(i, 2) <= target; i++) {
            if (arr[i]) {
                for (int j = (int) Math.pow(i, 2); j <= target; j += i)
                    arr[j] = false;
            }
        }

        for (int i = 2; i <= target; i++) {
            if (arr[i])
                System.out.println(i);
        }
    }
}