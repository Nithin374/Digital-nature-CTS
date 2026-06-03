mport java.util.*;

public class GeneratedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        
        visited.add(n);
        queue.add(n);
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current - a > 0 && !visited.contains(current - a)) {
                visited.add(current - a);
                queue.add(current - a);
            }
            if (current - b > 0 && !visited.contains(current - b)) {
                visited.add(current - b);
                queue.add(current - b);
            }
        }
        System.out.println(visited.size());
    }
}