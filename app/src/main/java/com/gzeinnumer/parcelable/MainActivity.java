package com.gzeinnumer.parcelable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataItem> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        mNames.add(new DataItem("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Weekuri.jpg","Danau"));
        mNames.add(new DataItem("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Toba.jpg","Danau Toba"));
        mNames.add(new DataItem("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Kelimutu.jpg","Danau Kelimutu"));
        mNames.add(new DataItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbrRMaziA1vnpoIBu0VHIFbrdz0whR2vRGNsI6E9w4DYb8NFxq","Jembatan"));
        mNames.add(new DataItem("https://c1.staticflickr.com/1/944/40484682670_e424a3dbdb_c.jpg","Lembah"));
        mNames.add(new DataItem("https://1.bp.blogspot.com/-PH8tZN-hc9Y/WP8Rn-1rtpI/AAAAAAAAAT0/7qJ2DKuWAs4TPn_TgHpCPdNM8_Uu9x5vgCLcB/s1600/gambar%2Bpemandangan%2Bhutan%2Byang%2Bindah%2B%25281%2529.jpg","Hutan Bambu"));

        initRecycleView();

    }

    public void initRecycleView(){
        RecyclerView recyclerView = findViewById(R.id.rv);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
