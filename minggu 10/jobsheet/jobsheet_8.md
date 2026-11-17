# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** Fahri Raihan Baldan
* **NIM:** 264107020067
* **Kelas / No. Presensi:** 1D/15

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang pada algoritma
2. Memahami alur perulangan bersarang
3. Mengenal sintaks perulangan bersarang
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Review Perulangan 1

Percobaan ini mengulang konsep perulangan FOR sebelum mempelajari perulangan bersarang. Program menampilkan karakter `*` sebanyak *n* kali secara mendatar (ke arah samping). Input *n* berupa bilangan bulat positif. File: `StarNoAbsen.java`.

#### 2.1.1 Kode Program Java
```java
// tulis kode StarNoAbsen.java di sini
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

**Screenshot n = 5**

![alt text](SS_P1_n5.png)

**Pengujian dengan nilai n lain:**

| Uji | Nilai n | Jumlah karakter `*` yang muncul |
| :---: | :---: | :---: |
| 1 | 3 | |
| 2 | 5 | |
| 3 | 7 | |

**Screenshot n = 3**

![alt text](SS_P1_n3.png)

**Screenshot n = 7**

![alt text](SS_P1_n7.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika n = 5? Jelaskan.
  * **Jawab:**
* **Pertanyaan 2:** Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat n = 5? Mengapa hasilnya berbeda?
  * **Jawab:**
* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya.
    ```java
    for (int i = 2; i <= n; i += 2) {
        System.out.print(i + " ");
    }
    ```
  * **Prediksi output:**
  * **Hasil pembuktian (screenshot):**

    ![alt text](SS_P1_Q3.png)
  * **Modifikasi kode agar mencetak bilangan ganjil positif yang tidak melebihi n:**
    ```java
    // tulis kode modifikasi di sini
    ```
    ![alt text](SS_P1_Q3_ganjil.png)
* **Pertanyaan 4:** Jelaskan mengapa perubahan *increment* `i++` menjadi `i--` (dengan kondisi tetap `i <= n`) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk n positif. (Jangan dijalankan; jika terlanjur berjalan, hentikan dengan Ctrl + C.)
  * **Jawab:**

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Pada percobaan ini digunakan *nested loop* FOR untuk mencetak persegi panjang bintang. Jumlah baris dan kolom dimasukkan secara terpisah. *Outer loop* mengatur **baris**, sedangkan *inner loop* mengatur **kolom**. File: `RectangleNoAbsen.java`.

Contoh input baris = 3 dan kolom = 6:
```
******
******
******
```

#### 2.2.1 Kode Program Java
```java
// tulis kode RectangleNoAbsen.java di sini
```

#### 2.2.2 Hasil Running / Screenshot Output

| Uji | Baris | Kolom |
| :---: | :---: | :---: |
| 1 | 3 | 6 |
| 2 | 4 | 2 |
| 3 | 1 | 5 |

**Screenshot**

![alt text](SS_P2_uji1.png)
![alt text](SS_P2_uji2.png)
![alt text](SS_P2_uji3.png)

**Perbandingan bentuk ketiga output:**

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j` pada program tersebut.
  * **Jawab:**
* **Pertanyaan 2:** Berapa kali *outer loop*, *inner loop*, dan perintah `print("*")` dijalankan untuk baris = 4 dan kolom = 7?
  * **Jawab:**
* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan `kolom`, inner menggunakan `baris`)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.
  * **Jawab:**
* **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah *inner loop*.
  * **Jawab:**
* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah `#`.
  * **Kode modifikasi:**
    ```java
    // tulis kode di sini
    ```
  * **Screenshot:**

    ![alt text](SS_P2_Q5.png)

---

### 2.3 Percobaan 3: Debugging Bintang Segitiga - Nested WHILE

Kode awal pada percobaan ini sengaja dibuat belum menghasilkan format segitiga yang benar. Tugas: mengidentifikasi kesalahan dan memperbaikinya **tanpa** mengganti struktur WHILE menjadi FOR. File: `TriangleNoAbsen.java`.

Output target untuk n = 5:
```
*
**
***
****
*****
```

#### 2.3.1 Kode Program Java

**Kode awal (sebelum diperbaiki):**
```java
// tulis kode awal di sini
```

**Kode akhir (setelah diperbaiki, tanpa baris debug):**
```java
// tulis kode hasil perbaikan di sini
```

#### 2.3.2 Hasil Running / Screenshot Output

**Output aktual kode awal (bandingkan dengan output target):**

| Uji | Nilai n | Output aktual |
| :---: | :---: | :--- |
| 1 | 3 | |
| 2 | 5 | |

![alt text](SS_P3_awal_n3.png)
![alt text](SS_P3_awal_n5.png)

**Hasil dengan baris debug (n = 5):**

![alt text](SS_P3_debug.png)

**Hasil setelah perbaikan 6a (println ditambahkan):**

![alt text](SS_P3_6a.png)

