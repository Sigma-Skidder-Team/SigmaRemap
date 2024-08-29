package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5226 extends Module {
    public Class5226() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Highjump for minecraft vanilla");
        this.registerSetting(new Class6009<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
    }

    @EventTarget
    public void method16273(Class4436 var1) {
        if (this.method15996()) {
            var1.method14002(this.method15977("Motion"));
        }
    }
}
