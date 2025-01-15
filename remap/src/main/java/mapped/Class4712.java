// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public abstract class Class4712<T extends Class759, M extends Class5845<T>> extends Class4710<T, M>
{
    public Class4712(final Class8551 class8551, final M m, final float n) {
        super(class8551, m, n);
    }
    
    public boolean method14004(final T t) {
        if (super.method13991(t)) {
            if (!t.method1879()) {
                if (!t.method1874()) {
                    return false;
                }
                if (t != this.field20283.field35908) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method14005(final T t, final Class6664 class6664, final double n, final double n2, final double n3) {
        if (!super.method13952((T)t, class6664, n, n2, n3)) {
            final Entity method4206 = t.method4206();
            return method4206 != null && class6664.method20261(method4206.method1887());
        }
        return true;
    }
    
    public void method14006(final T t, final float n, final float n2, final Class7351 class7351, final Class7807 class7352, final int n3) {
        super.method13980(t, n, n2, class7351, class7352, n3);
        final Entity method4206 = t.method4206();
        if (method4206 != null) {
            this.method14007(t, n2, class7351, class7352, method4206);
        }
    }
    
    private <E extends Entity> void method14007(final T t, final float n, final Class7351 class7351, final Class7807 class7352, final E e) {
        if (!Class8571.method28955() || !Class9216.field39049) {
            class7351.method22567();
            final double n2 = MathHelper.method35700(n * 0.5f, e.field2399, e.field2401) * 0.017453292f;
            final double n3 = MathHelper.method35700(n * 0.5f, e.field2400, e.field2402) * 0.017453292f;
            double cos = Math.cos(n2);
            double sin = Math.sin(n2);
            double sin2 = Math.sin(n3);
            if (e instanceof Class860) {
                cos = 0.0;
                sin = 0.0;
                sin2 = -1.0;
            }
            final double cos2 = Math.cos(n3);
            final double n4 = MathHelper.method35701(n, e.field2392, e.getPosX()) - cos * 0.7 - sin * 0.5 * cos2;
            final double n5 = MathHelper.method35701(n, e.field2393 + e.method1892() * 0.7, e.getPosY() + e.method1892() * 0.7) - sin2 * 0.5 - 0.25;
            final double n6 = MathHelper.method35701(n, e.field2394, e.getPosZ()) - sin * 0.7 + cos * 0.5 * cos2;
            final double n7 = MathHelper.method35700(n, t.field2951, t.field2952) * 0.017453292f + 1.5707963267948966;
            final double n8 = Math.cos(n7) * t.method1930() * 0.4;
            final double n9 = Math.sin(n7) * t.method1930() * 0.4;
            final double n10 = MathHelper.method35701(n, t.field2392, t.getPosX()) + n8;
            final double method35701 = MathHelper.method35701(n, t.field2393, t.getPosY());
            final double n11 = MathHelper.method35701(n, t.field2394, t.getPosZ()) + n9;
            class7351.method22564(n8, -(1.6 - t.method1931()) * 0.5, n9);
            final float n12 = (float)(n4 - n10);
            final float n13 = (float)(n5 - method35701);
            final float n14 = (float)(n6 - n11);
            final Class4150 method35702 = class7352.method25214(Class6332.method18781());
            final Matrix4f method35703 = class7351.method22569().method32111();
            final float n15 = MathHelper.fastInvSqrt(n12 * n12 + n14 * n14) * 0.025f / 2.0f;
            final float n16 = n14 * n15;
            final float n17 = n12 * n15;
            final int method35704 = this.method13954((T)t, n);
            final int method35705 = this.field20283.method28699(e).method13954(e, n);
            final int method35706 = t.field2391.method6992(Class237.field911, new BlockPos(t.method1747(n)));
            final int method35707 = t.field2391.method6992(Class237.field911, new BlockPos(e.method1747(n)));
            if (Class8571.method28955()) {
                Class9216.method33873();
            }
            method14008(method35702, method35703, n12, n13, n14, method35704, method35705, method35706, method35707, 0.025f, 0.025f, n16, n17);
            method14008(method35702, method35703, n12, n13, n14, method35704, method35705, method35706, method35707, 0.025f, 0.0f, n16, n17);
            if (Class8571.method28955()) {
                Class9216.method33874();
            }
            class7351.method22568();
        }
    }
    
    public static void method14008(final Class4150 class4150, final Matrix4f class4151, final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final float n10, final float n11) {
        for (int i = 0; i < 24; ++i) {
            final float n12 = i / 23.0f;
            final int method1422 = Class392.method1422((int) MathHelper.method35700(n12, (float)n4, (float)n5), (int) MathHelper.method35700(n12, (float)n6, (float)n7));
            method14009(class4150, class4151, method1422, n, n2, n3, n8, n9, 24, i, false, n10, n11);
            method14009(class4150, class4151, method1422, n, n2, n3, n8, n9, 24, i + 1, true, n10, n11);
        }
    }
    
    public static void method14009(final Class4150 class4150, final Matrix4f class4151, final int n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final boolean b, final float n9, final float n10) {
        float n11 = 0.5f;
        float n12 = 0.4f;
        float n13 = 0.3f;
        if (n8 % 2 == 0) {
            n11 *= 0.7f;
            n12 *= 0.7f;
            n13 *= 0.7f;
        }
        final float n14 = n8 / (float)n7;
        final float n15 = n2 * n14;
        final float n16 = n3 * (n14 * n14 + n14) * 0.5f + (n7 - (float)n8) / (n7 * 0.75f) + 0.125f;
        final float n17 = n4 * n14;
        if (!b) {
            class4150.method12444(class4151, n15 + n9, n16 + n5 - n6, n17 - n10).method12439(n11, n12, n13, 1.0f).method12440(n).method12397();
        }
        class4150.method12444(class4151, n15 - n9, n16 + n6, n17 + n10).method12439(n11, n12, n13, 1.0f).method12440(n).method12397();
        if (b) {
            class4150.method12444(class4151, n15 + n9, n16 + n5 - n6, n17 - n10).method12439(n11, n12, n13, 1.0f).method12440(n).method12397();
        }
    }
}
