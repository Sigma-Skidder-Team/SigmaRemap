// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.phases;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class NoClipPhase extends Module
{
    public NoClipPhase() {
        super(Category.MOVEMENT, "NoClip", "NoClip phase");
    }
    
    @EventListener
    private void method10715(final Class5713 class5713) {
        if (this.isEnabled()) {
            class5713.setCancelled(true);
        }
    }
    
    @EventListener
    public void method10716(final Class5753 class5753) {
        if (this.isEnabled() && NoClipPhase.mc.world != null) {
            if (class5753.method17064().getY() >= NoClipPhase.mc.player.posY) {
                class5753.method17067(VoxelShapes.empty());
            }
        }
    }
    
    @EventListener
    public void method10717(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        NoClipPhase.mc.player.field2985 = 3;
        if (NoClipPhase.mc.player.ticksExisted % 2 != 0) {
            return;
        }
        if (NoClipPhase.mc.player.onGround) {
            if (!NoClipPhase.mc.player.field2967) {
                if (NoClipPhase.mc.player.method1809()) {
                    NoClipPhase.mc.player.setPosition(NoClipPhase.mc.player.posX, NoClipPhase.mc.player.posY - 1.0, NoClipPhase.mc.player.posZ);
                }
            }
            else {
                NoClipPhase.mc.player.setPosition(NoClipPhase.mc.player.posX, NoClipPhase.mc.player.posY + 1.0, NoClipPhase.mc.player.posZ);
            }
        }
    }
}
