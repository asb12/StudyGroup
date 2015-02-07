package com.example.studygroup;

import java.util.Arrays;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.studygroup.R;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {				 

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

     
        return rootView;
    }
//	 @Override
//	    public void onViewCreated(View view, Bundle savedInstanceState) {
//	        super.onViewCreated(view, savedInstanceState);
//
//	        profilePictureView = (ProfilePictureView) view.findViewById(R.id.profile_pic);
//	       // defaultProfilePic = (ImageView) view.findViewById(R.id.default_user_pic);
//            profilePictureView.setVisibility(View.VISIBLE);
//          //  defaultProfilePic.setVisibility(View.GONE);
//	    }	 

	


}
