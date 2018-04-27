Scenario: Mendaftar akun pengguna di e-LOK dengan input invalid
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik tombol register
When Pengguna mengklik textbox Username
When Pengguna memasukkan username 'aa'
When Pengguna mengeklik lock password
When Pengguna mengklik textbox Password
When Pengguna memasukkan password 'Asdfgh90'
When Pengguna mengeklik textbox Email
When Pengguna memasukkan Email 'ad@ad.com'
When Pengguna mengeklik textbox Email (again)
When Pengguna memasukkan Email (again) 'ad@ad.com'
When Pengguna mengeklik textbox First name
When Pengguna memasukkan First name 'Tes tes'
When Pengguna mengeklik textbox Surname
When Pengguna memasukkan Surname 'Tes'
When Pengguna mengeklik textbox City
When Pengguna memasukkan City 'Yogya'
When Pengguna mengeklik textbox Country
When Pengguna mengeklik Negara 'Indonesia'
When Pengguna mengeklik tombol Create
Then Pengguna akan melihat error message