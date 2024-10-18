package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.client.entity.player.RemoteClientPlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;

public class Blink extends Module {
    public static RemoteClientPlayerEntity clientPlayerEntity;
    public float yaw;
    public float pitch;
    private final List<IPacket<?>> packets = new ArrayList<>();
    private Vector3d vector;

    public Blink() {
        super(ModuleCategory.PLAYER, "Blink", "Stops your packets to blink");
    }

    @Override
    public void onEnable() {
        this.vector = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        this.yaw = mc.player.rotationYaw;
        this.pitch = mc.player.rotationPitch;
        clientPlayerEntity = new RemoteClientPlayerEntity(mc.world, mc.player.getGameProfile());
        clientPlayerEntity.inventory = mc.player.inventory;
        clientPlayerEntity.setPositionAndRotation(this.vector.x, this.vector.y, this.vector.z, this.yaw, this.pitch);
        clientPlayerEntity.rotationYawHead = mc.player.rotationYawHead;
        mc.world.addEntity(-1, clientPlayerEntity);
    }

    @Override
    public void onDisable() {
        int packetAmount = this.packets.size();

        for (int i = 0; i < packetAmount; i++) {
            mc.getConnection().sendPacket(this.packets.get(i));
        }

        this.packets.clear();
        mc.world.removeEntityFromWorld(-1);
    }

    @EventTarget
    private void method16710(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof CEntityActionPacket
                    || var1.getPacket() instanceof CPlayerPacket
                    || var1.getPacket() instanceof CUseEntityPacket
                    || var1.getPacket() instanceof CAnimateHandPacket
                    || var1.getPacket() instanceof CPlayerTryUseItemPacket) {
                this.packets.add(var1.getPacket());
                var1.setCancelled(true);
            }
        }
    }
}
