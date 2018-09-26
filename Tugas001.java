package pbosmt3;
import java.util.Scanner;

public class Tugas001 {
    public static void main(String[] args) {
        Scanner root = new Scanner(System.in);
        System.out.println("Persamaan kuadrat ax^2 + bx + c = 0");
        System.out.print("Masukkan nilai a = ");
        double a = root.nextInt();
        System.out.print("Masukkan nilai b = ");
        double b = root.nextInt();
        System.out.print("Masukkan nilai c = ");
        double c = root.nextInt();
        
        double D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Maaf, nilai a tidak boleh sama dengan nol!");
        }
        else if (D > 0) {
            double getAkar1 = (-b + Math.pow(D, 0.5)) / (2 * a);
            double getAkar2 = (-b - Math.pow(D, 0.5)) / (2 * a);
            System.out.println("Akar-akar dari persamaan terseebut adalah x1 = " + getAkar1 + " dan x2 = " +getAkar2);
        }
        else if (D == 0) {
            double getAkar1 = -b / (2 * a);
            System.out.println("Akarnya adalah X12 = " + getAkar1);
        }
        else {
            System.out.println("Tidak punya akar.");
        }
    }
    
}

class getMethod {
    private double a, b, c;
    private double getAkar1;
    private double getAkar2;
    private double diskriminan;
    
    public getMethod(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public getMethod(double newDiskriminan) {
        diskriminan = newDiskriminan;
    }
    public double getDiskriminan() {
        return diskriminan;
    }
    public void setDiskriminan(double newDiskriminan) {
        diskriminan = Math.pow(b, 2) - 4 * a * c;
    }
}