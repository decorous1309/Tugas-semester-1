# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Fahri Raihan Baldan
* **NIM:** 264107020067
* **Kelas / No. Presensi:** 1D/15

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while, dan do-while)
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan bahasa pemrograman Java

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan FOR

Dosen ingin mencari nilai tertinggi dan terendah Kuis dari 10 mahasiswa dalam satu kelas. Dosen memasukkan nilai setiap mahasiswa, kemudian program menentukan dan menampilkan nilai tertinggi dan terendah. Program dibuat berdasarkan flowchart pada jobsheet. File: `SiakadForNoAbsen.java`.

#### 2.1.1 Kode Program Java
```java
// tulis kode SiakadForNoAbsen.java di sini
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![alt text](SS_P1.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
  * **Jawab:**
* **Pertanyaan 2:** Mengapa variabel `tertinggi` diinisialisasi 0 dan `terendah` diinisialisasi 100? Apa yang terjadi jika `tertinggi` diinisialisasi 100 dan `terendah` diinisialisasi 0?
  * **Jawab:**
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
    ```java
    if (nilai > tertinggi) {
        tertinggi = nilai;
    }
    if (nilai < terendah) {
        terendah = nilai;
    }
    ```
  * **Jawab:**
* **Pertanyaan 4:** Modifikasi kode program untuk menghitung berapa mahasiswa yang lulus dan tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!
  * **Kode modifikasi:**
    ```java
    // tulis kode modifikasi di sini
    ```
  * **Screenshot:**

    ![alt text](SS_P1_Q4.png)

---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan WHILE

Dosen memasukkan nilai beberapa mahasiswa ke SIAKAD untuk ditentukan kategori nilai hurufnya. Nilai tidak valid (negatif atau lebih dari 100) diabaikan dan input diminta ulang. Nilai valid dikelompokkan: A (80 < nilai ≤ 100), B+ (73 < nilai ≤ 80), B (65 < nilai ≤ 73), C+ (60 < nilai ≤ 65), C (50 < nilai ≤ 60), D (39 < nilai ≤ 50), E (nilai ≤ 39). File: `SiakadWhileNoAbsen.java`.

#### 2.2.1 Kode Program Java
```java
// tulis kode SiakadWhileNoAbsen.java di sini
```

#### 2.2.2 Hasil Running / Screenshot Output

| Uji | Nilai yang dimasukkan | Keterangan |
| :---: | :--- | :--- |
| 1 | 85, 63, 101, 23, -15, 70, 55 | Termasuk nilai tidak valid |
| 2 | | Variasi lain |

**Screenshot**

![alt text](SS_P2_uji1.png)
![alt text](SS_P2_uji2.png)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
    ```java
    if (nilai < 0 || nilai > 100) {
        System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
        continue;
    }
    ```
  * **a. `nilai < 0 || nilai > 100`**
    * **Jawab:**
  * **b. `continue`**
    * **Jawab:**
* **Pertanyaan 2:** Mengapa sintaks `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
  * **Jawab:**
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
  * **Jawab:**
* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
  * **Kode modifikasi:**
    ```java
    // tulis kode modifikasi di sini
    ```
  * **Screenshot:**

    ![alt text](SS_P2_Q4.png)

---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe - Perulangan DO-WHILE

Kasir kafe memproses transaksi beberapa pelanggan. Harga: kopi Rp 12.000, teh Rp 7.000, roti Rp 20.000. Kasir terus memasukkan jumlah pembelian untuk setiap pelanggan sampai ada input "batal", lalu program berhenti. File: `KafeDoWhileNoAbsen.java`.

#### 2.3.1 Kode Program Java
```java
// tulis kode KafeDoWhileNoAbsen.java di sini
```

#### 2.3.2 Hasil Running / Screenshot Output

| Uji | Nama pelanggan | Kopi | Teh | Roti | Total yang diharapkan |
| :---: | :--- | :---: | :---: | :---: | :---: |
| 1 | Rena | 3 | 0 | 1 | Rp 56000 |
| 2 | Yuni | 1 | 4 | 2 | Rp 80000 |
| 3 | BATAL | - | - | - | Transaksi dibatalkan |

**Screenshot**

![alt text](SS_P3.png)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?
  * **Jawab:**
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:**
* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE?
  * **Jawab:**
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
  * **Jawab:**

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [ ] **Tugas 1: Penjualan Tiket Bioskop** - Menghitung total tiket yang terjual dan total harga penjualan dalam satu hari. Harga Rp 50.000 per tiket. Diskon 10% jika pelanggan membeli lebih dari 4 tiket, diskon 15% jika lebih dari 10 tiket. Jika input jumlah tiket tidak valid (negatif), input diabaikan dan diminta ulang. Perulangan boleh for, while, atau do-while; boleh menambahkan `break` atau `continue`.

- [ ] **Tugas 2: Tempat Parkir (Implementasi Flowchart)** - Menghitung total pembayaran parkir dari beberapa kendaraan. Tarif mobil Rp 3.000/jam dan motor Rp 2.000/jam. Program terus meminta input selama jenis kendaraan bukan 0 (1 = mobil, 2 = motor, 0 = keluar). Implementasikan flowchart pada jobsheet ke dalam kode Java.

### 3.1 Implementasi Kode Tugas

**Tugas 1:**
```java
// tulis kode Tugas 1 di sini
```
![alt text](SS_Tugas1.png)

**Tugas 2:**
```java
// tulis kode Tugas 2 di sini
```
![alt text](SS_Tugas2.png)

---

## 4: KESIMPULAN

(Tulis kesimpulan Anda tentang perulangan for, while, dan do-while di sini.)
