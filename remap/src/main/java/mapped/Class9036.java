// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class9036
{
    private static Class869 field38216;
    private static Class5760 field38217;
    private static IProfiler field38218;
    public static boolean field38219;
    public static Class8032 field38220;
    public static Class8032 field38221;
    public static Class8032 field38222;
    public static Class8032 field38223;
    public static Class8032 field38224;
    public static Class8032 field38225;
    public static Class8032 field38226;
    private static long[] field38227;
    private static long[] field38228;
    private static long[] field38229;
    private static long[] field38230;
    private static long[] field38231;
    private static long[] field38232;
    private static long[] field38233;
    private static long[] field38234;
    private static boolean[] field38235;
    private static int field38236;
    private static long field38237;
    private static long field38238;
    
    public static void method32479() {
        if (Class9036.field38216 == null) {
            Class9036.field38216 = Class869.method5277();
            Class9036.field38217 = Class9036.field38216.field4648;
            Class9036.field38218 = Class9036.field38216.method5327();
        }
        if (Class9036.field38217.field23466 && (Class9036.field38217.field23496 || Class9036.field38217.field23468)) {
            Class9036.field38219 = true;
            final long nanoTime = System.nanoTime();
            if (Class9036.field38237 != -1L) {
                final int n = Class9036.field38236 & Class9036.field38227.length - 1;
                ++Class9036.field38236;
                final boolean method24704 = Class7741.method24704();
                Class9036.field38227[n] = nanoTime - Class9036.field38237 - Class9036.field38238;
                Class9036.field38228[n] = Class9036.field38220.field33062;
                Class9036.field38229[n] = Class9036.field38221.field33062;
                Class9036.field38230[n] = Class9036.field38222.field33062;
                Class9036.field38231[n] = Class9036.field38223.field33062;
                Class9036.field38232[n] = Class9036.field38224.field33062;
                Class9036.field38233[n] = Class9036.field38225.field33062;
                Class9036.field38234[n] = Class9036.field38226.field33062;
                Class9036.field38235[n] = method24704;
                Class8032.method26347(Class9036.field38220);
                Class8032.method26347(Class9036.field38221);
                Class8032.method26347(Class9036.field38224);
                Class8032.method26347(Class9036.field38223);
                Class8032.method26347(Class9036.field38222);
                Class8032.method26347(Class9036.field38225);
                Class8032.method26347(Class9036.field38226);
                Class9036.field38237 = System.nanoTime();
            }
            else {
                Class9036.field38237 = nanoTime;
            }
        }
        else {
            Class9036.field38219 = false;
            Class9036.field38237 = -1L;
        }
    }
    
    public static void method32480(final int n) {
        if (Class9036.field38217 != null) {
            if (Class9036.field38217.field23496 || Class9036.field38217.field23468) {
                final long nanoTime = System.nanoTime();
                Class8933.method31681(256);
                Class8933.method31633(5889);
                Class8933.method31635();
                final int method7692 = Class9036.field38216.method5332().method7692();
                final int method7693 = Class9036.field38216.method5332().method7693();
                Class8933.method31508();
                Class8933.method31634();
                Class8933.method31638(0.0, method7692, method7693, 0.0, 1000.0, 3000.0);
                Class8933.method31633(5888);
                Class8933.method31635();
                Class8933.method31634();
                Class8933.method31642(0.0f, 0.0f, -2000.0f);
                GL11.glLineWidth(1.0f);
                Class8933.method31610();
                final Class7392 method7694 = Class7392.method22694();
                final Class4148 method7695 = method7694.method22696();
                method7695.method12390(1, Class9237.field39615);
                for (int i = 0; i < Class9036.field38227.length; ++i) {
                    final int n2 = (i - Class9036.field38236 & Class9036.field38227.length - 1) * 100 / Class9036.field38227.length + 155;
                    final float n3 = (float)method7693;
                    if (!Class9036.field38235[i]) {
                        method32481(i, Class9036.field38227[i], n2, n2, n2, n3, method7695);
                        final float n4 = n3 - method32481(i, Class9036.field38234[i], n2 / 2, n2 / 2, n2 / 2, n3, method7695);
                        final float n5 = n4 - method32481(i, Class9036.field38233[i], 0, n2, 0, n4, method7695);
                        final float n6 = n5 - method32481(i, Class9036.field38232[i], n2, n2, 0, n5, method7695);
                        final float n7 = n6 - method32481(i, Class9036.field38231[i], n2, 0, 0, n6, method7695);
                        final float n8 = n7 - method32481(i, Class9036.field38230[i], n2, 0, n2, n7, method7695);
                        final float n9 = n8 - method32481(i, Class9036.field38229[i], 0, 0, n2, n8, method7695);
                        final float n10 = n9 - method32481(i, Class9036.field38228[i], 0, n2, n2, n9, method7695);
                    }
                    else {
                        method32481(i, Class9036.field38227[i], n2, n2 / 2, 0, n3, method7695);
                    }
                }
                method32482(0, Class9036.field38227.length, 33333333L, 196, 196, 196, (float)method7693, method7695);
                method32482(0, Class9036.field38227.length, 16666666L, 196, 196, 196, (float)method7693, method7695);
                method7694.method22695();
                Class8933.method31609();
                final int n11 = method7693 - 80;
                final int n12 = method7693 - 160;
                Class9036.field38216.field4643.method6610("30", 2.0f, (float)(n12 + 1), -8947849);
                Class9036.field38216.field4643.method6610("30", 1.0f, (float)n12, -3881788);
                Class9036.field38216.field4643.method6610("60", 2.0f, (float)(n11 + 1), -8947849);
                Class9036.field38216.field4643.method6610("60", 1.0f, (float)n11, -3881788);
                Class8933.method31633(5889);
                Class8933.method31636();
                Class8933.method31633(5888);
                Class8933.method31636();
                Class8933.method31609();
                final float method7696 = Config.method28866(1.0f - (float)((System.currentTimeMillis() - Class7741.method24702()) / 1000.0), 0.0f, 1.0f);
                final int n13 = (int)(170.0f + method7696 * 85.0f) << 16 | (int)(100.0f + method7696 * 55.0f) << 8 | (int)(10.0f + method7696 * 10.0f);
                final int n14 = 512 / n + 2;
                final int n15 = method7693 / n - 8;
                final Class685 field4647 = Class9036.field38216.field4647;
                Class565.method3293(n14 - 1, n15 - 1, n14 + 50, n15 + 10, -1605349296);
                Class9036.field38216.field4643.method6610(" " + Class7741.method24705() + " MB/s", (float)n14, (float)n15, n13);
                Class9036.field38238 = System.nanoTime() - nanoTime;
            }
        }
    }
    
    private static long method32481(final int n, final long n2, final int n3, final int n4, final int n5, final float n6, final Class4148 class4148) {
        final long n7 = n2 / 200000L;
        if (n7 >= 3L) {
            class4148.method12432(n + 0.5f, n6 - n7 + 0.5f, 0.0).method12399(n3, n4, n5, 255).method12397();
            class4148.method12432(n + 0.5f, n6 + 0.5f, 0.0).method12399(n3, n4, n5, 255).method12397();
            return n7;
        }
        return 0L;
    }
    
    private static long method32482(final int n, final int n2, final long n3, final int n4, final int n5, final int n6, final float n7, final Class4148 class4148) {
        final long n8 = n3 / 200000L;
        if (n8 >= 3L) {
            class4148.method12432(n + 0.5f, n7 - n8 + 0.5f, 0.0).method12399(n4, n5, n6, 255).method12397();
            class4148.method12432(n2 + 0.5f, n7 - n8 + 0.5f, 0.0).method12399(n4, n5, n6, 255).method12397();
            return n8;
        }
        return 0L;
    }
    
    public static boolean method32483() {
        return Class9036.field38219;
    }
    
    static {
        Class9036.field38219 = false;
        Class9036.field38220 = new Class8032();
        Class9036.field38221 = new Class8032();
        Class9036.field38222 = new Class8032();
        Class9036.field38223 = new Class8032();
        Class9036.field38224 = new Class8032();
        Class9036.field38225 = new Class8032();
        Class9036.field38226 = new Class8032();
        Class9036.field38227 = new long[512];
        Class9036.field38228 = new long[512];
        Class9036.field38229 = new long[512];
        Class9036.field38230 = new long[512];
        Class9036.field38231 = new long[512];
        Class9036.field38232 = new long[512];
        Class9036.field38233 = new long[512];
        Class9036.field38234 = new long[512];
        Class9036.field38235 = new boolean[512];
        Class9036.field38236 = 0;
        Class9036.field38237 = -1L;
        Class9036.field38238 = 0L;
    }
}
