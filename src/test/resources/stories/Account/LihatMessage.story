Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin melihat pesan-pesan yang masuk
Untuk bisa membalas pesan-pesan yang ditujukan pada saya

Scenario: Melihat Message
GivenStories: stories/Account/Positive/Login.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik nama
When Pengguna mengeklik tombol messages
Then Pengguna akan melihat messages-nya 'Halo apa kabar'