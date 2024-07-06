import java.util.Scanner;

public class InRaHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        if (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hinh chữ nhật");
            System.out.println("2. hình tam giác vuông bên dưới trái");
            System.out.println("3. hình tam giác vuông bên dưới trên");
            System.out.println("Chọn hình bạn muốn in ra: ");
            choice = input.nextInt();
            if (choice == 1) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                    break;
                }
            } else if (choice == 2) {
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                for (int i = 7; i > 0; i--){
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
        }
    }
}