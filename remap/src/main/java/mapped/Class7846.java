// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class7846
{
    private static String[] field32129;
    private Class6300 field32130;
    private int field32131;
    private int field32132;
    private float field32133;
    private float field32134;
    private float field32135;
    private int field32136;
    private int field32137;
    private int field32138;
    private float field32139;
    private float field32140;
    private float field32141;
    private float field32142;
    private float field32143;
    
    public Class7846(final Class6300 field32130, final int field32131, final int field32132, final float field32133, final float field32134, final float field32135, final int field32136, final int field32137, final int field32138, final float field32139) {
        this.field32130 = null;
        this.field32131 = 0;
        this.field32132 = 0;
        this.field32133 = 0.0f;
        this.field32134 = 0.0f;
        this.field32135 = 0.0f;
        this.field32136 = 0;
        this.field32137 = 0;
        this.field32138 = 0;
        this.field32139 = 0.0f;
        this.field32140 = 0.0f;
        this.field32141 = 0.0f;
        this.field32142 = 0.0f;
        this.field32143 = 0.0f;
        this.field32130 = field32130;
        this.field32131 = field32131;
        this.field32132 = field32132;
        this.field32133 = field32133;
        this.field32134 = field32134;
        this.field32135 = field32135;
        this.field32136 = field32136;
        this.field32137 = field32137;
        this.field32138 = field32138;
        this.field32139 = field32139;
        this.field32140 = field32131 / field32130.field25176;
        this.field32141 = field32132 / field32130.field25177;
        this.field32142 = (field32131 + field32136) / field32130.field25176;
        this.field32143 = (field32132 + field32137) / field32130.field25177;
    }
    
    public void method25349(final Class7392 class7392, final float n) {
        Class8933.method31642(this.field32133 * n, this.field32134 * n, this.field32135 * n);
        float n2 = this.field32140;
        float n3 = this.field32142;
        float n4 = this.field32141;
        float n5 = this.field32143;
        if (this.field32130.field25186) {
            n2 = this.field32142;
            n3 = this.field32140;
        }
        if (this.field32130.field25191) {
            n4 = this.field32143;
            n5 = this.field32141;
        }
        method25350(class7392, n2, n4, n3, n5, this.field32136, this.field32137, n * this.field32138, this.field32130.field25176, this.field32130.field25177);
        Class8933.method31642(-this.field32133 * n, -this.field32134 * n, -this.field32135 * n);
    }
    
    public static void method25350(final Class7392 class7392, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, float n7, final float n8, final float n9) {
        if (n7 < 6.25E-4f) {
            n7 = 6.25E-4f;
        }
        final float n10 = n3 - n;
        final float n11 = n4 - n2;
        final double n12 = Class9546.method35647(n10) * (n8 / 16.0f);
        final double n13 = Class9546.method35647(n11) * (n9 / 16.0f);
        final Class4148 method22696 = class7392.method22696();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        method22696.method12390(7, Class9237.field39617);
        method22696.method12432(0.0, n13, 0.0).method12391(n, n4).method12397();
        method22696.method12432(n12, n13, 0.0).method12391(n3, n4).method12397();
        method22696.method12432(n12, 0.0, 0.0).method12391(n3, n2).method12397();
        method22696.method12432(0.0, 0.0, 0.0).method12391(n, n2).method12397();
        class7392.method22695();
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        method22696.method12390(7, Class9237.field39617);
        method22696.method12432(0.0, 0.0, n7).method12391(n, n2).method12397();
        method22696.method12432(n12, 0.0, n7).method12391(n3, n2).method12397();
        method22696.method12432(n12, n13, n7).method12391(n3, n4).method12397();
        method22696.method12432(0.0, n13, n7).method12391(n, n4).method12397();
        class7392.method22695();
        final float n14 = 0.5f * n10 / n5;
        final float n15 = 0.5f * n11 / n6;
        GL11.glNormal3f(-1.0f, 0.0f, 0.0f);
        method22696.method12390(7, Class9237.field39617);
        for (int i = 0; i < n5; ++i) {
            final float n16 = i / (float)n5;
            final float n17 = n + n10 * n16 + n14;
            method22696.method12432(n16 * n12, n13, n7).method12391(n17, n4).method12397();
            method22696.method12432(n16 * n12, n13, 0.0).method12391(n17, n4).method12397();
            method22696.method12432(n16 * n12, 0.0, 0.0).method12391(n17, n2).method12397();
            method22696.method12432(n16 * n12, 0.0, n7).method12391(n17, n2).method12397();
        }
        class7392.method22695();
        GL11.glNormal3f(1.0f, 0.0f, 0.0f);
        method22696.method12390(7, Class9237.field39617);
        for (int j = 0; j < n5; ++j) {
            final float n18 = j / (float)n5;
            final float n19 = n + n10 * n18 + n14;
            final float n20 = n18 + 1.0f / n5;
            method22696.method12432(n20 * n12, 0.0, n7).method12391(n19, n2).method12397();
            method22696.method12432(n20 * n12, 0.0, 0.0).method12391(n19, n2).method12397();
            method22696.method12432(n20 * n12, n13, 0.0).method12391(n19, n4).method12397();
            method22696.method12432(n20 * n12, n13, n7).method12391(n19, n4).method12397();
        }
        class7392.method22695();
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        method22696.method12390(7, Class9237.field39617);
        for (int k = 0; k < n6; ++k) {
            final float n21 = k / (float)n6;
            final float n22 = n2 + n11 * n21 + n15;
            final float n23 = n21 + 1.0f / n6;
            method22696.method12432(0.0, n23 * n13, n7).method12391(n, n22).method12397();
            method22696.method12432(n12, n23 * n13, n7).method12391(n3, n22).method12397();
            method22696.method12432(n12, n23 * n13, 0.0).method12391(n3, n22).method12397();
            method22696.method12432(0.0, n23 * n13, 0.0).method12391(n, n22).method12397();
        }
        class7392.method22695();
        GL11.glNormal3f(0.0f, -1.0f, 0.0f);
        method22696.method12390(7, Class9237.field39617);
        for (int l = 0; l < n6; ++l) {
            final float n24 = l / (float)n6;
            final float n25 = n2 + n11 * n24 + n15;
            method22696.method12432(n12, n24 * n13, n7).method12391(n3, n25).method12397();
            method22696.method12432(0.0, n24 * n13, n7).method12391(n, n25).method12397();
            method22696.method12432(0.0, n24 * n13, 0.0).method12391(n, n25).method12397();
            method22696.method12432(n12, n24 * n13, 0.0).method12391(n3, n25).method12397();
        }
        class7392.method22695();
    }
}
