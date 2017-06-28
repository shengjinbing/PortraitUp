package cn.lixiang.portraitup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void qiudian(View view) {
        Toast.makeText(this, "点俺干啥呢", Toast.LENGTH_SHORT).show();
    }

    public void qiudiandian(View view) {
        Toast.makeText(this, "点点俺干啥呢", Toast.LENGTH_SHORT).show();
    }
}
