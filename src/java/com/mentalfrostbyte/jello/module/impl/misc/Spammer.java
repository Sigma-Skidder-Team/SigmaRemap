package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.InputSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;

public class Spammer extends Module {
    private int tickCount;

    public Spammer() {
        super(ModuleCategory.MISC, "Spammer", "Spam a message");
        this.registerSetting(new InputSetting("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
        this.registerSetting(new NumberSetting<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (this.isEnabled()) {
            this.tickCount++;
            if ((float) this.tickCount > this.getNumberValueBySettingName("Messages delay") * 20.0F) {
                this.tickCount = 0;
                String message = this.getStringSettingValueByName("Message").replaceAll("%r", Integer.toString(Math.round(10.0F + (float) Math.random() * 89.0F)));
                MultiUtilities.sendChatMessage(message);
            }
        }
    }
}
