// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4328;
import mapped.Class5723;
import mapped.EventListener;

public class NoViewReset extends Module
{
    public NoViewReset() {
        super(Category.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }
    
    @EventListener
    private void method10803(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (NoViewReset.mc.player == null) {
            return;
        }
        if (NoViewReset.mc.player.ticksExisted >= 10) {
            if (NoViewReset.mc.player != null) {
                if (class5723.method16998() instanceof Class4328) {
                    final Class4328 class5724 = (Class4328)class5723.method16998();
                    NoViewReset.mc.player.prevRotationYaw = class5724.field19380;
                    NoViewReset.mc.player.prevRotationPitch = class5724.field19381;
                    class5724.field19380 = NoViewReset.mc.player.rotationYaw;
                    class5724.field19381 = NoViewReset.mc.player.rotationPitch;
                }
            }
        }
    }
}
