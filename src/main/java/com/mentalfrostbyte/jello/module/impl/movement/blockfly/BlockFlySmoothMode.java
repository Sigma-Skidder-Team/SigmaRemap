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
import mapped.ItemUseContext;
import mapped.PositionFacing;
import mapped.RayTraceResult;
import mapped.RotationHelper;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;

public class BlockFlySmoothMode extends Module {
    private float yaw;
    private float pitch;
    private PositionFacing cache;
    private int oldSlot = -1;
    private int aacTicks;
    private int groundTicks;
    private Hand hand;
    private BlockFly parentModule = null;
    private boolean field23977;
    private boolean field23978 = false;
    private double field23979;
    private int field23980 = 0;

    public BlockFlySmoothMode() {
        super(ModuleCategory.MOVEMENT, "Smooth", "Places block underneath");
        this.registerSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
    }

    @Override
    public void initialize() {
        this.parentModule = (BlockFly) this.getParent();
    }

    @Override
    public void onEnable() {
        this.oldSlot = mc.player.inventory.currentItem;
        this.yaw = this.pitch = 999.0F;
        ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
        this.field23979 = -1.0;
        this.field23978 = false;
        if (mc.player.onGround) {
            this.field23979 = mc.player.getPosY();
        }

        this.groundTicks = -1;
    }

    @Override
    public void onDisable() {
        if (this.oldSlot != -1 && this.getParent().getStringSettingValueByName("ItemSpoof").equals("Switch")) {
            mc.player.inventory.currentItem = this.oldSlot;
        }

        this.oldSlot = -1;
        if (((BlockFly) this.getParent()).lastSpoofedSlot >= 0) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            ((BlockFly) this.getParent()).lastSpoofedSlot = -1;
        }

        MovementUtil.strafe(MovementUtil.getSpeed() * 0.9);
        mc.timer.timerSpeed = 1.0F;

