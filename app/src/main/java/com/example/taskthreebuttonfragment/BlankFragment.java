package com.example.taskthreebuttonfragment;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
//        LayoutInflater lf = getActivity().getLayoutInflater();
//        View view =  lf.inflate(R.layout.fragment, container, false); //pass the correct layout name for the fragment

//        TextView text = (TextView) view.findViewById(R.id.sektion_name_detailed_view);
//        text.setText("test");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView vv=v.findViewById(R.id.textView);;

//        vv= v.findViewById(R.id.textView);
        if(MainActivity.flag == 1){
            vv.setText("fjfjnghfhghf");}
            else if (MainActivity.flag ==2){
//            View v = inflater.inflate(R.layout.fragment_blank, container, false);
                vv.setText("here");
            v.setBackgroundColor(Color.BLUE);
            }


        else if (MainActivity.flag ==3){
            vv.setText("here");
            v.setBackgroundColor(Color.BLUE);
        }
        return v ;

    }

}
