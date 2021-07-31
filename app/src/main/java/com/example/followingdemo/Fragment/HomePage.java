package com.example.followingdemo.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.followingdemo.MyFragmentPagerAdapter;
import com.example.followingdemo.R;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

public class HomePage extends Fragment {
    private SlidingTabLayout mTab;
    private ViewPager mVp;
    private ArrayList<Fragment> mFragments;
    private String[] mTitlesArrays ={"关注","广场"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_page, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        mTab = (SlidingTabLayout) getActivity().findViewById(R.id.tab);
        mVp = (ViewPager) getActivity().findViewById(R.id.vp);

        mFragments = new ArrayList<>();
        mFragments.add(new Following());
        mFragments.add(BlankFragment.newInstance("广场"));

        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(getChildFragmentManager(), mFragments);
        mVp.setAdapter(pagerAdapter);

        mTab.setViewPager(mVp, mTitlesArrays);//tab和ViewPager进行关联
    }
}