package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.module.impl.movement.Speed;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;

public class BlockFlyHypixelMode extends Module {
    private float targetYaw;
    private float targetPitch;
    private PositionFacing pendingPlace;
    private int originalHotbarSlot = -1;
    private int rotationChangeTicks;
    private int groundTicksSinceLeave;
    private Hand placeHand;
    private BlockFly parentModule = null;
    private boolean isSneakDownwards;
    private boolean allowJumpCancel = false;
    private double lockedY;

    public BlockFlyHypixelMode() {
        super(ModuleCategory.MOVEMENT, "Hypixel", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
        this.registerSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
        this.registerSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
    }

    @Override
    public void initialize() {
        this.parentModule = (BlockFly) this.getParent();
    }

    @Override
    public void onEnable() {
        this.originalHotbarSlot = mc.player.inventory.currentItem;
        this.targetYaw = this.targetPitch = 999.0F;
        ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
        if (mc.gameSettings.keyBindSneak.isKeyDown() && this.getBooleanValueFromSettingName("Downwards")) {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.isSneakDownwards = true;
        }

        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.isSneakDownwards = false;
        }

        this.lockedY = -1.0;
        this.allowJumpCancel = false;
        if (mc.player.onGround) {
            this.lockedY = mc.player.getPosY();
        }

        this.groundTicksSinceLeave = -1;
    }

