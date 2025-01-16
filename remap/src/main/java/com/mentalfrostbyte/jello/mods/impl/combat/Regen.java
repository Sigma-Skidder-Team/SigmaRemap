// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class4353;
import mapped.Class5743;
import mapped.EventListener;

public class Regen extends Module
{
    public Regen() {
        super(Category.COMBAT, "Regen", "Regenerates hearts faster than ever (1.8 only)");
        this.addSetting(new NumberSetting("Packet amount", "Number of packets sent", 50.0f, Float.class, 1.0f, 100.0f, 1.0f));
        this.addSetting(new BooleanSetting("Only OnGround", "Regen only when on ground", false));
    }
    
    @EventListener
    private void method10527(final Class5743 class5743) {
        if (this.method9906()) {
            if (!Regen.mc.player.field3025.field27304) {
                if (Regen.mc.player.method2877().method33491() > 17) {
                    if (Regen.mc.player.method2664() < 20.0f) {
                        if (Regen.mc.player.method2664() != 0.0f) {
                            if (Regen.mc.player.onGround || !this.method9883("Only OnGround")) {
                                for (int n = 0; n < this.getNumberSettingValueByName("Packet amount"); ++n) {
                                    Regen.mc.method5269().method17292(new Class4353(Regen.mc.player.onGround));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
