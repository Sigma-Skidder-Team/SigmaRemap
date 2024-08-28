package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5206 extends Module {
    public Class5206() {
        super(ModuleCategory.MOVEMENT, "FastLadder", "Allows you to climp ladders faster");
        this.method15972(new Class6009<Float>("Motion", "Climbing motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
        this.method15972(new Class6005("Down mode", "The way you will go down on ladders", 0, "None", "OnSneak", "Always"));
    }

    @EventTarget
    private void method16217(Class4435 var1) {
        if (this.method15996() && mc.field1339.method3063()) {
            boolean var4 = Class8005.method27349() >= Class5989.field26130.method18582() || mc.method1528() == null;
            if (!mc.field1339.field5037 && (!mc.field1339.field4981 || !var4)) {
                if (this.method15978("Down mode").equals("OnSneak") && mc.field1299.field44637.method8509()
                        || this.method15978("Down mode").equals("Always")) {
                    var1.method13995(-this.method15977("Motion"));
                }
            } else {
                var1.method13995(this.method15977("Motion"));
            }
        }
    }
}
