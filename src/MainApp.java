/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input angka bilangan bulat: ");
        int angka = scanner.nextInt();

        if (bilPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima karena dapat dibagi " + getBilPrima(angka));
        }
    }

    // Fungsi untuk mengecek apakah angka merupakan bilangan prima
    public static boolean bilPrima(int angka) {
        if (angka < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Fungsi untuk mendapatkan pembagi pertama dari angka yang bukan prima
    public static int getBilPrima(int angka) {
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return i;
            }
        }
        // Jika angka itu sendiri adalah bilangan prima
        return angka; 
    }
}
