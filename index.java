import java.util.ArrayList;
import java.util.List;

public class index {
    public static void main(String[] args) {
        
        int[] intX = {1, 3, 5, 7, 9};
        int intY[] = {2, 4, 6, 8, 10};
        int[] intZ = new int[5];
        for (int i = 0; i < 5; i++) {
            intZ[i] = Math.max(intX[i], intY[i]);
        }
        System.out.println("Array intX = { " + arrayToString(intX) + " }");
        System.out.println("Array intY = { " + arrayToString(intY) + " }");
        System.out.println("Array intZ = intX + intY = { " + arrayToString(intZ) + " }");
    }
        private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }
        return sb.toString();
    }
}


