package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5269 extends Module {
    public Class5269() {
        super(ModuleCategory.MISC, "AntiLevitation", "Removes levitation effects");
    }

    @EventTarget
    public void method16490(Class4428 var1) {
        if (this.method15996()) {
            field23386.field1339.method3040(Class8254.field35491);
        }
    }
}
