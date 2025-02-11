package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.module.impl.movement.Speed;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class BlockFlySmoothMode extends Module {
    private float pitch;
    private float yaw;
    private BlockCache field23971;
    private int field23972 = -1;
    private int field23973;
    private int field23974;
    private Hand field23975;
    private BlockFly field23976 = null;
    private boolean field23977;
    private boolean field23978 = false;
    private double field23979;
    private int field23980 = 0;

    public BlockFlySmoothMode() {
        super(ModuleCategory.MOVEMENT, "Smooth", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
    }

    public static Vector3d method16892(BlockPos var0, Direction var1) {
        double var4 = (double) var0.getX() + 0.5;
        double var6 = (double) var0.getY() + 0.5;
        double var8 = (double) var0.getZ() + 0.5;
        var4 += (double) var1.getXOffset() / 2.0;
        var8 += (double) var1.getZOffset() / 2.0;
        var6 += (double) var1.getYOffset() / 2.0;
        double var10 = 0.2;
        if (var1 != Direction.UP && var1 != Direction.DOWN) {
            var6 += method16893(var10, -var10);
        } else {
            var4 += method16893(var10, -var10);
            var8 += method16893(var10, -var10);
        }

        if (var1 == Direction.WEST || var1 == Direction.EAST) {
            var8 += method16893(var10, -var10);
        }

        if (var1 == Direction.SOUTH || var1 == Direction.NORTH) {
            var4 += method16893(var10, -var10);
        }

        return new Vector3d(var4, var6, var8);
    }

    public static double method16893(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    @Override
    public void initialize() {
        this.field23976 = (BlockFly) this.access();
    }

    @Override
    public void onEnable() {
        this.field23972 = mc.player.inventory.currentItem;
        this.yaw = this.pitch = 999.0F;
        ((BlockFly) this.access()).field23884 = -1;
        this.field23979 = -1.0;
        this.field23978 = false;
        if (mc.player.onGround) {
            this.field23979 = mc.player.getPosY();
        }

        this.field23974 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23972 != -1 && this.access().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23972;
        }

        this.field23972 = -1;
        if (((BlockFly) this.access()).field23884 >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.access()).field23884 = -1;
        }

        MovementUtil.strafe(MovementUtil.getSpeed() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23974 == 0) {
            MultiUtilities.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    public void method16885(SafeWalkEvent var1) {
        if (this.isEnabled()) {
            if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && !Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()) {
                if (mc.world
                        .getCollisionShapes(
                                mc.player,
                                mc.player.boundingBox.expand(0.0, -1.5, 0.0).contract(0.05, 0.0, 0.05).contract(-0.05, 0.0, -0.05)
                        )
                        .count()
                        == 0L
                        && mc.player.fallDistance < 1.0F) {
                    var1.setSafe(true);
                }
            } else if (mc.player.onGround && Client.getInstance().moduleManager.getModuleByClass(SafeWalk.class).isEnabled()) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16886(EventUpdate event) {
        if (this.isEnabled() && this.field23976.getValidItemCount() != 0) {
            if (!event.isPre()) {
                if (this.yaw != 999.0F) {
                    this.field23976.method16736();
                    if (this.field23971 != null) {
                        BlockRayTraceResult var13 = BlockUtil.method34568(this.yaw, this.pitch, 5.0F, event);
                        if (var13.getType() == RayTraceResult.Type.MISS) {
                            return;
                        }

                        if (var13.getFace() == Direction.UP
                                && (double) var13.getPos().getY() <= mc.player.getPosY() - 1.0
                                && mc.player.onGround) {
                            return;
                        }

                        int var14 = mc.player.inventory.currentItem;
                        if (!this.access().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.field23976.method16734();
                        }

                        ItemStack var15 = mc.player.getHeldItem(Hand.MAIN_HAND);
                        new ItemUseContext(mc.player, Hand.MAIN_HAND, var13);
                        int var17 = var15.getCount();
                        mc.playerController.func_217292_a(mc.player, mc.world, this.field23975, var13);
                        this.field23971 = null;
                        if (!this.access().getBooleanValueFromSettingName("NoSwing")) {
                            mc.player.swingArm(this.field23975);
                        } else {
                            mc.getConnection().sendPacket(new CAnimateHandPacket(this.field23975));
                        }

                        if (this.access().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.access().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            mc.player.inventory.currentItem = var14;
                        }
                    }
                }
            } else {
                this.field23973++;
                this.field23980--;
                event.setMoving(true);
                this.field23975 = Hand.MAIN_HAND;
                if (BlockFly.shouldPlaceItem(mc.player.getHeldItem(Hand.OFF_HAND).getItem())
                        && (
                        mc.player.getHeldItem(this.field23975).isEmpty()
                                || !BlockFly.shouldPlaceItem(mc.player.getHeldItem(this.field23975).getItem())
                )) {
                    this.field23975 = Hand.OFF_HAND;
                }

                double var4 = event.getX();
                double var6 = event.getZ();
                double var8 = event.getY();
                if (!mc.player.collidedHorizontally && !mc.gameSettings.keyBindJump.pressed) {
                    double[] var10 = this.method16891();
                    var4 = var10[0];
                    var6 = var10[1];
                }

                if (mc.player.getMotion().y < 0.0
                        && mc.player.fallDistance > 1.0F
                        && BlockUtil.rayTrace(0.0F, 90.0F, 3.0F).getType() == RayTraceResult.Type.MISS) {
                    var8 += Math.min(mc.player.getMotion().y * 2.0, 4.0);
                } else if ((this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft"))
                        && !mc.gameSettings.keyBindJump.isKeyDown()) {
                    var8 = this.field23979;
                }

                if (!BlockUtil.isValidBlockPosition(
                        new BlockPos(
                                mc.player.getPositionVec().getX(),
                                mc.player.getPositionVec().getY() - 1.0,
                                mc.player.getPositionVec().getZ()
                        )
                )) {
                    var4 = mc.player.getPositionVec().getX();
                    var6 = mc.player.getPositionVec().getZ();
                }

                BlockPos var18 = new BlockPos(var4, var8 - 1.0, var6);
                if (!BlockUtil.isValidBlockPosition(var18) && this.field23976.canPlaceItem(this.field23975) && this.field23980 <= 0) {
                    BlockCache var11 = BlockUtil.findValidBlockCache(var18, false);
                    this.field23971 = var11;
                    float[] rots = BlockUtil.method34565();
                    if (var11 != null && rots != null) {
                        this.yaw = rots[0];
                        this.pitch = rots[1];
                    } else {
                        Rots.rotating = false;
                    }
                } else {
                    this.field23971 = null;
                }

                if (this.yaw != 999.0F) {
                    Rots.rotating = true;
                    Rots.prevYaw = this.yaw;
                    Rots.prevPitch = this.pitch;
                    event.setYaw(this.yaw);
                    event.setPitch(this.pitch);
                    Rots.yaw = this.yaw;
                    Rots.pitch = this.pitch;

                    mc.player.rotationYawHead = event.getYaw();
                    mc.player.renderYawOffset = event.getYaw();
                } else {
                    Rots.rotating = false;
                }

                if (mc.player.rotationYaw != event.getYaw() && mc.player.rotationPitch != event.getPitch()) {
                    this.field23973 = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void method16887(EventMove var1) {
        if (this.isEnabled() && this.field23976.getValidItemCount() != 0) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                this.field23979 = mc.player.getPosY();
            }

            if (this.access().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.field23974 = 0;
            } else if (this.field23974 >= 0) {
                this.field23974++;
            }

            if (this.field23976 == null) {
                this.field23976 = (BlockFly) this.access();
            }

            String var4 = this.getStringSettingValueByName("Speed Mode");
            switch (var4) {
                case "Jump":
                    if (mc.player.onGround && MultiUtilities.isMoving() && !mc.player.isSneaking() && !this.field23977) {
                        this.field23978 = false;
                        mc.player.jump();
                        ((Speed) Client.getInstance().moduleManager.getModuleByClass(Speed.class)).method16764();
                        this.field23978 = true;
                        var1.setY(mc.player.getMotion().y);
                        var1.setX(mc.player.getMotion().x);
                        var1.setZ(mc.player.getMotion().z);
                    }
                    break;
                case "AAC":
                    if (this.field23973 == 0 && mc.player.onGround) {
                        MovementUtil.setMotion(var1, MovementUtil.getSpeed() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = this.method16894(MathHelper.wrapDegrees(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (MultiUtilities.isMoving() && !mc.player.isSneaking() && !this.field23977) {
                            var1.setY(1.00000000000001);
                        }
                    } else if (this.field23974 == 1) {
                        if (var1.getY() <= 0.9) {
                            this.field23974 = -1;
                        } else {
                            var1.setY(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.field23974 == 2) {
                        if (var1.getY() > 0.05) {
                            this.field23974 = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.field23974 == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.field23974 == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.field23974 == 6) {
                        var1.setY(-1.023456987345906);
                    }

                    if (!MultiUtilities.isMoving()) {
                        var6 = 0.0;
                    }

                    if (mc.player.fallDistance < 1.0F) {
                        MovementUtil.setMotion(var1, var6, var8, var8, 360.0F);
                    }

                    MultiUtilities.setPlayerYMotion(var1.getY());
                    break;
                case "Slow":
                    if (mc.player.onGround) {
                        var1.setX(var1.getX() * 0.75);
                        var1.setZ(var1.getZ() * 0.75);
                    } else {
                        var1.setX(var1.getX() * 0.93);
                        var1.setZ(var1.getZ() * 0.93);
                    }
                    break;
                case "Sneak":
                    if (mc.player.onGround) {
                        var1.setX(var1.getX() * 0.65);
                        var1.setZ(var1.getZ() * 0.65);
                    } else {
                        var1.setX(var1.getX() * 0.85);
                        var1.setZ(var1.getZ() * 0.85);
                    }
            }

            this.field23976.method16741(var1);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16888(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof CHeldItemChangePacket && ((BlockFly) this.access()).field23884 >= 0) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16889(JumpEvent var1) {
        if (this.isEnabled() && this.field23978) {
            if (this.access().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MultiUtilities.isMoving() || this.access().getBooleanValueFromSettingName("Tower while moving"))) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16890(Render2DEvent var1) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23974 >= 0) {
            if (!(mc.player.fallDistance > 1.2F)) {
                if (!(mc.player.chasingPosY < this.field23979)) {
                    if (!mc.player.isJumping) {
                        mc.player.positionVec.y = this.field23979;
                        mc.player.lastTickPosY = this.field23979;
                        mc.player.chasingPosY = this.field23979;
                        mc.player.prevPosY = this.field23979;
                        if (MovementUtil.isMoving()) {
                            mc.player.cameraYaw = 0.099999994F;
                        }
                    }
                }
            }
        }
    }

    public double[] method16891() {
        double var3 = mc.player.getPosX();
        double var5 = mc.player.getPosZ();
        double var7 = mc.player.movementInput.moveForward;
        double var9 = mc.player.movementInput.moveStrafe;
        float var11 = mc.player.rotationYaw;
        BlockPos var12 = new BlockPos(var3, mc.player.getPosY() - 1.0, var5);
        double var13 = var3;
        double var15 = var5;
        double var17 = 0.0;

        for (double var19 = this.getNumberValueBySettingName("Extend") * 2.0F;
             BlockUtil.isValidBlockPosition(var12);
             var12 = new BlockPos(var13, mc.player.getPosY() - 1.0, var15)
        ) {
            if (++var17 > var19) {
                var17 = var19;
            }

            var13 = var3
                    + (var7 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F)) + var9 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F))) * var17;
            var15 = var5
                    + (var7 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F)) - var9 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F))) * var17;
            if (var17 == var19) {
                break;
            }
        }

        return new double[]{var13, var15};
    }

    public float method16894(float var1) {
        float var4 = 0.0F;
        float var5 = mc.player.moveStrafing;
        float var6 = mc.player.moveForward;
        if (!(var5 > 0.0F)) {
            if (var5 < 0.0F) {
                if (!(var6 > 0.0F)) {
                    if (!(var6 < 0.0F)) {
                        var1 += 90.0F;
                    } else {
                        var1 -= 45.0F;
                    }
                } else {
                    var1 += 45.0F;
                }
            }
        } else if (!(var6 > 0.0F)) {
            if (!(var6 < 0.0F)) {
                var1 -= 90.0F;
            } else {
                var1 += 45.0F;
            }
        } else {
            var1 -= 45.0F;
        }

        if (var1 >= 45.0F && var1 <= 135.0F) {
            var4 = 90.0F;
        } else if (var1 >= 135.0F || var1 <= -135.0F) {
            var4 = 180.0F;
        } else if (var1 <= -45.0F && var1 >= -135.0F) {
            var4 = -90.0F;
        } else if (var1 >= -45.0F && var1 <= 45.0F) {
            var4 = 0.0F;
        }

        if (var6 < 0.0F) {
            var4 -= 180.0F;
        }

        return var4 + 90.0F;
    }
}
