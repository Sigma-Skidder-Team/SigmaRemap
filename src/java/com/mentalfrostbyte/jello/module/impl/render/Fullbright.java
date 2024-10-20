package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderEntity;
import com.mentalfrostbyte.jello.event.impl.TextReplaceEvent;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.InputSetting;

public class Streaming extends Module {
    public Streaming() {
        super(ModuleCategory.RENDER, "Streaming", "Useful module when recording or streaming");
        this.registerSetting(new BooleanSetting("Hide skins", "Spoof all players skin", true));
        this.registerSetting(new BooleanSetting("Hide server name", "Spoof server name", false));
        this.registerSetting(new InputSetting("Server name", "The server name that you need to hide", "servernamehere"));
        this.registerSetting(new BooleanSetting("Hide date", "Hide date on scoreboard", false));
    }

    @EventTarget
    public void TextReplaceEvent(TextReplaceEvent event) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSettingName("Hide server name") && this.getStringSettingValueByName("Server name").length() > 1) {
                event.setText(event.setText().replaceAll(this.getStringSettingValueByName("Server name"), "sigmaclient"));
                event.setText(event.setText().replaceAll(this.getStringSettingValueByName("Server name").toLowerCase(), "sigmaclient"));
                event.setText(event.setText().replaceAll(this.getStringSettingValueByName("Server name").toUpperCase(), "sigmaclient"));
            }
        }
    }

    @EventTarget
    public void EventRenderNameTag(EventRenderNameTag event) {
    }

    @EventTarget
    public void EventRenderEntity(EventRenderEntity event) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSettingName("Hide skins")) {
                event.method13955(false);
            }
        }
    }
}
