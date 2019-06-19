package com.mi.soban.powertest;

public class TC_07_RUN_MI_VIDEO_APP extends InstrumentedTest_Base_class{
    public TC_07_RUN_MI_VIDEO_APP(){

        this.device= device;
    }
    public void launch_video_app(){
        execute("am start -n com.android.mms/.ui.NewMessageActivity");
        sleep(6000);

    }
}
