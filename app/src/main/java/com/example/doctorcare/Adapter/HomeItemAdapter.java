package com.example.doctorcare.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorcare.Fragment.DoctorListFragment;
import com.example.doctorcare.Model.HomeItem;
import com.example.doctorcare.R;
import com.example.doctorcare.databinding.HomeItemSampleBinding;

import java.util.ArrayList;

public class HomeItemAdapter extends RecyclerView.Adapter<HomeItemAdapter.viewHolder>{

    Context context;
    ArrayList<HomeItem> homeItems;

    public HomeItemAdapter(Context context, ArrayList<HomeItem> homeItems) {
        this.context = context;
        this.homeItems = homeItems;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(context).inflate(R.layout.home_item_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
          HomeItem homeItem =homeItems.get(position);

          holder.binding.igHomeItem.setImageResource(homeItem.getItemImage());
          holder.binding.txName.setText(homeItem.getItemName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frMainContainer , new DoctorListFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return homeItems.size();
    }


    public static class viewHolder extends RecyclerView.ViewHolder{
        HomeItemSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeItemSampleBinding.bind(itemView);
        }
    }
}
