import Chikens01.java.Day;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputdata = new Scanner(System.in);
        Day bagian1 = new Day();

        int pilihan;

        System.out.println(" Pilih Bagian : ");
        System.out.println(" 1. eggsPerChiken = 5, chikenCount = 3");
        System.out.println(" 2. eggsPerChiken = 4, chikenCount = 8");
        System.out.print(" Masukkan Pilihan : ");
        pilihan = inputdata.nextInt();

        if (pilihan == 1){
            bagian1.monday( 5, 3);
            bagian1.Tuesday(5,3);
            bagian1.Wednesday(5,3);
            bagian1.jumlahtelur(5,3);
        }

        if (pilihan == 2){
            bagian1.monday(4,8);
            bagian1.Tuesday(4,8);
            bagian1.Wednesday(4,8);
            bagian1.jumlahtelur(4,8);
        }

    }
}