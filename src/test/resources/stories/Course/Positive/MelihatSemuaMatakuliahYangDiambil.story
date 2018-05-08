Narrative:

Sebagai seorang mahasiswa
Saya ingin melihat daftar matakuliah yang saat ini saya ikuti di eLOK
Untuk dapat mengetahui matakuliah apa saja yang sudah saya enroll

Scenario: Melihat daftar matakuliah yang sudah di-enroll
GivenStories: stories/Account/Positive/Login.story
GivenStories: stories/Course/MengenrollDenganEnrollmentKeyValid.story
Given Pengguna berada pada Halaman Dashboard e-LOK
Then Pengguna melihat nama matakuliah '35-TIF216-Jaringan Komputer' pada menu Course Overview