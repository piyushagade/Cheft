package com.piyushagade.cheft;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Piyush Agade on 01-09-2016.
 */
public class AddTimerFragment extends Fragment{
    public String publishTopic="";
    public String publishMessage="";



    Context context=getActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.add_timer_activity, container, false);

        return view;
    }



}
