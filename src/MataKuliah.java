/**
 * Mewakili sebuah mata kuliah dalam sistem akademik.
 *
 * @author  Raditya Nalendra Utomo
 * @version 1.0
 * @since   2025-11-04
 */
public class MataKuliah {

    private String kodeMk;
    private String namaMk;
    private int kapasitas;
    private int jumlahMahasiswa = 0; // Default 0

    /**
     * Konstruktor untuk membuat objek MataKuliah baru.
     *
     * @param kodeMk    Kode unik untuk mata kuliah (cth: "IF4031").
     * @param namaMk    Nama lengkap mata kuliah (cth: "Kecerdasan Buatan").
     * @param kapasitas Jumlah maksimal mahasiswa yang bisa mendaftar.
     */
    public MataKuliah(String kodeMk, String namaMk, int kapasitas) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.kapasitas = kapasitas;
    }

    /**
     * Mengambil nama mata kuliah.
     *
     * @return String nama mata kuliah.
     */
    public String getNamaMk() {
        return namaMk;
    }

    /**
     * Menambah jumlah mahasiswa yang terdaftar di mata kuliah ini.
     * Dipanggil oleh SistemAkademik saat pendaftaran berhasil.
     */
    public void tambahMahasiswa() {
        this.jumlahMahasiswa++;
    }

    /**
     * Memeriksa apakah kapasitas mata kuliah masih tersedia.
     *
     * @return true jika jumlah mahasiswa < kapasitas, false jika sudah penuh.
     */
    public boolean isKapasitasTersedia() {
        return this.jumlahMahasiswa < this.kapasitas;
    }
}