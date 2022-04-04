package com.example.doctorcare.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctorcare.Adapter.HomeItemAdapter;
import com.example.doctorcare.Model.HomeItem;
import com.example.doctorcare.R;
import com.example.doctorcare.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private FragmentHomeBinding binding;
    private ArrayList<HomeItem> homeItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());


        binding.igProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer, new ProfileFragment())
                        .addToBackStack(null).commit();
            }
        });


        homeItems = new ArrayList<>();
        homeItems.add(new HomeItem(R.drawable.prevention,"Covid-19"));
        homeItems.add(new HomeItem(R.drawable.tooth,"Teeth"));
        homeItems.add(new HomeItem(R.drawable.heart,"Heart"));
        homeItems.add(new HomeItem(R.drawable.eye,"Eye"));
        homeItems.add(new HomeItem(R.drawable.blood,"Blood"));
        homeItems.add(new HomeItem(R.drawable.bone,"Bone"));
        homeItems.add(new HomeItem(R.drawable.ears,"Ears"));
        homeItems.add(new HomeItem(R.drawable.skin,"Skin"));
        homeItems.add(new HomeItem(R.drawable.mentalhealth,"Psychology"));
        homeItems.add(new HomeItem(R.drawable.longhair,"Hair"));
        homeItems.add(new HomeItem(R.drawable.thinking,"Mind"));
        homeItems.add(new HomeItem(R.drawable.pneumonia,"Cancer"));
        homeItems.add(new HomeItem(R.drawable.bloodtest,"Diabetes"));
        homeItems.add(new HomeItem(R.drawable.mosquito,"Malaria"));
        homeItems.add(new HomeItem(R.drawable.headache,"Vertigo"));
        homeItems.add(new HomeItem(R.drawable.stomach,"Stomach"));
        homeItems.add(new HomeItem(R.drawable.intestine,"Appendicitis"));
        homeItems.add(new HomeItem(R.drawable.fever,"Fever"));



        HomeItemAdapter homeItemAdapter =new HomeItemAdapter(getContext(),homeItems);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        binding.rvHomeItem.setLayoutManager(gridLayoutManager);
        binding.rvHomeItem.setAdapter(homeItemAdapter);


        return binding.getRoot();
    }
 }