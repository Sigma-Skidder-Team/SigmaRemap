package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5311 extends Module {
    private int field23845;
    private boolean field23846;
    private boolean field23847;
    private boolean field23848;
    private double field23849;

    public Class5311() {
        super(ModuleCategory.MOVEMENT, "Cubecraft", "Fly for Cubecraft");
        this.method15972(new Class6004("Damage", "Allows you to go infinitly up", false));
    }

    @Override
    public void method15966() {
        this.field23845 = 0;
        if (!mc.field1299.field44637.method8509()) {
            if (!mc.field1299.field44637.method8509()) {
                this.field23846 = false;
            }
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23846 = true;
        }

        if (mc.field1339.field5036) {
            this.field23847 = this.field23848 = false;
        }

        if (!this.method15974("Damage")) {
            this.field23848 = true;
        }
    }

    @Override
    public void method15965() {
        Class5628.method17725(-0.078);
        Class9567.method37090(0.2);
        mc.field1284.field40360 = 1.0F;
        if (this.field23846) {
            mc.field1299.field44637.field13071 = true;
        }
    }

    @EventTarget
    private void method16686(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23846 = true;
            }
        }
    }

    @EventTarget
    private void method16687(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23846 = false;
            }
        }
    }

    @EventTarget
    @Class5631
    public void method16688(Class4435 var1) {
        if (!this.method15996()) {
            if (mc.field1339.field5036) {
                this.field23847 = this.field23848 = false;
            }
        } else if (Class5628.method17718()) {
            if (this.field23845 > 0) {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
                this.field23845++;
            } else {
                if (this.field23845 != 0) {
                    if (this.field23847) {
                        var1.method13995(0.0);
                        Class9567.method37088(var1, Class9567.method37075());
                        if (this.field23845 != -4) {
                            if (this.field23845 != -1) {
                                if (Class8005.method27349() > Class5989.field26129.method18582()) {
                                    if (mc.field1299.field44636.method8509() && !this.field23846) {
                                        var1.method13995(0.0625);
                                        Class9567.method37088(var1, 0.0);
                                        this.field23845 = 1;
                                    } else if (this.field23846 && !mc.field1299.field44636.method8509()) {
                                        var1.method13995(-0.225);
                                        Class9567.method37088(var1, 0.0);
                                        this.field23845 = 1;
                                    }
                                }
                            } else {
                                if (!this.field23848) {
                                    Class5628.method17749(false);
                                    this.field23848 = true;
                                }

                                this.field23845--;
                            }
                        } else if (mc.field1299.field44636.method8509() && !this.field23846) {
                            var1.method13995(0.0625);
                        }
                    }
                } else if (Class8005.method27349() != Class5989.field26129.method18582()) {
                    if (!Class5628.method17730(mc.field1339, 0.001F)) {
                        var1.method13995(0.0);
                        Class9567.method37088(var1, 0.0);
                        if (mc.field1339.field5045 > 4.0F) {
                            mc.getClientPlayNetHandler().sendPacket(new Class5603(true));
                            this.field23848 = true;
                        }
                    } else {
                        var1.method13995(Class9567.method37080());
                        Class9567.method37088(var1, 0.615);
                    }

                    this.field23845 = 1;
                } else if (!Class5628.method17730(mc.field1339, 0.001F)) {
                    var1.method13995(0.0);
                    this.field23845 = -2;
                    Client.getInstance().getNotificationManager().post(new Notification("Cubecraft Fly", "Please start on the ground."));
                } else {
                    Class9567.method37088(var1, 0.0);
                    var1.method13995(0.0);
                    long var14 = Class5628.method17762() % 90L;
                    double var15 = 0.016 + (double) var14 / 10000.0;
                    double var16 = mc.field1339.getPosX();
                    double var10 = mc.field1339.getPosY() + 0.022;
                    double var12 = mc.field1339.getPosZ();
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(var16, var10, var12, false));
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(var16, var10, var12 + 0.07, false));
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(var16, var10, var12, false));
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(var16, var10 + 3.0, var12, false));
                }

                Class5628.method17725(var1.method13994());
            }
        } else {
            Class9567.method37088(var1, Class9567.method37075());
            var1.method13995(0.0);
            if (mc.field1339.field5055 % 2 == 0) {
                double var4 = mc.field1339.getPosX();
                double var6 = mc.field1339.getPosY();
                double var8 = mc.field1339.getPosZ();
                mc.field1339.method3215(var4, var6 + 1.0E-10, var8);
            }
        }
    }

    @EventTarget
    public void method16689(Class4399 var1) {
        if (var1.method13921() && Class5628.method17718()) {
            var1.method13908(true);
            if (Class8005.method27349() == Class5989.field26129.method18582() && this.field23845 == 0 && Class5628.method17730(mc.field1339, 0.001F)) {
                var1.method13900(true);
            }

            if (this.field23845 >= 2) {
                var1.method13912(275.0);
            }
        }
    }

    @EventTarget
    public void method16690(Class4396 var1) {
        if (mc.field1338 != null && mc.getClientPlayNetHandler() != null && Class5628.method17718()) {
            Packet var4 = var1.method13898();
            if (!(var4 instanceof Class5473)) {
                if (var4 instanceof Class5590) {
                    Class5590 var5 = (Class5590) var4;
                    if (var5.method17565() == mc.field1339.method3205()) {
                        this.field23845 = -4;
                    }
                }
            } else {
                Class5473 var20 = (Class5473) var4;
                if (Class8005.method27349() != Class5989.field26129.method18582()) {
                    float[] var6 = Class9567.method37082();
                    float var7 = var6[1];
                    float var8 = var6[2];
                    float var9 = var6[0];
                    double var10 = Math.cos(Math.toRadians(var9));
                    double var12 = Math.sin(Math.toRadians(var9));
                    double var14 = Class9567.method37075();
                    double var16 = ((double) var7 * var10 + (double) var8 * var12) * var14;
                    double var18 = ((double) var7 * var12 - (double) var8 * var10) * var14;
                    this.field23849 = var20.field24298;
                    var20.field24297 += var16;
                    var20.field24299 += var18;
                }

                this.field23847 = true;
                this.field23845 = -1;
            }
        }
    }
}
