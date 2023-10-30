package com.example.prm392_finalproject.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prm392_finalproject.Order;
import com.example.prm392_finalproject.R;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private Context mContext;
    private List<Order> mListOrder;

    public OrderAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Order> list) {
        this.mListOrder = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rev_order, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        Order order = mListOrder.get(position);
        holder.tvOrderId.setText(order.getOrderId() + "");

        if (order.getOrderStatus() == 0) {
            holder.tvOrderStatus.setText("Đã đặt hàng");
            holder.tvOrderStatus.setTextColor(Color.parseColor("#80000000"));
            holder.layoutOrder.setBackgroundColor(Color.parseColor("#40000000"));
       }
        else if (order.getOrderStatus() == 1) {
            holder.tvOrderStatus.setText("Đã xác nhận");
            holder.tvOrderStatus.setTextColor(Color.parseColor("#9C27B0"));
            holder.layoutOrder.setBackgroundColor(Color.parseColor("#409C27B0"));
        } else if (order.getOrderStatus() == 2) {
            holder.tvOrderStatus.setText("Đang giao hàng");
            holder.tvOrderStatus.setTextColor(Color.parseColor("#3F51B5"));
            holder.layoutOrder.setBackgroundColor(Color.parseColor("#403F51B5"));
        } else if (order.getOrderStatus() == 3) {
            holder.tvOrderStatus.setText("Đã giao hàng");
            holder.tvOrderStatus.setTextColor(Color.parseColor("#369C3A"));
            holder.layoutOrder.setBackgroundColor(Color.parseColor("#40369C3A"));
        } else if (order.getOrderStatus() == 4) {
            holder.tvOrderStatus.setText("Đơn hàng bị hủy");
            holder.tvOrderStatus.setTextColor(Color.parseColor("#CC3125"));
            holder.layoutOrder.setBackgroundColor(Color.parseColor("#40CC3125"));
        }

        holder.tvOrderUsername.setText(order.getUsername());
        holder.tvOrderPhonenum.setText(order.getPhoneNum());
        holder.tvOrderAddress.setText(order.getAddress());
        holder.tvOrderCost.setText(order.getOrderCost() + "");
        holder.cvOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Order clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListOrder != null) {
            return mListOrder.size();
        }
        return 0;
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {

        private TextView tvOrderId, tvOrderStatus, tvOrderUsername, tvOrderPhonenum, tvOrderAddress, tvOrderCost;
        private CardView cvOrder;
        private LinearLayout layoutOrder;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);

            tvOrderId = itemView.findViewById(R.id.tv_order_id);
            tvOrderStatus = itemView.findViewById(R.id.tv_order_status);
            tvOrderUsername = itemView.findViewById(R.id.tv_order_username);
            tvOrderPhonenum = itemView.findViewById(R.id.tv_order_phonenum);
            tvOrderAddress = itemView.findViewById(R.id.tv_order_address);
            tvOrderCost = itemView.findViewById(R.id.tv_order_cost);
            cvOrder = itemView.findViewById(R.id.cv_order);
            layoutOrder = itemView.findViewById(R.id.layout_order);
        }
    }
}