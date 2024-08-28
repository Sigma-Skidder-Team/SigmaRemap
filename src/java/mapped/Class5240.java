package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4417;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5240 extends Module {
    public Class5240() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Step for Vanilla");
        this.method15972(new Class6009<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 10.0F, 0.5F));
    }

    @EventTarget
    private void method16337(Class4417 var1) {
        if (this.method15996() && mc.player != null) {
            if (!var1.method13967()) {
                mc.player.field5051 = this.method15977("Maximum heigh");
            } else {
                mc.player.field5051 = 0.5F;
            }
        }
    }
}
