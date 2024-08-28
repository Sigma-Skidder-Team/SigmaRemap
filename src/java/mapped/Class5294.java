package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.Class4429;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5294 extends Module {
    public Class5294() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
    }

    @EventTarget
    private void method16626(Class4415 var1) {
        if (!this.method15996() || mc.field1339 == null) {
        }
    }

    @EventTarget
    private void method16627(Class4430 var1) {
        if (!this.method15996() || mc.field1339 == null) {
        }
    }

    @EventTarget
    private void method16628(Class4429 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (var1.method13976() != Class2116.field13790 && var1.method13976() != Class2116.field13791) {
            }
        }
    }
}
