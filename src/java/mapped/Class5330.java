package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5330 extends Class5325 {
    public static int field23887;

    public Class5330() {
        super(ModuleCategory.MOVEMENT, "Step", "Allows you to step up more than 0.5 block", new Class5240(), new Class5372(), new Class5187(), new Class5286());
    }

    @Override
    public void method15965() {
        super.method15965();
        mc.field1339.field5051 = 0.6F;
    }

    @EventTarget
    @Class5631
    private void method16746(Class4434 var1) {
        if (!(var1.method13988() < 0.1)) {
            field23887 = 0;
        }
    }

    @EventTarget
    @Class5631
    private void method16747(Class4399 var1) {
        if (var1.method13921()) {
            field23887++;
        }
    }

    public Class2131 method16748(Class4434 var1) {
        double var4 = mc.field1339.getPosX() + var1.method13991().field18048;
        double var6 = mc.field1339.getPosZ() + var1.method13991().field18050;
        double var8 = 0.41;
        double var10 = var1.method13988() - var1.method13990();
        Class6488 var12 = new Class6488(
                var4 - var8, mc.field1339.field5035.field28450, var6 - var8, var4 + var8, mc.field1339.field5035.field28450 + var10, var6 + var8
        );
        Object[] var13 = mc.field1338.method7055(mc.field1339, var12).toArray();
        int var14 = var13.length;
        Class7380 var15 = null;
        BlockPos var16 = null;
        double var17 = 0.0;

        for (int var19 = 0; var19 < var14; var19++) {
            Class6408 var20 = (Class6408) var13[var19];
            BlockPos var21 = new BlockPos(var20.method19512(Class113.field413), var20.method19512(Class113.field414), var20.method19512(Class113.field415));
            Class7380 var22 = mc.field1338.method6738(var21);
            if (var15 == null || var20.method19514().field28453 > var17) {
                var15 = var22;
                var16 = var21;
                var17 = var20.method19514().field28453;
            }
        }

        if (!mc.field1339.method3250() && !mc.field1339.method3264()) {
            if (var15 != null) {
                if (!mc.field1339.field5036) {
                    if (var15.method23383() instanceof Class3208) {
                        Class6408 var24 = var15.method23412(mc.field1338, var16);
                        if (var24.method19514().field28453 == 1.0) {
                            return Class2131.field13904;
                        }
                    }

                    if (var15.method23383() instanceof Class3421) {
                        return Class2131.field13905;
                    }

                    return Class2131.field13904;
                }

                if (var10 != var1.method13988() && var10 < 0.5) {
                    if (!(var15.method23383() instanceof Class3208)) {
                        if (var15.method23383() instanceof Class3421) {
                            return Class2131.field13905;
                        }
                    } else {
                        Class6408 var23 = var15.method23412(mc.field1338, var16);
                        if (var23.method19514().field28453 == 1.0) {
                            return Class2131.field13906;
                        }
                    }

                    return Class2131.field13906;
                }
            }

            return Class2131.field13906;
        } else {
            return Class2131.field13904;
        }
    }
}
