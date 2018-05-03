public class InOrderMerge {

    public static int[] inOrderMerge(int[] x, int[] y){
        int[] sorted = new int[x.length + y.length];
        int countX = 0, countY = 0;

        for (int i = 0 ; i < sorted.length; i ++){
            if (countX < x.length && x[countX] < y[countY]){
                sorted[i] = x[countX];
                countX++;
            } else if (countY < y.length){
                sorted[i] = y[countY];
                countY++;
            }
        }
        return sorted;
    }

    public static void main(String[] args){
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = inOrderMerge(arr1, arr2);

        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
