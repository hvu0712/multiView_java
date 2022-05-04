package com.example.multiview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int VIEW1 = -1;
    private static final int VIEW2 = 1;
    private List<User> mList;

    public void setData(List<User> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (VIEW1 == viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view1, parent, false);
            return new ViewHolder1(view);
        } else if (VIEW2 == viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view2, parent, false);
            return new ViewHolder2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = mList.get(position);
        if (user == null){
            return;
        }
        if (VIEW1 == holder.getItemViewType()){
            ViewHolder1 viewHolder1 = (ViewHolder1) holder;
            viewHolder1.img1.setImageResource(user.getIdResource());
            viewHolder1.tv.setText(user.getName());
        } else if (VIEW2 == holder.getItemViewType()){
            ViewHolder2 viewHolder2 = (ViewHolder2) holder;
            viewHolder2.img2.setImageResource(user.getIdResource());
            viewHolder2.tv_2.setText(user.getName());
            viewHolder2.tv_21.setText(user.getName());
        }
    }

    @Override
    public int getItemCount() {
        if(mList != null){
            return mList.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        User user = mList.get(position);
        if (user.isFeeatured()){
            return VIEW1;
        } else {
            return VIEW2;
        }
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder{

        ImageView img1;
        TextView tv;

        public ViewHolder1(@NonNull View itemView) {
            super(itemView);

            img1 = itemView.findViewById(R.id.img_item_view1);
            tv = itemView.findViewById(R.id.tv_item_view1);
        }
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {

        ImageView img2;
        TextView tv_2, tv_21;

        public ViewHolder2(@NonNull View itemView) {
            super(itemView);

            img2 = itemView.findViewById(R.id.img_item_view2);
            tv_2 = itemView.findViewById(R.id.tv_item_view2);
            tv_21 = itemView.findViewById(R.id.tv_item_view2_1);
        }
    }


}
