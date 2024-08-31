package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import mapped.*;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.BlockPos;

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
        Class9567.method37090(Class9567.method37075() * 0.7);
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
    public void method16250(Class4435 var1) {
        if (this.isEnabled()
                && !Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class).isEnabled()
                && !ColorUtils.method17684(mc.player)) {
            double var4 = this.getNumberValueBySettingName("OnGround Speed");
            if (!mc.player.onGround) {
                if (mc.player.collidedHorizontally) {
                    this.field23555 = 0.35;
                    this.field23553 = 1;
                }

                if (!ColorUtils.method17686()) {
                    this.field23555 = 0.3;
                }

                this.field23555 -= 0.01;
                if (this.field23555 < 0.3) {
                    this.field23555 = 0.3;
                }

                Class9567.method37088(var1, this.field23555);
            } else {
                if (this.field23552 > 1) {
                    this.field23553 = 0;
                } else {
                    this.field23552++;
                }

                if (this.getBooleanValueFromSetttingName("AutoJump") && ColorUtils.method17686()) {
                    mc.player.method2914();
                    var1.method13995(mc.player.method3433().y);
                }

                if (var1.method13994() == 0.4199998) {
                    Class9567.method37088(var1, 0.0);
                    return;
                }

                if (!this.getBooleanValueFromSetttingName("OnGround")) {
                    return;
                }

                int var6 = this.method16254();
                if (var6 == -1) {
                    Class9567.method37088(var1, 0.2);
                    return;
                }

                Vector3d var7 = new Vector3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
                BlockPos var8 = new BlockPos(mc.player.getPosition()).method8336(0, -1, 0);
                BlockRayTraceResult var9 = new BlockRayTraceResult(var7, Direction.field673, var8, false);
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

                Class9567.method37088(var1, this.field23555);
            }
        }
    }

    @EventTarget
    public void method16251(Class4436 var1) {
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
    public void method16252(RecievePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23553 = 0;
                this.field23555 = 0.0;
            }
        }
    }

    @EventTarget
    public void method16253(Class4434 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.method13988() > 0.2) {
                this.field23555 = this.field23555 - (double) (this.getNumberValueBySettingName("OnGround Speed") / 4.0F);
            }
        }
    }

    private int method16254() {
        if (mc.player.method3090().isEmpty()) {
            this.field23554 = mc.player.inventory.currentItem;
            return this.field23554;
        } else {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.player.field4904.method18131(var3).method18265().isEmpty()) {
                    if (mc.player.inventory.currentItem != var4 && this.field23554 != var4) {
                        mc.getConnection().sendPacket(new CHeldItemChangePacket(var4));
                        this.field23554 = var4;
                    }

                    return var4;
                }
            }

            Class7789.method25870(mc.player.field4904.field25471, 42, 0, Class2259.field14695, mc.player, true);
            if (mc.player.field4904.method18131(42).method18265().isEmpty()
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
