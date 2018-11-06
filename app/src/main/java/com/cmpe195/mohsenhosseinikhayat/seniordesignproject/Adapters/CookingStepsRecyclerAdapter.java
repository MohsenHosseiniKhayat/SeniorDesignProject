package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;

public class CookingStepsRecyclerAdapter extends RecyclerView.Adapter<CookingStepsRecyclerAdapter.ViewHolder>
{
    private String[] cookingSteps;
    private ItemClickListener itemClickListener;
    private Context context;
    private LayoutInflater inflater;

    public CookingStepsRecyclerAdapter(Context context, String[] cookingSteps)
    {
        this.cookingSteps = cookingSteps;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return cookingSteps.length;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.cookingStepTextView.setText(cookingSteps[position]);
    }


        @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recipe_detail_cooking_steps_row_layout, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView cookingStepTextView;

        private ViewHolder(View itemView) {
            super(itemView);
            cookingStepTextView = (TextView) itemView.findViewById(R.id. cookingStepTextview);
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
        return cookingSteps[id];
    }

    public void setClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}


