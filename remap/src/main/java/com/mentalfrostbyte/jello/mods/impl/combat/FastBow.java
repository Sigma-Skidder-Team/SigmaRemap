// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class FastBow extends Module
{
    private int field15888;
    
    public FastBow() {
        super(Category.COMBAT, "FastBow", "Shoots arrows faster");
    }
    
    @EventListener
    private void method10472(final EventPlayerTickI eventPlayerTick) {
        if (this.isEnabled()) {
            if (FastBow.mc.player.getHeldItemMainhand() != null) {
                if (FastBow.mc.player.getHeldItemMainhand().getItem() instanceof Class4087) {
                    if (FastBow.mc.player.onGround) {
                        for (int i = 0; i < 25; ++i) {
                            FastBow.mc.method5269().method17292(new Class4353(true));
                        }
                        FastBow.mc.method5269().method17292(new Class4399(Class2003.field11245, BlockPos.ZERO, Direction.DOWN));
                    }
                }
            }
        }
    }
}
