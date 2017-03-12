import java.util.Arrays;

public class Bitset {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   //первое множество
        int[] arr2 = {4, 7, 2, 23, 18, 0, 3, 7, 10, 15};    //второе множество
        int index = 4;  //заданный элемент (для удаления и множества)

        String res = Arrays.toString(joinArrays(arr1, arr2));
        String ind = Arrays.toString(remove(arr1, index));
        System.out.println(res);
        System.out.println(ind);
    }

    //объединение
    public static int[] joinArrays(int[] set, int[] set2) {
        if (set == null) {
            return set2;
        }
        if (set2 == null) {
            return set;
        }
        int[] res = new int[set.length + set2.length];

        System.arraycopy(set, 0, res, 0, set.length);
        System.arraycopy(set2, 0, res, set.length, set2.length);

        return res;
    }

    //удаление заданного элемента из множества (по индексу)
    public static int[] remove(int[] set, int index) {
        if (index >= 0 && index < set.length) {
            int[] res = new int[set.length - 1];
            System.arraycopy(set, 0, res, 0, index);
            System.arraycopy(set, index + 1, res, index, set.length - index - 1);
            return res;
        }
        return set;
    }

}
