/**
 * Program sederhana untuk menghitung dan mencetak deret bilangan Fibonacci.
 */
public class Fibonacci {
    /**
     * Metode utama program. Ini akan mencetak deret Fibonacci dengan jumlah bilangan
     * yang ditentukan.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        int n = 10; // Ubah nilai n sesuai dengan berapa banyak bilangan Fibonacci yang ingin Anda hitung

        System.out.println("Deret Fibonacci dengan " + n + " bilangan:");

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

         for (int i = 2; i < n; i++) {
                     fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                 }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
