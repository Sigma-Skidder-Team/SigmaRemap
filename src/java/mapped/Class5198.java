package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5198 extends Module {
    public Class5198() {
        super(ModuleCategory.WORLD, "FastPlace", "Allows you to place blocks faster");
        this.method15972(new Class6004("Reduce Delay", "Makes block placement faster, but not too much!", true));
    }

    @EventTarget
    private void method16186(TickEvent var1) {
        if (this.method15996()) {
            if (mc.player.method3090() != null) {
                if (mc.player.method3090().method32107() instanceof Class3292) {
                    if (mc.field1346 instanceof Class8711) {
                        if (!this.method15974("Reduce Delay")) {
                            mc.field1347 = 0;
                        } else {
                            mc.field1347--;
                        }
                    }
                }
            }
        }
    }
}
