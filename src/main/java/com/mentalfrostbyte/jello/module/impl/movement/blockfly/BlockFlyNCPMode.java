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
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class BlockFlyNCPMode extends Module {
    private float pitch;
    private float yaw;
    private BlockCache blockCache;
    private int field23924 = -1;
    private int field23925;
    private int field23926;
    private Hand hand;
    private BlockFly parent = null;
    private boolean field23929;
    private boolean field23930 = false;
    private double field23931;

    public BlockFlyNCPMode() {
        super(ModuleCategory.MOVEMENT, "NCP", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Slow", "Sneak"));
        this.registerSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
        this.registerSetting(new NumberSetting<Float>("Extend", "Extend value", 0.0F, Float.class, 0.0F, 6.0F, 0.1F));
        this.registerSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
    }

    public static Vector3d method16814(BlockPos var0, Direction var1) {
        double var4 = (double) var0.getX() + 0.5;
        double var6 = (double) var0.getY() + 0.5;
        double var8 = (double) var0.getZ() + 0.5;
        var4 += (double) var1.getXOffset() / 2.0;
        var8 += (double) var1.getZOffset() / 2.0;
        var6 += (double) var1.getYOffset() / 2.0;
        double var10 = 0.2;
        if (var1 != Direction.UP && var1 != Direction.DOWN) {
            var6 += method16815(var10, -var10);
        } else {
            var4 += method16815(var10, -var10);
            var8 += method16815(var10, -var10);
        }

        if (var1 == Direction.WEST || var1 == Direction.EAST) {
            var8 += method16815(var10, -var10);
        }

        if (var1 == Direction.SOUTH || var1 == Direction.NORTH) {
            var4 += method16815(var10, -var10);
        }

        return new Vector3d(var4, var6, var8);
    }

    public static double method16815(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    @Override
    public void initialize() {
        this.parent = (BlockFly) this.access();
    }

    @Override
    public void onEnable() {
        this.field23924 = mc.player.inventory.currentItem;
        this.yaw = this.pitch = 999.0F;
        ((BlockFly) this.access()).field23884 = -1;
        if (mc.gameSettings.keyBindSneak.isKeyDown() && this.getBooleanValueFromSettingName("Downwards")) {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23929 = true;
        }

        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23929 = false;
        }

        this.field23931 = -1.0;
        this.field23930 = false;
        if (mc.player.onGround) {
            this.field23931 = mc.player.getPosY();
        }

        this.field23926 = -1;
    }

    @Override
    public void onDisable() {
        if (this.field23924 != -1 && this.access().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23924;
        }

        this.field23924 = -1;
        if (((BlockFly) this.access()).field23884 >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.access()).field23884 = -1;
        }

        MovementUtil.strafe(MovementUtil.getSpeed() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23926 == 0) {
            MultiUtilities.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    public void method16805(SafeWalkEvent var1) {
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
            } else if (mc.player.onGround
                    && Client.getInstance().moduleManager.getModuleByClass(SafeWalk.class).isEnabled()
                    && (!this.field23929 || !this.getBooleanValueFromSettingName("Downwards"))) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    private void method16806(EventKeyPress var1) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                var1.setCancelled(true);
                this.field23929 = true;
            }
        }
    }

    @EventTarget
    private void method16807(MouseHoverEvent var1) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                var1.setCancelled(true);
                this.field23929 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16808(EventUpdate event) {
        if (this.isEnabled() && this.parent.getValidItemCount() != 0) {
            if (!event.isPre()) {
                this.parent.method16736();
                if (this.blockCache != null) {
                    BlockRayTraceResult var13 = new BlockRayTraceResult(
                            method16814(this.blockCache.field33646, this.blockCache.field33647), this.blockCache.field33647, this.blockCache.field33646, false
                    );
                    int var14 = mc.player.inventory.currentItem;
                    if (!this.access().getStringSettingValueByName("ItemSpoof").equals("None")) {
                        this.parent.method16734();
                    }

                    mc.playerController.func_217292_a(mc.player, mc.world, this.hand, var13);
                    if (!this.access().getBooleanValueFromSettingName("NoSwing")) {
                        mc.player.swingArm(this.hand);
                    } else {
                        mc.getConnection().sendPacket(new CAnimateHandPacket(this.hand));
                    }

                    if (this.access().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.access().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                        mc.player.inventory.currentItem = var14;
                    }
                }
            } else {
                this.field23925++;
                event.setMoving(true);
                this.hand = Hand.MAIN_HAND;
                if (BlockFly.shouldPlaceItem(mc.player.getHeldItem(Hand.MAIN_HAND).getItem())
                        && (
                        mc.player.getHeldItem(this.hand).isEmpty()
                                || !BlockFly.shouldPlaceItem(mc.player.getHeldItem(this.hand).getItem())
                )) {
                    this.hand = Hand.MAIN_HAND;
                }

                double x = event.getX();
                double z = event.getZ();
                double y = event.getY();
                if (!mc.player.collidedHorizontally && !mc.gameSettings.keyBindJump.pressed) {
                    double[] var10 = this.method16813();
                    x = var10[0];
                    z = var10[1];
                }

                if (mc.player.getMotion().y < 0.0
                        && mc.player.fallDistance > 1.0F
                        && BlockUtil.rayTrace(0.0F, 90.0F, 3.0F).getType() == RayTraceResult.Type.MISS) {
                    y += Math.min(mc.player.getMotion().y * 2.0, 4.0);
                } else if (this.field23929 && this.getBooleanValueFromSettingName("Downwards")) {
                    y--;
                } else if ((this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft"))
                        && !mc.gameSettings.keyBindJump.isKeyDown()) {
                    y = this.field23931;
                }

                if (!BlockUtil.isValidBlockPosition(
                        new BlockPos(
                                mc.player.getPositionVec().getX(),
                                mc.player.getPositionVec().getY() - 1.0,
                                mc.player.getPositionVec().getZ()
                        )
                )) {
                    x = mc.player.getPositionVec().getX();
                    z = mc.player.getPositionVec().getZ();
                }

                BlockPos blockPos = new BlockPos(x, y - 1.0, z);
                if (!BlockUtil.isValidBlockPosition(blockPos) && this.parent.canPlaceItem(this.hand)) {
                    BlockCache cache = BlockUtil.findValidBlockCache(blockPos, !this.field23929 && this.getBooleanValueFromSettingName("Downwards"));
                    this.blockCache = cache;
                    if (cache != null) {
                        float[] rots = BlockUtil.method34542(this.blockCache.field33646, this.blockCache.field33647);
                        this.yaw = rots[0];
                        this.pitch = rots[1];
                        Rots.rotating = true;
                        Rots.prevYaw = this.yaw;
                        Rots.prevPitch = this.pitch;
                        event.setYaw(this.yaw);
                        event.setPitch(this.pitch);
                        Rots.yaw = this.yaw;
                        Rots.pitch = this.pitch;

                        mc.player.rotationYawHead = event.getYaw();
                        mc.player.renderYawOffset = event.getYaw();
                    }
                } else {
                    if (this.getBooleanValueFromSettingName("KeepRotations") && this.pitch != 999.0F) {
                        Rots.rotating = true;
                        Rots.prevYaw = this.yaw;
                        Rots.prevPitch = this.pitch;
                        event.setYaw(this.yaw);
                        event.setPitch(this.pitch);
                        Rots.yaw = this.yaw;
                        Rots.pitch = this.pitch;

                        mc.player.rotationYawHead = event.getYaw();
                        mc.player.renderYawOffset = event.getYaw();
                    }

                    this.blockCache = null;
                }


                if (mc.player.rotationYaw != event.getYaw() && mc.player.rotationPitch != event.getPitch()) {
                    this.field23925 = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void method16809(EventMove event) {
        if (this.isEnabled() && this.parent.getValidItemCount() != 0) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                this.field23931 = mc.player.getPosY();
            }

            if (this.access().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.field23926 = 0;
            } else if (this.field23926 >= 0) {
                this.field23926++;
            }

            if (this.parent == null) {
                this.parent = (BlockFly) this.access();
            }

            String mode = this.getStringSettingValueByName("Speed Mode");
            switch (mode) {
                case "Jump":
                    if (mc.player.onGround && MultiUtilities.isMoving() && !mc.player.isSneaking() && !this.field23929) {
                        this.field23930 = false;
                        mc.player.jump();
                        ((Speed) Client.getInstance().moduleManager.getModuleByClass(Speed.class)).method16764();
                        this.field23930 = true;
                        event.setY(mc.player.getMotion().y);
                        event.setX(mc.player.getMotion().x);
                        event.setZ(mc.player.getMotion().z);
                    }
                    break;
                case "AAC":
                    if (this.field23925 == 0 && mc.player.onGround) {
                        MovementUtil.setMotion(event, MovementUtil.getSpeed() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = this.method16816(MathHelper.wrapDegrees(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (MultiUtilities.isMoving() && !mc.player.isSneaking() && !this.field23929) {
                            event.setY(1.01);
                        }
                    } else if (this.field23926 == 1) {
                        if (event.getY() <= 0.9) {
                            this.field23926 = -1;
                        } else {
                            event.setY(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.field23926 == 2) {
                        if (event.getY() > 0.05) {
                            this.field23926 = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.field23926 == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.field23926 == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.field23926 == 6) {
                        event.setY(-1.023456987345906);
                    }

                    if (!MultiUtilities.isMoving()) {
                        var6 = 0.0;
                    }

                    if (mc.player.fallDistance < 1.0F) {
                        MovementUtil.setMotion(event, var6, var8, var8, 360.0F);
                    }

                    MultiUtilities.setPlayerYMotion(event.getY());
                    break;
                case "Slow":
                    if (mc.player.onGround) {
                        event.setX(event.getX() * 0.75);
                        event.setZ(event.getZ() * 0.75);
                    } else {
                        event.setX(event.getX() * 0.93);
                        event.setZ(event.getZ() * 0.93);
                    }
                    break;
                case "Sneak":
                    if (mc.player.onGround) {
                        event.setX(event.getX() * 0.65);
                        event.setZ(event.getZ() * 0.65);
                    } else {
                        event.setX(event.getX() * 0.85);
                        event.setZ(event.getZ() * 0.85);
                    }
            }

            this.parent.method16741(event);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16810(SendPacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof CHeldItemChangePacket && ((BlockFly) this.access()).field23884 >= 0) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16811(JumpEvent var1) {
        if (this.isEnabled() && this.field23930) {
            if (this.access().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MultiUtilities.isMoving() || this.access().getBooleanValueFromSettingName("Tower while moving"))) {
                var1.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void method16812(Render2DEvent var1) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23926 >= 0) {
            if (!(mc.player.fallDistance > 1.2F)) {
                if (!(mc.player.chasingPosY < this.field23931)) {
                    if (!mc.player.isJumping) {
                        mc.player.positionVec.y = this.field23931;
                        mc.player.lastTickPosY = this.field23931;
                        mc.player.chasingPosY = this.field23931;
                        mc.player.prevPosY = this.field23931;
                        if (MovementUtil.isMoving()) {
                            mc.player.cameraYaw = 0.099999994F;
                        }
                    }
                }
            }
        }
    }

    public double[] method16813() {
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

    public float method16816(float var1) {
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
