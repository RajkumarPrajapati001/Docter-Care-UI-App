package com.example.doctorcare.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentSplashBinding;


public class SplashFragment extends Fragment {

    public SplashFragment() {
        // Required empty public constructor
    }

     private FragmentSplashBinding binding;
    private static final int SPLASH_SCREEN = 3000;
    private Animation topAnim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(getLayoutInflater());

        topAnim = AnimationUtils.loadAnimation(getContext(), R.anim.top_animation);

        binding.txDoctorCare.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.remove(SplashFragment.this);
                fragmentTransaction.replace(R.id.frMainContainer, new StartScreenFragment())
                        .addToBackStack(null).commit();
            }
        }, SPLASH_SCREEN);

        return binding.getRoot();
    }
}