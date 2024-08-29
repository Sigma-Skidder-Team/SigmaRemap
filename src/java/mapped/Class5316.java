package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5316 extends Module {
    private int field23854;
    private int field23855;
    private double field23856;
    private double field23857;
    private double field23858;
    private double field23859;
    private double field23860;
    private double field23861;

    public Class5316() {
        super(ModuleCategory.MOVEMENT, "Test", "A fly for OmegaCraft");
    }

    @Override
    public void isInDevelopment() {
        this.field23856 = mc.player.getPosX();
        this.field23857 = mc.player.getPosY();
        this.field23858 = mc.player.getPosZ();
        this.field23859 = 0.0;
        this.field23854 = 2;
        this.field23855 = 0;
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }

        mc.timer.field40360 = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16700(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
            if (this.field23854 <= 1) {
                if (this.field23854 != -1) {
                    if (this.field23854 != 0) {
                        if (this.field23854 < 1) {
                        }
                    } else {
                        Class9567.method37088(var1, 0.1);
                    }
                } else {
                    this.field23855++;
                    if (this.field23855 != 1 && this.field23855 % 3 != 0 && this.field23855 % 3 != 1) {
                    }

                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, 1.0);
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16701(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23854++;
            if (this.field23854 != 3) {
                if (this.field23854 > 3) {
                    if (this.field23854 >= 20 && this.field23854 % 20 == 0) {
                        var1.method13912(0.0);
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13912(1000.0);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16702(Class4396 var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23854 >= 1) {
                    this.field23854 = -1;
                }

                this.field23860 = this.field23857;
                this.field23861 = this.field23858;
                this.field23856 = var5.field24297;
                this.field23857 = var5.field24298;
                this.field23858 = var5.field24299;
                var5.field24300 = mc.player.field5031;
                var5.field24301 = mc.player.field5032;
            }
        }
    }

    @EventTarget
    public void method16703(Class4402 var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23854 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16704(Class4422 var1) {
        if (!this.isEnabled()) {
        }
    }
}
