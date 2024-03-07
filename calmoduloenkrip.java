import java.util.Scanner;

public class calmoduloenkrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan basis, pangkat, dan modulo
        System.out.print("Masukkan basis: ");
        long basis = scanner.nextLong();
        System.out.print("Masukkan pangkat: ");
        long pangkat = scanner.nextLong();
        System.out.print("Masukkan modulo: ");
        long modulo = scanner.nextLong();

        // Menghitung hasil pangkat dengan modulo
        long hasil = hitungPangkatModulo(basis, pangkat, modulo);

        // Menampilkan hasil
        System.out.println("Hasil pangkat modulo: " + hasil);
    }

    // Method untuk menghitung pangkat dengan modulo
    public static long hitungPangkatModulo(long basis, long pangkat, long modulo) {
        long hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = (hasil * basis) % modulo;
        }
        return hasil;
    }
}