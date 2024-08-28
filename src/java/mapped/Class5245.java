package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5245 extends Module {
    private int field23610;
    private double field23611;

    public Class5245() {
        super(ModuleCategory.COMBAT, "Gomme", "AntiKB for GommeHD");
        this.method15972(new Class6009<Float>("Delay", "Boost delay", 0.5F, Float.class, 0.0F, 1.0F, 0.01F));
        this.method15972(new Class6009<Float>("Boost", "Boost strengh", 0.1F, Float.class, 0.05F, 0.25F, 0.01F));
    }

    @EventTarget
    private void method16350(Class4418 var1) {
        this.field23610 = 0;
    }

    @EventTarget
    private void method16351(Class4435 var1) {
        double var4 = this.field23611 * (double) (1.0F - this.method15977("Delay")) - this.field23611 / 2.0;
        if (mc.field1339.field5036 && this.field23610 <= 0) {
        }

        if (this.field23610 == 1 && var1.method13994() < var4) {
            this.field23610++;
            var1.method13993(var1.method13992() * 0.5);
            var1.method13997(var1.method13996() * 0.5);
        } else if (this.field23610 == 2) {
            this.field23610++;
            Class9567.method37088(var1, this.method15977("Boost"));
        }
    }

    @EventTarget
    private void method16352(Class4396 var1) {
        if (var1.method13898() instanceof Class5590) {
            Class5590 var4 = (Class5590) var1.method13898();
            if (var4.method17565() == mc.field1339.method3205()) {
                this.field23610 = 1;
                this.field23611 = (double) var4.method17567() / 8000.0;
            }
        }
    }
}
