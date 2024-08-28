package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5351 extends Module {
    public static int field23907;
    public float field23908;
    public float field23909;

    public Class5351() {
        super(ModuleCategory.COMBAT, "AAC", "Places block underneath");
        this.method15972(new Class6009<Float>("Strengh", "Boost strengh", 0.7F, Float.class, 0.0F, 1.0F, 0.01F));
        field23907 = 20;
    }

    @Override
    public void method15965() {
        field23907 = 20;
    }

    @EventTarget
    private void method16788(Class4435 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (this.method16790()) {
                if (field23907 == 0 && !field23386.field1339.field5036 && field23386.field1339.field4952 > 0 && field23386.field1339.field5045 < 2.0F) {
                    field23386.field1339.method3280(0.0, -1.0, 0.0);
                    Class5628.method17725(field23386.field1339.method3433().method11321());
                    field23386.field1339.field5036 = true;
                    field23907 = 20;
                }
            } else {
                if (field23907 < 7) {
                    field23907++;
                    if (field23907 > 1) {
                        float var4 = Class9567.method37082()[1];
                        float var5 = Class9567.method37082()[2];
                        float var6 = Class9567.method37082()[0];
                        double var7 = Math.cos(Math.toRadians(var6));
                        double var9 = Math.sin(Math.toRadians(var6));
                        double var11 = (double) ((float) (7 - field23907) * this.method15977("Strengh")) * 0.04 * (double) this.field23909 * 0.2;
                        double var13 = ((double) var4 * var7 + (double) var5 * var9) * var11;
                        double var15 = ((double) var4 * var9 - (double) var5 * var7) * var11;
                        float var17 = (float) (Math.atan2(var13, var15) * 180.0 / Math.PI) - 90.0F;
                        float var18 = Class9142.method34143(this.field23908, var17);
                        if (var18 > 100.0F && Class5628.method17686()) {
                            var1.method13993(var1.method13992() + var13);
                            var1.method13997(var1.method13996() + var15);
                        } else {
                            var1.method13993(var1.method13992() * 0.8);
                            var1.method13997(var1.method13996() * 0.8);
                        }

                        Class5628.method17724(var1.method13992());
                        Class5628.method17726(var1.method13996());
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16789(Class4396 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5590) {
                if (this.method16790()) {
                    field23907 = 0;
                    return;
                }

                Class5590 var5 = (Class5590) var4;
                if (var5.method17565() == field23386.field1339.method3205() && (var5.field24801 != 0 || var5.field24803 != 0)) {
                    this.field23909 = (float) (Math.sqrt(var5.field24801 * var5.field24801 + var5.field24803 * var5.field24803) / 1000.0);
                    this.field23908 = (float) (Math.atan2(var5.field24801 / 1000, var5.field24803 / 1000) * 180.0 / Math.PI) - 90.0F;
                    field23907 = 0;
                }
            }

            if (var1.method13898() instanceof Class5515) {
                Class5515 var6 = (Class5515) var4;
            }
        }
    }

    public boolean method16790() {
        return this.method15977("Strengh") == 0.0F;
    }
}
