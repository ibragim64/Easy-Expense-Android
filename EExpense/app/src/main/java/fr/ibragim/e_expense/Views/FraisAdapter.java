package fr.ibragim.e_expense.Views;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import fr.ibragim.e_expense.AddDepenseActivity;
import fr.ibragim.e_expense.R;

/**
 * Created by ibragim.abubakarov on 07/04/2018.
 */

public class FraisAdapter extends RecyclerView.Adapter<ViewHolder>  {

    private List<ListItem> list;
    private final AdapterView.OnItemClickListener listener;
    //private Context context;


    public FraisAdapter(List<ListItem> list, AdapterView.OnItemClickListener listener, Context context) {
        this.list = list;
        this.listener = listener;
        //this.context = context;
    }


    @Override
    public int getItemViewType(int position) {
        return list.get(position).getListItemType();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        View view = null;
        switch (type) {
            case ListItem.Frais:
                view = LayoutInflater
                        .from(viewGroup.getContext())
                        .inflate(R.layout.cardview, viewGroup, false);
                return new ViewHolderFrais(view);
            case ListItem.Trajet:
                view = LayoutInflater
                        .from(viewGroup.getContext())
                        .inflate(R.layout.cardview, viewGroup, false);
                return new ViewHolderTrajet(view);
        }
        return null;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int pos) {
        final ListItem item = list.get(pos);
        viewHolder.bindType(item, listener);
        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Intent intent = new Intent(v.getContext(), AddDepenseActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }






    @Override
    public int getItemCount() {
        return list.size();
    }


}
