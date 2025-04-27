// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class EntitySpeed extends Module
{
    public float field15763;
    public int field15764;
    
    public EntitySpeed() {
        super(Category.MOVEMENT, "EntitySpeed", "Speed up your rideable entities");
        this.field15763 = 3.0f;
        this.field15764 = 0;
    }
    
    @Override
    public void onEnable() {
    }
    
    @EventListener
    public void method10312(final Class5718 class5718) {
        if (!this.isEnabled()) {
            return;
        }
        if (EntitySpeed.mc.gameSettings.field23439.method1056()) {
            if (!EntitySpeed.mc.player.method1920().onGround) {}
        }
        final Class6093 field4085 = EntitySpeed.mc.player.field4085;
        final float field4086 = field4085.field24722;
        final float field4087 = field4085.field24721;
        if (!EntitySpeed.mc.player.method1920().collidedHorizontally) {
            if (!EntitySpeed.mc.player.method1920().onGround) {
                if (ColorUtils.method19160(EntitySpeed.mc.player.method1920(), 5.0f)) {
                    if (!EntitySpeed.mc.player.method1920().method1706()) {
                        if (EntitySpeed.mc.world.getBlockState(EntitySpeed.mc.player.method1920().method1894()).method21696() != Blocks.field29173) {
                            class5718.method16983(-2.0);
                        }
                    }
                }
            }
        }
        if (EntitySpeed.mc.player.method1920().method1706()) {
            if (EntitySpeed.mc.player.method1920().collidedHorizontally) {
                class5718.method16983(-1.0);
            }
            else {
                class5718.method16983((Math.floor(EntitySpeed.mc.player.method1920().posY) + 0.7725465413369861 - EntitySpeed.mc.player.method1920().posY) / 2.0);
            }
        }
        if (field4086 == 0.0f && field4087 == 0.0f) {
            class5718.method16981(0.0);
            class5718.method16985(0.0);
            return;
        }
        final float method23147 = MovementUtil.method23147();
        final double cos = Math.cos(Math.toRadians(method23147));
        final double sin = Math.sin(Math.toRadians(method23147));
        this.field15763 = 2.75f;
        final float field4088 = this.field15763;
        if (EntitySpeed.mc.player.method1920() instanceof Class808) {
            if (EntitySpeed.mc.player.method1920().onGround) {
                if (EntitySpeed.mc.gameSettings.field23439.method1056()) {
                    EntitySpeed.mc.player.field4094 = 1.0f;
                }
            }
        }
        class5718.method16981(cos * field4088);
        class5718.method16985(sin * field4088);
        if (this.field15764 < 2 || !EntitySpeed.mc.player.method1920().onGround) {
            EntitySpeed.mc.player.method1920().stepHeight = 0.0f;
        }
    }
    
    @EventListener
    public void method10313(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (!(eventReceivePacket.getPacket() instanceof Class4263)) {}
        }
    }
    
    @EventListener
    public void method10314(final Class5721 class5721) {
        if (class5721.method16990() instanceof Class4251) {
            if (EntitySpeed.mc.player.method1920() != null) {
                if (this.field15764++ > 2) {
                    if (EntitySpeed.mc.player.method1920().onGround) {
                        EntitySpeed.mc.player.method1920().stepHeight = 1.0f;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10315(final Class5731 class5731) {
        EntitySpeed.mc.player.method1920().stepHeight = 0.0f;
        this.field15764 = 0;
    }
}
