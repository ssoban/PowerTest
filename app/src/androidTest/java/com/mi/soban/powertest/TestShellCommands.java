package com.mi.soban.powertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.util.Log;

public class TestShellCommands {
    private static final String LOG_TAG = "TestRunShell";
    static Runtime runtime = Runtime.getRuntime();
    static Process proc = null;
    static OutputStreamWriter osw = null;
    static StringBuilder sbstdOut = new StringBuilder();
    static StringBuilder sbstdErr = new StringBuilder();

    public static String runShellCommandString(String command) throws IOException {
        try {

            Log.d(LOG_TAG, "my command string is " + command);
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            int read;
            char[] buffer = new char[4096];
            StringBuffer output = new StringBuffer();
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }

            String results = output.toString();
            Log.d("LOG_TAG", results);

            reader.close();
            process.waitFor();

            return results;

        } catch (IOException e) {

            Log.d("LOG_TAG", "shell command did not execute correctly");
            throw new RuntimeException(e);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
    }

    public static void runShellCommandStringArray(String[] command) throws IOException {
        try {

            Log.d(LOG_TAG, "my command string is " + command);
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            int read;
            char[] buffer = new char[4096];
            StringBuffer output = new StringBuffer();
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }

            String results = output.toString();
            Log.d("LOG_TAG", results);

            reader.close();
            process.waitFor();

            return;

        } catch (IOException e) {

            Log.d("LOG_TAG", "shell command did not execute correctly");
            throw new RuntimeException(e);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
    }

}