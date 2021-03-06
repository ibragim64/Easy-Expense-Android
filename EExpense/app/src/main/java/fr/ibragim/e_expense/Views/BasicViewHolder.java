package fr.ibragim.e_expense.Views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import fr.ibragim.e_expense.Metier.NoteFrais;
import fr.ibragim.e_expense.R;

/**
 * Created by ibragim.abubakarov on 07/04/2018.
 */

public class BasicViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    //private ImageView img;
    private TextView title;
    private TextView date;
    private TextView etat;

    ItemClickListener itemClickListener;


    public BasicViewHolder(View itemView) {
        super(itemView);

        //img = itemView.findViewById(R.id.justi);
        title = itemView.findViewById(R.id.idNoteFrais);
        date = itemView.findViewById(R.id.dateNoteFrais);
        etat = itemView.findViewById(R.id.etatNoteFrais);

        itemView.setOnClickListener(this);
    }

    public void bind(final NoteFrais n, final AdapterView.OnItemClickListener listener){
        title.setText(n.getLibelle());
        date.setText(n.getDateFrais());
        setEtatBackground(n.getEtat());
    }

    public void setEtatBackground(String etat){

        switch (etat){
            case "En Cours":
                this.etat.setBackgroundResource(R.drawable.etatbackground);
                this.etat.setText(etat);
                break;
            case "Validé":
                this.etat.setBackgroundResource(R.drawable.etat_validated_background);
                this.etat.setText(etat);
                break;

            case "Refusé":
                this.etat.setBackgroundResource(R.drawable.etat_refused_background);
                this.etat.setText(etat);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }


}
