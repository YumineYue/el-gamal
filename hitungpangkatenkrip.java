import java.math.BigInteger;

public class hitungpangkatenkrip {
    public static void main(String[] args) {
        BigInteger basis = new BigInteger("2");
        BigInteger pangkat = new BigInteger("1321");

        // Hitung 2^1321
        BigInteger hasil = basis.pow(pangkat.intValue());

        System.out.println("Hasil: " + hasil);
    }
}