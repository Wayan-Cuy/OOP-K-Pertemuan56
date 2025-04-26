package pertemuan5602;

import java.util.Scanner;

public class Pertemuan5602 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasSegiTiga segiTiga01 = new LuasSegiTiga();

        System.out.print("Masukkan alas segitiga: ");
        segiTiga01.alas = input.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        segiTiga01.tinggi = input.nextInt();

        System.out.println("Luas Segitiga: " + segiTiga01.HitungLuas());

        input.close();
    }
}
