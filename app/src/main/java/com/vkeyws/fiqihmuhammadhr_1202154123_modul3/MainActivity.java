package com.vkeyws.fiqihmuhammadhr_1202154123_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //mendeklarasikan atribute
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Keterangan;
    private ArrayList<Integer> Gambar;

    //Daftar Merk air minum menggunakan array
    private String[] menu = {"Ades", "Amidis", "Aqua", "Cleo",  "Club", "Equil","Evian","Le Minerale","Nestle","Prinstine","Vit"};
    //Array keterangan merk
    private String[] keterangan = {"Ini adalah air minum merk Ades", "Ini adalah air minum merk Amidis", "Ini adalah air minum merk Aqua", "Ini adalah air minum merk Cleo", "Ini adalah air minum merk Club",
            "Ini adalah air minum merk Equil","Ini adalah air minum merk Evian","Ini adalah air minum merk le Minerale","Ini adalah air minum merk Nestle",
            "Ini adalah air minum merk Pristine","Ini adalah air minum merk Vit"};
    //Daftar Gambar air minum
    private int[] image = {R.drawable.ades, R.drawable.amidis, R.drawable.aqua, R.drawable.cleo, R.drawable.club,
            R.drawable.equil,R.drawable.evian,R.drawable.leminerale, R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu = new ArrayList<>();
        Keterangan = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.recycler_view);
        DaftarItem();
        //untuk mengatur posisi item pada listuntuk mengatur posisi item pada list, Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new MyAdapter(Menu, Keterangan, Gambar);
        //Memasang Adapter pada RecyclerView
        //recyclerview adalah adalah adapter view selain listview dan gridview
        recyclerView.setAdapter(adapter);
    }
    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Keterangan.add(keterangan[w]);
        }
    }
}
