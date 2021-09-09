package com.codes.tugas_6_gits_wildan_romiza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.codes.tugas_6_gits_wildan_romiza.Adapter.MakananAdapter;
import com.codes.tugas_6_gits_wildan_romiza.Model.Makanan;
import com.codes.tugas_6_gits_wildan_romiza.Model.MakananData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_makanan;
    private MakananAdapter makananAdapter;
    private List<Makanan> makananList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_makanan = findViewById(R.id.rv_makanan);
        makananList = new ArrayList<>();
        makananList = MakananData.listMakanan();
        makananAdapter = new MakananAdapter(this,makananList);
        rv_makanan.setLayoutManager(new GridLayoutManager(this, 2));
        rv_makanan.setAdapter(makananAdapter);

        rv_makanan.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int position = parent.getChildAdapterPosition(view); // item position
                int spanCount = 2;
                int spacing = 10;//spacing between views in grid

                if (position >= 0) {
                    int column = position % spanCount; // item column

                    outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                    outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                    if (position < spanCount) { // top edge
                        outRect.top = spacing;
                    }
                    outRect.bottom = spacing; // item bottom
                } else {
                    outRect.left = 0;
                    outRect.right = 0;
                    outRect.top = 0;
                    outRect.bottom = 0;
                }
            }
        });

    }
}