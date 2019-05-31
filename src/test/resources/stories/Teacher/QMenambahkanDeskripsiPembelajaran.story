Meta:

Narrative:

Scenario: Menambahkan Capaian Pembelajaran
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

When Pengguna mengeklik edit
When Pengguna mengeklik edit section
When Pengguna mengeklik textbox description
When Pengguna mengisi textbox description dengan 'Mata kuliah penjaminan kualitas perangkat lunak merupapkan matakuliah yang membahas latar belakang, teori-teori, prinsip-prinsip, dan kajian studi kasus untuk pengujian dan penjaminan kualitas/mutu perangkat lunak.'


When Pengguna mengeklik tombol Simpan dan Tampilkan
Then Pengguna menemukan 'Mata kuliah penjaminan kualitas perangkat lunak merupapkan' pada Deksripsi Pembelajaran
