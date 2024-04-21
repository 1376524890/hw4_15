import java.util.Scanner;
public class hw7_28 {
    public static int[] allNumber = new int[10];
    public static void input(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            allNumber[i] = scan.nextInt();
        }
    }
    public static void printNext(int lastID,int firstID){
        if(lastID < 9){
            lastID++;
            System.out.println(allNumber[firstID]+" "+allNumber[lastID]);
            printNext(lastID,firstID);
        }
    }

    public static void main(String[] args) {
        input();
        for (int i = 0; i < 10; i++) {
            printNext(i,i);
        }
    }
}
