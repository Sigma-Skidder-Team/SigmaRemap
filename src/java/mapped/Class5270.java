package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5270 extends Module {
    public Class5270() {
        super(ModuleCategory.MOVEMENT, "FullBlock", "Basic phase");
    }

    @EventTarget
    private void method16491(Class4399 var1) {
        if (this.isEnabled() && Class5628.method17761()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16492(Class4435 var1) {
        if (this.isEnabled()) {
            if (!Class5628.method17761()) {
                if (mc.player.collidedHorizontally) {
                    Class9567.method37088(var1, 0.0);
                    Class9567.method37095(1.1920931E-8);
                }
            } else {
                Class9567.method37095(0.617);
            }
        }
    }

    @EventTarget
    private void method16493(Class4425 var1) {
        if (this.isEnabled()) {
            var1.method13900(true);
        }
    }
}
