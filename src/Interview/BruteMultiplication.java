package Interview;

public class BruteMultiplication {
    public static int bruteMultiplication(int x, int y){
        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }
        return product;
    }

    public static void main(String[] args){
        System.out.println(bruteMultiplication(2,1));
        System.out.println(bruteMultiplication(5,5));
        System.out.println(bruteMultiplication(11,5));
        System.out.println(bruteMultiplication(7,11));
    }
}
