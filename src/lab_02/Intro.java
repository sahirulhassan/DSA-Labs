package lab_02;

public class Intro {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[5];
        jagged[2] = new int[1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j]);
            }
            System.out.println();
        }
    }
}






