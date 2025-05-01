// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.HypixelAntiBot;
import mapped.AdvancedAntiBot;

public class AntiBot extends Module
{
    public AntiBot() {
        super(Category.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Advanced", "Hypixel" }).method15195(class4997 -> this.method10302()));
    }
    
    @Override
    public void initialize() {
        if (this.isEnabled()) {
            this.method10302();
        }
    }
    
    @Override
    public void onEnable() {
        this.method10302();
    }
    
    @Override
    public void onDisable() {
        Client.getInstance().getBotManager().antiBot = null;
        Client.getInstance().getBotManager().bots.clear();
    }
    
    private void method10302() {
        Client.getInstance().getBotManager().bots.clear();
        final String mode = this.getStringSettingValueByName("Mode");
        switch (mode) {
            case "Advanced": {
                Client.getInstance().getBotManager().antiBot = new AdvancedAntiBot();
                break;
            }
            case "Hypixel": {
                Client.getInstance().getBotManager().antiBot = new HypixelAntiBot();
                break;
            }
        }
    }
}
