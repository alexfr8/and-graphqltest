package com.graphqlexample.githubgraphqlclient.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

/**
 * Created by alejandrofernandezruiz on 29/3/18.
 */

public class SearchElementViewHolder extends RecyclerView.ViewHolder {

    //Context
    TextView elementName;
    TextView elementURL;


    //Context
    private Context mContext;

    /**
     * Constructor for the Item Holder to setup the row layout
     *
     * @param itemView: a row View
     */
    public SearchElementViewHolder(View itemView) {
        super(itemView);
        elementName = itemView.findViewById(R.id.lbl_row_elementname);
        elementURL = itemView.findViewById(R.id.lbl_row_elementurl);

        mContext = itemView.getContext();
    }

    /**
     * bind method to populate fields in the row with the content of item
     *
     * @param item: the item to populate
     */
    public void bindSearchItem(GetEdgeXCategory.Edge item) {


        elementName.setText(item.node().name());
        elementURL.setText(item.node().url().toString());

    }
}
