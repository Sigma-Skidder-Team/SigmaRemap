package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.event.impl.Class4404;
import com.mentalfrostbyte.jello.event.impl.Class4425;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5307 extends Module {
    private int field23843;
    private double field23844;

    public Class5307() {
        super(ModuleCategory.MOVEMENT, "Unfull", "Weird Hypixel VClip for some blocks");
    }

    @EventTarget
    private void method16680(Class4404 var1) {
        if (this.method15996()) {
            if ((int) mc.field1339.getPosY() == this.field23843 && !mc.field1339.field4981) {
                Class5628.method17725(-2.0);
            }

            if (mc.field1339.getPosY() > (double) this.field23843 && mc.field1339.field4981 && !mc.field1339.method3331()) {
                this.field23843++;
            }

            if (mc.field1339.getPosY() % 1.0 == 0.0 && mc.field1339.method3331()) {
                this.field23843--;
            }
        }
    }

    @EventTarget
    private void method16681(Class4398 var1) {
        if (this.method15996()) {
            if (var1.method13903() != null && var1.method13902().getY() == this.field23843 - 1
                    || var1.method13902().getY() == this.field23843
                    || var1.method13902().getY() == this.field23843 + 1 && mc.field1338.method6738(var1.method13902()).method23383() instanceof Class3208
                    || mc.field1338.method6738(var1.method13902()).method23383() instanceof Class3465
                    || mc.field1338.method6738(var1.method13902()).method23383() instanceof Class3421
                    || mc.field1338.method6738(var1.method13902()).method23383() instanceof Class3415
                    || mc.field1338.method6738(var1.method13902()).method23383() instanceof Class3377) {
                var1.method13905(null);
            }
        }
    }

    @EventTarget
    private void method16682(Class4425 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @Override
    public void isInDevelopment() {
        this.field23843 = (int) mc.field1339.getPosY();
        this.field23844 = (double) this.field23843 - mc.field1339.getPosY();
    }
}
