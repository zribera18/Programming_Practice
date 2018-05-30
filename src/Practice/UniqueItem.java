package Interview;

import java.util.ArrayList;

public class UniqueItem {

    public static <E> E uniqueItem(E[] array){
        ArrayList<E> unique= new ArrayList<E>();

        for ( E item : array){
            if (unique.contains(item)) {
                unique.remove(item);
            } else {
                unique.add(item);
            }
        }

        return unique.get(0);
    }

    public static void main(String[] args){
        String[] strArray = {"Hello", "Husky", "Dog", "Hello", "Dog"};
        Integer[] intArray = {1,2,3,4,5,1,2,3,4,5,7};
        System.out.println(uniqueItem(strArray));
        System.out.println(uniqueItem(intArray));

    }
}
