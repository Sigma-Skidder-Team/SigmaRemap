package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5220 extends Module {
    public Class5220() {
        super(ModuleCategory.EXPLOIT, "Null", "Makes you invisible for the anticheat.");
        this.registerSetting(new BooleanSetting("Inv Bypass", "Avoid inventory glitchs on some servers", false));
    }

    @EventTarget
    public void method16255(Class4396 var1) {
        if (this.method15996() && mc.getCurrentServerData() != null) {
            if (!(var1.method13898() instanceof Class5554)) {
                if (var1.method13898() instanceof Class5542) {
                    Class5542 var4 = (Class5542) var1.method13898();
                    if (var4.method17422() < 0 || !this.method15974("Inv Bypass")) {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13900(true);
            }
        }
    }
}
