Login
Narrative:
Untuk dapat memanfaatkan fitur-fitur eLOK
Sebagai seorang mahasiswa
Saya ingin login pada aplikasi e-LOK

Scenario: Login pada aplikasi e-LOK dengan akun mahasiswa
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'FRANS14645'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokfrans24.'
When Pengguna mengeklik tombol login
Then Pengguna akan melihat Nama User yaitu 'Fransiskus A Kristiawan'
