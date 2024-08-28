package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5175 extends Module {
    public Class5175() {
        super(ModuleCategory.WORLD, "FastBreak", "Break blocks faster");
    }

    @EventTarget
    private void method16107(Class4428 var1) {
        if (this.method15996()) {
            if (field23386.field1337.field31362 > 0.7F) {
                field23386.field1337.field31362 = 1.0F;
            }

            field23386.field1337.field31364 = 0;
        }
    }
}
