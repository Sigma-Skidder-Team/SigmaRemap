package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4427;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5186 extends Module {
    public Class5186() {
        super(ModuleCategory.RENDER, "LowFire", "Makes the fire transparent when you're burning");
    }

    @EventTarget
    public void method16144(Class4427 var1) {
        if (this.isEnabled()) {
            var1.method13974(0.14F);
        }
    }
}
