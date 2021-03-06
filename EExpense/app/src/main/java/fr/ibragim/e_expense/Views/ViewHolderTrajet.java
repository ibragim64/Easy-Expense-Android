package fr.ibragim.e_expense.Views;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import fr.ibragim.e_expense.AddDepenseActivity;
import fr.ibragim.e_expense.Metier.Trajet;
import fr.ibragim.e_expense.R;

/**
 * Created by ibragim.abubakarov on 07/04/2018.
 */

public class ViewHolderTrajet extends ViewHolder {
    private ImageView img;
    private TextView title;
    private TextView date;
    private TextView etat;

    private ItemClickListener itemClickListener;

    public ViewHolderTrajet(View itemView) {
        super(itemView);


        img = itemView.findViewById(R.id.justi);
        title = itemView.findViewById(R.id.idNoteFrais);

        date = itemView.findViewById(R.id.dateNoteFrais);
        etat = itemView.findViewById(R.id.etatNoteFrais);
    }

    @Override
    public void bindType(final ListItem item, final AdapterView.OnItemClickListener listener) {
        title.setText(((Trajet) item).getLibelleTrajet());
        date.setText(((Trajet) item).getDateDepense());
        etat.setText(((Trajet) item).getEtatValidation());

        final Trajet trajet = ((Trajet) item);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AddDepenseActivity.class);
                intent.putExtra("TYPE_DEPENSE", "Trajet");
                intent.putExtra("EXISTING", "TRUE");
                intent.putExtra("DEPENSE_ID", trajet.getIdDepense());
                intent.putExtra("DEPENSE_CODEFRAIS", trajet.getCodeFrais());
                intent.putExtra("DEPENSE_LIBELLE",trajet.getLibelleTrajet());
                intent.putExtra("DEPENSE_DATE", trajet.getDateDepense());
                intent.putExtra("DEPENSE_ETAT", trajet.getEtatValidation());
                intent.putExtra("DEPENSE_DISTANCE", trajet.getDistanceKM());
                intent.putExtra("DEPENSE_DUREE", trajet.getDureeTrajet());
                intent.putExtra("DEPENSE_DATE_ALLER", trajet.getDateAller());
                intent.putExtra("DEPENSE_DATE_RETOUR", trajet.getDateRetour());
                intent.putExtra("DEPENSE_VILLE_DEPART", trajet.getVilleDepart());
                intent.putExtra("DEPENSE_VILLE_ARRIVEE", trajet.getVilleArrivee());
                intent.putExtra("DEPENSE_MONTANT", trajet.getMontantDepense());
                view.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view ,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }

}
