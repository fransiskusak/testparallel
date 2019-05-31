Meta:

Narrative:

Scenario: Login sebagai dosen
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
When Pengguna mengeklik nama
When Pengguna mengeklik tombol switch role
Then Pengguna akan melihat menu 'Ganti peran menjadi'