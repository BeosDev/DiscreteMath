public class quan_hau {
    boolean isGo[] = new boolean[30];
    boolean isCol[] = new boolean[9];
    boolean isRow[] = new boolean[9];
    int[][]x = new int[9][9];
    void find(int i){
        for (int j = 1;j<=8;j++)
            if (!isGo[i+j+8] && !isGo[i-j+8] && !isRow[i] && !isCol[j]){
                isGo[i+j+8] = true;
                isGo[i-j+8] = true;
                isRow[i] = true;
                isCol[j] = true;
                x[i][j] = 1;
                if (i==8){
                    printRes();
                }
                else
                    find(i+1);
                x[i][j] = 0;
                isGo[i+j+8] = false;
                isGo[i-j+8] = false;
                isRow[i] = false;
                isCol[j] = false;
            }
    }

    private void printRes() {
        for (int i = 1;i<9;i++) {
            System.out.println();
            for (int j = 1; j < 9; j++)
                System.out.print(x[i][j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        quan_hau q = new quan_hau();
        q.find(1);
    }
}
