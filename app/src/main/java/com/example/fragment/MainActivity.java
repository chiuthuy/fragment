package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnthem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnthem=findViewById(R.id.btn1);
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager= getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                FragmentHome fragmentHome=new FragmentHome();
                Bundle bundle=new Bundle();
                bundle.putString("aaa","lap trinh android");
                fragmentHome.setArguments(bundle);
                transaction.replace(R.id.myLayout,fragmentHome);
                transaction.commit();
            }
        });
        //addFragment(R.id.myLayout,new FragmentHome());
    }
//    public void addFragment(int id, Fragment fragment){
//        FragmentManager manager= getSupportFragmentManager();
//        FragmentTransaction transaction=manager.beginTransaction();
//        transaction.replace(id,fragment);
//        transaction.commit();
//
//    }
}
