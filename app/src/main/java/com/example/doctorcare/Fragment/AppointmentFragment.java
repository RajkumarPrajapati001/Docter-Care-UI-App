package com.example.doctorcare.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentAppointmentBinding;


public class AppointmentFragment extends Fragment {



    public AppointmentFragment() {
        // Required empty public constructor
    }

   private FragmentAppointmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAppointmentBinding.inflate(getLayoutInflater());

        binding.igBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new DoctorDetailFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnBookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new HomeFragment());
                fragmentTransaction.addToBackStack(null).commit();

                Toast.makeText(getContext(), "Your Appointment Is Successfully Book.", Toast.LENGTH_SHORT).show();
            }
        });


        return binding.getRoot();
    }
}