package com.mi.soban.powertest;

public class TC_08_RUN_DIALER_APP extends InstrumentedTest_Base_class{


    public TC_08_RUN_DIALER_APP(){
        this.device= device;
    }
    public void launch_dialer(){
        execute("am start -n com.android.contacts/.activities.TwelveKeyDialer");
        System.out.print("logcat iss printing");
        // execute("logcat -d >logcat123.txt");
        sleep(6000);
    }
}
