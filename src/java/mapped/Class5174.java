package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4429;
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
    public void method15966() {
        this.field23464 = -1;
        this.field23465 = null;
    }

    @Override
    public void method15965() {
        Class5628.method17725(-0.08);
        double var3 = Class9567.method37075();
        Class9567.method37090(var3);
        mc.field1284.field40360 = 1.0F;
    }

    @EventTarget
    private void method16104(Class4429 var1) {
        if (this.method15996() && (mc.field1339.method3331() || !this.method16004().method15974("Sneak"))) {
            if (var1.method13976() == Class2116.field13791) {
                Class8711 var4 = Class9217.method34567(
                        mc.field1339.field5031, mc.field1339.field5032, this.method16004().method15977("Maximum range")
                );
                BlockPos var5 = null;
                if (var4 != null) {
                    var5 = var4.method31423();
                }

                if (var5 == null) {
                    return;
                }

                this.field23465 = var5;
                mc.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(
                                        (double) this.field23465.method8304() + 0.5, this.field23465.getY() + 1, (double) this.field23465.method8306() + 0.5, true
                                )
                        );
                this.field23464 = 0;
            }
        }
    }

    @EventTarget
    public void method16105(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5473) {
                Class5473 var4 = (Class5473) var1.method13898();
                if (var4.field24297 == (double) this.field23465.method8304() + 0.5
                        && var4.field24298 == (double) (this.field23465.getY() + 1)
                        && var4.field24299 == (double) this.field23465.method8306() + 0.5) {
                    Client.getInstance().getNotificationManager().post(new Notification("ClickTP", "Successfully teleported"));
                    if (!this.method16004().method15974("Auto Disable")) {
                        this.field23464 = -1;
                        this.field23465 = null;
                        Class5628.method17725(-0.08);
                        double var5 = Class9567.method37075();
                        Class9567.method37090(var5);
                        mc.field1284.field40360 = 1.0F;
                    } else {
                        this.method16004().method16000();
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16106(Class4435 var1) {
        if (this.method15996()) {
            if (this.field23464 > -1 && this.field23465 != null) {
                var1.method13995(0.01);
                this.field23464++;
                if (this.field23464 >= 20) {
                    mc.field1284.field40360 = 1.4F;
                } else {
                    mc.field1284.field40360 = 2.0F;
                }

                mc.getClientPlayNetHandler()
                        .sendPacket(new Class5605(mc.field1339.getPosX(), mc.field1339.getPosY(), mc.field1339.getPosZ(), true));
                mc.getClientPlayNetHandler()
                        .sendPacket(
                                new Class5605(
                                        (double) this.field23465.method8304() + 0.5, this.field23465.getY() + 1, (double) this.field23465.method8306() + 0.5, true
                                )
                        );
            }
        }
    }
}
