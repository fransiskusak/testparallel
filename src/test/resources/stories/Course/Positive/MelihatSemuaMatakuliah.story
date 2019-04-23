Sebagai seorang mahasiswa
Saya ingin semua matakuliah yang tersedia di e-LOK
Untuk bisa meng-enroll pada salah satu matakuliah yang tersedia

Scenario: Melihat semua matakuliah yang tersedia
GivenStories: stories/Account/Positive/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik tombol Matakuliah
When Pengguna mengeklik tombol MOOC
Then Pengguna akan melihat salah satu Matakuliah yang tersedia yaitu 'Perencanaan & Pengendalian Produksi (TKI162606) Kelas 1'