package jp.kinoshita.imagenoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
            R.drawable.img_8
    };

    private String[] titles = {
            "顔交換",
            "猫が仕事の邪魔をする",
            "しごとが・・",
            "猫の手も借りたい",
            "猫の手も借りたい",
            "動物用の薬",
            "猫に小判",
            "オッドアイの猫"
    };

    private String[] texts = {
            "顔交換アプリを使ったら猫と顔が交換されました",
            "猫が仕事の邪魔をして仕事が捗らない・・",
            "猫様が仕事の邪魔をして仕事が進まない、でも幸せかも・・",
            "誰か手伝ってくれないかな、猫の手でもいいから・・",
            "猫でもいいから手を貸してくれ！！",
            "最新の動物用の薬です",
            "オッドアイの猫を発見しました\n神秘的！！"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
