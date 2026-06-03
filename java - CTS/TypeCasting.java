import java.util.Scanner;
class TypeCasting {
    public static void main(String[] args) {
        double d = 45.67;
        int i = (int)d;
        System.out.println("Double value: " + d);
        System.out.println("Converted to int: " + i);
        int x = 20;
        double y = (double)x;
        System.out.println("Integer value: " + x);
        System.out.println("Converted to double: " + y);
    }
}