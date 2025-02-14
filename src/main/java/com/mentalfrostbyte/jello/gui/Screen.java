package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import totalcross.json.JSONObject;
import net.minecraft.client.Minecraft;

public abstract class Screen
        extends CustomGuiScreen {

    public Screen(String var1) {
        super(null, var1, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight());
    }

    public int method13313() {
        return 30;
    }

    @Override
    public void loadConfig(JSONObject var1) {
        super.loadConfig(var1);
        this.setWidthA(Minecraft.getInstance().mainWindow.getWidth());
        this.setHeightA(Minecraft.getInstance().mainWindow.getHeight());
    }

    @Override
    public void keyPressed(int keyCode) {
        if (keyCode == Minecraft.getInstance().gameSettings.keyBindFullscreen.keyCode.keyCode) {
            Minecraft.getInstance().mainWindow.toggleFullscreen();
            Minecraft.getInstance().gameSettings.fullscreen = Minecraft.getInstance().mainWindow.isFullscreen();
        }

        super.keyPressed(keyCode);
    }
}
