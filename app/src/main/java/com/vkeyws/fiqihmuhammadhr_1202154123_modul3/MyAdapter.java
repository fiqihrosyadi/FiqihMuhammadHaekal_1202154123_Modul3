package com.vkeyws.fiqihmuhammadhr_1202154123_modul3;

import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AS on 2/24/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private ArrayList<String> arrayListMenu; //untuk menampung merk
    private ArrayList<String> arrayListsKeterangan; //untuk menampung keterangan
    private ArrayList<Integer> gambar; //Digunakan untuk menampung Gambar
    //membuat konstruktor
    MyAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsKeterangan, ArrayList<Integer> Gambar){
        this.arrayListMenu = arrayListMenu;
        this.arrayListsKeterangan = arrayListsKeterangan;
        this.gambar = Gambar;
    }
    //membuat class vieHolder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView menu, keterangan;
        private ImageView gambar;
        private RelativeLayout ItemList;
        //membuat method ViewHolder untuk mengurangi pemanggilan findViewById() yang nantinya akan ditampilkan
        ViewHolder(View itemView) {
            super(itemView);
            //pemanggialan id
            menu = itemView.findViewById(R.id.txtMenu);
            keterangan = itemView.findViewById(R.id.txtKeterangan);
            gambar = itemView.findViewById(R.id.image);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final MyAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat
        final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi
        final String keterangan = arrayListsKeterangan.get(position);//Mengambil data sesuai dengan posisi
        final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi
        holder.menu.setText(menu);
        holder.keterangan.setText(keterangan);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi
        //Membuat Aksi Saat Judul Pada List ditekan

        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                String komposisi;
                switch (position){
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Meat, Lasagna";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Meatballs, Fishballs, Shrimp";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "meat, potatoes";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Chicken, Sauce, Shrimp, Mushrooms and vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Beef, seasoning";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("keterangan", arrayListsKeterangan.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Shrimp, mushrooms, vegetables";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }
    public int getItemCount() {
        return arrayListMenu.size();
    }
}
