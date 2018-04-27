Login
Narrative:
Untuk dapat keluar dari eLOK
Sebagai seorang mahasiswa
Saya ingin logout pada aplikasi e-LOK

GivenStories: stories/Account/Login.story
Scenario: Logout
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik Logout
Then Pengguna akan melihat deskripsi 'Tentang eLOK'