package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.HighJump;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

@InDevelopment
public class AntiVoid extends Module {
    private double fallDistanceAccumulated;
    private int disableTimer;
    private int speedBoostTimer;
    private Vector3d lastSafePosition = null;

    public AntiVoid() {
        super(ModuleCategory.PLAYER, "AntiVoid", "Avoids you from falling into the void");
        this.registerSetting(new BooleanSetting("Void", "Catch only above void", true));
        this.registerSetting(new NumberSetting<Float>("Fall Distance", "Fall distance before catching you", 8.0F, Float.class, 2.0F, 15.0F, 0.5F));
        this.registerSetting(new ModeSetting("Mode", "AntiVoid method", 0, "Hypixel", "Motion", "Cubecraft", "Legit"));
    }

    @Override
    public void onEnable() {
        this.fallDistanceAccumulated = 0.0;
        this.speedBoostTimer = 0;
        this.disableTimer = 0;
        if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
            this.lastSafePosition = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        }
    }

    @EventTarget
    private void onMove(EventMove event) {
        if (this.isEnabled()) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                this.lastSafePosition = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
            }

            if (this.disableTimer <= 0) {
                Module flyModule = Client.getInstance().moduleManager.getModuleByClass(Fly.class);
                String flyMode = flyModule.getStringSettingValueByName("Type");
                Module highJumpModule = Client.getInstance().moduleManager.getModuleByClass(HighJump.class);
                String highJumpMode = highJumpModule.getStringSettingValueByName("Type");
                boolean shouldFly = flyModule.isEnabled();

                if (flyMode.equals("Cubecraft") && event.getY() < -0.4) {
                    shouldFly = false;
                }

                if (highJumpModule.isEnabled() && highJumpMode.equals("Hypixel")) {
                    shouldFly = true;
                }

                if (mc.player.getMotion().y < -0.08 && !shouldFly) {
                    this.fallDistanceAccumulated -= mc.player.getMotion().y;
                } else if (mc.player.onGround) {
                    this.fallDistanceAccumulated = 0.0;
                }
            } else {
                MovementUtil.setMotion(event, 0.0);
                event.setY(0.0);
                this.disableTimer--;
            }

            if (this.fallDistanceAccumulated > (double) this.getNumberValueBySettingName("Fall Distance") && (isSafeToFall() || !this.getBooleanValueFromSettingName("Void"))) {
                this.fallDistanceAccumulated = 0.0;
                handleVoidMode(this.getStringSettingValueByName("Mode"), event);
            }

            if (this.speedBoostTimer > 0) {
                this.speedBoostTimer--;
                MovementUtil.setMotion(event, 0.1);
            }
        }
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (this.isEnabled() && event.isPre() && this.disableTimer != 0) {
            event.setCancelled(true);
        }
    }

    @EventTarget
    private void onPacketReceive(ReceivePacketEvent event) {
        if (this.isEnabled() && this.disableTimer != 0) {
            if (event.getPacket() instanceof SPlayerPositionLookPacket) {
                this.disableTimer = 0;
                this.speedBoostTimer = 4;
            }
        }
    }

    private boolean isSafeToFall() {
        if (!(mc.player.getPositionVec().y < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB boundingBox = mc.player.boundingBox;
                boundingBox = boundingBox.expand(0.0, -mc.player.getPositionVec().y, 0.0);
                return mc.world.getCollisionShapes(mc.player, boundingBox).count() == 0L;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    private void handleVoidMode(String mode, EventMove event) {
        double posX = mc.player.getPositionVec().getX();
        double posY = mc.player.getPositionVec().getY();
        double posZ = mc.player.getPositionVec().getZ();

        if (mode.equals("Cubecraft") && !MultiUtilities.isCubecraft()) {
            mode = "Motion";
        }

        switch (mode) {
            case "Hypixel":
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(0.0, -999.0, 0.0, true));
                break;
            case "Motion":
                event.setY(0.1);
                MultiUtilities.setPlayerYMotion(event.getY());
                break;
            case "Cubecraft":
                double highPosition = 3.2E7;
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(posX, highPosition, posZ, false));
                Client.getInstance().moduleManager.getModuleByClass(Fly.class).setEnabled(false);
                break;
            case "Legit":
                this.disableTimer = 200;
        }
    }
}
