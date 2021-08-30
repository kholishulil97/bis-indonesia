package com.example.bisindonesia

object BusData {
    private val busBodies = arrayOf("Jetbus",
    "Legacy",
    "Avante",
    "Evolander",
    "Rexus",
    "Tourismo",
    "Infinity",
    "Skyliner",
    "Discovery",
    "Max",
    "Evonext",
    "Ventura",
    "Ultima",
    "Cityliner")

    private val busPrice = arrayOf("Rp 482.600.000",
    "Rp 471.500.000",
    "Rp 463.650.000",
    "Rp 437.240.000",
    "Rp 428.320.000",
    "Rp 473.860.000",
    "Rp 417.470.000",
    "Rp 453.770.000",
    "Rp 376.790.000",
    "Rp 368.140.000",
    "Rp 402.270.000",
    "Rp 431.340.000",
    "Rp 420.210.000",
    "Rp 420.250.000")

    private val builderName = arrayOf("Adi Putro",
    "Laksana",
    "Tentrem",
    "New Armada",
    "Piala Mas",
    "Morodadi Prima",
    "Tri Sakti",
    "Rahayu Santosa",
    "Laksana",
    "Tentrem",
    "New Armada",
    "Morodadi Prima",
    "Tri Sakti",
    "Nusantara Gemilang")

    private val builderCity = arrayOf("Malang",
    "Magelang",
    "Malang",
    "Magelang",
    "Malang",
    "Malang",
    "Magelang",
    "Bogor",
    "Magelang",
    "Malang",
    "Magelang",
    "Malang",
    "Magelang",
    "Demak")

