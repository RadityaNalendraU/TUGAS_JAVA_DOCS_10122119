import java.util.ArrayList;
import java.util.List;

/**
 * Kelas utama yang mengelola proses akademik, seperti pendaftaran
 * mata kuliah oleh mahasiswa.
 *
 * @author  Raditya Nalendra Utomo
 * @version 1.0
 * @since   2025-11-04
 */
public class SistemAkademik {

    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();

    /**
     * Metode utama untuk menjalankan simulasi sistem.
     *
     * @param args Argumen command-line (tidak digunakan).
     */
    public static void main(String[] args) {
        SistemAkademik sistem = new SistemAkademik();
        
        // Inisialisasi data
        Mahasiswa budi = new Mahasiswa("Budi Santoso", "13520001");
        MataKuliah ai = new MataKuliah("IF4031", "Kecerdasan Buatan", 1); // Kapasitas hanya 1
        
        sistem.daftarMahasiswa.add(budi);
        sistem.daftarMataKuliah.add(ai);

        try {
            // Skenario 1: Pendaftaran berhasil
            sistem.daftarkanMahasiswaKeMataKuliah(budi, ai);
            
            // Skenario 2: Pendaftaran gagal (kelas penuh)
            Mahasiswa ana = new Mahasiswa("Ana Lestari", "13520002");
            sistem.daftarkanMahasiswaKeMataKuliah(ana, ai);

        } catch (Exception e) {
            System.err.println("Error Pendaftaran: " + e.getMessage());
        }
    }

    /**
     * Mendaftarkan seorang mahasiswa ke sebuah mata kuliah.
     * Metode ini akan memeriksa ketersediaan kapasitas mata kuliah.
     *
     * @param mhs Mahasiswa yang akan mendaftar. Objek {@link Mahasiswa}.
     * @param mk  Mata kuliah yang akan diambil. Objek {@link MataKuliah}.
     * @return    true jika pendaftaran berhasil.
     * @throws    Exception jika mata kuliah sudah penuh.
     */
    public boolean daftarkanMahasiswaKeMataKuliah(Mahasiswa mhs, MataKuliah mk) throws Exception {
        
        if (mk.isKapasitasTersedia()) {
            mk.tambahMahasiswa();
            System.out.println("BERHASIL: " + mhs.getNama() + " terdaftar di " + mk.getNamaMk());
            return true;
        } else {
            // Melempar exception jika kelas penuh
            throw new Exception("Kapasitas untuk " + mk.getNamaMk() + " sudah penuh.");
        }
    }
}