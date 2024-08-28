package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5321 extends Module {
    public Class5321() {
        super(ModuleCategory.MOVEMENT, "Jetpack", "A jetpack type fly");
    }

    @EventTarget
    public void method16714(Class4428 var1) {
        if (this.method15996()) {
            if (mc.field1339.field4981) {
                mc.field1339.method2914();
            }
        }
    }
}
