package com.example.doctorcare.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctorcare.Adapter.DoctorNameRecyclerAdapter;
import com.example.doctorcare.Model.DoctorName;
import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentDoctorListBinding;

import java.util.ArrayList;

public class DoctorListFragment extends Fragment {

    public DoctorListFragment() {
        // Required empty public constructor
    }

    private FragmentDoctorListBinding binding;
    private ArrayList<DoctorName> doctorNames;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDoctorListBinding.inflate(getLayoutInflater());

        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new HomeFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });


        doctorNames = new ArrayList<>();
        doctorNames.add(new DoctorName(R.drawable.drdp,"Dr.Smith","Teeth Specialist","Civil Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp2,"Dr.Nidhi Shukla","Eye Specialist","Gokul Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp3,"Dr.Sachin Mehta","Heart Specialist","Shreeji Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp4,"Dr.Akhsay Kumar","Blood Specialist","Forex Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp5,"Dr.Allu Arjun","Skin Specialist","Sterling Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp6,"Dr.Payal Tripathi","Bone Specialist","Sai Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp7,"Dr.Vijay Thelupati","Psychology Specialist","Fortune Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp8,"Dr.Prabhas Bahubali","Hair Specialist","Wockhart Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp9,"Dr.Vikram Siyachin","Mental Specialist","Shivam Hospital"));
        doctorNames.add(new DoctorName(R.drawable.drdp10,"Dr.Ravina Teja","Ears Specialist","Asian Hospital"));


        DoctorNameRecyclerAdapter doctorNameRecyclerAdapter =new DoctorNameRecyclerAdapter(getContext(),doctorNames);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        binding.rvDoctorName.setLayoutManager(gridLayoutManager);
        binding.rvDoctorName.setAdapter(doctorNameRecyclerAdapter);




        return binding.getRoot();
    }
}