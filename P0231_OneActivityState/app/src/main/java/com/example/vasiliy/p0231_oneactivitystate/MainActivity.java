package com.example.vasiliy.p0231_oneactivitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "Activity создано");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity становиться видемым");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity получила фокус(состояние Resumed)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity приостановлено (состояние Paused)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity остановлено (состояние Stopped)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity уничтожено");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
