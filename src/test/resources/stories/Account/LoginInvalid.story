Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Login pada aplikasi e-LOK dengan akun mahasiswa dengan Input Invalid
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'FRANSISKUSAK'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya ''
When Pengguna mengeklik tombol login
Then Pengguna akan melihat pesan eror yaitu 'Invalid login, please try again'
