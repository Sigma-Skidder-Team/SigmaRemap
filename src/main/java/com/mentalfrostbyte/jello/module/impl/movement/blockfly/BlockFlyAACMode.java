package com.mentalfrostbyte.jello.module.impl.movement.blockfly;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.SafeWalk;
import com.mentalfrostbyte.jello.module.impl.movement.speed.AACSpeed;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.BlockUtils;
import mapped.PositionFacing;
import mapped.RayTraceResult;
import mapped.RotationHelper;
import net.minecraft.block.Blocks;
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
    private float yaw;
    private float pitch;
    private int scaffoldYLevel = 0;
    private int originalHotbarSlot = 0;
    private int hopTicks;
    private int speedStage;

    public BlockFlyAACMode() {
        super(ModuleCategory.MOVEMENT, "AAC", "Places block underneath if it is in hand");
        this.registerSetting(new BooleanSetting("Haphe (AACAP)", "Never let's you touch the ground.", false));
    }

    @Override
    public BlockFly getParent() {
        return (BlockFly) super.getParent();
    }

    @Override
    public void onEnable() {
        this.originalHotbarSlot = mc.player.inventory.currentItem;
        this.yaw = mc.player.rotationYaw;
        this.pitch = mc.player.rotationPitch;
        this.scaffoldYLevel = (int) mc.player.getPosY();
        this.speedStage = -1;
        this.getParent().lastSpoofedSlot = -1;
    }

    @Override
    public void onDisable() {
        if (this.originalHotbarSlot != -1 && this.getParent().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.originalHotbarSlot;
        }

        this.originalHotbarSlot = -1;
        if (this.getParent().lastSpoofedSlot >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            this.getParent().lastSpoofedSlot = -1;
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void onSend(SendPacketEvent event) {
        if (this.isEnabled() && mc.player != null) {
            if (event.getPacket() instanceof CHeldItemChangePacket && this.getParent().lastSpoofedSlot >= 0) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onReceive(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SPlayerPositionLookPacket) {
                this.speedStage = 0;
            }
        }
    }

    @EventTarget
    public void onSafeWalk(SafeWalkEvent event) {
        if (this.isEnabled()) {
            if (mc.player.onGround && Client.getInstance().moduleManager.getModuleByClass(SafeWalk.class).isEnabled()) {
                event.setSafe(true);
            }
        }
    }

    @EventTarget
    private void onFOV(EventFOV event) {
        if (this.isEnabled() && mc.world != null && mc.player != null) {
            if (this.getBooleanValueFromSettingName("Haphe (AACAP)") && MovementUtil.isMoving() && !mc.player.isSprinting()) {
                event.fovModifier *= 1.14F;
            }
        }
    }

    @EventTarget
    public void onJump(JumpEvent event) {
        if (this.isEnabled()) {
            if (this.getParent().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MovementUtil.isMoving() || this.getParent().getBooleanValueFromSettingName("Tower while moving"))) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onMove(EventMove event) {
        if (this.isEnabled()) {
            if (this.getParent().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (!this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                mc.gameSettings.keyBindSprint.pressed = false;
                mc.player.setSprinting(false);
            }

            this.getParent().performTowering(event);

            if (this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                if (!mc.player.onGround || mc.player.moveForward == 0.0F && mc.player.moveStrafing == 0.0F) {
                    if (this.hopTicks >= 0) {
                        this.hopTicks++;
                    }
                } else {
                    this.hopTicks = 0;
                    mc.player.jump();
                    event.setY(0.419998 + (double) MovementUtil.getJumpBoost() * 0.1);
                    if (this.speedStage < 3) {
                        this.speedStage++;
                    }
                }

                if (mc.player.moveForward == 0.0F && mc.player.moveStrafing == 0.0F || mc.player.collidedHorizontally) {
                    this.speedStage = 0;
                }

                double currentSpeed = AACSpeed.getAacHopSpeed(this.hopTicks, this.speedStage, () -> this.speedStage = 0);
                if (this.hopTicks >= 0) {
                    MovementUtil.setMotion(event, currentSpeed);
                }
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void onMotion(EventUpdate event) {
        if (this.isEnabled()) {
            if (!event.isPre()) {
                if (MovementUtil.isMoving() && mc.player.onGround && this.getBooleanValueFromSettingName("Haphe (AACAP)") && !mc.player.isJumping) {
                    mc.player.jump();
                }

                if (!this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                    if (!this.tryPlaceBlockFromRayTrace()) {
                        float var11 = 0.0F;

                        while (var11 < 0.7F && !this.tryPlaceBlockFromRayTrace()) {
                            var11 += 0.1F;
                        }
                    }
                } else {
                    this.tryPlaceBlockFromRayTrace();
                }
            } else {
                double y = mc.player.getPosY();
                if (!mc.player.isJumping && this.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                    y = this.scaffoldYLevel;
                }

                BlockPos below = new BlockPos(mc.player.getPosX(), (double) Math.round(y - 1.0), mc.player.getPosZ());
                List<PositionFacing> targets = getPlacementPath(below);

                if (!targets.isEmpty()) {
                    PositionFacing target = targets.get(targets.size() - 1);
                    BlockRayTraceResult currentHit = BlockUtil.rayTrace(this.yaw, this.pitch, 5.0F);
                    if (!currentHit.getPos().equals(target.blockPos) || !currentHit.getFace().equals(target.direction)) {
                        float[] rots = RotationHelper.getBlockRotations(target.blockPos, target.direction);
                        this.yaw = rots[0];
                        this.pitch = rots[1];
                    }
                }

                event.setYaw(this.yaw);
                event.setPitch(this.pitch);
            }
        }
    }

    private static List<PositionFacing> getPlacementPath(BlockPos startPos) {
        return BlockUtils.findPlacementPath(Blocks.STONE, startPos, (int) mc.playerController.getBlockReachDistance());
    }

    private boolean tryPlaceBlockFromRayTrace() {
        BlockRayTraceResult hit = (BlockRayTraceResult) BlockUtil.rayTraceBlocksFromEye(mc.player.lastReportedYaw, mc.player.lastReportedPitch, BlockUtil.getReachDist(), 0.0F);
        boolean result = false;
        if (hit != null && hit.getType() == RayTraceResult.Type.BLOCK) {
            if (this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
                if (!BlockFly.isPlacableBlockItem(mc.player.getHeldItem(Hand.MAIN_HAND).getItem())) {
                    return false;
                }
            }

            if (this.getBooleanValueFromSettingName("Haphe (AACAP)") && !mc.player.isJumping && !mc.player.onGround) {
                if (hit.getFace() == Direction.UP) {
                    return false;
                }

                if (hit.getPos().getY() != this.scaffoldYLevel - 1) {
                    return false;
                }
            }

            if (hit.getFace() == Direction.UP
                    && (double) (hit.getPos().getY() + 2) > mc.player.getPosY()
                    && BlockUtil.isValidBlockPosition(hit.getPos())) {
                return false;
            }

            if ((double) hit.getPos().getY() == mc.player.getPosY()) {
                return false;
            }

            this.getParent().refillHotbarWithBlocks();
            int previousSlot = mc.player.inventory.currentItem;
            if (!this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
                this.getParent().selectPlaceableHotbarSlot();
            }

            ActionResultType actionResult = mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, hit);
            if (this.getParent().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.getParent().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                mc.player.inventory.currentItem = previousSlot;
            }

            if (actionResult == ActionResultType.SUCCESS) {
                mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));

                if (hit.getFace() == Direction.UP) {
                    this.scaffoldYLevel = hit.getPos().getY() + 2;
                }

                result = true;
            }
        }

        return result;
    }
}
