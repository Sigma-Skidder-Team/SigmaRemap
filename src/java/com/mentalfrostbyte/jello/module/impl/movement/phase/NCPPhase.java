package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class NCPPhase extends PremiumModule {
    private boolean field23651;
    private int field23652;
    private int field23653;

    public NCPPhase() {
        super("NCP", "Phase for NCP anticheat", ModuleCategory.MOVEMENT);
        this.registerSetting(new BooleanSetting("Hypixel", "Hypixel bypass", true));
    }

    @Override
    public void onEnable() {
        this.field23651 = false;
        if (!mc.player.collidedHorizontally) {
            this.field23652 = -1;
        } else {
            this.field23652 = 0;
            if (mc.player.onGround) {
                double var3 = mc.player.getPosX();
                double var5 = mc.player.getPosY();
                double var7 = mc.player.getPosZ();
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var3, var5 + 0.0626, var7, false));
            }
        }
    }

    @EventTarget
    private void method16426(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (mc.gameSettings.keyBindSneak.isKeyDown()) {
                double var4 = mc.player.getPosX();
                double var6 = mc.player.getPosY();
                double var8 = mc.player.getPosZ();
                if (!ColorUtils.method17686()) {
                    if (ColorUtils.method17730(mc.player, 0.001F) && !ColorUtils.method17761()) {
                        mc.player.setPosition(var4, var6 - 1.0, var8);
                        var1.setY(var6 - 1.0);
                        var1.method13908(true);
                        var1.setPitch(var1.getPitch() + 10.0F);
                        ColorUtils.method17725(0.0);
                    } else if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())) {
                        mc.player.setPosition(var4, var6 - 0.3, var8);
                    }
                }
            }

            if (this.field23652 > 0 && this.field23651 && ColorUtils.method17761()) {
                this.field23653++;
                float var10 = (float) Math.sin(this.field23653) * 5.0F;
                float var11 = (float) Math.cos(this.field23653) * 5.0F;
                var1.setPitch(var1.getPitch() + var10);
                var1.setYaw(var1.getYaw() + var11);
            } else if (this.field23652 < 0) {
                return;
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16427(EventMove var1) {
        if (this.isEnabled()) {
            if (mc.player.collidedHorizontally && this.field23652 != 0) {
                this.field23652 = 0;
                if (mc.player.onGround) {
                    double var4 = mc.player.getPosX();
                    double var6 = mc.player.getPosY();
                    double var8 = mc.player.getPosZ();
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var4, var6 + 0.0626, var8, false));
                }
            }

            if (this.field23652 >= 0) {
                if (this.field23652 != 0) {
                    if (!ColorUtils.method17761()) {
                        this.field23651 = false;
                        MovementUtils.method37088(var1, 0.0);
                        return;
                    }

                    if (!this.field23651) {
                        MovementUtils.method37088(var1, !this.getBooleanValueFromSetttingName("Hypixel") ? 0.0031 : 0.03);
                    } else {
                        MovementUtils.method37088(var1, 0.617);
                    }
                } else {
                    MovementUtils.method37088(var1, 0.0);
                    MovementUtils.method37095(6.000000238415E-4);
                }

                this.field23652++;
            }
        }
    }

    @EventTarget
    private void method16428(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    private void method16429(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
                this.field23651 = true;
            }
        }
    }
}
