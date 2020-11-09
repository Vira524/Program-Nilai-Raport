package com.Vira;

import java.util.Scanner;

public class programNilai {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        int pengetahuan, keterampilan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Pengetahuan");
        pengetahuan =input.nextInt();
        System.out.println("Masukkan Nilai Keterampilan");
        keterampilan = input.nextInt();
        System.out.println("-----Info Nilai Raport-----");
        System.out.println("Nilai Pengetahuan = " + nilai.getnilaiPengetahuan(pengetahuan));
        System.out.println("Nilai Keterampilan = " + nilai.getnilaiKeterampilan(keterampilan));

        //pengetahuan
        if (nilai.getnilaiPengetahuan(pengetahuan) >=91 && nilai.getnilaiPengetahuan(pengetahuan) <=100 ){
            System.out.println("-----Hasil Konversi-----");
            System.out.println("Konversi Pengetahuan = A" );
        }
        else if (nilai.getnilaiPengetahuan(pengetahuan) >=81 && nilai.getnilaiPengetahuan(pengetahuan) <=90 ){
            System.out.println("-----Hasil Konversi-----");
            System.out.println("Konversi Pengetahuan = B+" );
        }
        else if (nilai.getnilaiPengetahuan(pengetahuan) >=71 && nilai.getnilaiPengetahuan(pengetahuan) <=80 ){
            System.out.println("-----Hasil Konversi-----");
            System.out.println("Konversi Pengetahuan = B" );
        }
        else if (nilai.getnilaiPengetahuan(pengetahuan) >=60 && nilai.getnilaiPengetahuan(pengetahuan) <=70){
            System.out.println("-----Hasil Konversi-----");
            System.out.println("Konversi Pengetahuan = C" );
        }
        else{
            System.out.println("-----Hasil Konversi-----");
            System.out.println("Konversi Pengetahuan = D");
        }

        //ketrampilan
        if (nilai.getnilaiKeterampilan(keterampilan) >=91 && nilai.getnilaiKeterampilan(keterampilan) <=100 ){
            System.out.println("Konversi Keterampilan = A" );
        }
        else if (nilai.getnilaiKeterampilan(keterampilan) >=81 && nilai.getnilaiKeterampilan(keterampilan) <=90 ){
            System.out.println("Konversi Keterampilan = B+" );
        }
        else if (nilai.getnilaiKeterampilan(keterampilan) >=71 && nilai.getnilaiKeterampilan(keterampilan) <=80 ){
            System.out.println("Konversi Keterampilan = B" );
        }
        else if (nilai.getnilaiKeterampilan(keterampilan) >=60 && nilai.getnilaiKeterampilan(keterampilan) <=70){
            System.out.println("Konversi Keterampilan = C" );
        }
        else{
            System.out.println("Konversi Keterampilan = D" );
        }

    }
}
