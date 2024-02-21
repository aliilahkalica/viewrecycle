package com.example.viewrecycle

object HeroesData {

        private val data = arrayOf(
            arrayOf(
                "Soekarno",
                "Soekarno adalah dalah seorang politikus yang berperan penting dalam Revolusi Nasional Indonesia dan menjabat sebagai Presiden Republik Indonesia pertama sejak 1945 hingga 1967.[7]:11, 81[8]:26-32 Bersama Mohammad Hatta, ia memproklamasikan Kemerdekaan Indonesia pada tanggal 17 Agustus 1945. Soekarno orang pertama yang mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/330px-Presiden_Sukarno.jpg"
            ),
            arrayOf(
                "Jenderal Soedirman",
                "Jenderal Besar TNI (Anumerta) Raden Soedirman (EYD: Sudirman; 24 Januari 1916 – 29 Januari 1950[a]) adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Sebagai Panglima Besar Tentara Nasional Indonesia pertama, ia adalah sosok yang dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya pindah ke Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang dijalankan oleh organisasi Islam Muhammadiyah. Saat di sekolah menengah, Soedirman mulai menunjukkan kemampuannya dalam memimpin dan berorganisasi. Soedirman sangat dihormati oleh masyarakat karena ketaatannya pada Islam. Setelah berhenti kuliah keguruan, pada 1936 ia mulai bekerja sebagai seorang guru, dan kemudian menjadi kepala sekolah, di sekolah dasar Muhammadiyah; ia juga aktif dalam kegiatan Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah pada tahun 1937.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Jenderal_Sudirman.jpg/330px-Jenderal_Sudirman.jpg"
            ),
            arrayOf(
                "Mohammad Hatta",
                "Dr. (H.C.) Drs. H. Mohammad Hatta (12 Agustus 1902 – 14 Maret 1980) adalah seorang tokoh penting dalam perjuangan kemerdekaan Indonesia, negarawan, dan ekonom Indonesia yang menjabat sebagai Wakil Presiden Indonesia pertama. Ia bersama Soekarno adalah Proklamator Kemerdekaan, memainkan peranan sentral dalam perjuangan kemerdekaan Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Pada 1956, ia mundur dari jabatan wakil presiden.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/VP_Hatta.jpg/330px-VP_Hatta.jpg"
            ),
            arrayOf(
                "Pangeran Diponegoro",
                "Bendara Raden Mas Mustahar (atau biasa dikenal dengan nama Pangeran Diponegoro Jogjakarta) beliau merupakan Putra dari Sultan Hamengku Buwono Ke 3 Jogjakarta .Nama yang berkaitan dengan \"fajar\" dalam istilah Jawa, sehingga berarti \"Sang Bangsawan yang lahir pada Fajarnya\" lahir di Kaputren, Keraton Yogyakarta, pada pukul 3.30-4.00, 11 November 1785, tepat menjelang fajar, saat sahur pada 8 Muharam 1200 H. Dalam tarikh Jawa, hari kelahirannya itu sangat bertuah karena jatuh pada bulan Sura, bulan pertama dalam tahun Jawa, ketika secara tradisional, kerajaan baru didirikan dan gelombang sejarah baru dimulai. Lahir pada Jumat Wage merupakan hari penting dalam bacaan almanak atau primbon Jawa modern.[1] Pangeran Diponegoro(11 November 1785 – 8 Januari 1855) adalah salah seorang pahlawan nasional Republik Indonesia, yang memimpin Perang Diponegoro atau Perang Jawa selama periode tahun 1825 hingga 1830 melawan pemerintah Hindia Belanda.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Diponegoro.jpg/330px-Diponegoro.jpg"
            )
        )

    val listHero: ArrayList<Hero>
        get() {
            val list= arrayListOf<Hero>()
            for (aData in data){
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]

                list.add(hero)
            }
            return list
        }

        }