package com.skumar.tabinfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sanjeev Kumar on 09-11-2017.
 */

public class TabsFragment extends android.support.v4.app.Fragment {
    private static View summaryView;
    private FragmentTabHost mTabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (summaryView == null) {
            summaryView = inflater.inflate(R.layout.fragment_tabhost, container, false);

            mTabHost = (FragmentTabHost) summaryView.findViewById(android.R.id.tabhost);
            mTabHost.setup(getActivity(), getActivity().getSupportFragmentManager(), R.id.realtabcontent);

            mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab1"), FirstFragment.class, null);
            mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab2"), SecondFragment.class, null);
            mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab3"), ThirdFragment.class, null);
        }
        return summaryView;
    }

    public static TabsFragment newInstance() {
        TabsFragment fragment = new TabsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

