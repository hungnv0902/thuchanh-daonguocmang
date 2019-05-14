import java.util.Scanner;
public class daonguocmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang :");
        int length = input.nextInt();
        int[] arr;
        arr = new int[length];
        for(int i = 0; i < arr.length; i ++) {
            System.out.println("Nhap phan tu thu " + (i+1) + " cua mang");
            arr[i] = input.nextInt();
        }
            System.out.println("Before");
        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        int temp;

        for(int j = 0; j < arr.length/2; j ++) {
            temp = arr[j];
            arr[j] = arr[arr.length - 1 -j];
            arr[arr.length - 1 - j] = temp;
        }
            System.out.println("After");
        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
