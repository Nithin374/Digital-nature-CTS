
import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        char[] original = s.toCharArray();
        char[] sortedArr = s.toCharArray();
        Arrays.sort(sortedArr);
        
        int mismatches = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] != sortedArr[i]) {
                mismatches++;
            }
        }
        System.out.println(mismatches);
    }
}