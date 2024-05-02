package responsi;
import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input data mahasiswa: ");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Alamat: ");
        String address = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        Student student = new Student(name, address, nim);

        System.out.println("\nInput pembayaran:");
        System.out.print("SPP: ");
        int spp = scanner.nextInt();
        student.setSpp(spp);

        System.out.print("SKS: ");
        int sks = scanner.nextInt();
        student.setSks(sks);

        System.out.print("Modul: ");
        int modul = scanner.nextInt();
        student.setModul(modul);

        System.out.println("\nTotal pembayaran untuk " + student.name + " adalah: " + student.hitungPembayaran());

        scanner.nextLine(); // Mengkonsumsi karakter newline yang ditinggalkan
        System.out.print("\nMasukkan hobi: ");
        String hobi = scanner.nextLine();
        student.hobi(hobi);

        scanner.close();
    }
}
