package tr.com.mali.sirasizde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import tr.com.mali.sirasizde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Arkadaslar> gorselArrayList;
    int seciliSirano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        gorselArrayList = new ArrayList<>();


        Arkadaslar ogr1 = new Arkadaslar(380,"Mali","ibicioğlu","11/B",1,R.drawable.ogr1);
        Arkadaslar ogr2 = new Arkadaslar(390,"Amet","elpasa","11/B",2,R.drawable.ogr2);
        Arkadaslar ogr3 = new Arkadaslar(400,"Berat","genc","11/B",3,R.drawable.ogr3);
        Arkadaslar ogr4 = new Arkadaslar(410,"Cemil","sucuklu","11/B",4,R.drawable.ogr4);
        Arkadaslar ogr5 = new Arkadaslar(420,"Emin","ceyhan","11/B",5,R.drawable.ogr5);
        Arkadaslar ogr6 = new Arkadaslar(430,"Eren","öğütcen","11/B",6,R.drawable.ogr6);
        Arkadaslar ogr7 = new Arkadaslar(440,"Osman","avcı","11/B",7,R.drawable.ogr7);
        Arkadaslar ogr8 = new Arkadaslar(450,"Ensar","ünal","11/B",8,R.drawable.ogr8);
        Arkadaslar ogr9 = new Arkadaslar(460,"Berkay","edikli","11/B",9,R.drawable.ogr9);
        Arkadaslar ogr10 = new Arkadaslar(470,"Memmet","genc","11/B",10,R.drawable.ogr10);

        gorselArrayList.add(ogr1);
        gorselArrayList.add(ogr2);
        gorselArrayList.add(ogr3);
        gorselArrayList.add(ogr4);
        gorselArrayList.add(ogr5);
        gorselArrayList.add(ogr6);
        gorselArrayList.add(ogr7);
        gorselArrayList.add(ogr8);
        gorselArrayList.add(ogr9);
        gorselArrayList.add(ogr10);

        binding.imageView.setImageResource(gorselArrayList.get(0).foto);
        binding.okulno.setText("Okul No : " + gorselArrayList.get(0).okulNo);
        binding.ad.setText("Adı : " + gorselArrayList.get(0).Adi);
        binding.soyad.setText("Soyad : " + gorselArrayList.get(0).Soyad);
        binding.siniff.setText("Okul No : " + gorselArrayList.get(0).Sinif);




        seciliSirano = 0;



    }

    public void ileriGit(View view) {
        if(seciliSirano<gorselArrayList.size()-1){
            seciliSirano++;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSirano).foto);
            binding.okulno.setText("Okul No : " + gorselArrayList.get(seciliSirano).okulNo);
            binding.ad.setText("Adı : " + gorselArrayList.get(seciliSirano).Adi);
            binding.soyad.setText("Soyad : " + gorselArrayList.get(seciliSirano).Soyad);
            binding.siniff.setText("Okul No : " + gorselArrayList.get(seciliSirano).Sinif);
        }
        else seciliSirano=-1;
    }

    public void geriGit(View view) {
        if(seciliSirano>0){
            seciliSirano--;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSirano).foto);
            binding.okulno.setText("Okul No : " + gorselArrayList.get(seciliSirano).okulNo);
            binding.ad.setText("Adı : " + gorselArrayList.get(seciliSirano).Adi);
            binding.soyad.setText("Soyad : " + gorselArrayList.get(seciliSirano).Soyad);
            binding.siniff.setText("Okul No : " + gorselArrayList.get(seciliSirano).Sinif);
        }
        else seciliSirano=10;
    }
}