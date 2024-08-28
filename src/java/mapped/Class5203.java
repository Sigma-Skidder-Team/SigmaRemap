package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.List;

public class Class5203 extends Module {
    public int field23519 = 0;
    private final List<Packet<?>> field23518 = new ArrayList<Packet<?>>();

    public Class5203() {
        super(ModuleCategory.COMBAT, "Delay", "For anticheats with \"good\" velocity checks");
        this.method15972(new Class6009<Float>("Delay", "Ticks delay", 7.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.method15972(new Class6009<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
        this.method15972(new Class6009<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
    }

    @EventTarget
    private void method16198(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5515) {
                Class5515 var4 = (Class5515) var1.method13898();
                this.field23518.add(var4);
                var1.method13900(true);
            }

            if (mc.field1339 != null && var1.method13898() instanceof Class5590) {
                Class5590 var5 = (Class5590) var1.method13898();
                if (var5.method17565() == mc.field1339.method3205()) {
                    this.field23518.add(var5);
                    var1.method13900(true);
                    if (this.field23519 == 0) {
                        this.field23519 = (int) this.method15977("Delay");
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16199(Class4402 var1) {
        if (this.method15996()) {
            if (var1.method13932() instanceof Class5505) {
                Class5505 var4 = (Class5505) var1.method13932();
                Class1968 var5 = var4.method17316();
                if (var5 != Class1968.field12833) {
                }
            }
        }
    }

    @EventTarget
    private void method16200(Class4428 var1) {
        if (this.field23519 != 0) {
            if (this.field23519 > 0) {
                this.field23519--;
            }
        } else {
            this.method16201();
        }
    }

    private void method16201() {
        for (Packet var4 : this.field23518) {
            if (!(var4 instanceof Class5590)) {
                if (var4 instanceof Class5515) {
                    Class5515 var5 = (Class5515) var4;
                    var5.field24473 = var5.field24473 * this.method15977("H-Multiplier");
                    var5.field24475 = var5.field24475 * this.method15977("H-Multiplier");
                    var5.field24474 = var5.field24474 * this.method15977("V-Multiplier");
                    mc.getClientPlayNetHandler().method15720(var5);
                }
            } else {
                Class5590 var6 = (Class5590) var4;
                var6.field24801 = (int) ((float) var6.field24801 * this.method15977("H-Multiplier"));
                var6.field24803 = (int) ((float) var6.field24803 * this.method15977("H-Multiplier"));
                var6.field24802 = (int) ((float) var6.field24802 * this.method15977("V-Multiplier"));
                mc.getClientPlayNetHandler().method15739(var6);
            }
        }

        this.field23518.clear();
    }
}
