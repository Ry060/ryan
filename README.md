Pendahuluan Program
java
Salin
public class uasSem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Program dimulai dengan mendeklarasikan kelas uasSem1, yang merupakan kelas utama.
Kemudian, objek Scanner dibuat dengan nama input yang akan digunakan untuk membaca input dari pengguna.
2. Deklarasi Menu dan Harga
java
Salin
String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
int[] hargaMenu = {20000, 15000, 12000, 10000, 8000, 20000, 25000};
daftarMenu: Array yang berisi daftar menu makanan dan minuman yang tersedia di kafe.
hargaMenu: Array yang berisi harga untuk setiap menu yang ada di daftarMenu. Harga menu yang bersesuaian dengan item pada indeks yang sama.
3. Inisialisasi Variabel Pesanan
java
Salin
int total = 0; // untuk menyimpan data array yang sudah didaftarkan
int pilihan;
String[] namaPesanan = new String[100];
int[] harga = new int[100];
int[] kuantitasBeli = new int[100];
total: Variabel yang menyimpan jumlah pesanan yang sudah dimasukkan oleh pengguna.
pilihan: Variabel yang digunakan untuk menyimpan pilihan menu dari pengguna.
namaPesanan, harga, dan kuantitasBeli adalah array untuk menyimpan data pesanan yang dimasukkan oleh pengguna, yaitu:
namaPesanan[]: Nama makanan atau minuman yang dipesan.
harga[]: Harga makanan atau minuman yang dipesan.
kuantitasBeli[]: Jumlah atau kuantitas item yang dipesan.
4. Menampilkan Menu Kafe
java
Salin
System.out.println("=== Selamat Datang di Kafe ===");
System.out.println("=== Menu ===");
for (int i = 0; i < daftarMenu.length; i++) {
    System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp" + hargaMenu[i]);
}
Program menampilkan pesan selamat datang di kafe.
Kemudian menampilkan daftar menu beserta harga untuk setiap menu, di mana setiap menu ditampilkan dengan nomor urut menggunakan for loop.
5. Menu Utama (Pilihan Pengguna)
java
Salin
do {
    System.out.println("=== Menu Utama ===");
    System.out.println("1. Tambah Pesanan");
    System.out.println("2. Tampilkan Data Pesanan");
    System.out.println("3. Hitung Total Biaya");
    System.out.println("4. Selesai");
    System.out.print("Pilihan menu: ");
    pilihan = input.nextInt();
    input.nextLine(); // untuk menghilangkan karakter newline
Menampilkan menu utama dengan 4 pilihan:
1. Tambah Pesanan: Menambah pesanan baru.
2. Tampilkan Data Pesanan: Menampilkan daftar pesanan yang sudah dipilih.
3. Hitung Total Biaya: Menghitung total biaya pesanan yang sudah dimasukkan.
4. Selesai: Mengakhiri program.
Input pengguna dibaca untuk memilih menu yang diinginkan.
6. Switch Case untuk Menangani Pilihan
Case 1: Menambah Pesanan
java
Salin
case 1:
    System.out.print("Pilih nomor menu pesanan: ");
    int pilihanMenu = input.nextInt();
    input.nextLine();
    if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
        System.out.println("Nomor tidak valid");
        break;
    }
    System.out.print("Masukkan jumlah pesanan: ");
    int kuantitas = input.nextInt();
    namaPesanan[total] = daftarMenu[pilihanMenu - 1];
    harga[total] = hargaMenu[pilihanMenu - 1];
    kuantitasBeli[total] = kuantitas;
    total++;
    System.out.println(kuantitas + " " + daftarMenu[pilihanMenu - 1] + " berhasil ditambahkan");
    break;
Pengguna diminta memilih menu berdasarkan nomor yang ada di daftar.
Program memeriksa apakah nomor menu valid.
Pengguna kemudian diminta untuk memasukkan jumlah pesanan.
Setelah itu, program menyimpan data pesanan (nama menu, harga, dan kuantitas) ke dalam array.
Variabel total ditambah untuk melacak jumlah pesanan yang telah ditambahkan.
Case 2: Menampilkan Data Pesanan
java
Salin
case 2:
    int totalSementara = 0;
    System.out.println("=== Daftar Pesanan ===");
    for (int i = 0; i < total; i++) {
        System.out.println((i + 1) + ". " + namaPesanan[i] + " x" + kuantitasBeli[i] + " - Rp." + (harga[i] * kuantitasBeli[i]));
        totalSementara += harga[i] * kuantitasBeli[i];
    }
    System.out.println("Total Biaya Sementara: Rp." + totalSementara);
    break;
Program menampilkan semua pesanan yang telah dimasukkan, beserta kuantitas dan total harga untuk setiap item.
totalSementara menghitung total biaya sementara setelah semua pesanan ditampilkan.
Menampilkan total biaya sementara setelah seluruh daftar pesanan.
Case 3: Menghitung Total Biaya
java
Salin
case 3:
    int totalBayar = 0;
    for (int i = 0; i < total; i++) {
        totalBayar += harga[i] * kuantitasBeli[i];
    }
    System.out.println("Total Bayar: Rp." + totalBayar);
    break;
Menghitung total pembayaran berdasarkan harga dan kuantitas masing-masing pesanan yang sudah dimasukkan.
Program menjumlahkan harga seluruh pesanan dan menampilkan total biaya yang harus dibayar.
Case 4: Mengakhiri Program
java
Salin
case 4:
    System.out.println("Terima kasih telah memesan di kafe kami");
    break;
Program mengucapkan terima kasih dan selesai. Program akan berhenti setelah pengguna memilih opsi 4.
7. Menangani Pilihan yang Tidak Valid
java
Salin
default:
    System.out.println("Pilihan tidak valid. Silakan coba lagi");
Jika pengguna memilih angka yang tidak valid (selain 1, 2, 3, atau 4), program akan memberi tahu pengguna untuk mencoba lagi.
8. Looping Hingga Pengguna Keluar
java
Salin
} while (pilihan != 4);
Selama pilihan yang dimasukkan tidak sama dengan 4 (pilihan untuk selesai), program akan terus menjalankan loop dan menampilkan menu utama
