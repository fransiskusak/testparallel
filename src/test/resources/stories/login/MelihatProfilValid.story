Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat halaman profil saya

Scenario: Melihat Profil
GivenStories: stories/login/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol profil
Then Pengguna akan melihat profil akunnya