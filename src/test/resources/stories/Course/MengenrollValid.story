!--Meta:

Narrative:
Sebagai seorang mahasiswa
Saya ingin enroll pada matakuliah Big Data di e-LOK

Scenario: Enroll sebuah matakuliah di e-LOK
GivenStories: stories/login/Login.story
GivenStories: stories/Course/CariCourse.story
Given Pengguna berada pada Halaman Dashboard e-LOK
When Pengguna mengeklik textboxt Search Courses
When Pengguna mengetik 'Big Data Komputasional'
When Pengguna mengeklik tombol cari
When Pengguna mengeklik judul Big Data Komputasional
When pengguna klik enroll me
Then Terdapat menu unenroll