    @Override
    public void onDisable() {
        if (this.originalHotbarSlot != -1 && this.getParent().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.originalHotbarSlot;
        }

        this.originalHotbarSlot = -1;
        if (((BlockFly) this.getParent()).lastSpoofedSlot >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
        }

        MovementUtil.strafe(MovementUtil.getSpeed() * 0.9);
        mc.timer.timerSpeed = 1.0F;
        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.groundTicksSinceLeave == 0) {
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
                    && (!this.isSneakDownwards || !this.getBooleanValueFromSettingName("Downwards"))) {
                event.setSafe(true);
            }
        }
    }

    @EventTarget
    private void onKey(EventKeyPress event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (event.getKey() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                event.setCancelled(true);
                this.isSneakDownwards = true;
            }
        }
    }

    @EventTarget
    private void onMouse(MouseHoverEvent event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Downwards")) {
            if (event.getMouseButton() == mc.gameSettings.keyBindSneak.keyCode.keyCode) {
                event.setCancelled(true);
                this.isSneakDownwards = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void onMotion(EventUpdate event) {
        if (this.isEnabled() && this.parentModule.countPlaceableBlocks() != 0) {
            ModuleWithModuleSettings flyMod = (ModuleWithModuleSettings) Client.getInstance().moduleManager.getModuleByClass(Fly.class);
            if (!flyMod.isEnabled() || !flyMod.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel") || !flyMod.method16726().getStringSettingValueByName("Bypass").equals("Blink")) {
                if (!event.isPre()) {
                    this.parentModule.refillHotbarWithBlocks();
                    if (this.pendingPlace != null) {
                        BlockRayTraceResult hit = new BlockRayTraceResult(
                                BlockUtil.getRandomizedHitVec(this.pendingPlace.blockPos, this.pendingPlace.direction), this.pendingPlace.direction, this.pendingPlace.blockPos, false
                        );
                        int prevSlot = mc.player.inventory.currentItem;
                        if (!this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.parentModule.selectPlaceableHotbarSlot();
                        }

                        mc.playerController.func_217292_a(mc.player, mc.world, this.placeHand, hit);
                        if (!this.getParent().getBooleanValueFromSettingName("NoSwing")) {
                            mc.player.swingArm(this.placeHand);
                        } else {
                            mc.getConnection().sendPacket(new CAnimateHandPacket(this.placeHand));
                        }

                        if (this.getParent().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.getParent().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            mc.player.inventory.currentItem = prevSlot;
                        }
                    }
                } else {
                    this.rotationChangeTicks++;
                    event.setMoving(true);
                    this.placeHand = Hand.MAIN_HAND;
                    if (BlockFly.isPlacableBlockItem(mc.player.getHeldItem(Hand.OFF_HAND).getItem())
                            && (
                            mc.player.getHeldItem(this.placeHand).isEmpty()
                                    || !BlockFly.isPlacableBlockItem(mc.player.getHeldItem(this.placeHand).getItem())
                    )) {
                        this.placeHand = Hand.OFF_HAND;
                    }

                    double targetX = event.getX();
                    double targetZ = event.getZ();
                    double targetY = event.getY();
                    if (mc.player.getMotion().y < 0.0
                            && mc.player.fallDistance > 1.0F
                            && BlockUtil.rayTrace(0.0F, 90.0F, 3.0F).getType() == RayTraceResult.Type.MISS) {
                        targetY += Math.min(mc.player.getMotion().y * 2.0, 4.0);
                    } else if (this.isSneakDownwards && this.getBooleanValueFromSettingName("Downwards")) {
                        targetY--;
                    } else if ((this.getStringSettingValueByName("Speed Mode").equals("Jump") || this.getStringSettingValueByName("Speed Mode").equals("Cubecraft"))
                            && !mc.gameSettings.keyBindJump.isKeyDown()) {
                        targetY = this.lockedY;
                    }

                    if (!BlockUtil.isValidBlockPosition(
                            new BlockPos(
                                    mc.player.getPositionVec().getX(),
                                    mc.player.getPositionVec().getY() - 1.0,
                                    mc.player.getPositionVec().getZ()
                            )
                    )) {
                        targetX = mc.player.getPositionVec().getX();
                        targetZ = mc.player.getPositionVec().getZ();
                    }

                    BlockPos belowTarget = new BlockPos(targetX, targetY - 1.0, targetZ);
                    if (!BlockUtil.isValidBlockPosition(belowTarget) && this.parentModule.canPlaceWithHand(this.placeHand)) {
                        PositionFacing neighbor = BlockUtil.findPlaceableNeighbor(belowTarget, !this.isSneakDownwards && this.getBooleanValueFromSettingName("Downwards"));
                        this.pendingPlace = neighbor;
                        if (neighbor != null) {
                            float[] rotations = RotationHelper.getBlockPlacementRotations(this.pendingPlace.blockPos, this.pendingPlace.direction);
                            if ((double) neighbor.blockPos.y - mc.player.getPosY() < 0.0) {
                                double dX = mc.player.getPosX()
                                        - ((double) neighbor.blockPos.x + 0.5 + (double) neighbor.direction.getXOffset() / 2.0);
                                double dZ = mc.player.getPosZ()
                                        - ((double) neighbor.blockPos.z + 0.5 + (double) neighbor.direction.getZOffset() / 2.0);
                                double dist = Math.sqrt(dX * dX + dZ * dZ);
                                if (dist < 2.0) {
                                    rotations[0] = mc.player.rotationYaw + 1.0F;
                                    rotations[1] = 90.0F;
                                }
                            }

                            this.targetYaw = rotations[0];
                            this.targetPitch = rotations[1];
                            Rots.rotating = true;
                            Rots.prevPitch = this.targetPitch;
                            Rots.prevYaw = this.targetYaw;
                            event.setYaw(this.targetYaw);
                            event.setPitch(this.targetPitch);
                            Rots.pitch = this.targetPitch;
                            Rots.yaw = this.targetYaw;

                            mc.player.rotationYawHead = this.targetYaw;
                            mc.player.renderYawOffset = this.targetYaw;
                        }
                    } else {
                        if (this.getBooleanValueFromSettingName("KeepRotations") && this.targetPitch != 999.0F) {
                            Rots.rotating = true;
                            Rots.prevPitch = 90.0F;
                            Rots.prevYaw = mc.player.rotationYaw + 1.0F;
                            event.setPitch(90.0F);
                            event.setYaw(mc.player.rotationYaw + 1.0F);
                            Rots.pitch = 90.0F;
                            Rots.yaw = mc.player.rotationYaw + 1.0F;

                            mc.player.rotationYawHead = mc.player.rotationYaw + 1.0F;
                            mc.player.renderYawOffset = mc.player.rotationYaw + 1.0F;
                        }

                        this.pendingPlace = null;
                    }

                    if (mc.player.rotationYaw != event.getYaw() && mc.player.rotationPitch != event.getPitch()) {
                        this.rotationChangeTicks = 0;
                    }
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void onMove(EventMove event) {
        if (this.isEnabled() && this.parentModule.countPlaceableBlocks() != 0) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                this.lockedY = mc.player.getPosY();
            }

            if (this.getParent().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.groundTicksSinceLeave = 0;
            } else if (this.groundTicksSinceLeave >= 0) {
                this.groundTicksSinceLeave++;
            }

            if (this.parentModule == null) {
                this.parentModule = (BlockFly) this.getParent();
            }

            String mode = this.getStringSettingValueByName("Speed Mode");
            switch (mode) {
                case "Jump":
                    if (mc.player.onGround && MovementUtil.isMoving() && !mc.player.isSneaking() && !this.isSneakDownwards) {
                        this.allowJumpCancel = false;
                        mc.player.jump();
                        ((Speed) Client.getInstance().moduleManager.getModuleByClass(Speed.class)).resetHopStage();
                        this.allowJumpCancel = true;
                        event.setY(mc.player.getMotion().y);
                        event.setX(mc.player.getMotion().x);
                        event.setZ(mc.player.getMotion().z);
                    }
                    break;
                case "AAC":
                    if (this.rotationChangeTicks == 0 && mc.player.onGround) {
                        MovementUtil.setMotion(event, MovementUtil.getSpeed() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = RotationHelper.getDirection23(MathHelper.wrapDegrees(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (MovementUtil.isMoving() && !mc.player.isSneaking() && !this.isSneakDownwards) {
                            event.setY(1.00000000000001);
                        }
                    } else if (this.groundTicksSinceLeave == 1) {
                        if (event.getY() <= 0.9) {
                            this.groundTicksSinceLeave = -1;
                        } else {
                            event.setY(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.groundTicksSinceLeave == 2) {
                        if (event.getY() > 0.05) {
                            this.groundTicksSinceLeave = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.groundTicksSinceLeave == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.groundTicksSinceLeave == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.groundTicksSinceLeave == 6) {
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

            this.parentModule.performTowering(event);
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
        if (this.isEnabled() && this.allowJumpCancel) {
            if (this.getParent().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MovementUtil.isMoving() || this.getParent().getBooleanValueFromSettingName("Tower while moving"))) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onRender(Render2DEvent event) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.groundTicksSinceLeave >= 0) {
            if (!(mc.player.fallDistance > 1.2F)) {
                if (!(mc.player.chasingPosY < this.lockedY)) {
                    if (!mc.player.isJumping) {
                        mc.player.positionVec.y = this.lockedY;
                        mc.player.lastTickPosY = this.lockedY;
                        mc.player.chasingPosY = this.lockedY;
                        mc.player.prevPosY = this.lockedY;
                        if (MovementUtil.isMoving()) {
                            mc.player.cameraYaw = 0.099999994F;
                        }
                    }
                }
            }
        }
    }
}