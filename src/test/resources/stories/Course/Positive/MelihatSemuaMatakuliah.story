Sebagai seorang mahasiswa
Saya ingin semua matakuliah yang tersedia di e-LOK
Untuk bisa meng-enroll pada salah satu matakuliah yang tersedia

Scenario: Melihat semua matakuliah yang tersedia
GivenStories: stories/Account/Positive/FLogin.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik tombol Matakuliah
When Pengguna mengeklik tombol MOOC
Then Pengguna akan melihat salah satu Matakuliah yang tersedia yaitu 'Sistem Komunikasi Lanjut'