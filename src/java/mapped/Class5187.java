package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4417;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5187 extends Module {
    public Class5187() {
        super(ModuleCategory.MOVEMENT, "AAC", "Step for AAC");
    }

    @EventTarget
    @LowerPriority
    private void method16145(Class4434 var1) {
        if (this.method15996() && !var1.isCancelled()) {
            double var4 = var1.method13988();
            if (!Class5628.method17730(mc.field1339, 1.0E-4F)) {
                var1.method13900(true);
            } else {
                if (!Class9567.method37081() && var4 >= 0.625) {
                    double var6 = mc.field1339.getPosX();
                    double var8 = mc.field1339.getPosY();
                    double var10 = mc.field1339.getPosZ();
                    if (var4 < 1.1) {
                        double[] var12 = new double[]{0.41999998688698 * var4, 0.754 * var4};

                        for (double var16 : var12) {
                            mc.getClientPlayNetHandler().sendPacket(new Class5605(var6, var8 + var16, var10, false));
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16146(Class4417 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (!var1.method13967()) {
                mc.field1339.field5051 = 1.0F;
            } else {
                mc.field1339.field5051 = 0.5F;
            }
        }
    }
}
