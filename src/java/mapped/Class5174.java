package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;

public class Class5174 extends Module {
    private int field23464;
    private BlockPos field23465;

    public Class5174() {
        super(ModuleCategory.MOVEMENT, "Spartan", "ClickTP for spartan anticheat");
    }

    @Override
    public void onEnable() {
        this.field23464 = -1;
        this.field23465 = null;
    }

    @Override
    public void onDisable() {
        Class5628.method17725(-0.08);
        double var3 = Class9567.method37075();
        Class9567.method37090(var3);
        mc.timer.field40360 = 1.0F;
    }

    @EventTarget
    private void method16104(ClickEvent var1) {
        if (this.isEnabled() && (mc.player.method3331() || !this.method16004().getBooleanValueFromSetttingName("Sneak"))) {
            if (var1.method13976() == ClickEvent.Button.RIGHT) {
                BlockRayTraceResult var4 = Class9217.method34567(
                        mc.player.rotationYaw, mc.player.rotationPitch, this.method16004().getNumberValueBySettingName("Maximum range")
                );
                BlockPos var5 = null;
                if (var4 != null) {
                    var5 = var4.getPos();
                }

                if (var5 == null) {
                    return;
                }

                this.field23465 = var5;
                mc.getConnection()
                        .sendPacket(
                                new Class5605(
                                        (double) this.field23465.getX() + 0.5, this.field23465.getY() + 1, (double) this.field23465.getZ() + 0.5, true
                                )
                        );
                this.field23464 = 0;
            }
        }
    }

    @EventTarget
    public void method16105(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5473) {
                Class5473 var4 = (Class5473) var1.getPacket();
                if (var4.field24297 == (double) this.field23465.getX() + 0.5
                        && var4.field24298 == (double) (this.field23465.getY() + 1)
                        && var4.field24299 == (double) this.field23465.getZ() + 0.5) {
                    Client.getInstance().getNotificationManager().post(new Notification("ClickTP", "Successfully teleported"));
                    if (!this.method16004().getBooleanValueFromSetttingName("Auto Disable")) {
                        this.field23464 = -1;
                        this.field23465 = null;
                        Class5628.method17725(-0.08);
                        double var5 = Class9567.method37075();
                        Class9567.method37090(var5);
                        mc.timer.field40360 = 1.0F;
                    } else {
                        this.method16004().method16000();
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16106(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.field23464 > -1 && this.field23465 != null) {
                var1.method13995(0.01);
                this.field23464++;
                if (this.field23464 >= 20) {
                    mc.timer.field40360 = 1.4F;
                } else {
                    mc.timer.field40360 = 2.0F;
                }

                mc.getConnection()
                        .sendPacket(new Class5605(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ(), true));
                mc.getConnection()
                        .sendPacket(
                                new Class5605(
                                        (double) this.field23465.getX() + 0.5, this.field23465.getY() + 1, (double) this.field23465.getZ() + 0.5, true
                                )
                        );
            }
        }
    }
}
