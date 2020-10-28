package jp.kinoshita.imagenoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Noteのためのデータ(本来はストレージやネットワークからとってくる)
    private int[] imageResources = {
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,
            R.drawable.img_10,
            R.drawable.img_11,
            R.drawable.img_12,
            R.drawable.img_13,
            R.drawable.img_14,
    };

    private String[] titles = {
            "虹",
            "窓から犬",
            "金閣寺",
            "港",
            "山",
            "街明かり",
            "GitHub",
            "なにかわからない花",
            "鳥",
            "夕陽",
            "砂浜",
            "桜",
            "ピンク色の花",
            "一面の黄色"

    };

    private String[] texts = {
            "電車から虹が見えた",
            "窓から犬が顔を出している",
            "卍きんかくじ卍",
            "珍しそうな船が停泊している",
            "単位がやばくて補修で山を登る人の例",
            "旧河川を利用しているらしい",
            "GitHubにいるつおい人",
            "何の花かわからない",
            "鴨、かもしれない・・",
            "反射がめっちゃ眩しい",
            "青い海、白い雲(冬)",
            "凍らせた心で暖かなry",
            "これも何の花かぜんぜんわからん",
            "あー一面の黄色"

    };

    List<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Note> list = new ArrayList<>();
        for(int i = 0; i < imageResources.length; i ++){

            // 作成したデータをもとにNoteを作成する
            Note note = new Note(imageResources[i], titles[i], texts[i]);

            // 作成したNoteをArrayListに追加する。
            list.add(note);
        }
        this.notes = list;
    }
}
