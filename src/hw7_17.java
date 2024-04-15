import java.util.Scanner;
public class hw7_17 {
    public static void range_2(int[][] info){
        int[][] info_temp = new int[1][2];
        boolean ifDone = false;
        for(;;){
            if(ifDone){
                break;
            }
            else{
                ifDone = true;
                for(int i = 0;i<info.length-1;i++){
                    if(info[i][1]<info[i+1][1]){
                        info_temp[0][0]=info[i][0];
                        info_temp[0][1]=info[i][1];
                        info[i][0]=info[i+1][0];
                        info[i][1]=info[i+1][1];
                        info[i+1][0]=info_temp[0][0];
                        info[i+1][1]=info_temp[0][1];
                        ifDone = false;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int numOfStudent = scan.nextInt();
        String[] nameArray = new String[numOfStudent];
        int[][] stuInfo = new int[numOfStudent][2];
        for (int i = 0; i < numOfStudent; i++) {
            stuInfo[i][0] = i;
        }
        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("输入学生"+(i+1)+"姓名");
            nameArray[i] = scan.next();
            System.out.print("输入学生"+(i+1)+"成绩");
            stuInfo[i][1] = scan.nextInt();
        }
        range_2(stuInfo);
        for (int i = 0; i < numOfStudent; i++) {
            System.out.print(nameArray[stuInfo[i][0]]+"\n");
        }
    }
}
