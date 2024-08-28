package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5159 extends Module {
    private int field23419;
    private int field23420;
    private double field23421;
    private double field23422;
    private boolean field23423;

    public Class5159() {
        super(ModuleCategory.MOVEMENT, "VeltPvP", "A fly for VeltPvP");
        this.method15972(new Class6009<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 5.0F, 0.1F));
    }

    @Override
    public void method15966() {
        this.field23421 = field23386.field1339.getPosY();
        this.field23419 = 0;
        if (!field23386.field1299.field44637.method8509()) {
            if (!field23386.field1299.field44637.method8509()) {
                this.field23423 = false;
            }
        } else {
            field23386.field1299.field44637.field13071 = false;
            this.field23423 = true;
        }
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.0);
        if (field23386.field1339.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    private void method16045(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == field23386.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23423 = true;
            }
        }
    }

    @EventTarget
    private void method16046(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == field23386.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23423 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16047(Class4435 var1) {
        if (this.method15996()) {
            double var4 = (double) this.method15977("Speed");
            if (this.field23419 <= 0) {
                if (this.field23419 != -1) {
                    if (this.field23419 == 0) {
                        if (!field23386.field1299.field44636.method8509() && var1.method13994() > 0.0) {
                            var1.method13995(-Class9567.method37080());
                        }

                        Class5628.method17725(var1.method13994());
                        Class9567.method37088(var1, var4 - 0.1);
                    }
                } else {
                    if (!field23386.field1299.field44636.method8509()) {
                        var1.method13995(!this.field23423 ? Class9567.method37080() : -var4 / 2.0);
                    } else {
                        var1.method13995(!this.field23423 ? var4 / 2.0 : Class9567.method37080());
                        this.field23422 = this.field23421;
                        this.field23421 = !this.field23423 ? field23386.field1339.getPosY() + var1.method13994() : this.field23421;
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
    public void method16048(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23419++;
            if (this.field23419 != 2) {
                if (this.field23419 > 2) {
                    if (this.field23419 >= 20 && this.field23419 % 20 == 0) {
                        double var4 = 150.0 + Math.random() * 150.0;
                        double var6 = -var4;
                        var1.method13912(var6);
                        this.field23420 += 2;
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                double var8 = 150.0 + Math.random() * 150.0;
                double var9 = -var8;
                var1.method13912(var9);
                this.field23420 += 2;
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16049(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (!(var4 instanceof Class5473)) {
                if (var4 instanceof Class5616) {
                    Class5616 var5 = (Class5616) var4;
                    String var6 = var5.method17648().getString();
                    if (this.field23420 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                        this.field23420--;
                        var1.method13900(true);
                    }
                }
            } else {
                Class5473 var7 = (Class5473) var4;
                if (this.field23419 >= 1) {
                    this.field23419 = -1;
                }

                this.field23422 = this.field23421;
                this.field23421 = var7.field24298;
            }
        }
    }

    @EventTarget
    public void method16050(Class4402 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23419 == -1) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16051(Class4422 var1) {
        if (this.method15996()) {
            double var4 = this.field23421;
            field23386.field1339.field5028.field18049 = var4;
            field23386.field1339.field5049 = var4;
            field23386.field1339.field4915 = var4;
            field23386.field1339.field5026 = var4;
        }
    }
}
