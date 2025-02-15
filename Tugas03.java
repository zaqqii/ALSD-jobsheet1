import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
 
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin dicari: ");
                    String cariHari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin dicari: ");
                    int cariSemester = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String cariNama = scanner.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, cariNama);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\n===== SELURUH JADWAL KULIAH =====");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("\n===== JADWAL KULIAH HARI " + cariHari.toUpperCase() + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + cariHari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\n===== JADWAL KULIAH SEMESTER " + cariSemester + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah untuk semester " + cariSemester);
        }
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cariNama) {
        System.out.println("\n===== HASIL PENCARIAN MATA KULIAH: " + cariNama + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.println("Mata Kuliah: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama \"" + cariNama + "\" tidak ditemukan.");
        }
    }
}
