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
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.network.Packet;
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
        ((BlockFly) this.method16004()).field23884 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23523 != -1 && this.method16004().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23523;
        }

        this.field23523 = -1;
        if (((BlockFly) this.method16004()).field23884 >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.method16004()).field23884 = -1;
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16202(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.method13932() instanceof CHeldItemChangePacket && ((BlockFly) this.method16004()).field23884 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16203(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
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
    public void method16205(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.method16004().getBooleanValueFromSetttingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (!this.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
                mc.gameSettings.keyBindSprint.pressed = false;
                mc.player.setSprinting(false);
            }

            ((BlockFly) this.method16004()).method16741(var1);
            if (this.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
                if (!mc.player.onGround || mc.player.field4984 == 0.0F && mc.player.field4982 == 0.0F) {
                    if (this.field23524 >= 0) {
                        this.field23524++;
                    }
                } else {
                    this.field23524 = 0;
                    mc.player.method2914();
                    var1.method13995(0.419998 + (double) Class9567.method37079() * 0.1);
                    if (this.field23525 < 3) {
                        this.field23525++;
                    }
                }

                if (mc.player.field4984 == 0.0F && mc.player.field4982 == 0.0F || mc.player.collidedHorizontally) {
                    this.field23525 = 0;
                }

                this.field23526 = AACSpeed.method16016(this.field23524, this.field23525, () -> this.field23525 = 0);
                if (this.field23524 >= 0) {
                    Class9567.method37088(var1, this.field23526);
                }
            }
        }
    }

    @EventTarget
    private void method16206(Class4423 var1) {
        if (this.isEnabled() && mc.world != null && mc.player != null) {
            if (this.getBooleanValueFromSetttingName("Haphe (AACAP)") && Class9567.method37087() && !mc.player.method3337()) {
                var1.field21557 *= 1.14F;
            }
        }
    }

    private boolean method16207() {
        BlockRayTraceResult var3 = (BlockRayTraceResult) BlockUtil.method34569(mc.player.field6122, mc.player.field6123, BlockUtil.method34560(), 0.0F);
        boolean var4 = false;
        if (var3 != null && var3.getType() == RayTraceResult.Type.BLOCK) {
            if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                BlockFly var10000 = (BlockFly) this.method16004();
                if (!BlockFly.method16733(mc.player.getHeldItem(Hand.MAIN_HAND).getItem())) {
                    return false;
                }
            }

            if (this.getBooleanValueFromSetttingName("Haphe (AACAP)") && !mc.player.field4981 && !mc.player.onGround) {
                if (var3.getFace() == Direction.field673) {
                    return false;
                }

                if (var3.getPos().getY() != this.field23522 - 1) {
                    return false;
                }
            }

            if (var3.getFace() == Direction.field673
                    && (double) (var3.getPos().getY() + 2) > mc.player.getPosY()
                    && BlockUtil.method34578(var3.getPos())) {
                return false;
            }

            if ((double) var3.getPos().getY() == mc.player.getPosY()) {
                return false;
            }

            ((BlockFly) this.method16004()).method16736();
            int var5 = mc.player.inventory.currentItem;
            if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
                ((BlockFly) this.method16004()).method16734();
            }

            ActionResultType var6 = mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, var3);
            if (this.method16004().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.method16004().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                mc.player.inventory.currentItem = var5;
            }

            if (var6 == ActionResultType.field14818) {
                if (!this.method16004().getBooleanValueFromSetttingName("NoSwing")) {
                    mc.player.swingArm(Hand.MAIN_HAND);
                } else {
                    mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                }

                if (var3.getFace() == Direction.field673) {
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
            if (!this.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void method16210(Class4399 var1) {
        if (this.isEnabled()) {
            if (!var1.method13921()) {
                if (Class9567.method37087() && mc.player.onGround && this.getBooleanValueFromSetttingName("Haphe (AACAP)") && !mc.player.field4981) {
                    mc.player.method2914();
                }

                if (!this.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
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
                if (!mc.player.field4981 && this.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
                    var4 = this.field23522;
                }

                BlockPos var6 = new BlockPos(mc.player.getPosX(), (double) Math.round(var4 - 1.0), mc.player.getPosZ());
                List var7 = this.method16208(Blocks.STONE, var6);
                if (!var7.isEmpty()) {
                    PositionFacing var8 = (PositionFacing) var7.get(var7.size() - 1);
                    BlockRayTraceResult var9 = BlockUtil.method34567(this.field23520, this.field23521, 5.0F);
                    if (!var9.getPos().equals(var8.blockPos) || !var9.getFace().equals(var8.direction)) {
                        float[] var10 = BlockUtil.method34543(var8.blockPos, var8.direction);
                        this.field23520 = BlockUtil.method34543(var8.blockPos, var8.direction)[0];
                        this.field23521 = BlockUtil.method34543(var8.blockPos, var8.direction)[1];
                    }
                }

                var1.method13916(this.field23521);
                var1.method13918(this.field23520);
            }
        }
    }

    @EventTarget
    public void method16211(Class4436 var1) {
        if (this.isEnabled()) {
            if (this.method16004().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!ColorUtils.method17686() || this.method16004().getBooleanValueFromSetttingName("Tower while moving"))) {
                var1.method13900(true);
            }
        }
    }
}
