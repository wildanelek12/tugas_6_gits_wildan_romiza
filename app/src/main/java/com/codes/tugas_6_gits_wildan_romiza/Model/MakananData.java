package com.codes.tugas_6_gits_wildan_romiza.Model;

import java.util.ArrayList;
import java.util.List;

public class MakananData {

    public static List<Makanan> listMakanan(){
        Makanan sate = new Makanan("Sate Ayam","Rp.15.000","https://backpanel.kemlu.go.id/PublishingImages/CC%20sate%20ayam%20madura/SM1.JPG");
        Makanan soto = new Makanan("Soto Babon","Rp.10.000","https://awsimages.detik.net.id/community/media/visual/2017/03/22/d3cb3b7a-aa3a-4e0a-a0d4-83828a40b5d5_43.jpg?w=700&q=90");
        Makanan ayam = new Makanan("Ayam Geprek","Rp.12.000","https://i2.wp.com/resepkoki.id/wp-content/uploads/2017/11/Resep-Ayam-geprek-jogja.jpg?fit=600%2C560&ssl=1");
        Makanan rujak = new Makanan("Rujak Cingur","Rp.13.000","https://asset.kompas.com/crops/dcFNlU98F0bRk5ZrSrV5PVivpc8=/129x0:858x486/750x500/data/photo/2021/05/15/609fbcd2ed6d9.jpg");
        Makanan boba = new Makanan("Boba Brown","Rp.19.000","https://asset.kompas.com/crops/aP_98iCv79Qo41hFBjRvIQ8YyG8=/0x0:1000x667/750x500/data/photo/2019/09/26/5d8c4fff5f34c.jpg");
        Makanan kopi = new Makanan("Kopi Hitam","Rp.5.000","https://image-cdn.medkomtek.com/kqxfebdrvnfv6jCfsJa-QOzuu3s=/1x49:1000x612/1200x675/klikdokter-media-buckets/medias/2302800/original/045285900_1547016776-4-Cara-Bikin-Kebiasaan-Minum-Kopi-Jadi-Lebih-Sehat-By-Ruslan-Semichev-Shutterstock.jpg");
        Makanan jus = new Makanan("Jus Jambu","Rp.9.000","https://www.buavita.co.id/images/article/guava_juice.jpg");
        Makanan tempura = new Makanan("Tempura","Rp.1.000","https://cdn0-production-images-kly.akamaized.net/pylWuAMLbeW0ldlFUjp2L1EUbss=/640x480/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3333890/original/082030800_1608971985-shrimp-tempura-4665687_1920.jpg");

        List<Makanan> listMakanan  = new ArrayList<>();

        listMakanan.add(sate);
        listMakanan.add(soto);
        listMakanan.add(ayam);
        listMakanan.add(rujak);
        listMakanan.add(boba);
        listMakanan.add(kopi);
        listMakanan.add(jus);
        listMakanan.add(tempura);

        return listMakanan;


    }

}
