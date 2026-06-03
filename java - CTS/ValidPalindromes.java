
import java.util.*;

public class ValidPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        
        int left = 0;
        int right = s.length() - 1;
        long ways = 1;
        
        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            if (left == right) {
                if (leftChar == '_') {
                    ways = (ways * 26) % n;
                }
            } else {
                if (leftChar == '_' && rightChar == '_') {
                    ways = (ways * 26) % n;
                } else if (leftChar == '_' || rightChar == '_') {
                    ways = (ways * 1) % n;
                } else if (leftChar != rightChar) {
                    System.out.println(0);
                    return;
                }
            }
            left++;
            right--;
        }
        System.out.println(ways);
    }
}