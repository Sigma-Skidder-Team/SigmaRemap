// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.Class7815;
import mapped.Class7816;

public class AntiBot extends Module
{
    public AntiBot() {
        super(Category.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Advanced", "Hypixel" }).method15195(class4997 -> this.method10302()));
    }
    
    @Override
    public void method9917() {
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
        Client.getInstance().method35191().field37638 = null;
        Client.getInstance().method35191().field37639.clear();
    }
    
    private void method10302() {
        Client.getInstance().method35191().field37639.clear();
        final String method9887 = this.getStringSettingValueByName("Mode");
        switch (method9887) {
            case "Advanced": {
                Client.getInstance().method35191().field37638 = new Class7816();
                break;
            }
            case "Hypixel": {
                Client.getInstance().method35191().field37638 = new Class7815();
                break;
            }
        }
    }
}
