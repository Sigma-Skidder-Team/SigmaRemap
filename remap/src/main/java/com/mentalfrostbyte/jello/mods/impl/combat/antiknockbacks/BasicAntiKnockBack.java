// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class4273;
import mapped.Class4394;
import mapped.Class5723;
import mapped.EventListener;

public class BasicAntiKnockBack extends Module
{
    public BasicAntiKnockBack() {
        super(Category.COMBAT, "Basic", "Places block underneath");
        this.addSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
        this.addSetting(new NumberSetting("H-Multiplier", "Horizontal velocity multiplier", 0.0f, Float.class, 0.0f, 1.0f, 0.01f));
        this.addSetting(new NumberSetting("V-Multiplier", "Vertical velocity multiplier", 0.0f, Float.class, 0.0f, 1.0f, 0.01f));
    }
    
    @EventListener
    private void method10567(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (BasicAntiKnockBack.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    if (class5724.method12822() == BasicAntiKnockBack.mc.player.getEntityId()) {
                        if (this.getNumberSettingValueByName("H-Multiplier") == 0.0f) {
                            if (this.getNumberSettingValueByName("V-Multiplier") == 0.0f) {
                                class5723.setCancelled(true);
                            }
                        }
                        class5724.field19165 *= (int)this.getNumberSettingValueByName("H-Multiplier");
                        class5724.field19167 *= (int)this.getNumberSettingValueByName("H-Multiplier");
                        class5724.field19166 *= (int)this.getNumberSettingValueByName("V-Multiplier");
                    }
                }
            }
            if (class5723.method16998() instanceof Class4394) {
                if (this.method9883("Explosions")) {
                    final Class4394 class5725 = (Class4394)class5723.method16998();
                    class5725.field19682 *= this.getNumberSettingValueByName("H-Multiplier");
                    class5725.field19684 *= this.getNumberSettingValueByName("H-Multiplier");
                    class5725.field19683 *= this.getNumberSettingValueByName("V-Multiplier");
                }
            }
        }
    }
}
