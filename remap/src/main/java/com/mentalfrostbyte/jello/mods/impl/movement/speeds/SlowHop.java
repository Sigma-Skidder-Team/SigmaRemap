// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class SlowHop extends Module
{
    private int field15588;
    private double field15589;
    private boolean field15590;
    
    public SlowHop() {
        super(Category.MOVEMENT, "SlowHop", "SlowHop speed");
        this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void method9879() {
        this.field15589 = Class7482.method23136();
        this.field15588 = 2;
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(Class7482.method23136());
    }
    
    @EventListener
    public void method10000(final Class5717 class5717) {
        if (this.method9906()) {
            this.method9883("AutoJump");
            final double method23136 = Class7482.method23136();
            ColorUtils.method19114();
            if (!SlowHop.mc.player.onGround) {
                ++this.field15588;
                this.field15589 = 0.36 - this.field15588 / 250.0;
                if (this.field15589 < method23136) {
                    this.field15589 = method23136;
                }
                Class7482.method23149(class5717, this.field15589);
            }
            else {
                this.field15588 = 0;
                SlowHop.mc.player.method2725();
                class5717.method16975(SlowHop.mc.player.getMotion().y);
            }
        }
    }
    
    @EventListener
    public void method10001(final Class5722 class5722) {
        if (this.method9906()) {
            class5722.method16995(0.407 + 0.1 * Class7482.method23140());
            this.field15588 = 0;
            class5722.method16996(1.8);
        }
    }
}
