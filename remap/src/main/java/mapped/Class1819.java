// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class1819 extends Class1799<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>
{
    private static String[] field9999;
    
    public Class1819(final Class4778<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>> class4778) {
        super(class4778);
    }
    
    public void method6584(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final AbstractClientPlayerEntity class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (class7353.method4094()) {
            if (!class7353.method1823()) {
                if (class7353.method2895(Class189.field610)) {
                    if (class7353.method4098() != null) {
                        if (class7353.method2718(Class2215.field13604).getItem() != Items.field31584) {
                            class7351.method22567();
                            class7351.method22564(0.0, 0.0, 0.125);
                            final double n8 = MathHelper.lerp(n4, class7353.field3015, class7353.field3018) - MathHelper.lerp(n4, class7353.prevPosX, class7353.getPosX());
                            final double n9 = MathHelper.lerp(n4, class7353.field3016, class7353.field3019) - MathHelper.lerp(n4, class7353.prevPosY, class7353.getPosY());
                            final double n10 = MathHelper.lerp(n4, class7353.field3017, class7353.field3020) - MathHelper.lerp(n4, class7353.prevPosZ, class7353.getPosZ());
                            final float n11 = class7353.field2952 + (class7353.field2951 - class7353.field2952);
                            final double n12 = MathHelper.sin(n11 * 0.017453292f);
                            final double n13 = -MathHelper.cos(n11 * 0.017453292f);
                            float method35653 = MathHelper.clamp((float)n9 * 10.0f, -6.0f, 32.0f);
                            float method35654 = MathHelper.clamp((float)(n8 * n12 + n10 * n13) * 100.0f, 0.0f, 150.0f);
                            final float method35655 = MathHelper.clamp((float)(n8 * n13 - n10 * n12) * 100.0f, -20.0f, 20.0f);
                            if (method35654 < 0.0f) {
                                method35654 = 0.0f;
                            }
                            if (method35654 > 165.0f) {
                                method35654 = 165.0f;
                            }
                            if (method35653 < -5.0f) {
                                method35653 = -5.0f;
                            }
                            float n14 = method35653 + MathHelper.sin(MathHelper.method35700(n4, class7353.prevDistanceWalkedModified, class7353.distanceWalkedModified) * 6.0f) * 32.0f * MathHelper.method35700(n4, class7353.field3012, class7353.field3013);
                            if (class7353.method1814()) {
                                n14 += 25.0f;
                                class7351.method22564(0.0, 0.1420000046491623, -0.017799999564886093);
                            }
                            class7351.method22566(Vector3f.XP.rotationDegrees(6.0f + method35654 / 2.0f + n14));
                            class7351.method22566(Vector3f.ZP.rotationDegrees(method35655 / 2.0f));
                            class7351.method22566(Vector3f.YP.rotationDegrees(180.0f - method35655 / 2.0f));
                            ((Class1799<T, Class5860>)this).method6559().method17594(class7351, class7352.method25214(Class6332.method18767(class7353.method4098())), n, Class1904.field10335);
                            class7351.method22568();
                        }
                    }
                }
            }
        }
    }
}
