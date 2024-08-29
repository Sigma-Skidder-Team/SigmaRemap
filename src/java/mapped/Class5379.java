package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5379 extends Module {
    private int field24009;

    public Class5379() {
        super(ModuleCategory.MOVEMENT, "ViperMC", "ViperMC speed");
    }

    @Override
    public void isInDevelopment() {
        this.field24009 = 1;
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.28F);
        mc.timer.field40360 = 1.0F;
    }

    @EventTarget
    public void method16942(Class4435 var1) {
        if (this.isEnabled()) {
            this.field24009++;
            float var4 = 0.28F + (float) Class9567.method37078() * 0.05F;
            if (this.field24009 >= 4) {
                this.field24009 = 0;
                var4 = 1.15F + (float) Class9567.method37078() * 0.04F;
            }

            if (mc.gameSettings.field44634.field13071) {
                var4 /= 1.3F;
            }

            Class9567.method37088(var1, var4);
        }
    }
}
