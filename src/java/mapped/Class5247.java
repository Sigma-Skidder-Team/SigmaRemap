package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5247 extends Module {
    private int field23617;

    public Class5247() {
        super(ModuleCategory.COMBAT, "Spartan", "AntiKB for spartan antichet");
        this.registerSetting(new NumberSetting<Float>("Ticks", "Ticks delay", 1.0F, Float.class, 1.0F, 6.0F, 1.0F));
    }

    @EventTarget
    private void method16359(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.field23617 < 10) {
                this.field23617++;
                if (this.field23617 == (int) this.getNumberValueBySettingName("Ticks")) {
                    Class9567.method37090(0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16360(Class4396 var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.method13898() instanceof Class5590) {
                Class5590 var4 = (Class5590) var1.method13898();
                if (var4.method17565() == mc.player.method3205()) {
                    this.field23617 = 0;
                }
            }
        }
    }
}
