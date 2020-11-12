package com.varconn.inc.campusdotcom.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.varconn.inc.campusdotcom.R;
import com.varconn.inc.campusdotcom.activity.HomeActivity;
import com.varconn.inc.campusdotcom.models.DataModel;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> implements Filterable {

    private List<DataModel> dataSet;
    List<DataModel> mDataFiltered ;
    Context mContext;
    //private OnNoteListener mOnNoteListener;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        CircleImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (CircleImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public RecyclerAdapter(Context mContext, ArrayList<DataModel> data) {
        this.mContext = mContext;
        this.dataSet = data;
        this.mDataFiltered = data;
    }

    public RecyclerAdapter(Context mContext, List<DataModel> data) {
        this.mContext = mContext;
        this.dataSet = data;
        this.mDataFiltered = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        view.setOnClickListener(HomeActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        CircleImageView imageView = holder.imageViewIcon;

        textViewName.setText(mDataFiltered.get(listPosition).getName());
        textViewVersion.setText(mDataFiltered.get(listPosition).getVersion());
        imageView.setImageResource(mDataFiltered.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return mDataFiltered.size();
    }

    @Override
    public Filter getFilter () {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                String Key = constraint.toString();
                if (Key.isEmpty()) {

                    mDataFiltered = dataSet ;

                }
                else {
                    List<DataModel> lstFiltered = new ArrayList<>();
                    for (DataModel row : dataSet) {

                        if (row.getName().toLowerCase().contains(Key.toLowerCase())){
                            lstFiltered.add(row);
                        }

                    }

                    mDataFiltered = lstFiltered;

                }


                FilterResults filterResults = new FilterResults();
                filterResults.values= mDataFiltered;
                return filterResults;

            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {


                mDataFiltered = (List<DataModel>) results.values;
                notifyDataSetChanged();

            }
        };


    }
}
