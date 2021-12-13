package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // グーが押された時のイベント
    public void onClickRock(View view) {
        game(0);
    }
    // チョキーが押された時のイベント
    public void onClickScissors(View view) {
        game(1);
    }
    // パーが押された時のイベント
    public void onClickPaper(View view) {
        game(2);
    }
    // コンピューターの手をランデムに決定し、勝敗の判定を行う
    private void game(int btnId) {
        //中身の処理はこの後実装します。
    }
}