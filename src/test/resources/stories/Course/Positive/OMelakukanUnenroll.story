
GivenStories: stories/Account/Positive/GLogin.story

Scenario: Unenroll dari sebuah matakuliah
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Jaringan Komputer-TIF216'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik judul matakuliah
When Pengguna mengeklik tombol unenroll
When Pengguna mengeklik continue
Then Pengguna tidak menemukan List Matakuliah bernama 'Jaringan Komputer-TIF216'