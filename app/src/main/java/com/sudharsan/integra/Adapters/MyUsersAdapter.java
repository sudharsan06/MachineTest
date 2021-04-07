package com.sudharsan.integra.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.sudharsan.integra.Models.UserPojo;
import com.sudharsan.integra.R;

import java.util.ArrayList;
import java.util.List;

public class MyUsersAdapter extends RecyclerView.Adapter<MyUsersAdapter.ViewHolder> {

    ArrayList<UserPojo> list;
    private List<UserPojo> orginalList;
    View v;
    Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;

        public ViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    public MyUsersAdapter(List<UserPojo> list, MyOrdersFragment myOrdersFragment) {
        this.list = (ArrayList<UserPojo>) list;
        this.orginalList = new ArrayList<>();
        orginalList.addAll(list);
    }

    @NonNull
    @Override
    public MyUsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_my_users, parent, false);
        context = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyUsersAdapter.ViewHolder holder, final int position) {
        LinearLayout ll_list_no = (LinearLayout) holder.view.findViewById(R.id.card_view);
        TextView tvUserName = (TextView) holder.view.findViewById(R.id.tvUserName);
        TextView tvUserMail = (TextView) holder.view.findViewById(R.id.tvUserMail);


        tvUserName.setText(list.get(position).getName());
        tvUserMail.setText(list.get(position).getEmailId());


        ll_list_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
