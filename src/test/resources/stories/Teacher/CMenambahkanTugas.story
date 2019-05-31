Meta:

Narrative:

Scenario: Membuat tugas baru
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'fransiskusak'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokfrans24.'
When Pengguna mengeklik tombol login

When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Ujicoba MK'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik enter course
When Pengguna mengeklik tombol hidupkan mode edit



When Pengguna mengeklik tombol tambahkan sebuah aktifitas tugas
When Pengguna mengeklik tombol assignment
When Pengguna mengeklik tombol tambah
When Pengguna mengeklik textbox assignment name
When Pengguna mengetik 'Tugas Mingguan' pada textbox assignment name
When Pengguna mengeklik tombol Simpan dan Tampilkan
When Pengguna mengeklik tombol matakuliah
Then Pengguna menemukan 'Tugas Mingguan' pada daftar tugas
