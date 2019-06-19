package com.mi.soban.powertest;

public class TC_06_RUN_MI_MUSIC_APP extends InstrumentedTest_Base_class{

    public  void TC_06_RUN_MI_MUSIC_APP(){

        this.device= device;
    }
    public  void launchmusic_app(){

        execute("am start -n com.miui.player/.ui.MusicBrowserActivity");
        sleep(6000);
    }

}
