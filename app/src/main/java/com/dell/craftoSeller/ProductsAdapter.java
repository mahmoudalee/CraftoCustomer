package com.dell.craftoSeller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dell.craftoSeller.model.Item;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductHolder>{

    private List<Item> products = new ArrayList<>();
    Context context;
    @NonNull
    @Override
    public ProductsAdapter.ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item,parent,false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ProductHolder holder, int position) {
        Item nProduct = products.get(position);

        Picasso.with(context)
                .load(nProduct.getImge())
                .error(R.drawable.ic_account_circle_black)
                .into(holder.img);
        holder.txtName.setText(nProduct.getName());
        holder.txtDisc.setText(nProduct.getDescription());
        holder.txtprice.setText(nProduct.getPrice().toString());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    public void setProducts(List<Item> products) {
        this.products = products;
        notifyDataSetChanged();
    }

    public Item getProductAt(int position) {
        return products.get(position);
    }

    public class ProductHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView txtName;
        private TextView txtDisc;
        private TextView txtprice;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            txtName = itemView.findViewById(R.id.tv_name);
            txtDisc = itemView.findViewById(R.id.tv_disc);
            txtprice = itemView.findViewById(R.id.tv_price);


        }
    }
}
