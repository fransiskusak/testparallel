Narrative:

Sebagai seorang mahasiswa
Saya ingin melihat daftar matakuliah yang saat ini saya ikuti di eLOK
Untuk dapat mengetahui matakuliah apa saja yang sudah saya enroll

Scenario: Melihat matakuliah yang di-enroll
GivenStories: stories/Account/Positive/GLogin.story
GivenStories: stories/Course/HMengenrollDenganEnrollmentKeyValid.story
Given Pengguna berada pada Halaman Dashboard e-LOK
Then Pengguna melihat nama matakuliah 'Jaringan Komputer-TIF216' pada menu Course Overview