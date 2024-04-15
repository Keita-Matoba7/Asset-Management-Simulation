package es.exsample;

import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabexsample);

        TabHost th = (TabHost)findViewById(android.R.id.tabhost);  //TabHostオブジェクト取得
        th.setup();  //TabHostのセットアップ

        TabSpec tab1 = th.newTabSpec("tab1");  //tab1のセットアップ
        tab1.setIndicator("現在の日本");  //タブ名の設定
        tab1.setContent(R.id.tab1);   //タブに使うリニアレイアウトの指定
        th.addTab(tab1);  //タブホストにタブを追加

        TabSpec tab2 = th.newTabSpec("tab2");  //tab2のセットアップ
        tab2.setIndicator("投資の重要性");
        tab2.setContent(R.id.tab2);
        th.addTab(tab2);

        TabSpec tab3 = th.newTabSpec("tab3"); //tab3のセットアップ
        tab3.setIndicator("投資に必要な3つの力");
        tab3.setContent(R.id.tab3);
        th.addTab(tab3);

        th.setCurrentTab(0); //最初のタブをtab1に設定

        //これ以降に、各ビューに対する処理を記述する
    }
}