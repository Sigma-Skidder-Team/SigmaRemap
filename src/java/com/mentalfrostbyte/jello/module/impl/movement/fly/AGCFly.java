package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public class AGCFly extends Module {
    private int field23902;
    private int field23903;
    private boolean field23904;

    public AGCFly() {
        super(ModuleCategory.MOVEMENT, "AGC", "A fly for AntiGamingChair");
    }

    @Override
    public void onEnable() {
        this.field23902 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23904 = false;
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23904 = true;
        }

        this.field23903 = 1;
    }

    @EventTarget
    private void method16780(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23904 = true;
            }
        }
    }

    @EventTarget
    private void method16781(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23904 = false;
            }
        }
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            ColorUtils.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16782(EventMove var1) {
        if (this.isEnabled()) {
            if (this.field23902 <= (this.field23903 != 3 ? this.field23903 : 1) - 2) {
                if (this.field23902 == -1) {
                    var1.setY(this.field23903 != 3 ? 0.001 : 0.095);
                    if (this.field23903 != 3) {
                        MovementUtils.setSpeed(var1, 0.32);
                    }

                    ColorUtils.setPlayerYMotion(var1.getY());
                }
            } else {
                var1.setY(0.0);
                MovementUtils.setSpeed(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16783(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23902++;
            if (this.field23902 != (this.field23903 != 3 ? this.field23903 : 1)) {
                if (this.field23902 > (this.field23903 != 3 ? this.field23903 : 1)) {
                    if (this.field23902 % 20 != 0) {
                        var1.setCancelled(true);
                    } else {
                        double var4 = this.method16785();
                        var1.setY(var4 - 1.0E-4);
                        var1.method13908(true);
                        var1.setGround(true);
                    }
                }
            } else {
                double var6 = this.method16785();
                var1.setY(var6 - 1.0E-4);
                var1.setGround(true);
                var1.method13908(true);
                this.field23903 = !this.field23904
                        ? (!mc.gameSettings.keyBindJump.isKeyDown() ? 1 : 3)
                        : (!mc.gameSettings.keyBindJump.isKeyDown() ? 2 : 1);
            }
        }
    }

    @EventTarget
    public void method16784(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23902 >= (this.field23903 != 3 ? this.field23903 : 1)) {
                    this.field23902 = -1;
                }

                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    private double method16785() {
        if (!(mc.player.getPositionVec().y < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB var3 = mc.player.boundingBox.contract(0.0, -mc.player.getPositionVec().y, 0.0);
                Iterator var4 = mc.world.getCollisionShapes(mc.player, var3).iterator();
                double var5 = -1.0;
                BlockPos var7 = null;

                while (var4.hasNext()) {
                    VoxelShape var8 = (VoxelShape) var4.next();
                    if (var8.getBoundingBox().maxY > var5) {
                        var5 = var8.getBoundingBox().maxY;
                        var7 = new BlockPos(var8.getBoundingBox().minX, var8.getBoundingBox().minY, var8.getBoundingBox().minZ);
                    }
                }

                if (var7 != null) {
                    Block var9 = mc.world.getBlockState(var7).getBlock();
                    if (var9 instanceof Class3410) {
                        var5 = (double) ((int) var5) - 1.0E-4;
                    }
                }

                return var5;
            } else {
                return mc.player.getPosY();
            }
        } else {
            return -1.0;
        }
    }
}
