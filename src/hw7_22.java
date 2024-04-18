public class hw7_22 {
    public static void turnTo0(boolean[][] lable, int j, int i){
        for (int i_change = i+1; i_change < 8; i_change++) {
            lable[i_change][j] = false;
        }
        for (int j_change = j+1; j_change < 8; j_change++) {
            lable[i][j_change] = false;
        }
        for (int i_change = i+1,j_change = j+1; j_change < 8&&i_change<8; j_change++,i_change++) {
            lable[i_change][j_change] = false;
        }

        for (int i_change = i-1; i_change >= 0; i_change--) {
            lable[i_change][j] = false;
        }
        for (int j_change = j-1; j_change >= 0; j_change--) {
            lable[i][j_change] = false;
        }
        for (int i_change = i-1,j_change = j-1; j_change >= 0&&i_change >= 0; j_change--,i_change--) {
            lable[i_change][j_change] = false;
        }

//       System.out.println("测试");
//        for(int m = 0;m<8;m++){
//            for(int n = 0;n<8;n++){
//                if(lable[m][n]){
//                    System.out.print("Q ");
//                }
//                else {
//                    System.out.print("X ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("测试结束");
    }

    public static void print(boolean[][] lable){
        for (int i = 0; i <8; i++) {
            for (int j = 0; j < 8; j++) {
                if(lable[i][j]) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] lable = new boolean[8][8];

        //i为行，j为列
        for(int j_sta = 0;j_sta<8; j_sta++){
            for(int i = 0;i<8;i++){
                for(int j = 0;j<8;j++){
                    lable[i][j] = true;
                }
            }
            turnTo0(lable,j_sta,0);
            for (int i = 1; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if(lable[i][j]){
                        turnTo0(lable,j,i);
                        break;
                    }
                }
            }
            boolean[] check = new boolean[8];
            for (int i = 0; i < 8; i++) {
                check[i] = false;
            }

            for(int i = 0;i<8;i++){
                for(int j = 0;j<8;j++){
                    if(!lable[i][j]){
                        check[i] = true;
                    }
                }
            }
            boolean check_total = true;
            for (int i = 0; i < 8; i++) {
                if(!check[i]){
                    check_total = false;
                }
            }
            if(check_total){
                print(lable);
                System.out.println();
            }
            System.out.println();
        }
    }
}
