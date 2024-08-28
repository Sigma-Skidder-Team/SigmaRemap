package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;

public class Class5256 extends PremiumModule {
    public boolean field23643 = false;

    public Class5256() {
        super("BoatFly", "Fly with a boat", ModuleCategory.MOVEMENT);
        this.method15972(new Class6009<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
    }

    @EventTarget
    public void method16416(TickEvent var1) {
        if (this.method15996()) {
            if (mc.field1339.method3421() != null) {
                float var4 = Class9567.method37086();
                float var5 = this.method15977("Speed");
                double var6 = Math.cos(Math.toRadians(var4)) * (double) var5;
                double var8 = Math.sin(Math.toRadians(var4)) * (double) var5;
                if (!Class9567.method37087()) {
                    var6 = 0.0;
                    var8 = 0.0;
                }

                Entity var10 = mc.field1339.method3421();
                var10.field5031 = mc.field1339.field5031;
                var10.method3435(var6, !mc.field1339.field4981 ? (!this.field23643 ? 0.0 : (double) (-var5)) : (double) var5, var8);
            }
        }
    }

    @EventTarget
    private void method16417(Class4430 var1) {
        if (this.method15996()) {
            if (mc.field1339.method3421() != null) {
                if (!mc.field1339.method3421().field5036) {
                    if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                        var1.method13900(true);
                        this.field23643 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16418(Class4426 var1) {
        if (this.method15996()) {
            if (this.field23643 && var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                this.field23643 = false;
            }

            if (mc.field1339.method3421() != null) {
                if (!mc.field1339.method3421().field5036) {
                    if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                        var1.method13900(true);
                        this.field23643 = false;
                    }
                }
            }
        }
    }

    @Override
    public void isInDevelopment() {
        if (!mc.field1299.field44637.method8509()) {
            if (!mc.field1299.field44637.method8509()) {
                this.field23643 = false;
            }
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23643 = true;
        }
    }

    @Override
    public void method15965() {
        mc.field1299.field44637.field13071 = this.field23643;
    }
}
