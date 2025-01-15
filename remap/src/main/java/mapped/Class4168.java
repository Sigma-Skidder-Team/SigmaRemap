// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class4168 extends Class4158<Class490>
{
    public static final Class1932 field18578;
    
    public Class4168(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12476(final Class490 class490, final float n, final Class7351 class491, final Class7807 class492, final int n2, final int n3) {
        final long method6754 = class490.method2186().method6754();
        final List<Class8392> method6755 = class490.method2450();
        int n4 = 0;
        for (int i = 0; i < method6755.size(); ++i) {
            final Class8392 class493 = method6755.get(i);
            method12477(class491, class492, n, method6754, n4, (i != method6755.size() - 1) ? class493.method27976() : 1024, class493.method27975());
            n4 += class493.method27976();
        }
    }
    
    private static void method12477(final Class7351 class7351, final Class7807 class7352, final float n, final long n2, final int n3, final int n4, final float[] array) {
        method12478(class7351, class7352, Class4168.field18578, n, 1.0f, n2, n3, n4, array, 0.2f, 0.25f);
    }
    
    public static void method12478(final Class7351 class7351, final Class7807 class7352, final Class1932 class7353, final float n, final float n2, final long x, final int n3, final int n4, final float[] array, final float n5, final float n6) {
        final int n7 = n3 + n4;
        class7351.method22567();
        class7351.method22564(0.5, 0.0, 0.5);
        final float n8 = Math.floorMod(x, 40L) + n;
        final float n9 = (n4 >= 0) ? (-n8) : n8;
        final float method35686 = MathHelper.method35686(n9 * 0.2f - MathHelper.method35642(n9 * 0.1f));
        final float n10 = array[0];
        final float n11 = array[1];
        final float n12 = array[2];
        class7351.method22567();
        class7351.method22566(Vector3f.YP.rotationDegrees(n8 * 2.25f - 45.0f));
        final float n13 = -n5;
        final float n14 = -n5;
        final float n15 = -1.0f + method35686;
        method12479(class7351, class7352.method25214(Class6332.method18775(class7353, false)), n10, n11, n12, 1.0f, n3, n7, 0.0f, n5, n5, 0.0f, n13, 0.0f, 0.0f, n14, 0.0f, 1.0f, n4 * n2 * (0.5f / n5) + n15, n15);
        class7351.method22568();
        final float n16 = -n6;
        final float n17 = -n6;
        final float n18 = -n6;
        final float n19 = -n6;
        final float n20 = -1.0f + method35686;
        method12479(class7351, class7352.method25214(Class6332.method18775(class7353, true)), n10, n11, n12, 0.125f, n3, n7, n16, n17, n6, n18, n19, n6, n6, n6, 0.0f, 1.0f, n4 * n2 + n20, n20);
        class7351.method22568();
    }
    
    private static void method12479(final Class7351 class7351, final Class4150 class7352, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14, final float n15, final float n16, final float n17, final float n18) {
        final Class8996 method22569 = class7351.method22569();
        final Matrix4f method22570 = method22569.method32111();
        final Matrix3f method22571 = method22569.method32112();
        method12480(method22570, method22571, class7352, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n15, n16, n17, n18);
        method12480(method22570, method22571, class7352, n, n2, n3, n4, n5, n6, n13, n14, n11, n12, n15, n16, n17, n18);
        method12480(method22570, method22571, class7352, n, n2, n3, n4, n5, n6, n9, n10, n13, n14, n15, n16, n17, n18);
        method12480(method22570, method22571, class7352, n, n2, n3, n4, n5, n6, n11, n12, n7, n8, n15, n16, n17, n18);
    }
    
    private static void method12480(final Matrix4f class6789, final Matrix3f class6790, final Class4150 class6791, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14) {
        method12481(class6789, class6790, class6791, n, n2, n3, n4, n6, n7, n8, n12, n13);
        method12481(class6789, class6790, class6791, n, n2, n3, n4, n5, n7, n8, n12, n14);
        method12481(class6789, class6790, class6791, n, n2, n3, n4, n5, n9, n10, n11, n14);
        method12481(class6789, class6790, class6791, n, n2, n3, n4, n6, n9, n10, n11, n13);
    }
    
    private static void method12481(final Matrix4f class6789, final Matrix3f class6790, final Class4150 class6791, final float n, final float n2, final float n3, final float n4, final int n5, final float n6, final float n7, final float n8, final float n9) {
        class6791.method12444(class6789, n6, (float)n5, n7).method12439(n, n2, n3, n4).method12391(n8, n9).method12441(Class1904.field10335).method12440(15728880).method12445(class6790, 0.0f, 1.0f, 0.0f).method12397();
    }
    
    public boolean method12482(final Class490 class490) {
        return true;
    }
    
    static {
        field18578 = new Class1932("textures/entity/beacon_beam.png");
    }
}
