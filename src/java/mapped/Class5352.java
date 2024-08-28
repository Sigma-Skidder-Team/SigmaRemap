package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5352 extends Module {
    private int field23910;
    private boolean field23911;

    public Class5352() {
        super(ModuleCategory.MOVEMENT, "LibreCraft", "A fly for LibreCraft");
        this.method15972(new Class6009<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 10.0F, 0.1F));
    }

    @Override
    public void method15966() {
        this.field23910 = 0;
        if (!mc.field1299.field44637.method8509()) {
            if (!mc.field1299.field44637.method8509()) {
                this.field23911 = false;
            }
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23911 = true;
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
    private void method16791(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23911 = true;
            }
        }
    }

    @EventTarget
    private void method16792(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23911 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16793(Class4435 var1) {
        if (this.method15996()) {
            if (this.field23910 <= 0) {
                if (this.field23910 != -1) {
                    if (this.field23910 == 0) {
                        var1.method13995(0.0);
                        Class5628.method17725(var1.method13994());
                        Class9567.method37088(var1, 0.35);
                    }
                } else {
                    var1.method13995(0.299);
                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, this.method15977("Speed"));
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16794(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23910++;
            if (this.field23910 != 2) {
                if (this.field23910 > 2) {
                    if (this.field23910 >= 20 && this.field23910 % 20 == 0) {
                        var1.method13912(0.1);
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13912(0.1);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16795(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (mc.field1339 != null && var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23910 >= 1) {
                    this.field23910 = -1;
                }

                var5.field24300 = mc.field1339.field5031;
                var5.field24301 = mc.field1339.field5032;
            }
        }
    }
}
