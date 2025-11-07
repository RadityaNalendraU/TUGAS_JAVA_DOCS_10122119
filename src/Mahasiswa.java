/**
 * Mewakili seorang mahasiswa dalam sistem akademik.
 * Kelas ini menyimpan informasi dasar seperti nama dan NIM.
 *
 * @author  Raditya Nalendra Utomo
 * @version 1.0
 * @since   2025-11-04
 */
public class Mahasiswa {

    private String nama;
    private String nim; // Nomor Induk Mahasiswa

    /**
     * Konstruktor untuk membuat objek Mahasiswa baru.
     *
     * @param nama Nama lengkap mahasiswa.
     * @param nim  Nomor Induk Mahasiswa yang unik.
     */
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    /**
     * Mengambil nama mahasiswa.
     *
     * @return String nama mahasiswa.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil NIM mahasiswa.
     *
     * @return String NIM mahasiswa.
     */
    public String getNim() {
        return nim;
    }

    /**
     * Mengembalikan representasi String dari objek Mahasiswa.
     *
     * @return String format "NIM - Nama".
     */
    @Override
    public String toString() {
        return nim + " - " + nama;
    }
}