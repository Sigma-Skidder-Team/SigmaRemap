package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5161 extends Module {
    public Class5161() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Vanilla speed");
        this.registerSetting(new Class6009<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16056(Class4435 var1) {
        if (this.method15996()) {
            double var4 = Class9567.method37075() * (double) this.method15977("Speed");
            Class9567.method37088(var1, var4);
        }
    }
}
