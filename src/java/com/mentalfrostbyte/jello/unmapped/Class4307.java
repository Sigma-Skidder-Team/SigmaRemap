package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONObject;
import mapped.Minecraft;

public abstract class Class4307 extends Class4305 {
    public static int field20939 = 0;

    public Class4307(String var1) {
        super(null, var1, 0, 0, Minecraft.getInstance().mainWindow.method8043(), Minecraft.getInstance().mainWindow.method8044());
    }

    public int method13313() {
        return 30;
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
        this.method13268(Minecraft.getInstance().mainWindow.method8043());
        this.method13270(Minecraft.getInstance().mainWindow.method8044());
    }

    @Override
    public void method13065(int var1) {
        if (var1 == Minecraft.getInstance().gameSettings.field44652.field13070.field34875) {
            Minecraft.getInstance().mainWindow.toggleFullscreen();
            Minecraft.getInstance().gameSettings.fullscreen = Minecraft.getInstance().mainWindow.isFullscreen();
        }

        super.method13065(var1);
    }
}
