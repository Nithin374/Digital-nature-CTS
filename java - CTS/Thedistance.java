import java.util.*;

public class Thedistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] firstOcc = new int[256];
        int[] lastOcc = new int[256];
        Arrays.fill(firstOcc, -1);
        Arrays.fill(lastOcc, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (firstOcc[ch] == -1) {
                firstOcc[ch] = i;
            }
            lastOcc[ch] = i;
        }
        
        int maxDist = 0;
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                if (i != j && firstOcc[i] != -1 && lastOcc[j] != -1) {
                    maxDist = Math.max(maxDist, Math.abs(firstOcc[i] - lastOcc[j]));
                }
            }
        }
        System.out.println(maxDist);
    }
}