package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5308 extends Module {
    public Class5308() {
        super(ModuleCategory.MOVEMENT, "Minemen", "Speed for AGC");
    }

    @EventTarget
    @HigherPriority
    public void method16683(Class4435 var1) {
        if (field23386.field1339.field5036) {
            double var4 = 0.3399 + (double) Class9567.method37078() * 0.06;
            if (field23386.field1339.field5055 % 3 == 0) {
                var4 = 0.679 + (double) Class9567.method37078() * 0.12;
            }

            Class9567.method37088(var1, var4);
        }
    }
}
