package anton.markin.mynotes;

import androidx.cardview.widget.CardView;

import anton.markin.mynotes.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
