package jp.kinoshita.imagenoteapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<ItemNoteViewHolder> {

    private List<Note> notes;

    public NoteListAdapter(List<Note> notes){
        this.notes = notes;
    }

    @Override
    public int getItemCount() {
        return this.notes.size();
    }

    @NonNull
    @Override
    public ItemNoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // item_noteレイアウトを画面にセットしている
        View view = inflater.inflate(R.layout.item_note, parent, false);

        // ViewHolderをインスタンス化した直後returnする
        return new ItemNoteViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemNoteViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.onBind(note);
    }
}
