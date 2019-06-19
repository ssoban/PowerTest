package com.mi.soban.powertest;

public class TC_04_RUN_GAME_APP extends InstrumentedTest_Base_class {
    public TC_04_RUN_GAME_APP(){
        this.device = device;
    }

    public void launch_game_app(){
        execute("am start -n com.gameloft.android.ANMP.GloftAGHM/com.gameloft.android.ANMP.GloftAGHM.MainActivity");
        sleep(6000);
    }
}
