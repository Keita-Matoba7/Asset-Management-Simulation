package es.exsample;

import android.os.*;
import android.view.*;
import android.content.Intent;
import android.widget.*;
import android.widget.AdapterView.*;
import androidx.appcompat.app.AppCompatActivity;

public class ExSample extends AppCompatActivity
{

    ListView lv1;
    Spinner sp;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        LinearLayout ll =new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);


        lv1 = new ListView(this);  //リストビュー1の生成
        //sp = new Spinner(this);  //スピナーの生成

        String[] str ={"教育コンテンツ","複利計算"};  //リストビュー、スピナーに格納するテキストデータ

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);  //テキストをリストビュー、スピナーに渡すためのアレイアダプター
        lv1.setAdapter(ad);  //リストビュー1にアレイアダプターを登録
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  //アレイアダプターにドロップダウンリストを設定
        //sp.setAdapter(ad);  //スピナーにアレイアダプターを登録

        //ScrollView sv = new ScrollView(this);  //スクロールビューの生成

        ll.addView(lv1);  //リニアレイアウトにリストビューを設定
        //ll.addView(sp);  //リニアレイアウトにスピナーを設定
        //ll.addView(sv);  //リニアレイアウトにスピナーを設定

        //sv.addView(lv2);  //スクロールビューにリストビューを設定

        lv1.setOnItemClickListener(new ExSampleItemClickListener());  //リストビュー1のアイテムクリック時のリスナー登録
        //sp.setOnItemSelectedListener(new ExSampleItemSelectedListener());  //スピナーのアイテム選択時のリスナー登録
    }

    class ExSampleItemClickListener implements OnItemClickListener{  //リストビューのアイテムクリック時のイベント処理
        public void onItemClick(AdapterView<?>v, View iv, int pos, long id){
            switch (pos){
                case 0:
                    Intent intent1 = new Intent(getApplication(), SubActivity1.class);
                    startActivity(intent1);
                    break;
                case 1:
                    Intent intent2 = new Intent(getApplication(), SubActivity2.class);
                    startActivity(intent2);
                    break;

            }
        }
    }
}
