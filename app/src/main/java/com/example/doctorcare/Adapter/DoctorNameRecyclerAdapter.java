package com.example.doctorcare.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorcare.Fragment.DoctorDetailFragment;
import com.example.doctorcare.Fragment.DoctorListFragment;
import com.example.doctorcare.Model.DoctorName;
import com.example.doctorcare.R;
import com.example.doctorcare.databinding.DoctorListSampleBinding;

import java.util.ArrayList;

public class DoctorNameRecyclerAdapter extends RecyclerView.Adapter<DoctorNameRecyclerAdapter.viewHolder> {

    Context context;
    ArrayList<DoctorName> doctorNames;

    public DoctorNameRecyclerAdapter(Context context, ArrayList<DoctorName> doctorNames) {
        this.context = context;
        this.doctorNames = doctorNames;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.doctor_list_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DoctorName doctorName = doctorNames.get(position);

        holder.binding.igDoctorImage.setImageResource(doctorName.getDoctorImage());
        holder.binding.txDoctorName.setText(doctorName.getDoctorName());
        holder.binding.txSpecialist.setText(doctorName.getDoctorSpecialist());
        holder.binding.txHospitalName.setText(doctorName.getHospitalName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frMainContainer , new DoctorDetailFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return doctorNames.size();
    }


    public static class viewHolder extends RecyclerView.ViewHolder{
           DoctorListSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DoctorListSampleBinding.bind(itemView);
        }
    }
}
