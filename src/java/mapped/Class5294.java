package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5294 extends Module {
    public Class5294() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
    }

    @EventTarget
    private void method16626(Class4415 var1) {
        if (!this.method15996() || mc.player == null) {
        }
    }

    @EventTarget
    private void method16627(Class4430 var1) {
        if (!this.method15996() || mc.player == null) {
        }
    }

    @EventTarget
    private void method16628(ClickEvent var1) {
        if (this.method15996() && mc.player != null) {
            if (var1.method13976() != ClickEvent.Button.LEFT && var1.method13976() != ClickEvent.Button.RIGHT) {
            }
        }
    }
}
