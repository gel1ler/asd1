//B2
import java.util.Arrays;
import java.util.Scanner;

public class BinArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] biArr = {1, 1, 0};
        int length = biArr.length;
        boolean[] resArr = new boolean[length];
        Arrays.fill(resArr, false);

        for (int i = 0; i < length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                s.append(biArr[j]);
            }
            int n = Integer.parseInt(s.toString(), 2);
            if (n % target == 0) {
                resArr[i] = true;
            }

        }
        for (int i = 0; i < length; i++) {
            System.out.println(resArr[i]);
        }
    }
}
