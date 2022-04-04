package com.example.doctorcare.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentStartScreenBinding;


public class StartScreenFragment extends Fragment {
    public StartScreenFragment() {
        // Required empty public constructor
    }

    private FragmentStartScreenBinding binding;
    private SharedPreferences spf;
    private String Name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStartScreenBinding.inflate(getLayoutInflater());

        spf = requireContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        Name = spf.getString("UserName" , null);

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                if(Name == null){
                    fragmentTransaction.replace(R.id.frMainContainer, new LoginFragment())
                            .addToBackStack(null).commit();
                }else {
                    fragmentTransaction.replace(R.id.frMainContainer, new HomeFragment())
                            .addToBackStack(null).commit();
                }
            }
        });
        return binding.getRoot();
    }
}