package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import mapped.*;

public class Class5259 extends PremiumModule {
    private boolean field23651;
    private int field23652;
    private int field23653;

    public Class5259() {
        super("NCP", "Phase for NCP anticheat", ModuleCategory.MOVEMENT);
        this.method15972(new Class6004("Hypixel", "Hypixel bypass", true));
    }

    @Override
    public void method15966() {
        this.field23651 = false;
        if (!mc.field1339.field5037) {
            this.field23652 = -1;
        } else {
            this.field23652 = 0;
            if (mc.field1339.field5036) {
                double var3 = mc.field1339.getPosX();
                double var5 = mc.field1339.getPosY();
                double var7 = mc.field1339.getPosZ();
                mc.getClientPlayNetHandler().sendPacket(new Class5605(var3, var5 + 0.0626, var7, false));
            }
        }
    }

    @EventTarget
    private void method16426(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            if (mc.field1299.field44637.method8509()) {
                double var4 = mc.field1339.getPosX();
                double var6 = mc.field1339.getPosY();
                double var8 = mc.field1339.getPosZ();
                if (!Class5628.method17686()) {
                    if (Class5628.method17730(mc.field1339, 0.001F) && !Class5628.method17761()) {
                        mc.field1339.method3215(var4, var6 - 1.0, var8);
                        var1.method13912(var6 - 1.0);
                        var1.method13908(true);
                        var1.method13918(var1.method13917() + 10.0F);
                        Class5628.method17725(0.0);
                    } else if (mc.field1339.getPosY() == (double) ((int) mc.field1339.getPosY())) {
                        mc.field1339.method3215(var4, var6 - 0.3, var8);
                    }
                }
            }

            if (this.field23652 > 0 && this.field23651 && Class5628.method17761()) {
                this.field23653++;
                float var10 = (float) Math.sin(this.field23653) * 5.0F;
                float var11 = (float) Math.cos(this.field23653) * 5.0F;
                var1.method13918(var1.method13917() + var10);
                var1.method13916(var1.method13915() + var11);
            } else if (this.field23652 < 0) {
                return;
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16427(Class4435 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5037 && this.field23652 != 0) {
                this.field23652 = 0;
                if (mc.field1339.field5036) {
                    double var4 = mc.field1339.getPosX();
                    double var6 = mc.field1339.getPosY();
                    double var8 = mc.field1339.getPosZ();
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(var4, var6 + 0.0626, var8, false));
                }
            }

            if (this.field23652 >= 0) {
                if (this.field23652 != 0) {
                    if (!Class5628.method17761()) {
                        this.field23651 = false;
                        Class9567.method37088(var1, 0.0);
                        return;
                    }

                    if (!this.field23651) {
                        Class9567.method37088(var1, !this.method15974("Hypixel") ? 0.0031 : 0.03);
                    } else {
                        Class9567.method37088(var1, 0.617);
                    }
                } else {
                    Class9567.method37088(var1, 0.0);
                    Class9567.method37095(6.000000238415E-4);
                }

                this.field23652++;
            }
        }
    }

    @EventTarget
    private void method16428(Class4425 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16429(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                var5.field24300 = mc.field1339.field5031;
                var5.field24301 = mc.field1339.field5032;
                this.field23651 = true;
            }
        }
    }
}
