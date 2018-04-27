Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin semua matakuliah yang tersedia di e-LOK

Scenario: Melihat Semua Matakuliah yang tersedia
GivenStories: stories/Account/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik tombol Matakuliah
Then Pengguna akan melihat semua matakuliah yang tersedia