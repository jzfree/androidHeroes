package com.jiu.androidheroes;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jiu on 15/12/11.
 */
public class ScrollFragment extends Fragment {
    public static ScrollFragment instance;

    public static ScrollFragment newInstance() {
        if (instance == null) {
            instance = new ScrollFragment();
        }
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.scroll_fragment, container, false);
        initViews(contentView);
        return contentView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getString(R.string.title_section2));
    }

    private void initViews(View view) {
    }
}
