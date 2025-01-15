// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7482
{
    private static String[] field28902;
    public static Class869 field28903;
    
    public static double method23136() {
        double n = 0.2873;
        float n2 = (float)(1.0f * ((Class7482.field28903.field4684.method2710(Class8107.field33408).method23950() / Class7482.field28903.field4684.field3025.method21427() + 1.0) / 2.0));
        if (Class7482.field28903.field4684.method1815()) {
            n2 -= (float)0.15;
        }
        if (Class7482.field28903.field4684.method2653(Class9439.field40474)) {
            if (Class7482.field28903.field4684.method1815()) {
                n2 -= (float)(0.03000002 * (Class7482.field28903.field4684.method2654(Class9439.field40474).method7908() + 1));
            }
        }
        if (Class7482.field28903.field4684.method1809()) {
            n *= 0.25;
        }
        if (method23142()) {
            n *= 0.3;
        }
        return n * n2;
    }
    
    public static double method23137() {
        double n = 0.2873 + method23139() * 0.057;
        if (Class7482.field28903.field4684.method1809()) {
            n *= 0.25;
        }
        return n;
    }
    
    public static double method23138() {
        double n = 0.2873;
        if (Class7482.field28903.field4684.method1809()) {
            n *= 0.25;
        }
        if (method23142()) {
            n *= 0.3;
        }
        return n;
    }
    
    public static int method23139() {
        if (!Class7482.field28903.field4684.method2653(Class9439.field40474)) {
            return 0;
        }
        return Class7482.field28903.field4684.method2654(Class9439.field40474).method7908() + 1;
    }
    
    public static int method23140() {
        if (!Class7482.field28903.field4684.method2653(Class9439.field40481)) {
            return 0;
        }
        return Class7482.field28903.field4684.method2654(Class9439.field40481).method7908() + 1;
    }
    
    public static double method23141() {
        return 0.41999998688697815 + method23140() * 0.1;
    }
    
    public static boolean method23142() {
        return Class7482.field28903.field4684.method1706();
    }
    
    public static float[] method23143() {
        final Class6093 field4085 = Class7482.field28903.field4684.field4085;
        return method23145(field4085.field24722, field4085.field24721);
    }
    
    public static float[] method23144() {
        final Class6093 field4085 = Class7482.field28903.field4684.field4085;
        return method23146(field4085.field24722, field4085.field24721);
    }
    
    public static float[] method23145(float n, float n2) {
        float n3 = Class7482.field28903.field4684.field2399 + 90.0f;
        if (Class9463.method35173().method35205().method26561() != -999.0f) {
            n3 = Class9463.method35173().method35205().method26561() + 90.0f;
        }
        if (n != 0.0f) {
            if (n2 < 1.0f) {
                if (n2 <= -1.0f) {
                    n3 += ((n <= 0.0f) ? -45 : 45);
                    n2 = 0.0f;
                }
            }
            else {
                n3 += ((n <= 0.0f) ? 45 : -45);
                n2 = 0.0f;
            }
            if (n <= 0.0f) {
                if (n < 0.0f) {
                    n = -1.0f;
                }
            }
            else {
                n = 1.0f;
            }
        }
        if (Class9463.method35173().method35205().method26559()) {
            if (!Class9463.method35173().method35205().method26558()) {
                n = 1.0f;
            }
        }
        return new float[] { n3, n, n2 };
    }
    
    public static float[] method23146(float n, float n2) {
        float n3 = Class7482.field28903.field4684.field2399 + 90.0f;
        if (n == 0.0f) {
            if (n2 != 0.0f) {
                n3 += ((n2 <= 0.0f) ? 90 : -90);
                n2 = 0.0f;
            }
        }
        else {
            if (n2 < 1.0f) {
                if (n2 <= -1.0f) {
                    n3 += ((n <= 0.0f) ? -45 : 45);
                    n2 = 0.0f;
                }
            }
            else {
                n3 += ((n <= 0.0f) ? 45 : -45);
                n2 = 0.0f;
            }
            if (n <= 0.0f) {
                if (n < 0.0f) {
                    n = -1.0f;
                    n3 -= 180.0f;
                }
            }
            else {
                n = 1.0f;
            }
        }
        return new float[] { n3, n, n2 };
    }
    
    public static float method23147() {
        float field2970 = Class7482.field28903.field4684.field2970;
        final float field2971 = Class7482.field28903.field4684.field2968;
        float n = Class7482.field28903.field4684.field2399 + 90.0f;
        if (field2970 > 0.0f) {
            if (Class7482.field28903.field4648.field23437.method1056()) {
                field2970 = -1.0f;
            }
        }
        if (field2971 != 0.0f && field2971 > 0.0f) {
            n -= 90.0f;
        }
        else if (field2971 != 0.0f) {
            if (field2971 < 0.0f) {
                n += 90.0f;
            }
        }
        if (field2970 != 0.0f) {
            if (field2971 != 0.0f && field2971 > 0.0f) {
                n -= ((field2970 <= 0.0f) ? 45 : -45);
            }
            else if (field2971 != 0.0f) {
                if (field2971 < 0.0f) {
                    n -= ((field2970 <= 0.0f) ? -45 : 45);
                }
            }
        }
        if (field2970 < 0.0f) {
            if (field2971 == 0.0f) {
                n -= 180.0f;
            }
        }
        return n;
    }
    
    public static boolean method23148() {
        final boolean method1056 = Class7482.field28903.field4648.field23435.method1056();
        final boolean method1057 = Class7482.field28903.field4648.field23436.method1056();
        final boolean method1058 = Class7482.field28903.field4648.field23438.method1056();
        final boolean method1059 = Class7482.field28903.field4648.field23437.method1056();
        if (!method1056) {
            if (!method1057) {
                if (!method1058) {
                    if (!method1059) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void method23149(final Class5717 class5717, final double n) {
        final float[] method23143 = method23143();
        final float n2 = method23143[1];
        final float n3 = method23143[2];
        final float n4 = method23143[0];
        if (n2 == 0.0f) {
            if (n3 == 0.0f) {
                class5717.method16973(0.0);
                class5717.method16977(0.0);
            }
        }
        final double cos = Math.cos(Math.toRadians(n4));
        final double sin = Math.sin(Math.toRadians(n4));
        final double n5 = (n2 * cos + n3 * sin) * n;
        final double n6 = (n2 * sin - n3 * cos) * n;
        class5717.method16973(n5);
        class5717.method16977(n6);
        Class6430.method19154(class5717.method16972());
        Class6430.method19156(class5717.method16976());
    }
    
    public static void method23150(final Class5717 class5717, final double n, final float n2) {
        final float[] method23143 = method23143();
        final float n3 = method23143[1];
        final float n4 = method23143[2];
        if (n3 == 0.0f) {
            if (n4 == 0.0f) {
                class5717.method16973(0.0);
                class5717.method16977(0.0);
            }
        }
        final double cos = Math.cos(Math.toRadians(n2));
        final double sin = Math.sin(Math.toRadians(n2));
        final double n5 = (n3 * cos + n4 * sin) * n;
        final double n6 = (n3 * sin - n4 * cos) * n;
        class5717.method16973(n5);
        class5717.method16977(n6);
        Class6430.method19154(class5717.method16972());
        Class6430.method19156(class5717.method16976());
    }
    
    public static void method23151(final double n) {
        final float[] method23143 = method23143();
        final float n2 = method23143[1];
        final float n3 = method23143[2];
        final float n4 = method23143[0];
        if (n2 == 0.0f) {
            if (n3 == 0.0f) {
                Class6430.method19154(0.0);
                Class6430.method19156(0.0);
            }
        }
        final double cos = Math.cos(Math.toRadians(n4));
        final double sin = Math.sin(Math.toRadians(n4));
        final double n5 = (n2 * cos + n3 * sin) * n;
        final double n6 = (n2 * sin - n3 * cos) * n;
        Class6430.method19154(n5);
        Class6430.method19156(n6);
    }
    
    public static void method23152() {
        final double field2395 = Class7482.field28903.field4684.field2395;
        final double field2396 = Class7482.field28903.field4684.field2396;
        final double field2397 = Class7482.field28903.field4684.field2397;
        for (int i = 0; i < 49 + method23140() * 17; ++i) {
            Class7482.field28903.method5269().method17292(new Class4354(field2395, field2396 + 0.06248, field2397, false));
            Class7482.field28903.method5269().method17292(new Class4354(field2395, field2396, field2397, false));
        }
        Class7482.field28903.method5269().method17292(new Class4354(field2395, field2396, field2397, true));
    }
    
    public static float method23153(final Class5717 class5717, final double n, final float n2, float n3, final float n4) {
        if (Class8845.method30918(n3, n2) <= n4) {
            n3 = n2;
        }
        else {
            n3 += ((MathHelper.method35668(n2 - n3) <= 0.0f) ? (-n4) : n4);
        }
        final float n5 = (n3 - 90.0f) * 0.017453292f;
        class5717.method16973(-MathHelper.sin(n5) * n);
        class5717.method16977(MathHelper.cos(n5) * n);
        Class6430.method19154(class5717.method16972());
        Class6430.method19156(class5717.method16976());
        return n3;
    }
    
    public static float method23154(final double n, final float n2, float n3, final float n4) {
        if (Class8845.method30918(n3, n2) <= n4) {
            n3 = n2;
        }
        else {
            n3 += ((MathHelper.method35668(n2 - n3) <= 0.0f) ? (-n4) : n4);
        }
        final float n5 = (n3 - 90.0f) * 0.017453292f;
        Class6430.method19154(-MathHelper.sin(n5) * n);
        Class6430.method19156(MathHelper.cos(n5) * n);
        return n3;
    }
    
    static {
        Class7482.field28903 = Class869.method5277();
    }
}
