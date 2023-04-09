import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Task3 {
    
    public static int[] arrMinusArr(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) throw new RuntimeException("Длины массивов не равны!");
        else {
            int[] result;
            result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                int val = arr1[i] - arr2[i];
                result[i] = val;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,6,10};
        int[] arr2 = {-7,10,0,3};
        int[] arr3 = {6,12};

        System.out.println(Arrays.toString(arrMinusArr(arr1, arr2)));
        System.out.println(arrMinusArr(arr1, arr3));
    }

}
