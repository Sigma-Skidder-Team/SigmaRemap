package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.module.impl.movement.speed.AACSpeed;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

import java.util.List;

public class BlockFlyAACMode extends Module {
    private float field23520;
    private float field23521;
    private int field23522 = 0;
    private int field23523 = 0;
    private int field23524;
    private int field23525;
    private double field23526;

    public BlockFlyAACMode() {
        super(ModuleCategory.MOVEMENT, "AAC", "Places block underneath if it is in hand");
        this.registerSetting(new BooleanSetting("Haphe (AACAP)", "Never let's you touch the ground.", false));
    }

    @Override
    public void onEnable() {
        this.field23523 = mc.player.inventory.currentItem;
        this.field23520 = mc.player.rotationYaw;
        this.field23521 = mc.player.rotationPitch;
        this.field23522 = (int) mc.player.getPosY();
        this.field23525 = -1;
        ((BlockFly) this.access()).field23884 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23523 != -1 && this.access().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23523;
        }

        this.field23523 = -1;
        if (((BlockFly) this.access()).field23884 >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.access()).field23884 = -1;
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16202(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof CHeldItemChangePacket && ((BlockFly) this.access()).field23884 >= 0) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16203(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                this.field23525 = 0;
            }
        }
    }

    @EventTarget
    public void method16204(SafeWalkEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround && Client.getInstance().getModuleManager().getModuleByClass(SafeWalk.class).isEnabled()) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    public void method16205(EventMove var1) {
        if (this.isEnabled()) {
            if (this.access().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (!this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                mc.gameSettings.keyBindSprint.pressed = false;
                mc.player.setSprinting(false);
            }

            ((BlockFly) this.access()).method16741(var1);
            if (this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                if (!mc.player.onGround || mc.player.moveForward == 0.0F && mc.player.moveStrafing == 0.0F) {
                    if (this.field23524 >= 0) {
                        this.field23524++;
                    }
                } else {
                    this.field23524 = 0;
                    mc.player.jump();
                    var1.setY(0.419998 + (double) MovementUtils.method37079() * 0.1);
                    if (this.field23525 < 3) {
                        this.field23525++;
                    }
                }

                if (mc.player.moveForward == 0.0F && mc.player.moveStrafing == 0.0F || mc.player.collidedHorizontally) {
                    this.field23525 = 0;
                }

                this.field23526 = AACSpeed.method16016(this.field23524, this.field23525, () -> this.field23525 = 0);
                if (this.field23524 >= 0) {
                    MovementUtils.setSpeed(var1, this.field23526);
                }
            }
        }
    }

    @EventTarget
    private void method16206(Class4423 var1) {
        if (this.isEnabled() && mc.world != null && mc.player != null) {
            if (this.getBooleanValueFromSettingName("Haphe (AACAP)") && MovementUtils.isMoving() && !mc.player.isSprinting()) {
                var1.field21557 *= 1.14F;
            }
        }
    }

    private boolean method16207() {
        BlockRayTraceResult var3 = (BlockRayTraceResult) BlockUtil.method34569(mc.player.field6122, mc.player.field6123, BlockUtil.method34560(), 0.0F);
        boolean var4 = false;
        if (var3 != null && var3.getType() == RayTraceResult.Type.BLOCK) {
            if (this.access().getStringSettingValueByName("ItemSpoof").equals("None")) {
                BlockFly var10000 = (BlockFly) this.access();
                if (!BlockFly.method16733(mc.player.getHeldItem(Hand.MAIN_HAND).getItem())) {
                    return false;
                }
            }

            if (this.getBooleanValueFromSettingName("Haphe (AACAP)") && !mc.player.isJumping && !mc.player.onGround) {
                if (var3.getFace() == Direction.UP) {
                    return false;
                }

                if (var3.getPos().getY() != this.field23522 - 1) {
                    return false;
                }
            }

            if (var3.getFace() == Direction.UP
                    && (double) (var3.getPos().getY() + 2) > mc.player.getPosY()
                    && BlockUtil.method34578(var3.getPos())) {
                return false;
            }

            if ((double) var3.getPos().getY() == mc.player.getPosY()) {
                return false;
            }

            ((BlockFly) this.access()).method16736();
            int var5 = mc.player.inventory.currentItem;
            if (!this.access().getStringSettingValueByName("ItemSpoof").equals("None")) {
                ((BlockFly) this.access()).method16734();
            }

            ActionResultType var6 = mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, var3);
            if (this.access().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.access().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                mc.player.inventory.currentItem = var5;
            }

            if (var6 == ActionResultType.SUCCESS) {
                if (!this.access().getBooleanValueFromSettingName("NoSwing")) {
                    mc.player.swingArm(Hand.MAIN_HAND);
                } else {
                    mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                }

                if (var3.getFace() == Direction.UP) {
                    this.field23522 = var3.getPos().getY() + 2;
                }

                var4 = true;
            }
        }

        return var4;
    }

    public List<PositionFacing> method16208(Block var1, BlockPos var2) {
        return Class9291.method35030(var1, var2, (int) mc.playerController.getBlockReachDistance());
    }

    @EventTarget
    public void method16209(Render2DEvent var1) {
        if (this.isEnabled()) {
            if (!this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void method16210(EventUpdate var1) {
        if (this.isEnabled()) {
            if (!var1.isPre()) {
                if (MovementUtils.isMoving() && mc.player.onGround && this.getBooleanValueFromSettingName("Haphe (AACAP)") && !mc.player.isJumping) {
                    mc.player.jump();
                }

                if (!this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                    if (!this.method16207()) {
                        float var11 = 0.0F;

                        while (var11 < 0.7F && !this.method16207()) {
                            var11 += 0.1F;
                        }
                    }
                } else {
                    this.method16207();
                }
            } else {
                double var4 = mc.player.getPosY();
                if (!mc.player.isJumping && this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                    var4 = this.field23522;
                }

                BlockPos var6 = new BlockPos(mc.player.getPosX(), (double) Math.round(var4 - 1.0), mc.player.getPosZ());
                List var7 = this.method16208(Blocks.STONE, var6);
                if (!var7.isEmpty()) {
                    PositionFacing var8 = (PositionFacing) var7.get(var7.size() - 1);
                    BlockRayTraceResult var9 = BlockUtil.rayTrace(this.field23520, this.field23521, 5.0F);
                    if (!var9.getPos().equals(var8.blockPos) || !var9.getFace().equals(var8.direction)) {
                        float[] var10 = BlockUtil.method34543(var8.blockPos, var8.direction);
                        this.field23520 = BlockUtil.method34543(var8.blockPos, var8.direction)[0];
                        this.field23521 = BlockUtil.method34543(var8.blockPos, var8.direction)[1];
                    }
                }

                var1.setYaw(this.field23521);
                var1.setPitch(this.field23520);
            }
        }
    }

    @EventTarget
    public void method16211(JumpEvent var1) {
        if (this.isEnabled()) {
            if (this.access().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MultiUtilities.method17686() || this.access().getBooleanValueFromSettingName("Tower while moving"))) {
                var1.setCancelled(true);
            }
        }
    }
}
