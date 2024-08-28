package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5376 extends Module {
    public Class5376() {
        super(ModuleCategory.WORLD, "Timer", "Speeds up the world's timer");
        this.method15972(new Class6009<Float>("Timer", "Timer value", 0.1F, Float.class, 0.1F, 10.0F, 0.1F));
    }

    @EventTarget
    private void method16925(Class4428 var1) {
        if (this.method15996()) {
            field23386.field1284.field40360 = this.method15977("Timer");
        }
    }

    @Override
    public void method15965() {
        field23386.field1284.field40360 = 1.0F;
    }
}
