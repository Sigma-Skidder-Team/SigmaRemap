package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5247 extends Module {
    private int field23617;

    public Class5247() {
        super(ModuleCategory.COMBAT, "Spartan", "AntiKB for spartan antichet");
        this.method15972(new Class6009<Float>("Ticks", "Ticks delay", 1.0F, Float.class, 1.0F, 6.0F, 1.0F));
    }

    @EventTarget
    private void method16359(TickEvent var1) {
        if (this.method15996()) {
            if (this.field23617 < 10) {
                this.field23617++;
                if (this.field23617 == (int) this.method15977("Ticks")) {
                    Class9567.method37090(0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16360(Class4396 var1) {
        if (this.method15996()) {
            if (mc.field1339 != null && var1.method13898() instanceof Class5590) {
                Class5590 var4 = (Class5590) var1.method13898();
                if (var4.method17565() == mc.field1339.method3205()) {
                    this.field23617 = 0;
                }
            }
        }
    }
}
