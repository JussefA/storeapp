package com.cecati6.jussef.drawernavigation.CustomAdapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cecati6.jussef.drawernavigation.DataModels.ShopDataModel;
import com.cecati6.jussef.drawernavigation.R;
import com.cecati6.jussef.drawernavigation.ShopCarFragment;

import java.util.ArrayList;
import java.util.List;

public class ShopingCustomAdapter extends ArrayAdapter<ShopDataModel> {


    private Context mContecxt;
    private List<ShopDataModel> shoplist;

    public ShopingCustomAdapter(@NonNull Context context ,ArrayList<ShopDataModel> list) {
        super(context, R.layout.item_car , list);

        mContecxt = context;
        shoplist = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

//        if (listItem == null)
            listItem = LayoutInflater.from(mContecxt).inflate(R.layout.item_car,parent,false);


        ShopDataModel currentItem = shoplist.get(position);

        ImageView imagen = listItem.findViewById(R.id.imgproducto);
        TextView nombre = listItem.findViewById(R.id.txtnombre);

        imagen.setImageResource(currentItem.getImagen());
        nombre.setText(currentItem.getTitulo());

        return listItem;
    }
}
