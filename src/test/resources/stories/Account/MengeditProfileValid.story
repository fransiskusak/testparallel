Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin memperbaharui informasi profil akun saya di eLOK
Sehingga informasi yang tercanmtum di halaman profil saya lebih update

Scenario: Mengedit halaman profile akun eLOK
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol profil
When Pengguna mengeklik tombol 
When Pengguna mengeklik field First name
When Pengguna memasukkan 'Budi' ke field First name
When Pengguna mengeklik field Surname
When Pengguna memasukkan '' ke field Surname
When Pengguna mengeklik field Email address
When Pengguna memasukkan '' ke field Email address
When Pengguna mengeklik field Email display
When Pengguna mengeklik pilihan Allow everyone to see my email address
When Pengguna mengeklik field City/Town
When Pengguna memasukkan '' ke field City/Town
When Pengguna mengeklik field Country
When Pengguna mengeklik pilihan Indonesia
When Pengguna mengeklik field Timezone
When Pengguna mengeklik pilihan Server timezone (Asia/Jakarta)
When Pengguna mengeklik field Description
When Pengguna memasukkan '' ke field
When Pengguna mengeklik tombol update profil
Then Pengguna melihat nama akunnya menjadi ''