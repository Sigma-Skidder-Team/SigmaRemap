package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4427;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.NCPPhase;

public class Class5336 extends ModuleWithModuleSettings {
    public Class5336() {
        super(
                ModuleCategory.MOVEMENT, "Phase", "Allows you to go through blocks", new Class5270(), new NCPPhase(), new Class5284(), new Class5307(), new Class5320()
        );
    }

    @EventTarget
    private void method16751(Class4427 var1) {
        if (this.isEnabled()) {
            var1.method13974(0.0F);
            var1.method13900(true);
        }
    }
}
