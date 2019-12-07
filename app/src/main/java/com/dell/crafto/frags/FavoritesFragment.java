package com.dell.crafto.frags;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dell.crafto.LSAdapter;
import com.dell.crafto.ProductsAdapter;
import com.dell.crafto.R;
import com.dell.crafto.model.Product;

import java.util.ArrayList;
import java.util.List;

public class FavoritesFragment extends Fragment {

    private static LSAdapter productsAdapter;
    private static List<Product> fav_products = new ArrayList<>();
    private static ListView productsView;
    static Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context = container.getContext();
        View rootView = inflater.inflate(R.layout.fragment_favorites, container, false);
//
//        // Inflate the layout for this fragment
        productsView =rootView.findViewById(R.id.product_view);


       return rootView;
    }





    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


    }
    public static void setData(Product product) {
        fav_products.add(product);
        productsAdapter = new LSAdapter(context,fav_products);
        productsView.setAdapter((ListAdapter) productsAdapter);
    }
}
