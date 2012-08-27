/**
 * 
 */

package com.mirrorlabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mirrorlabs.ScrollingTabs.R;
import com.mirrorlabs.ScrollingTabs.ListActivity;


public class ArtistsFragment extends Fragment{
	
	ListActivity myactivity;
	
	 public ArtistsFragment() {
	    }

	    public ArtistsFragment(Bundle bundle) {
	        setArguments(bundle);
	    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup root = null;
		
		root = (ViewGroup) inflater.inflate(R.layout.about_us_dialog,container,false);	
		//myactivity = new ListActivity(getActivity(), root);
		
				
		return root;
	}
	
	@Override
    public void onStart() {
        super.onStart();
       
      
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
