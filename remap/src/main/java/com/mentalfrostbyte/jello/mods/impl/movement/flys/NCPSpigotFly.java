// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class NCPSpigotFly extends Module
{
    private int field15949;
    private double field15950;
    
    public NCPSpigotFly() {
        super(Category.MOVEMENT, "NCPSpigot", "A fly for NoCheatPlus");
    }
    
    @Override
    public void onEnable() {
        this.field15950 = NCPSpigotFly.mc.player.posY;
        this.field15949 = 2;
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.0);
        if (NCPSpigotFly.mc.player.getMotion().y > 0.0) {
            ColorUtils.method19155(-0.0789);
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10583(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (this.field15949 <= 1) {
                if (this.field15949 != -1) {
                    if (this.field15949 != 0) {
                        if (this.field15949 == 1) {
                            class5717.method16975(-1.0E-7);
                            MovementUtil.method23149(class5717, MovementUtil.method23136());
                            ColorUtils.method19155(class5717.method16974());
                        }
                    }
                    else {
                        class5717.method16975(-1.0E-7);
                        MovementUtil.method23149(class5717, MovementUtil.method23136());
                        ColorUtils.method19155(class5717.method16974());
                    }
                }
                else {
                    class5717.method16975(0.0);
                    ColorUtils.method19155(class5717.method16974());
                    MovementUtil.method23149(class5717, MovementUtil.method23136());
                }
            }
            else {
                MovementUtil.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10584(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            ++this.field15949;
            if (this.field15949 != 3) {
                if (this.field15949 > 3) {
                    if (this.field15949 >= 20) {
                        if (this.field15949 % 20 == 0) {
                            updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
                        }
                    }
                }
            }
            else {
                updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
            }
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    public void method10585(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (method16998 instanceof SPlayerPositionLookPacket) {
                final SPlayerPositionLookPacket class5724 = (SPlayerPositionLookPacket)method16998;
                if (this.field15949 >= 1) {
                    this.field15949 = -1;
                }
                this.field15950 = class5724.field19378;
                class5724.yaw = NCPSpigotFly.mc.player.rotationYaw;
                class5724.pitch = NCPSpigotFly.mc.player.rotationPitch;
            }
        }
    }
    
    @EventListener
    public void method10586(final Class5721 class5721) {
        if (this.isEnabled()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15949 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @EventListener
    public void method10587(final Class5741 class5741) {
        if (this.isEnabled()) {
            final double field15950 = this.field15950;
            NCPSpigotFly.mc.player.posY = field15950;
            NCPSpigotFly.mc.player.lastTickPosY = field15950;
            NCPSpigotFly.mc.player.field3019 = field15950;
            NCPSpigotFly.mc.player.prevPosY = field15950;
        }
    }
}
