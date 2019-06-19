package com.mi.soban.powertest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public  class MainActivity extends AppCompatActivity {


    public static final String TAG="<IM>";
    public static String filename="t.txt";
    public EditText edt_1;



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



    @Override
    protected void onCreate(Bundle saveInstanceState)

    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
      //  filename="log_"+BuildNewFileName();
      //edt_1 = findViewById(R.id.edt_1);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            {
                Log.v(TAG, "<IM>Permission is granted");
            }
            else
            {
                Log.v(TAG, "<IM>Permission is not granted");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }

    }

    /** Called when the user taps the START button */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void demoToast(View view)
    {
        String msg = edt_1.getText().toString();
        System.out.println("<IM>:1x");

        if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
        {
            Log.v(TAG,"<IM>Create file, msg"+msg+",FilePath="+filename);
            //File write
           // appendToFile(msg,filename);
        }

        Toast toast = Toast.makeText(getApplicationContext(), "Added Text:"+msg, Toast.LENGTH_SHORT); toast.show();

        try {
            String command="am instrument -w -r   -e debug false -e class 'com.example.test0207.UItest' com.example.test0207.test/android.support.test.runner.AndroidJUnitRunner";
            command="ls";
            String tr=Executer(command);
            Log.v(TAG,"<IM>Command Response="+tr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //function return unique names


    //shell executer
    public String Executer(String command) {

        StringBuffer output = new StringBuffer();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine())!= null) {
                output.append(line + "n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        String response = output.toString();
        return response;

    }

}
