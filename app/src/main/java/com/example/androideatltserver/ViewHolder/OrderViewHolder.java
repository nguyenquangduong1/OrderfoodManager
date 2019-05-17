package com.example.androideatltserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androideatltserver.Interface.ItemClickListener;
import com.example.androideatltserver.R;


public class OrderViewHolder extends RecyclerView.ViewHolder {
    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress,txtOrderDate;

    public Button btnEdit,btnRemove,btnDeatail,btnDirestion;


    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);
        txtOrderDate = (TextView)itemView.findViewById(R.id.order_date);


        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnDeatail = (Button)itemView.findViewById(R.id.btnDetail);
        btnDirestion = (Button)itemView.findViewById(R.id.btnDirection);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
    }
}
