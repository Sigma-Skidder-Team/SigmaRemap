package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5366 extends Module {
    private int field23981;
    private double field23982;

    public Class5366() {
        super(ModuleCategory.MOVEMENT, "Redesky", "Longjump for Redesky.");
        this.method15972(new Class6009<Float>("Boost", "Longjump boost", 1.0F, Float.class, 0.1F, 1.0F, 0.01F));
        this.method15972(new Class6009<Float>("Heigh", "Longjump heigh", 1.0F, Float.class, 0.1F, 1.0F, 0.01F));
        this.method15972(new Class6004("NoFall", "Avoid taking fall damage", true));
    }

    @Override
    public void method15965() {
    }

    @Override
    public void method15966() {
        this.field23981 = 0;
        this.field23982 = 0.0;
    }

    @EventTarget
    public void method16895(Class4435 var1) {
        double var4 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
        if (mc.field1339.field5036) {
            if (this.field23981 > 0) {
                this.field23981 = 0;
                if (this.method16004().method15974("Auto Disable")) {
                    this.method16004().method16000();
                    return;
                }
            } else {
                BlockPos var6 = new BlockPos(mc.field1339.getPosX(), mc.field1339.getPosY() - 0.4, mc.field1339.getPosZ());
                if (this.method16004().method15974("BorderJump") && !Class9217.method34578(var6) && Class5628.method17686()
                        || this.method16004().method15974("Auto Jump") && Class5628.method17686()
                        || var1.method13994() == Class9567.method37080()) {
                    this.field23981 = 1;
                    var1.method13995(Class9567.method37080());
                    Class9567.method37088(var1, 0.55);
                }
            }
        } else if (this.field23981 > 0) {
            this.field23981++;
            double var7 = var4;
            if (this.field23981 < 10) {
                switch (this.field23981) {
                    case 2:
                        var7 = 0.7;
                        break;
                    case 3:
                        var7 = 0.8;
                        break;
                    case 4:
                        var7 = 0.9;
                        break;
                    case 5:
                        var7 = 1.0;
                        break;
                    case 6:
                        var7 = 1.1;
                        break;
                    case 7:
                        var7 = 1.2;
                        break;
                    case 8:
                        var7 = 1.3;
                        break;
                    case 9:
                        var7 = 1.32;
                }

                Class9567.method37088(var1, (double) this.method15977("Boost") * var7);
                var1.method13995((double) this.method15977("Heigh") * Class9567.method37080());
                this.field23982 = 1.0;
            } else if (var1.method13994() < 0.0 && mc.field1339.field5045 < 3.0F) {
                this.field23982 = this.field23982 - var1.method13994();
            }
        }

        Class5628.method17725(var1.method13994());
    }

    @EventTarget
    public void method16896(Class4399 var1) {
        if (this.method15974("NoFall")) {
            if (this.field23982 > 3.0) {
                var1.method13920(true);
                this.field23982 = 0.0;
            }
        }
    }
}
