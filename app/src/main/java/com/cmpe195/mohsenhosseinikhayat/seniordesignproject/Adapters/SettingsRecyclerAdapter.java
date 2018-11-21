package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.IngredientCommand;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.MeasurementUnit;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.PantryAssistantViewModel;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;

import java.util.List;

public class SettingsRecyclerAdapter extends RecyclerView.Adapter<SettingsRecyclerAdapter.ViewHolder>{

    private ItemClickListener itemClickListener;
    private List<String> settingsOptions;
    private LayoutInflater inflater;
    private Context context;

    public SettingsRecyclerAdapter(Context context, List<String> settingsOptions) {
        this.inflater= LayoutInflater.from(context);
        this.settingsOptions = settingsOptions;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return settingsOptions.size();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.settings_row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String settingsOption = settingsOptions.get(position);
        holder.settingOptionTextView.setText(settingsOption);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView settingOptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            settingOptionTextView = (TextView) itemView.findViewById(R.id.settingOptionTextView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null)
            {
                itemClickListener.onItemClick(v, getAdapterPosition());
            }
        }
    }

    public String getItem(int id)
    {
        return settingsOptions.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}

