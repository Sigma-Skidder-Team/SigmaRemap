// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class NoSlow extends Module
{
    private boolean field15679;
    
    public NoSlow() {
        super(Category.MOVEMENT, "NoSlow", "Stops slowdown when using an item");
        this.addSetting(new StringSetting("Mode", "NoSlow mode", 0, "Vanilla", "NCP"));
    }
    
    @EventListener
    private void method10155(final EventSlowDown eventSlowDown) {
        if (this.isEnabled()) {
            eventSlowDown.setCancelled(true);
        }
    }
    
    @EventListener
    private void method10156(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled()) {
            final boolean method9898 = Client.getInstance().moduleManager().getModuleByClass(KillAura.class).method9898();
            final boolean b = NoSlow.mc.player.getHeldItemMainhand() != null && NoSlow.mc.player.getHeldItemMainhand().getItem() instanceof SwordItem;
            if (!updateWalkingEvent.isPre()) {
                if (b) {
                    if (NoSlow.mc.gameSettings.field23445.method1056()) {
                        if (!this.field15679) {
                            if (!method9898) {
                                if (this.getStringSettingValueByName("Mode").equals("NCP")) {
                                    ColorUtils.method19163();
                                    this.field15679 = true;
                                    return;
                                }
                            }
                        }
                    }
                }
                if (!b) {
                    if (this.field15679) {
                        this.field15679 = false;
                    }
                }
            }
            else if (!this.getStringSettingValueByName("Mode").equals("NCP")) {
                if (this.field15679) {
                    if (!NoSlow.mc.gameSettings.field23445.method1056()) {
                        this.field15679 = false;
                    }
                }
            }
            else if (this.field15679) {
                if (NoSlow.mc.gameSettings.field23445.method1056()) {
                    if (!method9898) {
                        if (b) {
                            ColorUtils.method19164();
                        }
                        this.field15679 = false;
                    }
                }
            }
        }
    }
}
