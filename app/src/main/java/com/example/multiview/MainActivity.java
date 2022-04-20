package com.example.multiview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        myAdapter = new MyAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter.setData(getListItem());
        recyclerView.setAdapter(myAdapter);
    }

    private List<User> getListItem(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.mipmap.ic_launcher, "Vu Pham", true));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham1", true));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham2", true));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham3", true));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham4", false));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham5", false));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham6", false));

        list.add(new User(R.mipmap.ic_launcher, "Vu Pham7", false));
        return list;
    }
}