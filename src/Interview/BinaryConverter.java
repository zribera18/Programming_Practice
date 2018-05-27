package Interview;

public class BinaryConverter {
    public static String binaryConverter(int n){
        String binary = "";

        while (n != 0) {
            if ( n % 2 == 0 ){
                binary = "0" + binary;
            } else {
                binary = "1" + binary;

            }
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args){
        System.out.println(binaryConverter(1));
        System.out.println(binaryConverter(2));
        System.out.println(binaryConverter(4));
        System.out.println(binaryConverter(8));
        System.out.println(binaryConverter(10));
        System.out.println(binaryConverter(11));
        System.out.println(binaryConverter(256));
    }
}
