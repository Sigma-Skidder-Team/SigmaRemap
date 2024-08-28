package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5320 extends Module {
    public Class5320() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Vanilla phase");
    }

    @EventTarget
    private void method16711(Class4399 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5037) {
                Class9629 var4 = Class5628.method17760(1.0E-4);
                double var5 = Class8005.method27349() != Class5989.field26129.method18582() ? 1.0E-6 : 0.0625;
                if (((Direction) var4.method37538()).method544() != Class113.field413) {
                    var1.method13914(
                            (double) Math.round((((Vector3d) var4.method37539()).field18050 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method541() * var5
                    );
                } else {
                    var1.method13910(
                            (double) Math.round((((Vector3d) var4.method37539()).field18048 + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).method539() * var5
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16712(Class4435 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5037 || Class5628.method17761()) {
                Class9567.method37088(var1, 0.0);
                Class9567.method37095(1.7);
            }
        }
    }

    @EventTarget
    private void method16713(Class4425 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }
}
