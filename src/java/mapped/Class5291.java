package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5291 extends Module {
    private int field23801;

    public Class5291() {
        super(ModuleCategory.EXPLOIT, "VeltPvP", "Disabler for VeltPvP.");
    }

    @Override
    public void method15966() {
        this.field23801 = 0;
    }

    @EventTarget
    public void method16619(Class4399 var1) {
        if (this.method15996() && field23386.field1339 != null && var1.method13921()) {
            this.field23801++;
            double var4 = -0.1;
            if (this.field23801 >= 20) {
                this.field23801 = 0;
                var1.method13912(var4);
                var1.method13920(false);
            }
        }
    }

    @EventTarget
    public void method16620(Class4396 var1) {
        if (!this.method15996()) {
        }
    }
}
