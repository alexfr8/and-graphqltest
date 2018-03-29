package com.graphqlexample.githubgraphqlclient.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.graphqlexample.GetAllCategories;


public class SearchCategoryViewHolder extends RecyclerView.ViewHolder {

    //Context
    TextView categoryName;
    TextView categoryListingCountTitle;
    TextView categoryListingCountValue;

    //Context
    private Context mContext;

    /**
     * Constructor for the Item Holder to setup the row layout
     * @param itemView: a row View
     */
    public SearchCategoryViewHolder(View itemView) {
        super(itemView);
        categoryName = itemView.findViewById(R.id.lbl_row_name);
        categoryListingCountTitle = itemView.findViewById(R.id.lbl_count_title);
        categoryListingCountValue = itemView.findViewById(R.id.lbl_row_count_value);
        mContext = itemView.getContext();
    }

    /**
     * bind method to populate fields in the row with the content of item
     * @param item: the item to populate
     */
    public void bindSearchItem(GetAllCategories.MarketplaceCategory item) {


        categoryName.setText(item.name());
        categoryListingCountTitle.setText(mContext.getString(R.string.category_count));
        categoryListingCountValue.setText(String.valueOf(item.primaryListingCount()+item.secondaryListingCount()));

    }


}