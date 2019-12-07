package com.dell.crafto.frags;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dell.crafto.MainActivity;
import com.dell.crafto.ProductsAdapter;
import com.dell.crafto.R;
import com.dell.crafto.model.Item;
import com.dell.crafto.model.Product;
import com.dell.crafto.model.ProductData;
import com.dell.crafto.network.EndPoint;
import com.dell.crafto.network.RetrofitBase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    RecyclerView rv;
    static ProductsAdapter adapter;
    static List<Item> data = new ArrayList<>();
    Context context;
    private EndPoint endPoint = (EndPoint) RetrofitBase.getData().create(EndPoint.class);


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {


        context = container.getContext();
        View rootView = inflater.inflate(R.layout.fragment_explore, container, false);
//
//        // Inflate the layout for this fragment
        rv = rootView.findViewById(R.id.products);
        setupRecyclerView(container);

        search(container);
        return rootView;
    }

    private void setupRecyclerView(ViewGroup viewGroup) {
        rv.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        adapter = new ProductsAdapter();
        rv.setAdapter(adapter);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


    }

    public static void setData(Item product) {
        data.add(product);
        adapter.setProducts(data);
    }

    public void search(View view) {


        endPoint.Data().enqueue(new Callback<ProductData>() {
            @Override
            public void onResponse(Call<ProductData> call, Response<ProductData> response) {
//                List<String> authors = response.body().get(1).getAuthors();
                if (response.body() != null) {
                    data = response.body().getItems();


                    adapter = new ProductsAdapter();
                    adapter.setProducts(data);
                    rv.setAdapter(adapter);

                }

            }

            @Override
            public void onFailure(Call<ProductData> call, Throwable t) {
                Log.e("Main Activity : ", "Failer at Retrofit at first");
            }
        });


    }
}
