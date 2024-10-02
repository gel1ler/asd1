//B3
import java.util.Scanner;

public class CamelCaseDivider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isUpperCase(currentChar) && i != 0) {
                res.append(' ');
            }
            res.append(currentChar);
        }

        System.out.println(res);
    }
}
