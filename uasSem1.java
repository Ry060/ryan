
import java.util.Scanner;

public class uasSem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] hargaMenu = {20000, 15000, 12000, 10000, 8000, 20000, 25000};
        int total = 0; //untuk menyimpan data array yang sudah didaftarkan
        int pilihan;
        String[] namaPesanan = new String[100];
        int[] harga = new int[100];
        int[] kuantitasBeli = new int[100];

        System.out.println("=== Selamat Datang di Kafe ===");
        System.out.println();
        System.out.println("=== Menu ===");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp" + hargaMenu[i]);
        }
        System.out.println();

        do {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Data Pesanan");
            System.out.println("3. Hitung Total Biaya");
            System.out.println("4. Selesai");
            System.out.print("Pilihan menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // untuk menghilangkan

            switch (pilihan) {
                case 1:
                    System.out.print("Pilih nomor menu pesanan: ");
                    int pilihanMenu = input.nextInt();
                    input.nextLine();

                    if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
                        System.out.println("Nomor tidak valid");
                        break;
                    }

                    System.out.print("masukkan jumlah pesanan: ");
                    int kuantitas = input.nextInt();

                    namaPesanan[total] = daftarMenu[pilihanMenu - 1];
                    harga[total] = hargaMenu[pilihanMenu - 1];
                    kuantitasBeli[total] = kuantitas;
                    total++;
                    System.out.println(kuantitas + " " + daftarMenu[pilihanMenu - 1] + " berhasil ditambahkan");
                    System.out.println();
                    break;
                case 2:
                    int totalSementara = 0;
                    System.out.println();
                    System.out.println("=== Daftar pesanan ===");
                    for (int i = 0; i < total; i++) {
                        System.out.println((i + 1) + ". " + " " + namaPesanan[i] + " x" + kuantitasBeli[i] + " - Rp." + (harga[i] * kuantitasBeli[i]));
                        totalSementara += harga[i] * kuantitasBeli[i];

                        System.out.println("Total Biaya Sementara: Rp." + totalSementara);
                    }
                    System.out.println();
                    break;
                case 3:
                    int totalBayar = 0;
                    for (int i = 0; i < total; i++) {
                        totalBayar += harga[i] * kuantitasBeli[i];
                    }
                    System.out.println("total bayar: Rp." + totalBayar);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Terima kasih telah memesan di kafe kami");
                    break;
                default:
                    System.out.println("pilih tidak valid. silahkan coba lagi");

            }

        } while (pilihan != 4);

    }
}
