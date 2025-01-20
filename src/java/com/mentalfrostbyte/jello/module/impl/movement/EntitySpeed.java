package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUseLess;
import com.mentalfrostbyte.jello.event.impl.EventMoveRideable;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.network.play.client.CMoveVehiclePacket;
import net.minecraft.network.play.server.SMoveVehiclePacket;
import net.minecraft.util.MovementInput;

public class EntitySpeed extends Module {
    public float field23546 = 3.0F;
    public int field23547 = 0;

    public EntitySpeed() {
        super(ModuleCategory.MOVEMENT, "EntitySpeed", "Speed up your rideable entities");
    }

    @Override
    public void onEnable() {
    }

    @EventTarget
    public void method16240(EventMoveRideable var1) {
        if (this.isEnabled()) {
            if (mc.gameSettings.keyBindJump.isKeyDown() && !mc.player.getRidingEntity().onGround) {
            }

            MovementInput var4 = mc.player.movementInput;
            float var5 = var4.moveForward;
            float var6 = var4.moveStrafe;
            if (!mc.player.getRidingEntity().collidedHorizontally
                    && !mc.player.getRidingEntity().onGround
                    && MultiUtilities.isAboveBounds(mc.player.getRidingEntity(), 5.0F)
                    && !mc.player.getRidingEntity().isInWater()
                    && mc.world.getBlockState(mc.player.getRidingEntity().getPosition()).getBlock() != Blocks.WATER) {
                var1.setY(-2.0);
            }

            if (mc.player.getRidingEntity().isInWater()) {
                if (mc.player.getRidingEntity().collidedHorizontally) {
                    var1.setY(-1.0);
                } else {
                    double var13 = Math.floor(mc.player.getRidingEntity().getPosY()) + 0.7725465413369861 - mc.player.getRidingEntity().getPosY();
                    var1.setY(var13 / 2.0);
                }
            }

            if (var5 == 0.0F && var6 == 0.0F) {
                var1.setX(0.0);
                var1.setZ(0.0);
            } else {
                float var7 = MovementUtils.method37086();
                double var8 = Math.cos(Math.toRadians(var7));
                double var10 = Math.sin(Math.toRadians(var7));
                this.field23546 = 2.75F;
                float var12 = this.field23546;
                if (mc.player.getRidingEntity() instanceof HorseEntity) {
                    HorseEntity var15 = (HorseEntity) mc.player.getRidingEntity();
                    if (var15.onGround && mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.player.field6140 = 1.0F;
                    }
                }

                var1.setX(var8 * (double) var12);
                var1.setZ(var10 * (double) var12);
                if (this.field23547 < 2 || !mc.player.getRidingEntity().onGround) {
                    mc.player.getRidingEntity().stepHeight = 0.0F;
                }
            }
        }
    }

    @EventTarget
    public void method16241(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (!(var1.getPacket() instanceof SMoveVehiclePacket)) {
            }
        }
    }

    @EventTarget
    public void method16242(SendPacketEvent var1) {
        if (var1.getPacket() instanceof CMoveVehiclePacket
                && mc.player.getRidingEntity() != null
                && this.field23547++ > 2
                && mc.player.getRidingEntity().onGround) {
            mc.player.getRidingEntity().stepHeight = 1.0F;
        }
    }

    @EventTarget
    public void method16243(EventUseLess var1) {
        mc.player.getRidingEntity().stepHeight = 0.0F;
        this.field23547 = 0;
    }
}
