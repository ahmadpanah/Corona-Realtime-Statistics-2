package com.university.corona2.ui.country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CovidCountryAdapter extends RecyclerView.Adapter<CovidCountryAdapter.ViewHolder> {

    ArrayList<CovidCountry> covidCountries;

    public CovidCountryAdapter(ArrayList <CovidCountry> covidCountries) {
        this.covidCountries = covidCountries;
    }

    @NonNull
    @Override
    public CovidCountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_covid_country  , parent , false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidCountryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
