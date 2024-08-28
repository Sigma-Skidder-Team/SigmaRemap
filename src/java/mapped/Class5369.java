package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5369 extends Module {
    private int field23986;
    private double field23987;
    private boolean field23988;

    public Class5369() {
        super(ModuleCategory.MOVEMENT, "Reloaded", "A fly for AnticheatReloaded");
        this.method15972(new Class6009<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 8.0F, 0.1F));
        this.method15972(new Class6004("Offset", "Offset while flying", false));
        this.method15972(new Class6004("NoFall", "Avoid getting fall damage when flying down", true));
    }

    @Override
    public void isInDevelopment() {
        this.field23987 = mc.field1339.getPosY();
        this.field23986 = 0;
        if (!mc.field1299.field44637.method8509()) {
            if (!mc.field1299.field44637.method8509()) {
                this.field23988 = false;
            }
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23988 = true;
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
    private void method16902(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23988 = true;
            }
        }
    }

    @EventTarget
    private void method16903(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23988 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16904(Class4435 var1) {
        if (this.method15996()) {
            if (this.field23986 != -1) {
                if (this.field23986 == 0) {
                    if (Math.abs(var1.method13994()) < 0.08) {
                        var1.method13995(!this.method15974("Offset") ? 0.0 : -0.01);
                    }

                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, 0.35);
                }
            } else {
                double var4 = !this.method15974("Offset") ? 0.0 : 0.01;
                if (this.field23988) {
                    var4 -= this.method15977("Speed") / 2.0F;
                }

                if (mc.field1299.field44636.method8509()) {
                    var4 += this.method15977("Speed") / 2.0F;
                }

                var1.method13995(var4);
                Class5628.method17725(var1.method13994());
                Class9567.method37088(var1, this.method15977("Speed"));
            }
        }
    }

    @EventTarget
    public void method16905(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23986++;
            if (this.field23986 != 2) {
                if (this.field23986 > 2 && this.field23986 >= 20 && this.field23986 % 20 == 0) {
                    var1.method13912(-150.0 - Math.random() * 150.0);
                }
            } else {
                var1.method13912(-150.0 - Math.random() * 150.0);
            }

            if (this.method15974("NoFall")) {
                var1.method13920(true);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16906(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23986 >= 1) {
                    this.field23986 = -1;
                }

                this.field23987 = var5.field24298;
                var5.field24300 = mc.field1339.field5031;
                var5.field24301 = mc.field1339.field5032;
            }
        }
    }

    @EventTarget
    public void method16907(Class4402 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13932();
            if (var4 instanceof Class5603) {
                Class5603 var5 = (Class5603) var4;
                if (this.field23986 == -1 && this.method15974("NoFall")) {
                    var5.field24883 = true;
                }
            }
        }
    }

    @EventTarget
    public void method16908(Class4422 var1) {
        if (this.method15996()) {
            double var4 = this.field23987;
            mc.field1339.field5028.field18049 = var4;
            mc.field1339.field5049 = var4;
            mc.field1339.field4915 = var4;
            mc.field1339.field5026 = var4;
        }
    }
}
