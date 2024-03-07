//deltaenkrip

import java.math.BigInteger;

public class deltaenkrips {
    public static void main(String[] args) {
        // Inisialisasi nilai basis dan pangkat
        BigInteger basis = new BigInteger("949");
        BigInteger pangkat = new BigInteger("1321");

        // Hitung hasil pangkat
        BigInteger hasil = basis.pow(pangkat.intValue());

        // Tampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
} 