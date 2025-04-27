// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.spiders;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Spider;
import mapped.UpdateWalkingEvent;
import mapped.Class5753;
import mapped.EventListener;

public class SpartanSpider extends Module
{
    public SpartanSpider() {
        super(Category.MOVEMENT, "Spartan", "Spider for Spartan");
    }
    
    @EventListener
    private void method10523(final UpdateWalkingEvent updateWalkingEvent) {
        if (!this.isEnabled() || !updateWalkingEvent.isPre()) {
            return;
        }
        final int method10264 = ((Spider)this.method9914()).method10264();
        if (method10264 != 0 && SpartanSpider.mc.player.collidedHorizontally) {
            final double field2395 = SpartanSpider.mc.player.posX;
            final double field2396 = SpartanSpider.mc.player.posY;
            final double field2397 = SpartanSpider.mc.player.posZ;
            double n = 1.19209289E-8;
            if (SpartanSpider.mc.player.getMotion().y <= -0.22768848754498797 || SpartanSpider.mc.player.onGround) {
                if (!SpartanSpider.mc.player.onGround) {
                    SpartanSpider.mc.player.setPosition(field2395, field2396 - (field2396 - (int)field2396), field2397);
                    updateWalkingEvent.method17037(field2396 - (field2396 - (int)field2396));
                    n = -1.0E-13;
                }
                SpartanSpider.mc.player.method2725();
                updateWalkingEvent.method17045(true);
            }
            switch (method10264) {
                case 1: {
                    if (field2395 < 0.0) {
                        updateWalkingEvent.method17035((int)field2395 - 0.3 - n);
                        break;
                    }
                    updateWalkingEvent.method17035((int)(field2395 + 1.0) - 0.3 - n);
                    break;
                }
                case 2: {
                    if (field2395 < 0.0) {
                        updateWalkingEvent.method17035((int)(field2395 - 1.0) + 0.3 + n);
                        break;
                    }
                    updateWalkingEvent.method17035((int)field2395 + 0.3 + n);
                    break;
                }
                case 3: {
                    if (field2397 < 0.0) {
                        updateWalkingEvent.method17039((int)field2397 - 0.3 - n);
                        break;
                    }
                    updateWalkingEvent.method17039((int)(field2397 + 1.0) - 0.3 - n);
                    break;
                }
                case 4: {
                    if (field2397 < 0.0) {
                        updateWalkingEvent.method17039((int)(field2397 - 1.0) + 0.3 + n);
                        break;
                    }
                    updateWalkingEvent.method17039((int)field2397 + 0.3 + n);
                    break;
                }
            }
        }
    }
    
    @EventListener
    private void method10524(final Class5753 class5753) {
        if (this.isEnabled() && SpartanSpider.mc.player != null) {
            if (class5753.method17065() != null) {
                if (!class5753.method17065().isEmpty()) {
                    if (class5753.method17065().getBoundingBox().minY > SpartanSpider.mc.player.boundingBox.minY + 1.0) {
                        class5753.setCancelled(true);
                    }
                }
            }
        }
    }
}
