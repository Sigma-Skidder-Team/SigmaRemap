package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5315 extends Module {
    private boolean field23852 = false;
    private boolean field23853;

    public Class5315() {
        super(ModuleCategory.COMBAT, "Minemen", "Minemen Club bypass");
    }

    @Override
    public void isInDevelopment() {
        this.field23852 = false;
        this.field23853 = true;
    }

    @EventTarget
    public void method16697(Class4399 var1) {
        if (var1.method13921()) {
            if (Class5628.method17730(mc.player, 1.0E-5F)) {
                this.field23852 = true;
                var1.method13912(var1.method13911() - 5.0E-7);
                var1.method13920(false);
            } else {
                if (this.field23852 && mc.player.method3433().field18049 < 0.0) {
                    this.field23852 = false;
                    var1.method13920(true);
                }
            }
        }
    }

    @EventTarget
    public void method16698(Class4435 var1) {
        if (this.field23853) {
            if (!mc.player.field5036) {
                if (mc.player.field5045 > 1.0F) {
                    this.field23853 = false;
                }
            } else {
                var1.method13995(Class9567.method37080());
                this.field23853 = false;
            }
        }

        Class5628.method17725(var1.method13994());
    }

    @EventTarget
    private void method16699(Class4396 var1) {
        if (mc.player != null && var1.method13898() instanceof Class5590) {
            Class5590 var5 = (Class5590) var1.method13898();
            if (var5.method17565() == mc.player.method3205() && var5.field24802 < 0 && mc.player.field5036) {
                var1.method13900(true);
            }
        } else if (var1.method13898() instanceof Class5473) {
            Class5473 var4 = (Class5473) var1.method13898();
            this.field23853 = true;
        }
    }
}
