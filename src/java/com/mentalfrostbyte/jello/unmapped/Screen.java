package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONObject;
import net.minecraft.client.Minecraft;

public abstract class Screen
        extends IconPanel {
    public static int field20939 = 0;

    public Screen(String var1) {
        super(null, var1, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight());
    }

    public int method13313() {
        return 30;
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
        this.setWidth(Minecraft.getInstance().mainWindow.getWidth());
        this.setHeight(Minecraft.getInstance().mainWindow.getHeight());
    }

    @Override
    public void keyPressed(int var1) {
        if (var1 == Minecraft.getInstance().gameSettings.keyBindFullscreen.keycode.keyCode) {
            Minecraft.getInstance().mainWindow.toggleFullscreen();
            Minecraft.getInstance().gameSettings.fullscreen = Minecraft.getInstance().mainWindow.isFullscreen();
        }

        super.keyPressed(var1);
    }
}
