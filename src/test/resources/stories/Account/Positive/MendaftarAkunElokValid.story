Scenario: Mendaftar akun pengguna di e-LOK
Given Pengguna berada pada Homepage e-LOK
When Pengguna mengeklik tombol register
When Pengguna mengklik textbox Username
When Pengguna memasukkan username 'andi098765'
When Pengguna mengeklik lock password
When Pengguna mengklik textbox Password
When Pengguna memasukkan password 'Andiii-09'
When Pengguna mengeklik textbox Email
When Pengguna memasukkan Email 'andi098765@andi.com'
When Pengguna mengeklik textbox Email (again)
When Pengguna memasukkan Email (again) 'andi098765@andi.com'
When Pengguna mengeklik textbox First name
When Pengguna memasukkan First name 'Andi'
When Pengguna mengeklik textbox Surname
When Pengguna memasukkan Surname 'andi'
When Pengguna mengeklik textbox City
When Pengguna memasukkan City 'Yogya'
When Pengguna mengeklik tombol create
Then Pengguna akan melihat konfirmasi 'An email should have been sent to your address at'