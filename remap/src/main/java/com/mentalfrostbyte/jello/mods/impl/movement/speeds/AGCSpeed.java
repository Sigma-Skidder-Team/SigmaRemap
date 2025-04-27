// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class AGCSpeed extends Module
{
    private int field15591;
    private double field15592;
    private float field15593;
    
    public AGCSpeed() {
        super(Category.MOVEMENT, "AGC", "Speed for AGC");
    }
    
    @Override
    public void onEnable() {
        this.field15593 = MovementUtil.method23143()[0];
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.2800000011920929);
    }
    
    @EventListener
    private void method10003(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (AGCSpeed.mc.player != null) {
                if (eventReceivePacket.getPacket() instanceof Class4273) {
                    if (((Class4273) eventReceivePacket.getPacket()).method12822() == AGCSpeed.mc.player.getEntityId()) {
                        this.field15591 = -1;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10004(final Class5717 class5717) {
        if (!this.isEnabled()) {
            return;
        }
        if (Client.getInstance().getTickManager().method29228() > 25) {
            this.field15591 = 0;
        }
        if (this.field15591 >= 0) {
            if (!ColorUtils.method19114()) {
                if (AGCSpeed.mc.player.onGround) {
                    this.field15593 = AGCSpeed.mc.player.rotationYaw + 90.0f;
                }
            }
            else if (!AGCSpeed.mc.player.onGround) {
                this.field15592 -= 0.00775;
                if (this.field15592 < 0.17) {
                    this.field15592 = 0.17;
                }
                this.field15593 = MovementUtil.method23153(class5717, this.field15592, MovementUtil.method23144()[0], this.field15593, 45.0f);
            }
            else {
                this.field15592 = 0.67 + Math.random() * 1.0E-10 + MovementUtil.method23139() * 0.12;
                this.field15593 = MovementUtil.method23153(class5717, this.field15592, MovementUtil.method23144()[0], this.field15593, 45.0f);
                this.field15592 = 0.39;
                class5717.method16975(MovementUtil.method23141());
                ColorUtils.method19155(class5717.method16974());
            }
        }
    }
}
