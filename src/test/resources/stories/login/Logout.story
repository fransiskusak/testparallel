Login
Narrative:
Untuk dapat memanfaatkan fitur-fitur eLOK
Sebagai seorang mahasiswa
Saya ingin login pada aplikasi e-LOK

GivenStories: stories/login/Login.story
Scenario: Mencari Course
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Big Data Komputasional'
When Pengguna mengeklik tombol cari
Then Pengguna akan melihat Nama Matakuliah Big Data Komputasional