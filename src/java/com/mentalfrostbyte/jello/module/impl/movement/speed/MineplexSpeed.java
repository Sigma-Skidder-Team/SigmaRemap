package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventStep;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;

public class MineplexSpeed extends Module {
    private int field23552;
    private int field23553;
    private int field23554;
    private double field23555;

    public MineplexSpeed() {
        super(ModuleCategory.MOVEMENT, "Mineplex", "Speed for Mineplex");
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
        this.registerSetting(new BooleanSetting("OnGround", "OnGround Speed.", true));
        this.registerSetting(new NumberSetting<Float>("OnGround Speed", "OnGround value.", 0.8F, Float.class, 0.3F, 1.5F, 0.01F));
    }

    @Override
    public void onDisable() {
        MovementUtil.strafe(MovementUtil.getSpeed() * 0.7);
        if (mc.player.inventory.currentItem != this.field23554) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            this.field23554 = mc.player.inventory.currentItem;
        }
    }

    @Override
    public void onEnable() {
        this.field23553 = 0;
        this.field23552 = 0;
        this.field23554 = -1;
        this.field23555 = this.getNumberValueBySettingName("OnGround Speed") / 4.0F;
    }

    @EventTarget
    @HigherPriority
    public void method16250(EventMove var1) {
        if (this.isEnabled()
                && !Client.getInstance().moduleManager.getModuleByClass(BlockFly.class).isEnabled()
                && !MultiUtilities.method17684(mc.player)) {
            double var4 = this.getNumberValueBySettingName("OnGround Speed");
            if (!mc.player.onGround) {
                if (mc.player.collidedHorizontally) {
                    this.field23555 = 0.35;
                    this.field23553 = 1;
                }

                if (!MultiUtilities.method17686()) {
                    this.field23555 = 0.3;
                }

                this.field23555 -= 0.01;
                if (this.field23555 < 0.3) {
                    this.field23555 = 0.3;
                }

                MovementUtil.setSpeed(var1, this.field23555);
            } else {
                if (this.field23552 > 1) {
                    this.field23553 = 0;
                } else {
                    this.field23552++;
                }

                if (this.getBooleanValueFromSettingName("AutoJump") && MultiUtilities.method17686()) {
                    mc.player.jump();
                    var1.setY(mc.player.getMotion().y);
                }

                if (var1.getY() == 0.4199998) {
                    MovementUtil.setSpeed(var1, 0.0);
                    return;
                }

                if (!this.getBooleanValueFromSettingName("OnGround")) {
                    return;
                }

                int var6 = this.method16254();
                if (var6 == -1) {
                    MovementUtil.setSpeed(var1, 0.2);
                    return;
                }

                Vector3d var7 = new Vector3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
                BlockPos var8 = new BlockPos(mc.player.getPosition()).add(0, -1, 0);
                BlockRayTraceResult var9 = new BlockRayTraceResult(var7, Direction.UP, var8, false);
                CPlayerTryUseItemOnBlockPacket var10 = new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var9);
                mc.getConnection().sendPacket(var10);
                this.field23555 += var4 / 4.0;
                if (mc.player.collidedHorizontally) {
                    this.field23555 /= 2.0;
                }

                if (this.field23555 > var4) {
                    this.field23555 = var4;
                }

                if (this.field23555 < 0.3) {
                    this.field23555 = 0.3;
                }

                MovementUtil.setSpeed(var1, this.field23555);
            }
        }
    }

    @EventTarget
    public void method16251(JumpEvent var1) {
        if (this.isEnabled()) {
            this.field23555 = 0.81 + (double) this.field23553 * 0.095;
            if (mc.player.getPosY() != (double) ((int) mc.player.getPosY())) {
                this.field23555 = 0.52;
                this.field23553 = 1;
            }

            this.field23552 = 0;
            if (this.field23553 < 2) {
                this.field23553++;
            }

            var1.method14003(0.0);
            var1.method14002(0.4199998);
            if (mc.player.inventory.currentItem != this.field23554) {
                mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
                this.field23554 = mc.player.inventory.currentItem;
            }
        }
    }

    @EventTarget
    public void method16252(ReceivePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23553 = 0;
                this.field23555 = 0.0;
            }
        }
    }

    @EventTarget
    public void method16253(EventStep var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getHeight() > 0.2) {
                this.field23555 = this.field23555 - (double) (this.getNumberValueBySettingName("OnGround Speed") / 4.0F);
            }
        }
    }

    private int method16254() {
        if (mc.player.getHeldItemMainhand().isEmpty()) {
            this.field23554 = mc.player.inventory.currentItem;
            return this.field23554;
        } else {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.player.container.getSlot(var3).getStack().isEmpty()) {
                    if (mc.player.inventory.currentItem != var4 && this.field23554 != var4) {
                        mc.getConnection().sendPacket(new CHeldItemChangePacket(var4));
                        this.field23554 = var4;
                    }

                    return var4;
                }
            }

            InvManagerUtils.fixedClick(mc.player.container.windowId, 42, 0, ClickType.QUICK_MOVE, mc.player, true);
            if (mc.player.container.getSlot(42).getStack().isEmpty()
                    && mc.player.inventory.currentItem != 6
                    && this.field23554 != 6) {
                mc.getConnection().sendPacket(new CHeldItemChangePacket(6));
                this.field23554 = 6;
                return 6;
            } else {
                return -1;
            }
        }
    }
}
