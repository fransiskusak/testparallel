Meta:

Narrative:

Scenario: Membuat matakuliah dengan input bernilai invalid
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'fransiskusak'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokfrans24.'
When Pengguna mengeklik tombol login
When Pengguna mengeklik tombol Matakuliah
When Pengguna mengeklik tombol Add New Course
When Pengguna mengeklik textbox Course full name
When Pengguna mengisi textbox Course full name dengan nama 'Ujicoba'
When Pengguna mengeklik textbox Course short name
When Pengguna mengisi textbox Course short name dengan nama 'Ujicoba'
When Pengguna mengeklik tombol Save and Display
Then Pengguna akan melihat error 'Short name is already used for another course'