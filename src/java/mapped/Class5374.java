package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5374 extends Module {
    private double field23997;

    public Class5374() {
        super(ModuleCategory.COMBAT, "Hover", "Hover criticals");
    }

    @Override
    public void method15966() {
        this.field23997 = 1.0E-11;
    }

    @EventTarget
    public void method16921(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                this.field23997 = 1.0E-11;
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16922(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            boolean var4 = mc.field1346 != null && mc.field1346.method31417() == Class2100.field13690;
            boolean var5 = mc.field1337.method23158() || mc.field1299.field44643.method8509() && var4;
            if (Client.getInstance().method19939().method31329() > 0 && !var5) {
                this.field23997 -= 1.0E-14;
                if (this.field23997 < 0.0 || Class5330.field23887 == 0) {
                    this.field23997 = 1.0E-11;
                }

                var1.method13908(true);
                var1.method13912(var1.method13911() + this.field23997);
                var1.method13920(false);
            } else {
                this.field23997 = 1.0E-11;
            }
        }
    }
}
