import java.util.Scanner;
public class hw7_12 {
    public static void reverse(int[] array){
        int[] array_temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array_temp[i] = array[array.length-1-i];
        }
        System.arraycopy(array_temp, 0, array, 0, array.length);

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
