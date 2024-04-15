import java.util.Scanner;
public class hw7_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num_array = new int[101];
        for(int i = 0; i < 101; i++) {
            num_array[i] = 0;
        }
        for(int i = 101;;){
            i = scan.nextInt();
            if(i != 0){
                num_array[i]++;
            }
            else {
                break;
            }
        }
        for(int i = 1;i<=100;i++){
            if(num_array[i]!=0){
                System.out.println(i+" occurs  "+num_array[i]+" times");
            }
        }
    }
}
