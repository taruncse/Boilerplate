package com.tkb.boilerplate.drawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.Drawer;

import com.tkb.boilerplate.R;
import com.tkb.boilerplate.common.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 * This is just a demo fragment with a long scrollable view of editTexts. Don't see this as a reference for anything
 */
public class FirstFragment extends BaseFragment {
    private static final String KEY_TITLE = "title";

    private Drawer result;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance(String title) {
        FirstFragment f = new FirstFragment();

        Bundle args = new Bundle();

        args.putString(KEY_TITLE, title);
        f.setArguments(args);

        return (f);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // don't look at this layout it's just a listView to show how to handle the keyboard
        Toast.makeText(getActivity(), "Fragment Created", Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_simple_sample, container, false);

        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(getArguments().getString(KEY_TITLE));


        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        //add the values which need to be saved from the drawer to the bundle
        outState = result.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }
}
