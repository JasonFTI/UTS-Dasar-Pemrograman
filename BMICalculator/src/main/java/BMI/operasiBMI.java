/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author Lenovo
 */
public class operasiBMI {
    int Bb;
    int Tb;
    double hasilBMI;
    
    public operasiBMI(int Tb, int Bb) {
       this.Bb = Bb;
       this.Tb = Tb;
    }
    
    public void hitungBMI() {
        hasilBMI = (double) Bb /Math.pow (Tb/100.0,2);
        if (hasilBMI < 18.5){
        System.out.println("Waduh Anda Kurus");
        } else if (hasilBMI >=18.5 && hasilBMI <=24.9){
            System.out.println("Selamat Anda Normal");
        } else if (hasilBMI >=25 && hasilBMI <=29.9){
            System.out.println("Selamat Anda Berlebihan");
        } else {System.out.println("Waduh cik Obesitas");
          }
    }
    public double gethasilBMI(){
        return hasilBMI;
    }
}
