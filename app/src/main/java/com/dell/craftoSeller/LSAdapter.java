package com.dell.craftoSeller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dell.craftoSeller.model.Product;

import java.util.List;

public class LSAdapter extends BaseAdapter {
    private final Context context;
    private final List<Product> productList;

    public LSAdapter(Context context , List<Product> products) {
        this.context = context;
        this.productList = products;
    }


    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Product getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.f_product_row,parent,false);
        ImageView imageView = view.findViewById(R.id.iv_row);
        TextView name = view.findViewById(R.id.tv_name);
        TextView price = view.findViewById(R.id.tv_price);
        Product product = getItem(position);

//        imageView.setImageResource(product.getImage());
        name.setText(product.getName());
        price.setText(product.getPrice());

        return view;
    }
}
