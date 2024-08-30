package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONObject;
import net.minecraft.client.Minecraft;

public abstract class Class4307 extends Class4305 {
    public static int field20939 = 0;

    public Class4307(String var1) {
        super(null, var1, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight());
    }

    public int method13313() {
        return 30;
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
        this.method13268(Minecraft.getInstance().mainWindow.getWidth());
        this.method13270(Minecraft.getInstance().mainWindow.getHeight());
    }

    @Override
    public void method13065(int var1) {
        if (var1 == Minecraft.getInstance().gameSettings.keyBindFullscreen.keycode.keyCode) {
            Minecraft.getInstance().mainWindow.toggleFullscreen();
            Minecraft.getInstance().gameSettings.fullscreen = Minecraft.getInstance().mainWindow.isFullscreen();
        }

        super.method13065(var1);
    }
}
