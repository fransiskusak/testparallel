Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat halaman profil saya

Scenario: Mengedit password sebuah akun eLOK
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik textboxt Username
When Pengguna mengetik usernamenya 'FRANS4'
When Pengguna mengeklik textboxt Password
When Pengguna mengetik passwordnya 'Elokelok24.'
When Pengguna mengeklik tombol login
When Pengguna mengeklik nama
When Pengguna mengeklik tombol Preferences
When Pengguna mengeklik Change password
When Pengguna mengeklik textbox Current password
When Pengguna memasukkan 'Elokelok24.' pada textbox Current password
When Pengguna mengeklik textbox New password
When Pengguna memasukkan 'Elokelok01..' pada textbox New password
When Pengguna mengeklik textbox New password (again)
When Pengguna memasukkan 'Elokelok01..' pada textbox New password (again)
When Pengguna mengeklik tombol Save changes
Then Pengguna akan melihat pemberitahuan 'Password has been changed'