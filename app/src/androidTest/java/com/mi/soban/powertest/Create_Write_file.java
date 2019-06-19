package com.mi.soban.powertest;

import android.os.Environment;
import android.text.format.Time;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import android.util.Log;

import static android.util.Log.*;


public class Create_Write_file extends InstrumentedTest_Base_class  {

    public  static final String TAG ="MYAPP";

    public String dateTimeString()
    { // creates a new filr name
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();

        StringBuilder sb = new StringBuilder();

        sb.append(today.year + "");                // Year)
        sb.append("_");
        sb.append(today.monthDay + "");          // Day of the month (1-31)
        sb.append("_");
        sb.append(today.month + "");              // Month (0-11))
        sb.append("_");
        sb.append(today.format("%k:%M:%S"));      // Current time
        sb.append(".txt");                      //Completed file name

        String myNewFileName = sb.toString();
        //Replace (:) with (_)
        myNewFileName = myNewFileName.replaceAll(":", "_");

        return myNewFileName;
    }

    //Function to write /append file
    public void appendToFile(String str,String filename) throws IOException, FileNotFoundException {
        File sdCard = Environment.getExternalStorageDirectory();
        File directory = new File (sdCard.getAbsolutePath() );
        //+"/TestAPP"
        if (!directory.exists())
        {
            directory.mkdirs();
        }

        File file = new File(directory, filename);

        Log.v(TAG, "<IM>FileWrite init,absFilePath="+file.getAbsolutePath()+" | Str="+str);

        FileOutputStream fOut = new FileOutputStream(file,true);
        OutputStreamWriter osw = new OutputStreamWriter(fOut);
        //---write the string to the file---
        osw.write(str+"\n");
        osw.flush();
        osw.close();

        Log.v(TAG, "<IM>FileWrite Completed,Str added:"+str);
    }
}