        if (this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.groundTicks == 0) {
            MovementUtil.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    public void onSafewalk(SafeWalkEvent event) {
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
            } else if (mc.player.onGround && Client.getInstance().moduleManager.getModuleByClass(SafeWalk.class).isEnabled()) {
                event.setSafe(true);
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void onMotion(EventUpdate event) {
        if (this.isEnabled() && this.parentModule.countPlaceableBlocks() != 0) {
            if (!event.isPre()) {
                if (this.yaw != 999.0F) {
                    this.parentModule.refillHotbarWithBlocks();
                    if (this.cache != null) {
                        BlockRayTraceResult result = RotationHelper.rayTraceBlocksFromRotations(this.yaw, this.pitch, 5.0F, event);
                        if (result.getType() == RayTraceResult.Type.MISS) {
                            return;
                        }

                        if (result.getFace() == Direction.UP
                                && (double) result.getPos().getY() <= mc.player.getPosY() - 1.0
                                && mc.player.onGround) {
                            return;
                        }

                        int var14 = mc.player.inventory.currentItem;
                        if (!this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
                            this.parentModule.selectPlaceableHotbarSlot();
                        }

                        new ItemUseContext(mc.player, Hand.MAIN_HAND, result);

                        mc.playerController.func_217292_a(mc.player, mc.world, this.hand, result);
                        this.cache = null;
                        if (!this.getParent().getBooleanValueFromSettingName("NoSwing")) {
                            mc.player.swingArm(this.hand);
                        } else {
                            mc.getConnection().sendPacket(new CAnimateHandPacket(this.hand));
                        }

                        if (this.getParent().getStringSettingValueByName("ItemSpoof").equals("Spoof") || this.getParent().getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")) {
                            mc.player.inventory.currentItem = var14;
                        }
                    }
                }
            } else {
                this.aacTicks++;
                this.field23980--;
                event.setMoving(true);
                this.hand = Hand.MAIN_HAND;
                if (BlockFly.isPlacableBlockItem(mc.player.getHeldItem(Hand.OFF_HAND).getItem())
                        && (
                        mc.player.getHeldItem(this.hand).isEmpty()
                                || !BlockFly.isPlacableBlockItem(mc.player.getHeldItem(this.hand).getItem())
                )) {
                    this.hand = Hand.OFF_HAND;
                }

                double var4 = event.getX();
                double var6 = event.getZ();
                double var8 = event.getY();
                if (!mc.player.collidedHorizontally && !mc.gameSettings.keyBindJump.pressed) {
                    double[] var10 = BlockUtil.getExtend(getNumberValueBySettingName("Extend"));
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
                if (!BlockUtil.isValidBlockPosition(var18) && this.parentModule.canPlaceWithHand(this.hand) && this.field23980 <= 0) {
                    PositionFacing var11 = BlockUtil.findPlaceableNeighbor(var18, false);
                    this.cache = var11;
                    float[] rots = RotationHelper.getMovementDirectionBlockRotations();
                    if (var11 != null && rots != null) {
                        this.yaw = rots[0];
                        this.pitch = rots[1];
                    }
                } else {
                    this.cache = null;
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
                    this.aacTicks = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void onMove(EventMove event) {
        if (this.isEnabled() && this.parentModule.countPlaceableBlocks() != 0) {
            if (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.01F)) {
                this.field23979 = mc.player.getPosY();
            }

            if (this.getParent().getBooleanValueFromSettingName("No Sprint")) {
                mc.player.setSprinting(false);
            }

            if (mc.player.onGround) {
                this.groundTicks = 0;
            } else if (this.groundTicks >= 0) {
                this.groundTicks++;
            }

            if (this.parentModule == null) {
                this.parentModule = (BlockFly) this.getParent();
            }

            String speedMode = this.getStringSettingValueByName("Speed Mode");
            switch (speedMode) {
                case "Jump":
                    if (mc.player.onGround && MovementUtil.isMoving() && !mc.player.isSneaking() && !this.field23977) {
                        this.field23978 = false;
                        mc.player.jump();
                        ((Speed) Client.getInstance().moduleManager.getModuleByClass(Speed.class)).resetHopStage();
                        this.field23978 = true;
                        event.setY(mc.player.getMotion().y);
                        event.setX(mc.player.getMotion().x);
                        event.setZ(mc.player.getMotion().z);
                    }
                    break;
                case "AAC":
                    if (this.aacTicks == 0 && mc.player.onGround) {
                        MovementUtil.setMotion(event, MovementUtil.getSpeed() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = RotationHelper.getDirection(MathHelper.wrapDegrees(mc.player.rotationYaw));
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        mc.timer.timerSpeed = 1.0F;
                    } else if (mc.player.onGround) {
                        if (MovementUtil.isMoving() && !mc.player.isSneaking() && !this.field23977) {
                            event.setY(1.00000000000001);
                        }
                    } else if (this.groundTicks == 1) {
                        if (event.getY() <= 0.9) {
                            this.groundTicks = -1;
                        } else {
                            event.setY(0.122);
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.groundTicks == 2) {
                        if (event.getY() > 0.05) {
                            this.groundTicks = -1;
                        } else {
                            mc.timer.timerSpeed = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.groundTicks == 3) {
                        mc.timer.timerSpeed = 0.3F;
                        var6 = 2.4;
                    } else if (this.groundTicks == 4) {
                        var6 = 0.28;
                        mc.timer.timerSpeed = 1.0F;
                    } else if (this.groundTicks == 6) {
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
    public void onPacket(SendPacketEvent event) {
        if (this.isEnabled() && mc.player != null) {
            if (event.getPacket() instanceof CHeldItemChangePacket && ((BlockFly) this.getParent()).lastSpoofedSlot >= 0) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onJump(JumpEvent event) {
        if (this.isEnabled() && this.field23978) {
            if (this.getParent().getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!MovementUtil.isMoving() || this.getParent().getBooleanValueFromSettingName("Tower while moving"))) {
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onRender(Render2DEvent event) {
        if (this.isEnabled() && this.getStringSettingValueByName("Speed Mode").equals("Cubecraft") && this.groundTicks >= 0) {
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
}