    private val busDetails = arrayOf("Model bus besar Adiputro sering ditemui di terminal-terminal dan menjadi favorit karena bentuknya yang aman, tidak banyak sudut tajam yang diterima oleh masyarakat. Saat ini varian terbaru dari Adiputro yaitu Jetbus 3+. Kemudian tipe Jetbus 3+ ini paling banyak jadi referensi bagi karoseri kecil yang sering melakukan facelift bodi. Hal ini disebabkan spare parts dari model Jetbus yang mudah ditemui di pasaran. Jetbus 3+ ini dibagi lagi menjadi berbagai model yang disesuaikan dengan dimensinya. Untuk bus besar, varian dari Jetbus 3+ dimulai dari High Decker Double Glass (HDD), MHD, Super High Decker (SHD), Ultra High Decker (UHD), dan Super Double Decker (SDD).",
    "Laksana launch new bus model by offering a different luxury experience, namely Legacy SR 2 Double Decker. The newest double decker bus with elegant, masculine and optimize design structure. Interior design equipped with a step ladder design using the first print composite material in Indonesia. Use of lightweight composite materials can reduce the weight of the vehicle, so the bus can be more efficient. In line with the development of Indonesia's infrastructure progress, it is expected that the LegacySR 2 Double Decker bus can become a reliable mode of transportation.",
    "Pandangan kedepan yang amat lapang, dengan adanya garis pemisah di kaca depan yang paling minim di kelasnya justru menjadi keunqqulan Avante H7 ini untuk dapat menawarkan panorama yang luar biasa serta pengalaman berkendara yang berbeda. Body bus yang kokoh dan Bentuk yang aerodinamis memungkinkan kenyamanan maksimal bagi para penumpang maupun pengemudi. Desain futuristik Avante H7 akan menjadi desain yang tahan akan masa depan (future proof). Avante H8 hadir menjawab kebutuhan dunia perbisan saat ini, body ini mempunyai bagasi lebih lapang dan cocok dipakai untuk chasis ber air suspension tipe narrow, Avante H8 memiliki bagasi terluas di kelasnya dan kestabilan body sangat akurat.",
    "Evolander sendiri merupakan generasi penerus dari model Evonext GT. Namun Evolander ini pernah kurang diminati saat pertama kali dirilis. Development Design karoseri New Armada Deddy Hermawan mengatakan, pertama kali Evolander diperkenalkan ke pasaran pada tahun 2016. Evolander 2016 ini merupakan versi all new dari Evo-series. Secara tampilan, Evolander ini memang terlihat hanya memiliki satu kaca saja. Padahal jika melihat keluar dari kabin, ada kaca di bagian atas kaca depan yang menambah kesan elegan, seperti layaknya sun roof.",
    "Model Rexus karoseri Piala Mas terlihat lebih berani karena memiliki garis desain yang tajam dan sangar. Bus Rexus ini menggunakan dua kaca ganda bagian depan (Double Glass) yang jika diperhatikan kacanya mirip dengan model Jetliner. Tapi karoseri Piala Mas memberikan sesuai yang menarik di sisi sebelah kanan dan kiri dekat dengan pangkal spion dengan warna hitam sehingga terlihat lebih sporty. Bus Rexus menggunakan tiga buah wiper, dua buah wiper di kaca depan bagian bawah dean tambahab satu buah wiper pada kaca bagian atas.",
    "Many factors determine the results and quality of vehicles produced in the carroserie industry. Amongst those are quality of the chassis, the chassis manufacturer and goverment regulations about passengers safety. Last but not least, the Body Builder technique is by far the most important determining factor. The appropriate technology, supported by competent and committed human resources are the main factors that determine the success of the carroserie. Hence, it is through the commitment of highly dedicated employees that P.T. Morodadi Prima is able to produce high quality vehicles for more than three decades.",
    "Meski bukan sebagai yang terbesar dan terlaris di Indonesia, Karoseri Trisakti berhasil mencuri perhatian kalangan pengusaha bus lewat model bus ini. Infinity HD Deluxe merupakan model bus dengan desain dek tinggi dari rata-rata bus buatan Trisakti lainnya. Ciri khas bus ini ada pada kaca depannya yang dibuat ganda (double glass) dengan desain membulat alias rounded. Terdapat pilar horisontal yang memisahkan antara kaca depan di bagian atas dan kaca utama di bawahnya. Yang membedakan Infinity HD Deluxe ini dengan bus high deck dari karoseri lain, pada bus ini tersemat tambahan 'topi' di atap, persis di atas kaca bagian atas.",
    "Tahukah kamu siapa pemilik body bus Skyliner pertama di Indonesia? Ya, diluncurkan pertama kali pada tahun 2012, unit berbody Skyliner pertama kali dimiliki oleh PT Marissa Kencana Lestari atau yang dikenal dengan PO Marissa Holiday. Varian body bus hasil karya Karoseri Rahayu Santosa, asal Bogor ini hingga sekarang tetap eksis meskipun terus digempur oleh berbagai macam varian body bus lain. Skyliner tetap hadir tak lekang oleh zaman. Marissa Holiday dan Karoseri Rahayu Santosa merupakan satu kesatuan yang tak bisa dipisahkan. Untuk Skyliner, Marissa Holiday merupakan pemakai pertama dari produk ini. Dibeli dari pameran IIMS 2012 dengan chassis Mercedes Benz OH 1626.",
    "Multi purpose - The perfect solution for city and intercity trips! Especially designed to cater passengers’ satisfaction of short distance ride and the comfort of long distance journey. Simple and elegant interiors – Crucial for both fellow operators and travelers, not only provide more spacious area but it is also maintenance free and creatively designed.",
    "Merupakan pioneer bodi bus bermesin depan dengan kaca double di Indonesia, yang mematahkan anggapan bahwa bodi bus bermesin depan tidak bisa menjadi bus yang bisa tampil menarik dan tampak premium. Sangat cocok untuk bus jarak pendek hingga menengah. Karakternya yang lincah,desain bodi yang tangguh dan memudahkan perawatan membuat pengusaha bus dapat menghemat biaya operasional dan memaksimalkan penghasilan.",
    "Salah satu produk Big Bus dari karoseri New Armada adalah bus dengan nama EVONEXT,model ini  merupakan kategori Bus Besar yang diproduksi oleh karoseri New Armada Magelang. Model bus ini sudah di unakan oleh beberapa Perusahaan Otobus di Indonesia, seperti model-model bus yang lain, model EVONEXT sendiri juga di produksi dengan beberapa seri model, seri-seri model yang lain akan saya tulis pada postingan selanjutnya, kali ini saya akan saya tuliskan Spesifikasi dan Material yang digunakan pada model EVONEXT standar.",
    "Ventura HDD ini merupakan salah satu dari tiga bodi big bus yang ditawarkan oleh Morodadi Prima saat ini. Selain New Patriot dan Grand Tourismo yang banyak dipakai oleh PO ANS asal Sumatra Barat. Ciri khas bodi Ventura HDD ini ada di bentuk selendang dan aksen hitam di bagian pintu depannya. Uniknya lagi kaca samping bagian belakangnya bersudut tajam yang mengingatkan kita akan desain kaca Honda Freed.",
    "Ultima dari Karoseri Trisakti awal kali muncul di tahun 2013, waktu itu sepertinya yang pertama adalah dari Perum Damri, kemudian GMS Aurora, Aneka Jaya, Dewi Sri, dan lain-lain. Sepertinya Ultima ini di posisikan sebagai bis premium atau VIP dari Karoseri TS. menggunakan lampu belakang yang baru dan hanya digunakan oleh Ultima saja. Lampu besar yang terpisah dengan LED lamp yang memanjang seperti gagang telepon, lampu sein, lampu mundur, dan mata kucing. Bentuk kaca melengkung sedikit dan di bawahnya terpasang stop lamp LED memanjang tapi yang menyala hanya yang di tengah. Identitas sang Ultima terlihat sangat jelas di belakang pada aksen krom di atas kap mesin. Untuk kisi-kisi udara berbentuk seperti JETBUS hanya saja lebih kecil dan full semacam awat nyamuk.",
    "Bagian mukanya sudah dimodifikasi jadi serupa dengan model bus tingkat dari PO Nusantara yang biasa disebut Conqueror. Jadi mukanya lebih garang dibanding model Cityliner yang biasa. Keunggulan lain dari bodi buatan karoseri Nusantara Gemilang ini yaitu seluruh bodinya dibuat dari aluminium yang diklaim lebih ringan. Untuk desainnya sendiri, bodi Cityliner terinspirasi dari Neoplan Starliner, jadi bentuknya memang bernuansa Eropa dengan garis jendela yang bersih tanpa ada selendang. ")

    private val busImages = intArrayOf(R.drawable.jetbus,
        R.drawable.legacy,
        R.drawable.avante,
        R.drawable.evolander,
        R.drawable.rexus,
        R.drawable.tourismo,
        R.drawable.infinity,
        R.drawable.skyliner,
        R.drawable.discovery,
        R.drawable.max,
        R.drawable.evonext,
        R.drawable.ventura,
        R.drawable.ultima,
        R.drawable.cityliner
    )

    val listData: ArrayList<Bus>
        get() {
            val list = arrayListOf<Bus>()
            for (position in busBodies.indices) {
                val bus = Bus()
                bus.body = busBodies[position]
                bus.detail = busDetails[position]
                bus.photo = busImages[position]
                bus.price = busPrice[position]
                bus.builderName = builderName[position]
                bus.builderCity = builderCity[position]
                list.add(bus)
            }
            return list
        }


}
