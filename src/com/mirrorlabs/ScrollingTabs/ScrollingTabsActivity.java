package com.mirrorlabs.ScrollingTabs;





import com.mirrorlabs.adapters.PagerAdapter;
import com.mirrorlabs.adapters.ScrollingTabsAdapter;
import com.mirrorlabs.fragments.ArtistsFragment;
import com.mirrorlabs.fragments.ScrollFragment;
import com.mirrorlabs.ui.widgets.ScrollableTabView;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class ScrollingTabsActivity extends FragmentActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
     //   ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);
		 //  actionBar.setTitle("Google Music");
		  // actionBar.setHomeAction(new IntentAction(this,createShareIntent(), R.drawable.ic_title_home_default));
       
		   initPager();
    }
    
    private Intent createShareIntent() {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Shared from the ActionBar widget.");
        return Intent.createChooser(intent, "Share");
    }
    
    public void initPager() {
        
    	  // Initiate PagerAdapter
        PagerAdapter mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
       
        mPagerAdapter.addFragment(new ArtistsFragment());
        for(int i=0;i<5;i++){
        mPagerAdapter.addFragment(new ScrollFragment());
        }
         
         // Initiate ViewPager
        ViewPager mViewPager = (ViewPager)findViewById(R.id.viewPager);
        mViewPager.setPageMargin(getResources().getInteger(R.integer.viewpager_margin_width));
        mViewPager.setPageMarginDrawable(R.drawable.viewpager_margin);
        mViewPager.setOffscreenPageLimit(mPagerAdapter.getCount());
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.setCurrentItem(1);

        // Tabs
        initScrollableTabs(mViewPager);

       
    }
    public void initScrollableTabs(ViewPager mViewPager) {
    	
        ScrollableTabView mScrollingTabs = (ScrollableTabView)findViewById(R.id.scrollingTabs);
        ScrollingTabsAdapter mScrollingTabsAdapter = new ScrollingTabsAdapter(this);
        mScrollingTabs.setAdapter(mScrollingTabsAdapter);
        mScrollingTabs.setViewPager(mViewPager);

       
    }

    
}