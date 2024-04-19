public class hw7_22 {
    public static void turnTo0(boolean[][] attact, int j, int i){
        for (int i_point = 0; i_point < 8; i_point++) {
            for (int j_point = 0; j_point < 8; j_point++) {
                if(i_point == i||j_point == j||D_value(i,j) == D_value(i_point,j_point)||S_value(i,j) == S_value(i_point,j_point)){
                    attact[i_point][j_point] = false;
                }
            }
        }
    }

    public static int D_value(int i, int j){
        return i-j;
    }
    public static int S_value(int i, int j){
        return i-j;
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

    public static boolean ifSuit(boolean[][] lable){
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
    public static void findNext(boolean[][] lable, int i_now, int j_now){

    }

    public static void main(String[] args) {
        boolean[][] lable = new boolean[8][8];

        if(ifSuit(lable)){
            print(lable);
            System.out.println();
        }
        System.out.println();
    }
}
