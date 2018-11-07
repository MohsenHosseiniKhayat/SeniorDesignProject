package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Activities.SignInActivity;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.SettingsRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SettingsFragment extends Fragment implements SettingsRecyclerAdapter.ItemClickListener {
    private SettingsRecyclerAdapter settingsRecyclerAdapter;
    private SuperRecyclerView settingsSuperRecyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        setupView(view);
        return view;
    }

    public void setupView(View view)
    {
        String [] settings = new String [] {"About", "Rate us", "Logout"};
        settingsRecyclerAdapter = new SettingsRecyclerAdapter(this.getContext(), Arrays.asList(settings));
        settingsSuperRecyclerView = (SuperRecyclerView) view.findViewById(R.id.settingsSuperRecyclerView);
        settingsSuperRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        settingsSuperRecyclerView.setAdapter(settingsRecyclerAdapter);
        settingsRecyclerAdapter.setClickListener(this);
        settingsRecyclerAdapter.notifyDataSetChanged();

    }

    @Override
    public void onItemClick(View view, int position)
    {
        switch (position)
        {
            case 0:
                break;
            case 1:
                break;
            case 2:
                signOut();
                break;
        }
    }

    private void signOut()
    {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        GoogleSignInClient googleSignInClient = GoogleSignIn.getClient(this.getContext(), gso);



        googleSignInClient.signOut()
                .addOnCompleteListener(this.getActivity(), new OnCompleteListener<Void>()
                {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        goBackToSignInActivity();
                    }
                });
    }

    private void goBackToSignInActivity()
    {
        Intent intent = new Intent(this.getActivity(), SignInActivity.class);
        this.getActivity().startActivity(intent);
    }

}
