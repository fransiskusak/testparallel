Narrative:
Sebagai seorang mahasiswa
Saya ingin memperbaharui informasi profil akun saya di eLOK
Sehingga informasi yang tercanmtum di halaman profil saya lebih update


Scenario: Mengedit halaman profile akun eLOK dengan input bernilai invalid (sudah digunakan)
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'FRANS14645'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokelok01,'
When Pengguna mengeklik tombol login
When Pengguna mengeklik nama
When Pengguna mengeklik tombol profil
When Pengguna mengeklik tombol Edit profile
When Pengguna mengeklik field First name
When Pengguna memasukkan 'Budi' ke field First name
When Pengguna mengeklik field Surname
When Pengguna memasukkan 'Setiawan' ke field Surname
When Pengguna mengeklik field Email address
When Pengguna memasukkan 'f.a.kristiawan@mail.ugm.ac.id' ke field Email address
When Pengguna mengeklik field Email display
When Pengguna mengeklik pilihan Allow everyone to see my email address
When Pengguna mengeklik field City/Town
When Pengguna memasukkan 'Yogyakarta' ke field City/Town
When Pengguna mengeklik field Country
When Pengguna mengeklik pilihan Indonesia
When Pengguna mengeklik field Timezone
When Pengguna mengeklik pilihan Server timezone (Asia/Jakarta)
When Pengguna mengeklik field Description
When Pengguna memasukkan 'Saya adalah mahasiswa DTETI angkatan 2014' ke field Description
When Pengguna mengeklik tombol update profil
Then Pengguna melihat pesan eror 'This email address is already registered.'