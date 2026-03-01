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
import mapped.PositionFacing;
import mapped.RayTraceResult;
import mapped.RotationHelper;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;

public class BlockFlyNCPMode extends Module {
    private float pitch;
    private float yaw;
    private PositionFacing blockData;
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
        this.registerSetting(new NumberSetting<>("Extend", "Extend value", 0.0F, Float.class, 0.0F, 6.0F, 0.1F));
        this.registerSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
    }

    @Override
    public void initialize() {
        this.parent = (BlockFly) this.getParent();
    }

    @Override
    public void onEnable() {
        this.field23924 = mc.player.inventory.currentItem;
        this.yaw = this.pitch = 999.0F;
        ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
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
        if (this.field23924 != -1 && this.getParent().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.field23924;
        }

        this.field23924 = -1;
        if (((BlockFly) this.getParent()).lastSpoofedSlot >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
        }

        MovementUtil.strafe(MovementUtil.getSpeed() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.field23926 == 0) {
            MovementUtil.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    public void onSafe(SafeWalkEvent event) {
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
                    event.setSafe(true);
                }
            } else if (mc.player.onGround
                    && Client.getInstance().moduleManager.getModuleByClass(SafeWalk.class).isEnabled()
                    && (!this.field23929 || !this.getBooleanValueFromSettingName("Downwards"))) {
                event.setSafe(true);
            }
        }
    }

    @EventTarget
    private void onKey(EventKeyPress event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (event.getKey() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                event.setCancelled(true);
                this.field23929 = true;
            }
        }
    }

    @EventTarget
    private void onHover(MouseHoverEvent event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (event.getMouseButton() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                event.setCancelled(true);
                this.field23929 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void onMotion(EventUpdate event) {
        if (this.isEnabled() && this.parent.countPlaceableBlocks() != 0) {
            if (!event.isPre()) {
                this.parent.refillHotbarWithBlocks();
                if (this.blockData != null) {
                    BlockRayTraceResult hit = new BlockRayTraceResult(
                            BlockUtil.rayTraceBlocksFromRotations(this.blockData.blockPos, this.blockData.direction), this.blockData.direction, this.blockData.blockPos, false
                    );
                    int slot = mc.player.inventory.currentItem;
                    if (!this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
                        this.parent.selectPlaceableHotbarSlot();
                    }

                    mc.playerController.func_217292_a(mc.player, mc.world, this.hand, hit);
                    if (!this.getParent().getBooleanValueFromSettingName("NoSwing")) {
                        mc.player.swingArm(this.hand);
                    } else {
                        mc.getConnection().sendPacket(new CAnimateHandPacket(this.hand));
                    }

                    if (this.getParent().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.getParent().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                        mc.player.inventory.currentItem = slot;
                    }
                }
            } else {
                this.field23925++;
                event.setMoving(true);
                this.hand = Hand.MAIN_HAND;
                if (BlockFly.isPlacableBlockItem(mc.player.getHeldItem(Hand.MAIN_HAND).getItem()) && (mc.player.getHeldItem(this.hand).isEmpty() || !BlockFly.isPlacableBlockItem(mc.player.getHeldItem(this.hand).getItem())
                )) {
                    this.hand = Hand.MAIN_HAND;
                }

                double x = event.getX();
                double z = event.getZ();
                double y = event.getY();
                if (!mc.player.collidedHorizontally && !mc.gameSettings.keyBindJump.pressed) {
                    double[] extend = BlockUtil.getExtend(getNumberValueBySettingName("Extend"));
                    x = extend[0];
                    z = extend[1];
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
                if (!BlockUtil.isValidBlockPosition(blockPos) && this.parent.canPlaceWithHand(this.hand)) {
                    PositionFacing cache = BlockUtil.findPlaceableNeighbor(blockPos, !this.field23929 && this.getBooleanValueFromSettingName("Downwards"));
                    this.blockData = cache;
                    if (cache != null) {
                        float[] rots = RotationHelper.getBlockPlacementRotations(this.blockData.blockPos, this.blockData.direction);
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

                    this.blockData = null;
                }


                if (mc.player.rotationYaw != event.getYaw() && mc.player.rotationPitch != event.getPitch()) {
                    this.field23925 = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void onMove(EventMove event) {
        if (this.isEnabled() && this.parent.countPlaceableBlocks() != 0) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                this.field23931 = mc.player.getPosY();
            }

            if (this.getParent().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.field23926 = 0;
            } else if (this.field23926 >= 0) {
                this.field23926++;
            }

            if (this.parent == null) {
                this.parent = (BlockFly) this.getParent();
            }

            String mode = this.getStringSettingValueByName("Speed Mode");
            switch (mode) {
                case "Jump":
                    if (mc.player.onGround && MovementUtil.isMoving() && !mc.player.isSneaking() && !this.field23929) {
                        this.field23930 = false;
                        mc.player.jump();
                        ((Speed) Client.getInstance().moduleManager.getModuleByClass(Speed.class)).resetHopStage();
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
                    float var8 = RotationHelper.method16816(MathHelper.wrapDegrees(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (MovementUtil.isMoving() && !mc.player.isSneaking() && !this.field23929) {
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

                    if (!MovementUtil.isMoving()) {
                        var6 = 0.0;
                    }

                    if (mc.player.fallDistance < 1.0F) {
                        MovementUtil.setMotionWithTurnLimit(event, var6, var8, var8, 360.0F);
                    }

                    MovementUtil.setPlayerYMotion(event.getY());
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

            this.parent.performTowering(event);
        }
    }

    @EventTarget
    @LowerPriority
    public void onSend(SendPacketEvent event) {
        if (this.isEnabled() && mc.player != null) {
            if (event.getPacket() instanceof CHeldItemChangePacket && ((BlockFly) this.getParent()).lastSpoofedSlot >= 0) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onJump(JumpEvent event) {
        if (this.isEnabled() && this.field23930) {
            if (this.getParent().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MovementUtil.isMoving() || this.getParent().getBooleanValueFromSettingName("Tower while moving"))) {
                event.setCancelled(true);
            }
        }
    }
}
