!--Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin enroll pada matakuliah Big Data di e-LOK

Scenario: Enroll sebuah matakuliah di e-LOK
GivenStories: stories/Account/Login.story
GivenStories: stories/Course/MancariCourseValid.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Big Data Komputasional'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik judul Big Data Komputasional
When Pengguna klik tombol enroll me
Then Terdapat menu 'Unenrol me from Big Data'