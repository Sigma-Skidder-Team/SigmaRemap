// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.DecoderException;

public class Class5709 extends Class5705
{
    private static String[] field23224;
    public static final float[] field23225;
    public static final float[] field23226;
    public int field23227;
    public int field23228;
    public int field23229;
    public float field23230;
    public int field23231;
    public float field23232;
    public float field23233;
    public float field23234;
    
    public Class5709(final int field23227) {
        this.field23227 = field23227;
        this.field23228 = 0;
    }
    
    @Override
    public void method16954(final Class2341 class2341, final Class8664 class2342, final Class9410 class2343) throws DecoderException {
        final int method9474 = class2341.method9474(4);
        this.field23229 = method9474;
        if (method9474 != 15) {
            if (class2343 != null) {
                class2343.method35005(this.field23229, 4);
            }
            if (this.field23229 != 0) {
                this.field23231 = this.field23229 + 1;
                this.field23233 = Class5709.field23225[this.field23229];
                this.field23234 = Class5709.field23226[this.field23229];
            }
            return;
        }
        throw new Class2345(514, null);
    }
    
    @Override
    public void method16955(final Class2341 class2341, final Class8664 class2342) {
        if (this.field23229 != 0) {
            this.field23230 = Class5709.field23168[class2341.method9474(6)];
        }
    }
    
    @Override
    public boolean method16956(final Class2341 class2341) {
        if (this.field23229 != 0) {
            this.field23232 = (float)class2341.method9474(this.field23231);
        }
        if (++this.field23228 != 12) {
            return false;
        }
        this.field23228 = 0;
        return true;
    }
    
    @Override
    public boolean method16957(final int n, final Class8560 class8560, final Class8560 class8561) {
        if (this.field23229 != 0) {
            if (n != 2) {
                class8560.method28754((this.field23232 * this.field23233 + this.field23234) * this.field23230, this.field23227);
            }
        }
        return true;
    }
    
    static {
        field23225 = new float[] { 0.0f, 0.6666667f, 0.2857143f, 0.13333334f, 0.06451613f, 0.031746034f, 0.015748031f, 0.007843138f, 0.0039138943f, 0.0019550342f, 9.770396E-4f, 4.884005E-4f, 2.4417043E-4f, 1.2207776E-4f, 6.103702E-5f };
        field23226 = new float[] { 0.0f, -0.6666667f, -0.8571429f, -0.9333334f, -0.9677419f, -0.98412704f, -0.992126f, -0.9960785f, -0.99804306f, -0.9990225f, -0.9995115f, -0.99975586f, -0.9998779f, -0.99993896f, -0.9999695f };
    }
}
