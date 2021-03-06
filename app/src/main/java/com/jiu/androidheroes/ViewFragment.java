package com.jiu.androidheroes;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jiu on 15/10/20.
 */
public class ViewFragment extends Fragment {
    public static ViewFragment instance;

    public static ViewFragment newInstance() {
        if (instance == null) {
            instance = new ViewFragment();
        }
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.view_fragment, container, false);
        initViews(contentView);
        return contentView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getString(R.string.title_section3));
    }

    private void initViews(View view) {

    }
}
