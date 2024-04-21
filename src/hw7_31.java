import java.util.Scanner;
public class hw7_31 {
    public static  void addToResult(int[] result, int[][] list, int nowList, int[] listPosi){
        if(list[nowList][listPosi[nowList]]<list[Math.abs(nowList-1)][listPosi[Math.abs(nowList-1)]]){
            nowList = Math.abs(nowList-1);
        }

        result[listPosi[0]+listPosi[1]] = list[Math.abs(nowList-1)][listPosi[Math.abs(nowList-1)]];
        listPosi[Math.abs(nowList-1)]++;
        if(list[Math.abs(nowList-1)][listPosi[Math.abs(nowList-1)]] != 0){
            addToResult(result,list,nowList, listPosi);
        }
        else {
            for (; list[nowList][listPosi[nowList]] != 0 ; listPosi[nowList]++) {
                result[listPosi[0]+listPosi[1]] = list[nowList][listPosi[nowList]];
            }
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int[][] list = new int[2][list1.length+list2.length];
        int[] result = new int[list1.length+list2.length];
        //初始化将数组归零
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = 0;
                result[j] = 0;
            }
        }

        //向二维数组list中填入两个原始数组
        for (int i = 0; i < list1.length; i++) {
            list[0][i] = list1[i];
        }
        for (int i = 0; i <list2.length ; i++) {
            list[1][i] = list2[i];
        }
        int nowList = 0;

        addToResult(result,list, nowList, new int[]{0, 0});
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个有序数组：");
        int[] lenth = new int[2];
        lenth[0] = scan.nextInt();
        int[] list1 = new int[lenth[0]];
        for (int i = 0; i < lenth[0]; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.print("请输入第二个有序数组：");
        lenth[1] = scan.nextInt();
        int[] list2 = new int[lenth[1]];
        for (int i = 0; i < lenth[1]; i++) {
            list2[i] = scan.nextInt();
        }
        int[] result = merge(list1,list2);
        for (int i = 0; i < lenth[0]+lenth[1]; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
