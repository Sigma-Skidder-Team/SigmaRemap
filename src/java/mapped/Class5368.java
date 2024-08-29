package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;
import java.util.List;

public class Class5368 extends Module {
    private final List<Packet<?>> field23983 = new ArrayList<Packet<?>>();
    private boolean field23984;
    private final Timer field23985 = new Timer();

    public Class5368() {
        super(ModuleCategory.EXPLOIT, "Hypixel", "Disable watchdog.");
    }

    @Override
    public void isInDevelopment() {
        if (!mc.player.field5036) {
            this.field23984 = false;
        } else {
            double var3 = mc.player.getPosX();
            double var5 = mc.player.getPosY();
            double var7 = mc.player.getPosZ();
            this.field23984 = false;
            mc.getConnection().sendPacket(new Class5605(var3, var5 + 0.2, var7, false));
            mc.getConnection().sendPacket(new Class5605(var3, var5 + 0.1, var7, false));
            this.field23984 = true;
            this.field23985.method27120();
            this.field23985.method27118();
            if (!this.method15974("Instant")) {
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Wait 5s..."));
            } else {
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Move where you want"));
            }
        }
    }

    @Override
    public void method15965() {
        this.field23985.method27120();
        this.field23985.method27118();
        if (this.field23984) {
            int var3 = this.field23983.size();

            for (int var4 = 0; var4 < var3; var4++) {
                mc.getConnection().sendPacket(this.field23983.get(var4));
            }

            Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Disabler canceled"));
        }

        this.field23983.clear();
    }

    @EventTarget
    public void method16898(Class4399 var1) {
        if (mc.player != null) {
            if (!this.field23984 && mc.player.field5036) {
                if (!this.method15974("Instant")) {
                    Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Wait 5s..."));
                } else {
                    Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Move where you want"));
                }

                this.field23985.method27120();
                this.field23985.method27118();
                this.field23984 = true;
            }
        }
    }

    @EventTarget
    public void method16899(Class4435 var1) {
        if (mc.player != null) {
            if (!this.method15974("Instant") && this.field23984) {
                var1.method13993(0.0);
                var1.method13995(0.0);
                var1.method13997(0.0);
            }

            if (this.field23985.method27121() > 10000L && this.field23984) {
                this.field23984 = false;
                int var4 = this.field23983.size();

                for (int var5 = 0; var5 < var4; var5++) {
                    mc.getConnection().sendPacket(this.field23983.get(var5));
                }

                this.field23983.clear();
                this.field23985.method27120();
                this.field23985.method27119();
                this.method16004().method16000();
                Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Disabler failed"));
            }
        }
    }

    @EventTarget
    private void method16900(Class4402 var1) {
        if (mc.getConnection() != null) {
            if (this.field23984) {
                if (var1.method13932() instanceof CEntityActionPacket
                        || var1.method13932() instanceof Class5603
                        || var1.method13932() instanceof CUseEntityPacket
                        || var1.method13932() instanceof CAnimateHandPacket
                        || var1.method13932() instanceof Class5555) {
                    if (this.method15974("Instant")) {
                        this.field23983.add(var1.method13932());
                    }

                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    public void method16901(Class4396 var1) {
        if (mc.player != null && this.field23984) {
            if (this.method15996() || this.method15974("Instant")) {
                if (var1.method13898() instanceof Class5473) {
                    this.method16004().method16000();
                    if (!this.method15974("Instant")) {
                        Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "You can do what you want for 5s"));
                    } else {
                        Class5473 var4 = (Class5473) var1.method13898();
                        var1.method13900(true);
                        mc.getConnection()
                                .sendPacket(new Class5604(var4.field24297, var4.field24298, var4.field24299, var4.field24300, var4.field24301, false));
                        int var5 = this.field23983.size();

                        for (int var6 = 0; var6 < var5; var6++) {
                            mc.getConnection().sendPacket(this.field23983.get(var6));
                        }

                        this.field23983.clear();
                        Client.getInstance().getNotificationManager().post(new Notification("Hypixel disabler", "Successfully sent packets"));
                    }

                    this.field23984 = false;
                }
            }
        }
    }
}
