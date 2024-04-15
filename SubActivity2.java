package es.exsample;

import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity2 extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4;
    Button bt1, bt2, bt3;
    EditText et1, et2, et3;
    ScrollView scr;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);

        scr = new ScrollView(this);
        tv1 = new TextView(this);
        tv2 = new TextView(this);
        tv3 = new TextView(this);
        tv4 = new TextView(this);
        et1 = new EditText(this);  //エディットテキストの生成
        et2 = new EditText(this);  //エディットテキストの生成
        et3 = new EditText(this);  //エディットテキストの生成
        bt1 = new Button(this);
        bt2 = new Button(this);
        bt3 = new Button(this);


        tv1.setText("年利を入力してください(%)");
        tv1.setTextSize(18);  //テキストサイズの設定
        tv2.setText("元金を入力してください(円)");
        tv2.setTextSize(18);  //テキストサイズの設定
        tv3.setText("経過年数(年)");
        tv3.setTextSize(18);  //テキストサイズの設定


        bt1.setText("計算");
        bt2.setText("HOME");
        bt3.setText("クリア");


        ll.addView(tv1);
        ll.addView(et1);
        ll.addView(tv2);
        ll.addView(et2);
        ll.addView(tv3);
        ll.addView(et3);
        ll.addView(bt1);
        ll.addView(bt3);
        ll.addView(bt2);
        ll.addView(scr);
        scr.addView(tv4);




        //複利計算
        bt1.setOnClickListener(
                new OnClickListener() {
                    public void onClick(View v) {
                        int x = Integer.parseInt(et1.getText().toString());
                        double y = Double.parseDouble(et2.getText().toString());
                        int z = Integer.parseInt(et3.getText().toString());
                        int i = 1;
                        String result = "";
                        while (i <= z) {
                            y = y * (1 + (x * 0.01));
                            result += "年数:" + i + " " + "元利合計:" + y + "円\n";
                            i = i + 1;
                        }
                        tv4.setText(result);
                    }
                }
        );
        //ホームへ
        bt2.setOnClickListener(
                new OnClickListener() {
                    public void onClick(View v) {

                        finish();

                    }
                }
        );
        //値のクリア
        bt3.setOnClickListener(
                new OnClickListener() {
                    public void onClick(View v) {

                        et1.getEditableText().clear();
                        et2.getEditableText().clear();
                        et3.getEditableText().clear();
                        tv4.setText("");

                    }
                }
        );
    }
}
