package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.notification.Notification;
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

public class MineplexFly extends PremiumModule {
    private int field23668;
    private int field23669;
    private int field23670;
    private double field23671;
    private double field23672;
    private double field23673;
    private boolean field23674;
    private boolean field23675;

    public MineplexFly() {
        super("Mineplex", "Mineplex fly/longjump", ModuleCategory.MOVEMENT);
        this.registerSetting(new NumberSetting<Float>("Boost", "Boost value", 4.0F, Float.class, 1.0F, 8.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Fake", "Simulate a real fly", false));
    }

    @Override
    public void onEnable() {
        this.field23668 = -1;
        this.field23671 = Class9567.method37075();
        this.field23669 = 0;
        this.field23675 = false;
        this.field23670 = -1;
        this.field23673 = -1.0;
        this.method16461();
    }

    @Override
    public void onDisable() {
        double var3 = Class9567.method37075() * 0.5;
        Class9567.method37090(var3);
        if (this.field23670 != -1) {
            mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
            this.field23670 = mc.player.inventory.currentItem;
        }

        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    public void method16454(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16455(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23673 = this.field23668 = this.field23670 = -1;
            this.field23669 = 0;
            this.field23675 = false;
            this.field23671 = Class9567.method37075();
        }
    }

    public boolean method16456() {
        return this.isEnabled()
                && this.field23670 != -1
                && this.field23671 < (double) this.getNumberValueBySettingName("Boost")
                && (mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F))
                && !this.field23675;
    }

    @EventTarget
    public void method16457(SafeWalkEvent var1) {
        if (this.isEnabled() && this.field23675 && mc.player != null) {
            if (mc.player.onGround) {
                var1.setSafe(true);
            }
        }
    }

    @EventTarget
    public void method16458(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.field23675) {
                Class9567.method37088(var1, 0.01);
            } else {
                float var4 = mc.player.rotationYaw + 90.0F;
                if (!mc.player.onGround && !ColorUtils.method17730(mc.player, 0.001F)) {
                    if (this.field23668 != -1) {
                        if (this.field23674 && !ColorUtils.method17686()) {
                            this.field23674 = !this.field23674;
                            this.field23671 = 0.5;
                        }

                        this.field23669++;
                        this.field23671 *= 0.98;
                        this.field23672 -= 0.04000000000001;
                        if (this.field23669 <= 22) {
                            if (this.field23669 == 10 && this.field23674) {
                                this.field23672 = -0.005;
                            }
                        } else {
                            this.field23672 -= 0.02;
                        }

                        if (this.field23669 > 6 && !ColorUtils.method17686()) {
                            this.field23672 -= 0.05;
                        }

                        var1.method13995(this.field23672);
                        if (mc.player.collidedHorizontally || !ColorUtils.method17686()) {
                            this.field23671 = 0.35;
                        }

                        Class9567.method37088(var1, this.field23671);
                    }
                } else {
                    if (this.field23669 > 0) {
                        Class9567.method37088(var1, 0.0);
                        this.method16004().method16000();
                        return;
                    }

                    if (this.field23668 == -1) {
                        this.field23668 = 0;
                        this.field23671 = 0.35;
                        return;
                    }

                    this.field23668++;
                    int var5 = this.method16461();
                    if (var5 == -1) {
                        return;
                    }

                    Vector3d var6 = new Vector3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
                    BlockPos var7 = new BlockPos(mc.player.getPosition()).method8336(0, -1, 0);
                    BlockRayTraceResult var8 = new BlockRayTraceResult(var6, Direction.field673, var7, false);
                    CPlayerTryUseItemOnBlockPacket var9 = new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var8);
                    mc.getConnection().sendPacket(var9);
                    if (!(this.field23671 < (double) this.getNumberValueBySettingName("Boost"))) {
                        Class9567.method37088(var1, 0.0);
                        mc.player.method2914();
                        this.field23672 = 0.4299999;
                        this.field23669 = 0;
                        this.field23674 = ColorUtils.method17686();
                        var1.method13995(this.field23672);
                        this.field23673 = mc.player.getPosY();
                        this.field23668++;
                        this.field23671 += 0.5;
                    } else {
                        mc.timer.timerSpeed = Math.min(1.0F, Math.max(0.1F, (float) (1.2 - this.field23671 * 0.15)));
                        if (this.field23668 > 2) {
                            this.field23671 += 0.05;
                        }

                        if (this.field23668 % 2 != 0) {
                            var1.method13993(Math.cos(Math.toRadians(var4)) * this.field23671);
                            var1.method13997(Math.sin(Math.toRadians(var4)) * this.field23671);
                        } else {
                            var1.method13993(Math.cos(Math.toRadians(var4 + 180.0F)) * this.field23671);
                            var1.method13997(Math.sin(Math.toRadians(var4 + 180.0F)) * this.field23671);
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16459(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23675 = true;
                Client.getInstance().getNotificationManager().post(new Notification("Mineplex fly", "Please try again"));
            }
        }
    }

    @EventTarget
    public void method16460(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13932() instanceof CHeldItemChangePacket
                    && this.field23670 != -1
                    && this.field23671 < (double) this.getNumberValueBySettingName("Boost")
                    && (mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F))
                    && !this.field23675) {
                var1.method13900(true);
            }
        }
    }

    private int method16461() {
        if (mc.player.method3090().isEmpty()) {
            this.field23670 = mc.player.inventory.currentItem;
            return this.field23670;
        } else {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.player.field4904.method18131(var3).method18265().isEmpty()) {
                    if (mc.player.inventory.currentItem != var4 && this.field23670 != var4) {
                        mc.getConnection().sendPacket(new CHeldItemChangePacket(var4));
                        this.field23670 = var4;
                    }

                    return var4;
                }
            }

            Class7789.method25870(mc.player.field4904.field25471, 42, 0, ClickType.field14695, mc.player, true);
            if (!mc.player.field4904.method18131(42).method18265().isEmpty()) {
                Client.getInstance().getNotificationManager().post(new Notification("Mineplex Fly", "Please empty a slot in your inventory"));
            } else if (mc.player.inventory.currentItem != 6 && this.field23670 != 6) {
                mc.getConnection().sendPacket(new CHeldItemChangePacket(6));
                this.field23670 = 6;
                return 6;
            }

            return -1;
        }
    }

    @EventTarget
    public void method16462(Render2DEvent var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Fake") && !(this.field23673 < 0.0) && !(mc.player.getPosY() < this.field23673)) {
            mc.player.positionVec.y = this.field23673;
            mc.player.lastTickPosY = this.field23673;
            mc.player.field4915 = this.field23673;
            mc.player.prevPosY = this.field23673;
            if (Class9567.method37087()) {
                mc.player.field4909 = 0.099999994F;
            }
        }
    }
}
