Meta:

Narrative:

Scenario: Menambahkan materi baru
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


When Pengguna mengeklik tombol tambahkan sebuah aktifitas
When Pengguna mengeklik tombol assignment
When Pengguna mengeklik tombol file
When Pengguna mengeklik tombol tambah

When Pengguna mengeklik textbox nama
When Pengguna mengisi nama materi dengan 'Materi Pengantar'

When Pengguna mengeklik tombol add

When Pengguna mengeklik Upload a file
When Pengguna mengeklik Browse
When Pengguna mengeklik  upload this File
When Pengguna mengeklik Simpan

When Pengguna mengeklik tombol matakuliah
Then Pengguna menemukan 'Materi Pengantar' pada daftar materi
