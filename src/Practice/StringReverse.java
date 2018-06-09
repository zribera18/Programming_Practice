package Practice;

public class StringReverse {
    public static String stringReverse(String a){
        char[] x = a.toCharArray();
        String tmp = "";

        for (int i = a.length() - 1; i >= 0; i--){
            tmp += x[i];
        }
        return tmp;
    }

    public static String stringReverseInPlace(String a){
        char[] array = a.toCharArray();

        for (int i = 0; i < array.length / 2; i++){
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        return String.valueOf(array);
    }

    public static boolean palindromeChecker(String a){
        String reverse = stringReverse(a);

        if ( a.equals(reverse) ) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args){
        System.out.println(stringReverse("Hello, mom!"));
        System.out.println(stringReverseInPlace("Hello, mom!"));
        System.out.println(palindromeChecker("mom"));
    }
}
