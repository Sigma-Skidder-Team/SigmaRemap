package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4421;
import com.mentalfrostbyte.jello.event.impl.Class4432;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5215 extends Module {
    public float field23546 = 3.0F;
    public int field23547 = 0;

    public Class5215() {
        super(ModuleCategory.MOVEMENT, "EntitySpeed", "Speed up your rideable entities");
    }

    @Override
    public void method15966() {
    }

    @EventTarget
    public void method16240(Class4432 var1) {
        if (this.method15996()) {
            if (field23386.field1299.field44636.method8509() && !field23386.field1339.method3421().field5036) {
            }

            MovementInput var4 = field23386.field1339.field6131;
            float var5 = var4.field43908;
            float var6 = var4.field43907;
            if (!field23386.field1339.method3421().field5037
                    && !field23386.field1339.method3421().field5036
                    && Class5628.method17730(field23386.field1339.method3421(), 5.0F)
                    && !field23386.field1339.method3421().method3250()
                    && field23386.field1338.method6738(field23386.field1339.method3421().method3432()).method23383() != Class8487.field36413) {
                var1.method13984(-2.0);
            }

            if (field23386.field1339.method3421().method3250()) {
                if (field23386.field1339.method3421().field5037) {
                    var1.method13984(-1.0);
                } else {
                    double var13 = Math.floor(field23386.field1339.method3421().getPosY()) + 0.7725465413369861 - field23386.field1339.method3421().getPosY();
                    var1.method13984(var13 / 2.0);
                }
            }

            if (var5 == 0.0F && var6 == 0.0F) {
                var1.method13982(0.0);
                var1.method13986(0.0);
            } else {
                float var7 = Class9567.method37086();
                double var8 = Math.cos(Math.toRadians(var7));
                double var10 = Math.sin(Math.toRadians(var7));
                this.field23546 = 2.75F;
                float var12 = this.field23546;
                if (field23386.field1339.method3421() instanceof Class1074) {
                    Class1074 var15 = (Class1074) field23386.field1339.method3421();
                    if (var15.field5036 && field23386.field1299.field44636.method8509()) {
                        field23386.field1339.field6140 = 1.0F;
                    }
                }

                var1.method13982(var8 * (double) var12);
                var1.method13986(var10 * (double) var12);
                if (this.field23547 < 2 || !field23386.field1339.method3421().field5036) {
                    field23386.field1339.method3421().field5051 = 0.0F;
                }
            }
        }
    }

    @EventTarget
    public void method16241(Class4396 var1) {
        if (this.method15996()) {
            if (!(var1.method13898() instanceof Class5536)) {
            }
        }
    }

    @EventTarget
    public void method16242(Class4402 var1) {
        if (var1.method13932() instanceof Class5483
                && field23386.field1339.method3421() != null
                && this.field23547++ > 2
                && field23386.field1339.method3421().field5036) {
            field23386.field1339.method3421().field5051 = 1.0F;
        }
    }

    @EventTarget
    public void method16243(Class4421 var1) {
        field23386.field1339.method3421().field5051 = 0.0F;
        this.field23547 = 0;
    }
}
