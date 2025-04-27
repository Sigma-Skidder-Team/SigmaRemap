// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;
import mapped.Class5727;
import mapped.Class5729;
import mapped.Class5749;
import mapped.EventListener;

public class Streaming extends Module
{
    public Streaming() {
        super(Category.RENDER, "Streaming", "Useful module when recording or streaming");
        this.addSetting(new BooleanSetting("Hide server name", "Spoof server name", false));
        this.addSetting(new TextInputSetting("Server name", "The server name that you need to hide", "ServerNameHere"));
    }
    
    @EventListener
    public void method10401(final Class5727 class5727) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSettingName("Hide server name")) {
                if (this.getStringSettingValueByName("Server name").length() > 1) {
                    class5727.method17002(class5727.method17001().replaceAll(this.getStringSettingValueByName("Server name"), "sigmaclient"));
                    class5727.method17002(class5727.method17001().replaceAll(this.getStringSettingValueByName("Server name").toLowerCase(), "sigmaclient"));
                    class5727.method17002(class5727.method17001().replaceAll(this.getStringSettingValueByName("Server name").toUpperCase(), "sigmaclient"));
                }
            }
        }
    }
    
    @EventListener
    public void method10402(final Class5749 class5749) {
    }
    
    @EventListener
    public void method10403(final Class5729 class5729) {
        if (this.isEnabled()) {
            return;
        }
    }
}
