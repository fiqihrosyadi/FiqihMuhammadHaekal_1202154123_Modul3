package com.vkeyws.fiqihmuhammadhr_1202154123_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private int counts = 1;
    private Button plus;
    private Button minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //pengambilan data menggunakan internt
        String merk =  getIntent().getStringExtra("menu");
        String ket =  getIntent().getStringExtra("komposisi");
        Integer gambar = getIntent().getIntExtra("image", 0);

        //pemanggilan/pencarian berdasarkan id
        TextView textMerk = findViewById(R.id.merk);
        TextView textKet = findViewById(R.id.ket);
        ImageView imageGambar = findViewById(R.id.imageview);

        textMerk.setText(merk);
        textKet.setText(ket);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txtView);
        battery = findViewById(R.id.battery);
        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        value.setText(Integer.toString(counts) + " Liter");
    }

    //memberikan action onClick pada method plus
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {

                case 1:

                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
                    break;
                case 2:

                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 3:

                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 4:

                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 7:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
                    break;

            }

        }
    }
    //memberikan action onClick pada method plus
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 7:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + " Liter");
                    Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
                    break;
            }

        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        //function ketika button back di klik maka akan kembali ke view sebelumnya
        onBackPressed();
        return true;
    }

}
