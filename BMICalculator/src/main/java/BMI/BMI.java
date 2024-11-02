/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat Datang di Kalkulator BMI");
        System.out.println("+------------------------------+");
        System.out.print("Masukkan tinggi badan anda : ");
        int Tb = in.nextInt();
        System.out.print("Masukkan berat badan anda : ");
        int Bb  = in.nextInt();
        
        operasiBMI jason = new operasiBMI (Tb, Bb);
        jason.hitungBMI();
        
        System.out.println("nilai BMI : " + jason.gethasilBMI());
        in.close();
    }
}
