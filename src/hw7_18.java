import java.util.Scanner;
public class hw7_18 {
    public static void bubbleRange(double[] array){
        double array_temp;
        boolean ifDone = false;
        for(;;){
            if(ifDone){
                break;
            }
            else{
                ifDone = true;
                for(int i = 0;i<array.length-1;i++){
                    if(array[i]>array[i+1]){
                        array_temp=array[i];
                        array[i]=array[i+1];
                        array[i+1]=array_temp;
                        ifDone = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入十个数");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextDouble();
        }
        bubbleRange(array);
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
