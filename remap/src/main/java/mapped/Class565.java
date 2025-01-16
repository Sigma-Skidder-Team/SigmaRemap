// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;

public abstract class Class565
{
    public static final ResourceLocation field3361;
    public static final ResourceLocation field3362;
    public static final ResourceLocation field3363;
    private int field3364;
    
    public void method3291(int n, int n2, final int n3, final int n4) {
        if (n2 < n) {
            final int n5 = n;
            n = n2;
            n2 = n5;
        }
        method3293(n, n3, n2 + 1, n3 + 1, n4);
    }
    
    public void method3292(final int n, int n2, int n3, final int n4) {
        if (n3 < n2) {
            final int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        method3293(n, n2 + 1, n + 1, n3, n4);
    }
    
    public static void method3293(final int n, final int n2, final int n3, final int n4, final int n5) {
        method3294(Class9294.method34322().method34328(), n, n2, n3, n4, n5);
    }
    
    public static void method3294(final Matrix4f class6789, int n, int n2, int n3, int n4, final int n5) {
        if (n < n3) {
            final int n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            final int n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n5 & 0xFF) / 255.0f;
        final Class4148 method22696 = Class7392.method22694().method22696();
        Class8726.method30011();
        Class8726.method30041();
        Class8726.method30117();
        method22696.method12390(7, Class9237.field39615);
        method22696.method12444(class6789, (float)n, (float)n4, 0.0f).method12439(n9, n10, n11, n8).method12397();
        method22696.method12444(class6789, (float)n3, (float)n4, 0.0f).method12439(n9, n10, n11, n8).method12397();
        method22696.method12444(class6789, (float)n3, (float)n2, 0.0f).method12439(n9, n10, n11, n8).method12397();
        method22696.method12444(class6789, (float)n, (float)n2, 0.0f).method12439(n9, n10, n11, n8).method12397();
        method22696.method12393();
        Class8475.method28282(method22696);
        Class8726.method30040();
        Class8726.method30012();
    }
    
    public void method3189(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final float n11 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n12 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n14 = (n6 & 0xFF) / 255.0f;
        Class8726.method30041();
        Class8726.method30011();
        Class8726.method29998();
        Class8726.method30117();
        Class8726.method30045(7425);
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(7, Class9237.field39615);
        method22695.method12432(n3, n2, this.field3364).method12439(n8, n9, n10, n7).method12397();
        method22695.method12432(n, n2, this.field3364).method12439(n8, n9, n10, n7).method12397();
        method22695.method12432(n, n4, this.field3364).method12439(n12, n13, n14, n11).method12397();
        method22695.method12432(n3, n4, this.field3364).method12439(n12, n13, n14, n11).method12397();
        method22694.method22695();
        Class8726.method30045(7424);
        Class8726.method30012();
        Class8726.method29999();
        Class8726.method30040();
    }
    
    public void method3295(final Class1844 class1844, final String s, final int n, final int n2, final int n3) {
        class1844.method6609(s, (float)(n - class1844.method6617(s) / 2), (float)n2, n3);
    }
    
    public void method3296(final Class1844 class1844, final String s, final int n, final int n2, final int n3) {
        class1844.method6609(s, (float)(n - class1844.method6617(s)), (float)n2, n3);
    }
    
    public void method3297(final Class1844 class1844, final String s, final int n, final int n2, final int n3) {
        class1844.method6609(s, (float)n, (float)n2, n3);
    }
    
    public static void method3298(final int n, final int n2, final int n3, final int n4, final int n5, final Class1912 class1912) {
        method3302(n, n + n4, n2, n2 + n5, n3, class1912.method7497(), class1912.method7498(), class1912.method7500(), class1912.method7501());
    }
    
    public void method3186(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        method3299(n, n2, this.field3364, (float)n3, (float)n4, n5, n6, 256, 256);
    }
    
    public static void method3299(final int n, final int n2, final int n3, final float n4, final float n5, final int n6, final int n7, final int n8, final int n9) {
        method3301(n, n + n6, n2, n2 + n7, n3, n6, n7, n4, n5, n9, n8);
    }
    
    public static void method3300(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10) {
        method3301(n, n + n3, n2, n2 + n4, 0, n7, n8, n5, n6, n9, n10);
    }
    
    public static void method3188(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        method3300(n, n2, n5, n6, n3, n4, n5, n6, n7, n8);
    }
    
    private static void method3301(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final int n10, final int n11) {
        method3302(n, n2, n3, n4, n5, (n8 + 0.0f) / n10, (n8 + n6) / n10, (n9 + 0.0f) / n11, (n9 + n7) / n11);
    }
    
    public static void method3302(final int n, final int n2, final int n3, final int n4, final int n5, final float n6, final float n7, final float n8, final float n9) {
        final Class4148 method22696 = Class7392.method22694().method22696();
        method22696.method12390(7, Class9237.field39617);
        method22696.method12432(n, n4, n5).method12391(n6, n9).method12397();
        method22696.method12432(n2, n4, n5).method12391(n7, n9).method12397();
        method22696.method12432(n2, n3, n5).method12391(n7, n8).method12397();
        method22696.method12432(n, n3, n5).method12391(n6, n8).method12397();
        method22696.method12393();
        Class8726.method29999();
        Class8475.method28282(method22696);
    }
    
    public int method3303() {
        return this.field3364;
    }
    
    public void method3304(final int field3364) {
        this.field3364 = field3364;
    }
    
    static {
        field3361 = new ResourceLocation("textures/gui/options_background.png");
        field3362 = new ResourceLocation("textures/gui/container/stats_icons.png");
        field3363 = new ResourceLocation("textures/gui/icons.png");
    }
}
