Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat halaman yang memuat nilai-nilai saya

Scenario: Melihat Grade
GivenStories: stories/login/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol grade
Then Pengguna akan melihat nilai-nilai nya