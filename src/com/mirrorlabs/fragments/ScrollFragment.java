
package com.mirrorlabs.fragments;





import com.mirrorlabs.ScrollingTabs.ListActivity;
import com.mirrorlabs.ScrollingTabs.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScrollFragment extends Fragment{
	
	ListActivity myactivity;
	
	 public ScrollFragment() {
	    }

	    public ScrollFragment(Bundle bundle) {
	        setArguments(bundle);
	    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup root = null;
		
		root = (ViewGroup) inflater.inflate(R.layout.listview,container,false);	
		myactivity = new ListActivity(getActivity(), root);
		
				
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
