package com.university.corona2.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.university.corona2.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.ReferenceQueue;

public class HomeFragment extends Fragment {

    private TextView tvTotalConfirmed , tvTotralDeaths , tvTotalRecoverd ;
    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //Call View
        tvTotalConfirmed = root.findViewById(R.id.tvTotalConfirmed);
        tvTotralDeaths = root.findViewById(R.id.tvTotalDeaths);
        tvTotalRecoverd = root.findViewById(R.id.tvTotalRecoverd);
        progressBar = root.findViewById(R.id.progress_circular_home);

        //Call Volley
        getData();

        return root;
    }

    private void getData() {
        RequestQueue queue = Volley.newRequestQueue(getActivity());

        String  url = "https://corona.lmao.ninja/v2/all";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressBar.setVisibility(View.GONE);

                try {
                    JSONObject jsonObject = new JSONObject(response.toString());

                    tvTotalConfirmed.setText(jsonObject.getString("cases"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse (VolleyError error) {
                progressBar.setVisibility(View.GONE);
                Log.d("Error Response" , error.toString());
            }

        });

        queue.add(stringRequest);

    }
}
