package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5196 extends Module {
    public Class5196() {
        super(ModuleCategory.WORLD, "AntiCactus", "Prevent you from taking damage from cactus");
        this.method15972(new Class6004("Above", "Avoid damage above cactus also", true));
    }

    @EventTarget
    private void method16182(Class4398 var1) {
        if (this.method15996()) {
            if (field23386.field1338.method6738(var1.method13902()).method23383() instanceof Class3220) {
                var1.method13905(Class8022.method27427(0.0, 0.0, 0.0, 1.0, !this.method15974("Above") ? 0.9375 : 0.999, 1.0));
            }

            if (field23386.field1338.method6738(var1.method13902()).method23383() instanceof Class3399) {
                var1.method13905(Class8022.method27427(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
            }
        }
    }
}
