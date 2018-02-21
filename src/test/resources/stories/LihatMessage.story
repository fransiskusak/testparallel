Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat pesan-pesan yang ditujukan kepada saya

Scenario: Melihat Message
GivenStories: stories/login/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol messages
Then Pengguna akan melihat messages-nya