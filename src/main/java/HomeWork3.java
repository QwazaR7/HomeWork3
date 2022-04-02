import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArr()));
        System.out.println(Arrays.toString(handredArr()));
        System.out.println(Arrays.toString(sixArr()));
        System.out.println(Arrays.deepToString(trebleArr()));
        System.out.println(Arrays.toString(dinamicArr(10, 17)));
    }

    private static int[] newArr() {
        int[] arr = {1,0,0,0,1,1,1,0,1,0};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1){
                arr[i] = 0;
            }
        }
        return arr;
    }
    private static int[] handredArr() {
        int[] handred = new int[100];
        for (int i = 0; i < handred.length; i++) {
            handred[i] = handred[99]++;
        }
        return handred;
    }
     private static int[] sixArr() {
        int[] six = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < six.length; i++) {
            if( six[i] < 6) {
                six[i]= six[i] * 2;
            }
        }
        return six;
     }
     private static int[][] trebleArr() {
        int[][] treble = new int[3][3];
        for(int i = 0; i < treble.length; i++){
            for( int j = 0; j < treble[i].length; j++){
                if(treble[i][j] == 0) {
                    treble[i][j] = treble[i][j] + 1;
                    treble[0][1] = 0;
                    treble[1][0] = 0;
                    treble[1][2] = 0;
                    treble[2][1] = 0;
                }
            }
        }
         return treble;
     }
     private static int[] dinamicArr(int len, int initialValue) {
        int[] dinamic = new int[len];
        for(int i = 0; i < dinamic.length; i++) {
            dinamic[i] = initialValue;
        }
        return dinamic;
     }

}
