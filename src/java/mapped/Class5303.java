package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5303 extends Module {
    public Class5303() {
        super(ModuleCategory.MISC, "PortalGui", "Allows GUIs while in nether portal");
    }

    @EventTarget
    private void method16663(Class4428 var1) {
        if (this.method15996()) {
            field23386.field1339.field5080 = false;
        }
    }
}
