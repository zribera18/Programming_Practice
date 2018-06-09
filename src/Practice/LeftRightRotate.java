package Practice;

public class LeftRightRotate {

    public static int[] leftRightRotate(int[] x, int leftRotations, int rightRotations){

        for (int i = 0; i < leftRotations; i++){
            int tmp = x[0];
            for (int j = 0; j < x.length - 1; j++){
                x[j] = x[j+1];
            }
            x[x.length - 1] = tmp;
        }

        for (int i = 0; i < rightRotations; i++){
            int tmp = x[x.length -1];
            for (int j = x.length-1; j > 0; j--){
                x[j] = x[j-1];
            }
            x[0] = tmp;
        }
        return x;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        a = leftRightRotate(a,0, 2);

        for(int i = 0; i < a.length; i ++) {
            System.out.print(a[i] + " ");
        }
    }
}
