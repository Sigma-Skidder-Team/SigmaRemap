// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5717;
import mapped.MovementUtil;
import mapped.EventListener;

public class ViperMCSpeed extends Module
{
    private int field16100;
    
    public ViperMCSpeed() {
        super(Category.MOVEMENT, "ViperMC", "ViperMC speed");
    }
    
    @Override
    public void onEnable() {
        this.field16100 = 1;
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.2800000011920929);
        ViperMCSpeed.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    public void method10796(final Class5717 class5717) {
        if (this.isEnabled()) {
            ++this.field16100;
            float n = 0.28f + MovementUtil.method23139() * 0.05f;
            if (this.field16100 >= 4) {
                this.field16100 = 0;
                n = 1.15f + MovementUtil.method23139() * 0.04f;
            }
            if (ViperMCSpeed.mc.gameSettings.field23437.field2162) {
                n /= 1.3f;
            }
            MovementUtil.method23149(class5717, n);
        }
    }
}
