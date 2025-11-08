# SistemAkademik 🎓
## Pendaftaran Mata Kuliah - Dokumentasi JavaDocs

[![JavaDocs](https://img.shields.io/badge/JavaDocs-HTML-brightgreen)](docs/index.html)

---

### Deskripsi
Proyek ini adalah simulasi **Sistem Akademik** sederhana menggunakan Java, yang berfokus pada proses pendaftaran mahasiswa ke mata kuliah.

[cite_start]Sesuai dengan deskripsi tugas [cite: 1][cite_start], proyek ini didokumentasikan menggunakan **JavaDocs** untuk menghasilkan dokumentasi kode yang jelas dan mudah dipahami, yang akan mempermudah pemeliharaan, pembaruan, dan kolaborasi tim[cite: 2].

---

### Fitur
* Model data untuk `Mahasiswa` dan `MataKuliah`.
* Logika bisnis untuk mendaftarkan mahasiswa ke mata kuliah.
* [cite_start]Penanganan *error* (exception) saat kapasitas mata kuliah penuh[cite: 20].
* [cite_start]Dokumentasi kode lengkap menggunakan tag JavaDocs (`@param`, `@return`, `@throws`)[cite: 5, 18, 19, 20].

---

### Struktur Folder Proyek
SistemAkademik/ ├─ src/ → File sumber Java (.java) │ ├─ Mahasiswa.java → Model data mahasiswa │ ├─ MataKuliah.java → Model data mata kuliah │ └─ SistemAkademik.java→ Kelas utama (logika bisnis & simulasi) ├─ bin/ → File hasil kompilasi (.class) ├─ docs/ → Hasil dokumentasi JavaDocs (HTML) └─ README.md → Panduan proyek ini
---

### Cara Menjalankan Program
1.  Buka terminal (seperti `Git Bash`, `CMD`, atau terminal VS Code).
2.  Kompilasi semua file `.java` dari folder `src` dan simpan hasilnya di folder `bin`:

    ```bash
    javac -d bin src/*.java
    ```
3.  Jalankan program dari kelas utama (`SistemAkademik`) menggunakan *classpath* (`-cp`) ke folder `bin`:
    ```bash
    java -cp bin SistemAkademik
    ```

**Output yang Diharapkan:**
BERHASIL: Budi Santoso terdaftar di Kecerdasan Buatan Error Pendaftaran: java.lang.Exception: Kapasitas untuk Kecerdasan Buatan sudah penuh.

---

### Cara Membuat Dokumentasi (JavaDocs)
[cite_start]Untuk menghasilkan dokumentasi HTML dari komentar JavaDocs[cite: 23]:

1.  Pastikan Anda berada di direktori utama proyek (`SistemAkademik/`).
2.  Jalankan perintah `javadoc`:

    ```bash
    javadoc -d docs src/*.java
    ```
3.  [cite_start]Folder `docs/` akan terbuat secara otomatis[cite: 28]. [cite_start]Buka file `docs/index.html` di browser Anda untuk melihat hasil dokumentasi[cite: 24].