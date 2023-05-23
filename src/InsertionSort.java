import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,2,8,12,1,6,3,9};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(array));
    }

//    public static void insertionSort(int[] array){
//        int n = array.length;
//
//        for (int i = 1; i < n; i++){
//            int key = array[i];
//            int j = i - 1;
//
//            System.out.println("Bước " + i + " : " + Arrays.toString(array));
//
//            while (j >= 0 && array[j] > key){
//                array[j + 1] = array[j];
//                j--;
//            }
//            array[j + 1] = key;
//        }
//    }

    public static void insertionSort(int[] list){
        int n = list.length;

        for (int i = 1; i < n; i++){
            int key = list[i];
            int j = i - 1;


            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
}
