package jp.kinoshita.imagenoteapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemNoteViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView titleView;
    private TextView textView;


    public ItemNoteViewHolder(View view){
        // 親クラスRecyclerView.ViewHolderのコンストラクタはViewを必要としている
        super(view);

        imageView = view.findViewById(R.id.image_view);
        titleView = view.findViewById(R.id.title_view);
        textView = view.findViewById(R.id.text_view);
    }

    public void onBind(Note note){

        // item_noteのimage_viewにNoteに設定した画像をセットします。
        imageView.setImageResource(note.getImageResourceId());

        // item_noteのtitle_viewにNoteに設定したタイトルをセットしています。
        titleView.setText(note.getTitle());

        // item_noteのtext_viewにNoteに設定したテキスト（本文）をセットしています。
        textView.setText(note.getText());
    }
}
