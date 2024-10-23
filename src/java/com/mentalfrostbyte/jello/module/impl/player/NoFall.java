package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.AxisAlignedBB;

public class NoFall extends Module {
    private boolean isAacModeActive = false;
    private boolean isNcpSpigotModeActive;
    private double fallDistanceOffset;
    private boolean isVanillaLegitModeActive;

    public NoFall() {
        super(ModuleCategory.PLAYER, "NoFall", "Avoid fall damage");
        this.registerSetting(
                new ModeSetting("Mode", "Nofall mode", 0, "Vanilla", "Hypixel", "Hypixel2", "AAC", "NCPSpigot", "OldHypixel", "Vanilla Legit")
                        .setPremiumModes("Hypixel", "Hypixel2")
        );
    }

    @Override
    public void onEnable() {
        this.isAacModeActive = false;
        this.isNcpSpigotModeActive = false;
        this.fallDistanceOffset = 0.0;
    }

    @EventTarget
    @LowerPriority
    private void onMove(EventMove event) {
        if (this.isEnabled()) {
            if (event.getY() < -0.5
                    && mc.player.fallDistance > 2.0 + MovementUtils.method37079() * 0.5
                    && !mc.player.onGround
                    && this.getStringSettingValueByName("Mode").equals("Hypixel")
                    && MultiUtilities.isHypixel()) {

                double[] offsets = MultiUtilities.method17747();
                double closestOffset = Double.MAX_VALUE;

                for (double offset : offsets) {
                    double playerY = mc.player.getPosY();
                    double adjustment = (int) (playerY + event.getY()) - playerY - event.getY() + offset;
                    double minAdjustment = 0.02;
                    double maxAdjustment = -0.05;

                    if (event.getY() > -0.5 + MovementUtils.method37079()) {
                        minAdjustment = 0.0;
                    }

                    if (adjustment > maxAdjustment && adjustment < minAdjustment) {
                        AxisAlignedBB boundingBox = mc.player.boundingBox.offset(event.getX(), event.getY() + adjustment + maxAdjustment, event.getZ());
                        if (mc.world.getCollisionShapes(mc.player, boundingBox).count() != 0L) {
                            adjustment -= 1.0E-5;
                            event.setY(event.getY() + adjustment);
                            MultiUtilities.setPlayerYMotion(event.getY());
                            closestOffset = Double.MAX_VALUE;
                            break;
                        }

                        if (Math.abs(adjustment) < closestOffset) {
                            closestOffset = adjustment;
                        }
                    }
                }

                if (Math.abs(closestOffset) < 0.1) {
                    event.setY(event.getY() + closestOffset);
                    MultiUtilities.setPlayerYMotion(event.getY());
                }
            }
        }
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (this.isEnabled() && mc.player != null) {
            if (mc.player.getPosY() >= 2.0) {
                String mode = this.getStringSettingValueByName("Mode");
                if (!MultiUtilities.isHypixel() && mode.equals("Hypixel")) {
                    mode = "OldHypixel";
                }

                switch (mode) {
                    case "OldHypixel":
                        if (event.isPre()) {
                            if (MultiUtilities.isAboveBounds(mc.player, 1.0E-4F)) {
                                this.fallDistanceOffset = 0.0;
                                return;
                            }

                            if (mc.player.getMotion().y < -0.1) {
                                this.fallDistanceOffset -= mc.player.getMotion().y;
                            }

                            if (this.fallDistanceOffset > 3.0) {
                                this.fallDistanceOffset = 1.0E-14;
                                event.setGround(true);
                            }
                        }
                        break;
                    case "Hypixel":
                        if (event.isPre() && mc.player.getMotion().y < 0.0 && !mc.player.onGround && MultiUtilities.isHypixel()) {
                            for (double offset : MultiUtilities.method17747()) {
                                if ((int) event.getY() - event.getY() + offset == 0.0) {
                                    event.setGround(true);
                                    break;
                                }
                            }
                        }
                        break;
                    case "Hypixel2":
                        if (event.isPre()) {
                            if (MultiUtilities.isAboveBounds(mc.player, 1.0E-4F)) {
                                this.fallDistanceOffset = 0.0;
                                return;
                            }

                            if (mc.player.getMotion().y < -0.1 && mc.player.fallDistance > 3.0F) {
                                this.fallDistanceOffset++;
                                if (this.fallDistanceOffset == 1.0) {
                                    mc.getConnection().sendPacket(new CPlayerPacket(true));
                                } else if (this.fallDistanceOffset > 1.0) {
                                    this.fallDistanceOffset = 0.0;
                                }
                            }
                        }
                        break;
                    case "AAC":
                        if (event.isPre()) {
                            if (mc.player.ticksExisted == 1) {
                                this.isAacModeActive = false;
                            }

                            if (!this.isAacModeActive && mc.player.fallDistance > 3.0F && mode.equals("AAC")) {
                                this.isAacModeActive = true;
                                CPlayerPacket.PositionPacket packet = new CPlayerPacket.PositionPacket(mc.player.getPosX(), Double.NaN, mc.player.getPosZ(), true);
                                mc.getConnection().sendPacket(packet);
                            }
                        }
                        break;
                    case "Vanilla":
                        if (event.isPre() && mc.player.getMotion().y < -0.1) {
                            event.setGround(true);
                        }
                        break;
                    case "Vanilla Legit":
                        if (mc.player.getMotion().y < -0.1) {
                            event.setGround(true);
                        }

                        if (mc.player.fallDistance > 3.0F) {
                            this.isVanillaLegitModeActive = true;
                        }

                        if (this.isVanillaLegitModeActive && mc.player.onGround && !mc.player.isInWater()) {
                            double posX = mc.player.getPosX();
                            double posY = mc.player.getPosY();
                            double posZ = mc.player.getPosZ();
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(posX, posY + 3.01, posZ, false));
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(posX, posY, posZ, false));
                            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(posX, posY, posZ, true));
                            System.out.println("sent");
                            this.isVanillaLegitModeActive = false;
                        }
                        break;
                    case "NCPSpigot":
                        if (event.isPre()) {
                            if (mc.player.fallDistance > 3.0F) {
                                this.isNcpSpigotModeActive = true;
                            }

                            if (this.isNcpSpigotModeActive && Client.getInstance().getPlayerTracker().getgroundTicks() == 0 && mc.player.onGround) {
                                event.setY(event.getY() - 11.0);
                                this.isNcpSpigotModeActive = false;
                            }
                        }
                }
            }
        }
    }
}
