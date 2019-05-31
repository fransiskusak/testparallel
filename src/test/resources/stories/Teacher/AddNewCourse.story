Meta:

Narrative:

Scenario: Membuat matakuliah baru
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'fransiskusak'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokfrans24.'
When Pengguna mengeklik tombol login

When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Ujicoba MK'
When Pengguna mengeklik tombol cari
Then Pengguna akan melihat Nama Matakuliah yaitu 'Ujicoba'