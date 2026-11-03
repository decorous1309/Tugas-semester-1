# JOBSHEET 6 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**
* **Nama:** Fahri Raihan Baldan
* **NIM:** 264107020067
* **Kelas / No. Presensi:** 1D/15

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan studi kasus menggunakan struktur pemilihan dasar dan pemilihan bersarang
2. Mahasiswa mampu menyimpan dan mengumpulkan pekerjaan menggunakan Git dan GitHub melalui Visual Studio Code
3. Mahasiswa mampu berkolaborasi dengan teman menggunakan GitHub

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Persiapan Awal (Git, GitHub, dan VS Code)

Persiapan yang dilakukan sekali di setiap laptop/PC: membuat akun GitHub, menginstal Git, dan mengatur identitas Git (`user.name` dan `user.email`).

**Screenshot hasil konfigurasi identitas Git:**

![alt text](SS_P0_config.png)

---

### 2.2 Percobaan 1: Menyiapkan Repository

Membuat repository `PraktikumDaspro<NoPresensi>` di GitHub, melakukan *clone* ke komputer, menambahkan `README.md` berisi identitas, lalu melakukan *add*, *commit*, dan *push*.

#### 2.2.1 Hasil / Screenshot

**Repository baru di GitHub (nama dan visibility Public):**

![alt text](SS_P1_repo.png)

**Hasil clone di VS Code:**

![alt text](SS_P1_clone.png)

**README.md (status Untracked / U):**

![alt text](SS_P1_readme.png)

**Setelah Stage Changes (status Added / A) dan Commit:**

![alt text](SS_P1_commit.png)

**Setelah Push, README.md tampil di GitHub:**

![alt text](SS_P1_push.png)

#### 2.2.2 Catatan Kendala (jika ada)

---

### 2.3 Percobaan 2: Studi Kasus 1 - Pemilihan Dasar

Kedai Kopi Senja menjual Kopi Susu Gula Aren seharga Rp18.000 per cup dan memberikan diskon 10% untuk pembelian minimal Rp100.000. Program kasir menghitung total bayar dan kembalian berdasarkan flowchart pada jobsheet. File: `StudiKasus1<NoPresensi>.java`.

#### 2.3.1 Kode Program Java
```java
// tulis kode StudiKasus1<NoPresensi>.java di sini
```

#### 2.3.2 Hasil Running / Screenshot Output

| Uji | Jumlah cup | Uang bayar | Output yang diharapkan |
| :---: | :---: | :---: | :--- |
| 1 | 3 | 50000 | Total Rp 54000, diskon Rp 0, uang tidak cukup (kurang Rp 4000) |
| 2 | | | Diskon 10% (total harga >= Rp 100000) |
| 3 | | | Uang cukup, tampil kembalian |

**Screenshot**

![alt text](SS_SK1_uji1.png)
![alt text](SS_SK1_uji2.png)
![alt text](SS_SK1_uji3.png)

#### 2.3.3 Bukti Commit (minimal 2 commit)

| Commit | Pesan commit |
| :---: | :--- |
| 1 | SK1: input dan deklarasi variabel |
| 2 | SK1: logika diskon dan kembalian |

![alt text](SS_SK1_commit.png)

---

### 2.4 Percobaan 3: Studi Kasus 2 - Pemilihan Bersarang

Program membantu Admin Kemahasiswaan mengecek status dana penghargaan prestasi mahasiswa menggunakan nested IF (maksimal 3 tingkat).

Ketentuan:
* Perlombaan BELMAWA, BAKORMA, atau Mandiri: dana hanya untuk Juara 1, 2, atau 3.
* PKM: dana diberikan kepada tim yang lolos pendanaan.
* Kegiatan Lainnya: tidak memperoleh dana.
* Untuk ketentuan di atas, wajib upload 4 dokumen lengkap (Surat Tugas, Sertifikat, Foto Kegiatan, Poster Kegiatan); jika kurang dari 4, dana tidak diberikan dan ditampilkan jumlah dokumen yang kurang.

File: `StudiKasus2<NoPresensi>.java`.

#### 2.4.1 Kode Program Java
```java
// tulis kode StudiKasus2<NoPresensi>.java di sini
```

#### 2.4.2 Hasil Running / Screenshot Output

| Uji | Jenis kegiatan | Dokumen | Peringkat / Pendanaan | Output yang diharapkan | Output program |
| :---: | :--- | :---: | :--- | :--- | :--- |
| 1 | BAKORMA | 3 | Juara 1 | Dokumen tidak lengkap (kurang 1). Dana tidak diberikan | |
| 2 | Mandiri | 4 | 0 (bukan juara) | Tidak memperoleh dana (hanya Juara 1/2/3) | |
| 3 | pkm | 4 | 1 (lolos) | Berhak memperoleh dana | |
| 4 | Lainnya | 4 | (tidak ditanyakan) | Tidak memperoleh dana | |

**Screenshot**

![alt text](SS_SK2_uji1.png)
![alt text](SS_SK2_uji2.png)
![alt text](SS_SK2_uji3.png)
![alt text](SS_SK2_uji4.png)

#### 2.4.3 Bukti Commit (minimal 2 commit)

| Commit | Pesan commit |
| :---: | :--- |
| 1 | SK2: cabang lomba |
| 2 | SK2: cabang PKM dan lainnya |

![alt text](SS_SK2_commit.png)

---

### 2.5 Percobaan 4: Uji Silang Program Teman

Dikerjakan berpasangan dan bergantian: menguji program teman dan program Anda diuji oleh teman, menggunakan GitHub Collaborators.

**Identitas pasangan:**
* **Nama teman:**
* **Username GitHub teman:**
* **Repository teman:**

#### 2.5.1 Screenshot Proses Kolaborasi

**Menambahkan collaborator (Settings → Collaborators):**

![alt text](SS_P4_collab.png)

**Menerima undangan / clone repository teman:**

![alt text](SS_P4_accept.png)

**Hasil Pull dan riwayat Commits dari teman:**

![alt text](SS_P4_pull.png)

#### 2.5.2 Hasil Uji Studi Kasus 2 (diisi di README.md)

Hasil Uji Studi Kasus 2 oleh `<Nama>`

| No | Jenis | Dokumen | Juara/Dana | Output | Sesuai? |
|----|-------|---------|------------|---------|---------|
| 1 | | | | | |
| 2 | | | | | |
| 3 | | | | | |

**Screenshot hasil uji:**

![alt text](SS_P4_uji.png)

#### 2.5.3 Perbaikan Program (jika ada hasil yang tidak sesuai)

---

## 3: TUGAS MANDIRI

Jobsheet ini tidak memiliki tugas mandiri tambahan.

---

## 4: KESIMPULAN

(Tulis kesimpulan Anda tentang pemilihan bersarang dan penggunaan Git/GitHub di sini.)
