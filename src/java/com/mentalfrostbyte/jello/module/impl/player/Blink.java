package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;

import java.util.ArrayList;
import java.util.List;

public class Blink extends Module {
    public static Class1116 field23863;
    public float field23866;
    public float field23867;
    private final List<Packet<?>> field23864 = new ArrayList<Packet<?>>();
    private Vector3d field23865;

    public Blink() {
        super(ModuleCategory.PLAYER, "Blink", "Stops your packets to blink");
    }

    @Override
    public void onEnable() {
        this.field23865 = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        this.field23866 = mc.player.rotationYaw;
        this.field23867 = mc.player.rotationPitch;
        field23863 = new Class1116(mc.world, mc.player.getGameProfile());
        field23863.inventory = mc.player.inventory;
        field23863.method3269(this.field23865.x, this.field23865.y, this.field23865.z, this.field23866, this.field23867);
        field23863.field4967 = mc.player.field4967;
        mc.world.method6846(-1, field23863);
    }

    @Override
    public void onDisable() {
        int var3 = this.field23864.size();

        for (int var4 = 0; var4 < var3; var4++) {
            mc.getConnection().sendPacket(this.field23864.get(var4));
        }

        this.field23864.clear();
        mc.world.method6848(-1);
    }

    @EventTarget
    private void method16710(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.method13932() instanceof CEntityActionPacket
                    || var1.method13932() instanceof Class5603
                    || var1.method13932() instanceof CUseEntityPacket
                    || var1.method13932() instanceof CAnimateHandPacket
                    || var1.method13932() instanceof Class5555) {
                this.field23864.add(var1.method13932());
                var1.method13900(true);
            }
        }
    }
}
