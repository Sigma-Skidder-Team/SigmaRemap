package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5165 extends Module {
    public Class5165() {
        super(ModuleCategory.RENDER, "AntiBlind", "Disables bad visual potion effects");
    }

    @EventTarget
    private void method16067(Class4422 var1) {
        if (this.method15996()) {
            mc.player.method3040(Class8254.field35475);
            mc.player.method3040(Class8254.field35481);
        }
    }
}
