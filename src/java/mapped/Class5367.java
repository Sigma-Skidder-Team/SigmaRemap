package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5367 extends Module {
    public Class5367() {
        super(ModuleCategory.COMBAT, "HitSounds", "Changes the player hurting sounds client side.");
    }

    @EventTarget
    @LowerPriority
    private void method16897(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5464) {
                Class5464 var4 = (Class5464) var1.method13898();
                if (var4.method17178(mc.world) == null
                        || !var4.method17178(mc.world).method3066()
                        || var4.method17178(mc.world).method3275(mc.player) > 5.0F
                        || var4.method17178(mc.world) == mc.player) {
                }
            }
        }
    }
}
