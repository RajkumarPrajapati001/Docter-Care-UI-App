package com.example.doctorcare.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentDoctorDetailBinding;

public class DoctorDetailFragment extends Fragment {


    public DoctorDetailFragment() {
        // Required empty public constructor
    }

    private FragmentDoctorDetailBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDoctorDetailBinding.inflate(getLayoutInflater());

        binding.igBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new DoctorListFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new AppointmentFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });





        return binding.getRoot();
    }
}