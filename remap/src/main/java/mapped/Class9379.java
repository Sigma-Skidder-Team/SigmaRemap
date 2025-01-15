// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class9379
{
    private static String[] field40211;
    public static Class869 field40212;
    private static final int field40213;
    private static final int field40214;
    private static final int field40215;
    private static final int field40216;
    private static final int field40217;
    private static final long field40218;
    private static final long field40219;
    private static final long field40220;
    public static double field40221;
    public static double field40222;
    public static double field40223;
    public static float field40224;
    
    public static long method34821(final BlockPos class354) {
        return ((long)class354.getX() & Class9379.field40218) << Class9379.field40217 | ((long)class354.getY() & Class9379.field40219) << Class9379.field40216 | ((long)class354.getZ() & Class9379.field40220) << 0;
    }
    
    public static void method34822(float n, float n2, float n3, final float n4) {
        final float n5 = n * n + n2 * n2 + n3 * n3;
        if (n5 >= 1.0E-4f) {
            float method35640 = MathHelper.method35640(n5);
            if (method35640 < 1.0f) {
                method35640 = 1.0f;
            }
            final float n6 = n4 / method35640;
            n *= n6;
            n2 *= n6;
            n3 *= n6;
            final float method35641 = MathHelper.sin(Class9379.field40212.field4684.field2399 * 0.017453292f);
            final float method35642 = MathHelper.cos(Class9379.field40212.field4684.field2399 * 0.017453292f);
            Class9379.field40221 += n * method35642 - n3 * method35641;
            Class9379.field40222 += n2;
            Class9379.field40223 += n3 * method35642 + n * method35641;
        }
    }
    
    public static void method34823(final float n, final float n2, final float n3) {
        if (Class9379.field40212.field4684.method2749() || Class9379.field40212.field4684.method1919()) {
            if (Class9379.field40212.field4684.method1706()) {
                final double field2396 = Class9379.field40212.field4684.field2396;
                float method34827 = method34827();
                float n4 = 0.02f;
                float n5 = (float)Class8742.method30210(Class9379.field40212.field4684);
                if (n5 > 3.0f) {
                    n5 = 3.0f;
                }
                if (!Class9379.field40212.field4684.field2404) {
                    n5 *= 0.5f;
                }
                if (n5 > 0.0f) {
                    method34827 += (0.54600006f - method34827) * n5 / 3.0f;
                    n4 += (Class9379.field40212.field4684.method2732() - n4) * n5 / 3.0f;
                }
                method34822(n, n2, n3, n4);
                method34825(Class9379.field40221, Class9379.field40222, Class9379.field40223);
                Class9379.field40221 *= method34827;
                Class9379.field40222 *= 0.800000011920929;
                Class9379.field40223 *= method34827;
                if (!Class9379.field40212.field4684.method1698()) {
                    Class9379.field40222 -= 0.02;
                }
                if (Class9379.field40212.field4684.field2405) {
                    if (Class9379.field40212.field4684.method1669(Class9379.field40221, Class9379.field40222 + 0.6000000238418579 - Class9379.field40212.field4684.field2396 + field2396, Class9379.field40223)) {
                        Class9379.field40222 = 0.30000001192092896;
                    }
                }
            }
        }
    }
    
    public static boolean method34824(final Class6221 class6221, final Class8059 class6222) {
        final int method35644 = MathHelper.floor(class6221.field25073);
        final int method35645 = MathHelper.method35650(class6221.field25076);
        final int method35646 = MathHelper.floor(class6221.field25074);
        final int method35647 = MathHelper.method35650(class6221.field25077);
        final int method35648 = MathHelper.floor(class6221.field25075);
        final int method35649 = MathHelper.method35650(class6221.field25078);
        if (Class9379.field40212.field4683.method6973(method35644, method35646, method35648, method35645, method35647, method35649)) {
            final Class386 method35650 = Class386.method1296();
            for (int i = method35644; i < method35645; ++i) {
                for (int j = method35646; j < method35647; ++j) {
                    for (int k = method35648; k < method35649; ++k) {
                        method35650.method1300(i, j, k);
                        final Class7096 method35651 = Class9379.field40212.field4683.method6701(method35650);
                        method35651.method21696();
                        if (method35651.method21697() == class6222) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public static void method34825(final double n, final double n2, final double n3) {
    }
    
    public static void method34826() {
        Class9379.field40222 += 0.03999999910593033;
    }
    
    public static float method34827() {
        return 0.8f;
    }
    
    public static boolean method34828() {
        return method34824(Class9379.field40212.field4684.method1886().method18494(0.0, -0.4000000059604645, 0.0).method18492(0.001, 0.001, 0.001), Class8059.field33161);
    }
    
    static {
        Class9379.field40212 = Class869.method5277();
        field40213 = 1 + MathHelper.method35682(MathHelper.method35679(30000000));
        field40214 = Class9379.field40213;
        field40215 = 64 - Class9379.field40213 - Class9379.field40214;
        field40216 = 0 + Class9379.field40214;
        field40217 = Class9379.field40216 + Class9379.field40215;
        field40218 = (1L << Class9379.field40213) - 1L;
        field40219 = (1L << Class9379.field40215) - 1L;
        field40220 = (1L << Class9379.field40214) - 1L;
    }
}
