// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;
import mapped.Class5743;
import mapped.ColorUtils;
import mapped.EventListener;

public class Spammer extends Module
{
    private int field15877;
    
    public Spammer() {
        super(Category.MISC, "Spammer", "Spam a message");
        this.addSetting(new TextInputSetting("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
        this.addSetting(new NumberSetting("Messages delay", "Delay between messages", 3.0f, Float.class, 0.1f, 10.0f, 0.1f));
    }
    
    @EventListener
    public void method10465(final Class5743 class5743) {
        if (this.isEnabled()) {
            ++this.field15877;
            if (this.field15877 > this.getNumberSettingValueByName("Messages delay") * 20.0f) {
                this.field15877 = 0;
                ColorUtils.method19107(this.getStringSettingValueByName("Message").replaceAll("%r", Integer.toString(Math.round(10.0f + (float)Math.random() * 89.0f))));
            }
        }
    }
}
