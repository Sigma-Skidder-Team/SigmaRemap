package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.settings.InputSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;

public class Spammer extends Module {
    private int field23438;

    public Spammer() {
        super(ModuleCategory.MISC, "Spammer", "Spam a message");
        this.registerSetting(new InputSetting("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
        this.registerSetting(new NumberSetting<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16066(TickEvent var1) {
        if (this.isEnabled()) {
            this.field23438++;
            if ((float) this.field23438 > this.getNumberValueBySettingName("Messages delay") * 20.0F) {
                this.field23438 = 0;
                String var4 = this.getStringSettingValueByName("Message").replaceAll("%r", Integer.toString(Math.round(10.0F + (float) Math.random() * 89.0F)));
                ColorUtils.sendChatMessage(var4);
            }
        }
    }
}
