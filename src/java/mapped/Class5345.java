package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5345 extends Module {
    private Entity field23894;
    private double field23895;

    public Class5345() {
        super(ModuleCategory.COMBAT, "Smooth", "Automatically aims at players");
        this.method15972(new Class6009<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
    }

    @EventTarget
    private void method16765(Class4420 var1) {
        if (this.method15996()) {
            if (!(field23386.field1339.field5032 > 45.0F)) {
                Entity var4 = ((Class5335) this.method16004()).method16750(this.method15977("Range"));
                if (var4 != null) {
                    double var5 = field23386.field1339.field5032 - this.method16766(var4)[1];
                    double var7 = field23386.field1339.field5031 - this.method16766(var4)[0];
                    if (var7 < 0.0) {
                        var7 *= -1.0;
                    }

                    if (var5 < 0.0) {
                        var5 *= -1.0;
                    }

                    double var9 = var4.getPosX() - var4.field5048;
                    double var11 = var4.getPosZ() - var4.field5050;
                    double var13 = var9 * 2.14 + var11 * 2.14;
                    if (var13 < 0.0) {
                        var13 *= -1.0;
                    }

                    double var15 = 0.05 * (double) Minecraft.method1586() * (var13 + 1.0);
                    if (field23386.field1339.field5032 > this.method16766(var4)[1]) {
                        field23386.field1339.field5032 = (float) ((double) field23386.field1339.field5032 - (var15 * var5 / 90.0 + Math.min(0.5, var7)));
                    }

                    if (field23386.field1339.field5032 < this.method16766(var4)[1]) {
                        field23386.field1339.field5032 = (float) ((double) field23386.field1339.field5032 + var15 * var5 / 90.0 + Math.min(0.5, var7));
                    }

                    if (field23386.field1339.field5031 > this.method16766(var4)[0]) {
                        field23386.field1339.field5031 = (float) ((double) field23386.field1339.field5031 - (var15 * var7 / 90.0 + Math.min(0.5, var5)));
                    }

                    if (field23386.field1339.field5031 < this.method16766(var4)[0]) {
                        field23386.field1339.field5031 = (float) ((double) field23386.field1339.field5031 + var15 * var7 / 90.0 + Math.min(0.5, var5));
                    }

                    field23386.field1339.field4967 = field23386.field1339.field5031;
                }
            }
        }
    }

    public float[] method16766(Entity var1) {
        if (field23386.field1345 == null && this.field23894 != null) {
            this.field23895 = Math.random();
        }

        this.field23894 = field23386.field1345;
        double var4 = var1.getPosX() - field23386.field1339.getPosX() + Math.cos((double) (var1.method3142() + 90.0F) * Math.PI / 180.0) * 0.14;
        double var6 = var1.getPosY() - 1.6 - this.field23895 + (double) var1.method3393() - field23386.field1339.getPosY();
        double var8 = var1.getPosZ() - field23386.field1339.getPosZ() + Math.sin((double) (var1.method3142() + 90.0F) * Math.PI / 180.0) * 0.14;
        double var10 = Class9679.method37766(var4 * var4 + var8 * var8);
        float var12 = this.method16767(field23386.field1339.field5031, (float) (Math.atan2(var8, var4) * 180.0 / Math.PI) - 90.0F, 360.0F);
        float var13 = this.method16767(field23386.field1339.field5032, (float) (-(Math.atan2(var6, var10) * 180.0 / Math.PI)), 360.0F);
        return new float[]{var12, var13};
    }

    private float method16767(float var1, float var2, float var3) {
        float var6 = Class9679.method37792(var2 - var1);
        if (var6 > var3) {
            var6 = var3;
        }

        if (var6 < -var3) {
            var6 = -var3;
        }

        return var1 + var6;
    }
}
