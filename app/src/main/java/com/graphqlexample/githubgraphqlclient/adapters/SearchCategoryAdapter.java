package com.graphqlexample.githubgraphqlclient.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * This class is an adapter for the simple recyclerview included in the search
 * view
 * @param: mList : A list of searched items
 * @param: itemLayout: the layout of the row to show.
 *
 *
 * */
public class SearchCategoryAdapter extends RecyclerView.Adapter<SearchCategoryViewHolder> {

    //DATA
    private List<GHCategory> mList = new ArrayList<>();
    //LAYOUT
    private int itemLayout;

    //listener
    private final OnItemClickListener listener;
    public interface OnItemClickListener {

        void onItemClick(GHCategory searchItemSelected, int position);
    }

    /**
     * Constructor of the SearchCategoryAdapter
     * @param items: A list of category GHCategory
     * @param itemLayout: the row layout
     * @param listener: the listener to ear the user item click
     */
    public SearchCategoryAdapter(List<GHCategory> items, int itemLayout, OnItemClickListener listener) {

        this.itemLayout = itemLayout;
        this.listener = listener;
        this.mList = items;
    }


    @Override
    public SearchCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new SearchCategoryViewHolder(v);
    }

    @Override public void onBindViewHolder(final SearchCategoryViewHolder viewHolder, final int position) {

        final Integer pos = position;
        final GHCategory categoryItem = mList.get(position);
        viewHolder.bindSearchItem(categoryItem);


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                listener.onItemClick(categoryItem, position);

            }
        });
    }



    @Override
    public int getItemCount() {

        return mList.size();
    }

}