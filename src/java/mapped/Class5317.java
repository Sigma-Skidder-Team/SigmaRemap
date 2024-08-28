package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5317 extends Module {
    private static int field23862;

    public Class5317() {
        super(ModuleCategory.COMBAT, "AAC 4", "Criticals for aac 4.*");
        this.method15972(new Class6004("KillAura", "Criticals only if KillAura is enabled", false));
    }

    public static boolean method16708() {
        return field23862 == 2;
    }

    @Override
    public void isInDevelopment() {
        field23862 = 0;
    }

    @EventTarget
    @LowerPriority
    private void method16705(Class4434 var1) {
        if (this.method15996() && !(var1.method13988() < 0.625)) {
            field23862 = 0;
        }
    }

    @EventTarget
    private void method16706(Class4436 var1) {
        if (field23862 == 2) {
            var1.method13900(true);
        }
    }

    @EventTarget
    @HigherPriority
    private void method16707(Class4399 var1) {
        if (!this.method15996() || Client.getInstance().getModuleManager().method14662(Class5341.class).method15996()) {
            field23862 = 0;
        } else if (var1.method13921()) {
            if (mc.field1337.method23158()) {
                field23862 = 0;
            }

            boolean var4 = !this.method15974("KillAura") || Class5357.field23948 != null || Class5357.field23949 != null;
            if (mc.field1339.field5036 && mc.field1339.field5038 && var4) {
                field23862++;
                mc.field1339.field6120 = 0.0;
                if (field23862 != 2) {
                    if (field23862 >= 3) {
                        double var5 = 0.001;
                        var1.method13912(var1.method13911() + var5);
                        var1.method13920(false);
                    }
                } else {
                    var1.method13912(var1.method13911() + 0.00101);
                    var1.method13920(false);
                }
            } else {
                field23862 = 0;
            }
        }
    }
}
