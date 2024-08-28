package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5310 extends Module {
    public Class5310() {
        super(ModuleCategory.RENDER, "NoHurtCam", "Disables the hurt animation");
    }

    @EventTarget
    private void method16685(Class4422 var1) {
        if (this.method15996()) {
            field23386.field1339.field4952 = 0;
        }
    }
}