**Hasil setelah perbaikan 6b (outer loop diperbaiki):**

![alt text](SS_P3_6b.png)

**Hasil akhir (segitiga + segitiga terbalik, n = 5):**

![alt text](SS_P3_akhir.png)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi

**Pengamatan debug (n = 5):**
* **a.** Berapa kali *outer loop* dijalankan? Apakah sama dengan jumlah baris yang diinginkan?
  * **Jawab:**
* **b.** Berapa karakter `*` yang tercetak saat `i = 0`?
  * **Jawab:**
* **c.** Mengapa semua karakter tampil dalam satu baris?
  * **Jawab:**

**Pertanyaan:**
* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
  * **Jawab:**
* **Pertanyaan 2:** Jelaskan peran variabel `i` dan `j`. Mengapa nilai `j` harus diinisialisasi kembali ke 0 pada setiap iterasi *outer loop*? Apa yang terjadi jika `j` tidak di-*reset*?
  * **Jawab:**
* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (*update*) pada *outer loop* yang diperlukan untuk membentuk segitiga terbalik.
  * **Jawab:**

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Program menerima jumlah kelompok dan jumlah penilai yang sama untuk setiap kelompok, kemudian menghitung rata-rata nilai tiap kelompok dan menentukan kelompok dengan rata-rata tertinggi. Menggunakan tiga tingkat perulangan: WHILE (kelompok), FOR (penilai), dan DO-WHILE (validasi nilai 0-100). File: `NilaiKelompokNoAbsen.java`.

#### 2.4.1 Kode Program Java
```java
// tulis kode NilaiKelompokNoAbsen.java di sini
```

#### 2.4.2 Hasil Running / Screenshot Output

| Uji | Jumlah kelompok | Jumlah penilai | Keterangan |
| :---: | :---: | :---: | :--- |
| 1 | 3 | 2 | Termasuk input nilai 105 (uji validasi) |
| 2 | 2 | 3 | Variasi lain |
| 3 | 0 | - | Uji input tidak valid |

**Screenshot**

![alt text](SS_P4_uji1.png)
![alt text](SS_P4_uji2.png)
![alt text](SS_P4_uji3.png)

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa `totalNilai` perlu di-*reset* di dalam *outer loop*, tetapi `rataTertinggi` tidak boleh di-*reset* pada setiap kelompok?
  * **Jawab:**
* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?
  * **Jawab:**
* **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` dideklarasikan sebagai `int` dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
  * **Jawab:**
* **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.
  * **Jawab:**
* **Pertanyaan 5:** Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.
  * **Jawab:**

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [ ] **Tugas 1: Pola Bilangan Bertingkat** - Mencetak pola bilangan 1 sampai nomor baris (n minimal 1). Baris pertama `1`, baris kedua `1 2`, dan seterusnya sampai baris ke-n. Setelah pola selesai, tampilkan total banyaknya angka yang telah dicetak. File: `Tugas1NoAbsen.java`.

  Contoh n = 5:
  ```
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
  Total angka tercetak: 15
  ```

- [ ] **Tugas 2: Tabel Perkalian** - Menampilkan tabel perkalian berukuran n x n menggunakan nested FOR atau WHILE (n minimal 3). Atur spasi agar rapi, lalu tampilkan jumlah seluruh angka pada tabel. File: `Tugas2NoAbsen.java`.

  Contoh n = 4:
  ```
     1   2   3   4
     2   4   6   8
     3   6   9  12
     4   8  12  16
  Jumlah seluruh angka: 100
  ```

- [ ] **Tugas 3: Rekap Penjualan Beberapa Toko** - Program meminta jumlah toko, jumlah pelanggan tiap toko, dan jumlah barang yang dibeli setiap pelanggan. Tampilkan total pelanggan dan total barang per toko, total barang seluruh toko, dan nomor toko dengan barang terbanyak (jika sama, pilih nomor toko terkecil). Ketentuan: jumlah toko minimal 1; jumlah pelanggan dan jumlah barang boleh 0 tetapi tidak boleh negatif. File: `Tugas3NoAbsen.java`.

  Contoh ringkasan:
  ```
  Toko 1 - pelanggan: 2, total barang: 5
  Toko 2 - pelanggan: 3, total barang: 7
  Total barang seluruh toko: 12
  Toko dengan barang terbanyak: 2
  ```

### 3.1 Implementasi Kode Tugas

**Tugas 1:**
```java
// tulis kode Tugas1NoAbsen.java di sini
```
![alt text](SS_Tugas1.png)

**Tugas 2:**
```java
// tulis kode Tugas2NoAbsen.java di sini
```
![alt text](SS_Tugas2.png)

**Tugas 3:**
```java
// tulis kode Tugas3NoAbsen.java di sini
```
![alt text](SS_Tugas3.png)

---

## 4: KESIMPULAN

(Tulis kesimpulan Anda tentang perulangan bersarang di sini.)
