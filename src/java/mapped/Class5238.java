package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5238 extends Module {
    private int field23594;
    private int field23595;
    private double field23596;
    private double field23597;
    private boolean field23598;

    public Class5238() {
        super(ModuleCategory.MOVEMENT, "ViperMC", "A fly for ViperMC");
        this.method15972(new Class6009<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 6.0F, 0.1F));
    }

    @Override
    public void isInDevelopment() {
        this.field23596 = mc.field1339.getPosY();
        this.field23594 = 0;
        if (!mc.field1299.field44637.method8509()) {
            if (!mc.field1299.field44637.method8509()) {
                this.field23598 = false;
            }
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23598 = true;
        }
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.0);
        if (mc.field1339.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    private void method16329(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23598 = true;
            }
        }
    }

    @EventTarget
    private void method16330(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23598 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16331(Class4435 var1) {
        if (this.method15996()) {
            double var4 = this.method15977("Speed");
            if (this.field23594 <= 0) {
                if (this.field23594 != -1) {
                    if (this.field23594 == 0) {
                        if (!mc.field1299.field44636.method8509() && var1.method13994() > 0.0) {
                            var1.method13995(-Class9567.method37080());
                        }

                        Class5628.method17725(var1.method13994());
                        Class9567.method37088(var1, Class9567.method37075());
                    }
                } else {
                    if (mc.field1299.field44636.method8509()) {
                        var1.method13995(!this.field23598 ? var4 / 2.0 : Class9567.method37080());
                        this.field23597 = this.field23596;
                        this.field23596 = !this.field23598 ? mc.field1339.getPosY() + var1.method13994() : this.field23596;
                    } else {
                        var1.method13995(this.field23598 && !Class5628.method17730(mc.field1339, 0.01F) ? -var4 / 2.0 : Class9567.method37080());
                        this.field23597 = this.field23596;
                        this.field23596 = this.field23598 && !Class5628.method17730(mc.field1339, 0.01F)
                                ? mc.field1339.getPosY() + var1.method13994()
                                : this.field23596;
                    }

                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, var4);
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16332(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23594++;
            if (this.field23594 != 2) {
                if (this.field23594 > 2) {
                    if (this.field23594 >= 20 && this.field23594 % 20 == 0) {
                        var1.method13912(-150.0 - Math.random() * 150.0);
                        this.field23595 += 2;
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13912(-150.0 - Math.random() * 150.0);
                this.field23595 += 2;
            }

            var1.method13920(true);
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16333(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (!(var4 instanceof Class5473)) {
                if (var4 instanceof Class5616) {
                    Class5616 var5 = (Class5616) var4;
                    String var6 = var5.method17648().getString();
                    if (this.field23595 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                        this.field23595--;
                        var1.method13900(true);
                    }
                }
            } else {
                Class5473 var7 = (Class5473) var4;
                if (this.field23594 >= 1) {
                    this.field23594 = -1;
                }

                this.field23597 = this.field23596;
                this.field23596 = var7.field24298;
                var7.field24300 = mc.field1339.field5031;
                var7.field24301 = mc.field1339.field5032;
            }
        }
    }

    @EventTarget
    public void method16334(Class4402 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23594 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16335(Class4422 var1) {
        if (this.method15996()) {
            double var4 = this.field23596 - this.field23597;
            double var6 = this.field23596;
            mc.field1339.field5028.field18049 = var6;
            mc.field1339.field5049 = var6;
            mc.field1339.field4915 = var6;
            mc.field1339.field5026 = var6;
        }
    }
}
