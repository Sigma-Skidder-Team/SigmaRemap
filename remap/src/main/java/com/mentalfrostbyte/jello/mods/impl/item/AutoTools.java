// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class AutoTools extends Module
{
    public int field15762;
    
    public AutoTools() {
        super(Category.ITEM, "AutoTools", "Picks the best tool when breaking blocks");
        this.field15762 = -1;
    }
    
    @EventListener
    public void method10308(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (AutoTools.mc.player != null) {
                if (class5715.method16963() == 0) {
                    if (this.field15762 != -1) {
                        AutoTools.mc.player.inventory.field2743 = this.field15762;
                        this.field15762 = -1;
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10309(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (AutoTools.mc.player != null) {
                if (class5752.method17061() == 0) {
                    this.method10311(class5752.method17063());
                }
            }
        }
    }
    
    @EventListener
    private void method10310(final Class5743 class5743) {
        if (this.isEnabled()) {
            if (AutoTools.mc.player != null) {
                if (AutoTools.mc.gameSettings.field23446.method1056()) {
                    this.method10311(null);
                }
            }
        }
    }
    
    public void method10311(final BlockPos class354) {
        final BlockPos class355 = (class354 == null) ? ((AutoTools.mc.field4691.getType() != RayTraceResult.Type.BLOCK) ? null : ((BlockRayTraceResult) AutoTools.mc.field4691).getPos()) : class354;
        if (class355 == null) {
            return;
        }
        final int method29334 = InvManagerUtil.method29334(AutoTools.mc.world.getBlockState(class355));
        if (method29334 != -1) {
            if (AutoTools.mc.player.inventory.field2743 != method29334 % 9) {
                if (this.field15762 == -1) {
                    this.field15762 = AutoTools.mc.player.inventory.field2743;
                }
            }
            if (method29334 >= 36 && method29334 <= 44) {
                AutoTools.mc.player.inventory.field2743 = method29334 % 9;
            }
            else {
                AutoTools.mc.player.inventory.field2743 = InvManagerUtil.method29354(method29334);
            }
        }
    }
}
