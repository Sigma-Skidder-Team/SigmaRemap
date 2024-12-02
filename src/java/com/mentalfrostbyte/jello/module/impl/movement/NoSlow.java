package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventSlowDown;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.client.entity.player.RemoteClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;

public class NoSlow extends Module {
    private boolean isBlocking;
    private final List<IPacket<?>> packets = new ArrayList<>();
    private boolean isBlinking = false;
    private RemoteClientPlayerEntity clientPlayerEntity;
    private Vector3d startPosition;
    private float startYaw;
    private float startPitch;

    public NoSlow() {
        super(ModuleCategory.MOVEMENT, "NoSlow", "Stops slowdown when using an item");
        this.registerSetting(new ModeSetting("Mode", "NoSlow mode", 0, "Vanilla", "NCP", "Blink"));
    }

    @EventTarget
    private void onSlowDown(EventSlowDown event) {
        if (this.isEnabled() && isModeBlink()) {
            event.setCancelled(true);
        }
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (!this.isEnabled()) return;

        String mode = this.getStringSettingValueByName("Mode");

        if (mode.equals("Blink")) {
            handleBlinkMode(event);
        } else {
            handleOtherModes(event);
        }
    }

    @EventTarget
    private void onSendPacket(SendPacketEvent event) {
        if (this.isEnabled() && isBlinking && isModeBlink()) {
            IPacket<?> packet = event.getPacket();
            if (packet instanceof CPlayerPacket
                    || packet instanceof CEntityActionPacket
                    || packet instanceof CUseEntityPacket
                    || packet instanceof CAnimateHandPacket
                    || packet instanceof CPlayerTryUseItemPacket) {
                packets.add(packet);
                event.setCancelled(true);
            }
        }
    }

    private void handleBlinkMode(EventUpdate event) {
        ItemStack heldItem = mc.player.getHeldItemMainhand();
        if (heldItem != null) {
            heldItem.getItem().isFood();
        }
        boolean isEating = false;

        if (isEating && !isBlinking) {
            startBlink();
        } else if (!isEating && isBlinking) {
            stopBlink();
        }
    }

    private void handleOtherModes(EventUpdate event) {
        boolean auraEnabled = Client.getInstance().getModuleManager().getModuleByClass(KillAura.class).isEnabled2();
        boolean isSwordEquipped = mc.player.getHeldItemMainhand() != null && mc.player.getHeldItemMainhand().getItem() instanceof SwordItem;

        if (!event.isPre()) {
            if (isSwordEquipped && mc.gameSettings.keyBindUseItem.isKeyDown() && !isBlocking && !auraEnabled && isModeNCP()) {
                MultiUtilities.block();
                isBlocking = true;
            } else if (!isSwordEquipped && isBlocking) {
                isBlocking = false;
            }
        } else {
            handlePreEvent(isSwordEquipped, auraEnabled);
        }
    }

    private void startBlink() {
        isBlinking = true;

        // Save current position and orientation
        startPosition = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        startYaw = mc.player.rotationYaw;
        startPitch = mc.player.rotationPitch;

        // Create a fake client player entity


        // Add fake entity to the world
        mc.world.addEntity(-1, clientPlayerEntity);
    }

    private void stopBlink() {
        isBlinking = false;

        // Send all stored packets to the server
        for (IPacket<?> packet : packets) {
            mc.getConnection().sendPacket(packet);
        }
        packets.clear();

        // Remove the fake client player entity
        mc.world.removeEntityFromWorld(-1);
    }

    private boolean isModeNCP() {
        return this.getStringSettingValueByName("Mode").equals("NCP");
    }

    private boolean isModeBlink() {
        return this.getStringSettingValueByName("Mode").equals("Blink");
    }

    private void handlePreEvent(boolean isSwordEquipped, boolean auraEnabled) {
        if (!isModeNCP()) {
            if (isBlocking && !mc.gameSettings.keyBindUseItem.isKeyDown()) {
                isBlocking = false;
            }
        } else if (isBlocking && mc.gameSettings.keyBindUseItem.isKeyDown() && !auraEnabled) {
            if (isSwordEquipped) {
                MultiUtilities.unblock();
            }
            isBlocking = false;
        }
    }
}
