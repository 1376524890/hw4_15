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

    public static boolean ifSuit(boolean lable[][]){
        boolean haveQ = false;
        for (int i = 0; i < 8; i++) {
            haveQ = false;
            for (int j = 0; j < 8; j++) {
                if(lable[i][j]){
                    haveQ = lable[i][j];
                    break;
                }
            }
            if(!haveQ){
                break;
            }
        }
        return haveQ;
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

            if(ifSuit(lable)){
                print(lable);
                System.out.println();
            }
//            System.out.println();
        }
    }
}
