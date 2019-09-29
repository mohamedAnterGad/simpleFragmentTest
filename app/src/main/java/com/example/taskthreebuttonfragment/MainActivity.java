package com.example.taskthreebuttonfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView about,home,search;
BlankFragment fragment;
public static int flag = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = findViewById(R.id.about);
        home=findViewById(R.id.home);
        search=findViewById(R.id.search);
 fragment = new BlankFragment();
 about.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         flag = 1;
         BlankFragment firstFrag = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
         firstFrag.getView().setBackgroundColor(Color.BLACK);
         //         fragment.getView().setBackgroundColor(Color.WHITE);
     }
 });
home.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        flag = 2;
//        BlankFragment firstFrag = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        BlankFragment firstFrag = new BlankFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,firstFrag);
        ft.commit();
//        firstFrag.getView().setBackgroundColor(Color.BLUE);
//        loadFragment(firstFrag,Color.BLUE);
    }
});
search.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        flag = 3;
        BlankFragment firstFrag = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        firstFrag.getView().setBackgroundColor(Color.GREEN);
    }
});
    }
    public void loadFragment(Fragment fragment, Color color) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,fragment);
//        fragment.getView().setBackgroundColor(color);

        ft.commit();
        //BlankFragment firstFrag = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
//        fragment.getView().setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
        //or for color set
//        fragment.getView().setBackgroundColor(Color.BLACK);

    }
}
