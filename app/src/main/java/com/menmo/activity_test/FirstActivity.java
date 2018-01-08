package com.menmo.activity_test;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button btnToSecondActivity = (Button) findViewById(R.id.button);
        btnToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "you clicked button", Toast.LENGTH_LONG);
                Intent intent =new Intent("com.menmo.activity_test.ACTION_START");
                intent.addCategory("com.menmo.activity_test.MY_CATEGORY");
                startActivity(intent);
            }
        });
        Button btnTiaozhuan = (Button) findViewById(R.id.button1);
        btnTiaozhuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"you clicked button*",Toast.LENGTH_SHORT);
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://music.163.com"));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(FirstActivity.this, "you clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(FirstActivity.this, "you clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }
}
