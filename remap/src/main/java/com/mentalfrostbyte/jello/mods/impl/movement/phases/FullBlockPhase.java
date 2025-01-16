// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.phases;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class FullBlockPhase extends Module
{
    public FullBlockPhase() {
        super(Category.MOVEMENT, "FullBlock", "Basic phase");
    }
    
    @EventListener
    private void method10830(final Class5744 class5744) {
        if (this.method9906() && method10834()) {
            class5744.method17033(true);
        }
    }
    
    @EventListener
    private void method10831(final Class5717 class5717) {
        if (this.method9906()) {
            if (!method10834()) {
                if (FullBlockPhase.mc.player.collidedHorizontally) {
                    Class7482.method23149(class5717, 0.0);
                    this.method10833(1.1920931E-8);
                }
            }
            else {
                this.method10833(0.617);
            }
        }
    }
    
    @EventListener
    private void method10832(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    private void method10833(final double n) {
        double n2 = FullBlockPhase.mc.player.field4085.field24722;
        double n3 = FullBlockPhase.mc.player.field4085.field24721;
        float field2399 = FullBlockPhase.mc.player.rotationYaw;
        if (n2 != 0.0) {
            if (n3 <= 0.0) {
                if (n3 < 0.0) {
                    field2399 += ((n2 <= 0.0) ? -45 : 45);
                }
            }
            else {
                field2399 += ((n2 <= 0.0) ? 45 : -45);
            }
            n3 = 0.0;
            if (n2 <= 0.0) {
                if (n2 < 0.0) {
                    n2 = -1.0;
                }
            }
            else {
                n2 = 1.0;
            }
        }
        FullBlockPhase.mc.player.setPosition(FullBlockPhase.mc.player.posX + (n2 * n * Math.cos(Math.toRadians(field2399 + 90.0f)) + n3 * n * Math.sin(Math.toRadians(field2399 + 90.0f))), FullBlockPhase.mc.player.posY, FullBlockPhase.mc.player.posZ + (n2 * n * Math.sin(Math.toRadians(field2399 + 90.0f)) - n3 * n * Math.cos(Math.toRadians(field2399 + 90.0f))));
    }
    
    public static boolean method10834() {
        final double n = 1.0E-7;
        return FullBlockPhase.mc.world.method6981(FullBlockPhase.mc.player, FullBlockPhase.mc.player.boundingBox.expand(n, 0.0, n).expand(-n, 0.0, -n)).count() > 0L;
    }
}
