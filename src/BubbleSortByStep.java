import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước danh sách: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Danh sách đầu vào: ");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
