package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra:");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; count < number; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.print(i + " ");
                count ++;
            }
        }
    }
}
