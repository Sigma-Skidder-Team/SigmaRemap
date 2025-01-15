// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.DecoderException;

public class Class5710 extends Class5709
{
    private static String[] field23235;
    public int field23236;
    public float field23237;
    public int field23238;
    public float field23239;
    public float field23240;
    public float field23241;
    
    public Class5710(final int n) {
        super(n);
    }
    
    @Override
    public void method16954(final Class2341 class2341, final Class8664 class2342, final Class9410 class2343) throws DecoderException {
        this.field23229 = class2341.method9474(4);
        this.field23236 = class2341.method9474(4);
        if (class2343 != null) {
            class2343.method35005(this.field23229, 4);
            class2343.method35005(this.field23236, 4);
        }
        if (this.field23229 != 0) {
            this.field23231 = this.field23229 + 1;
            this.field23233 = Class5710.field23225[this.field23229];
            this.field23234 = Class5710.field23226[this.field23229];
        }
        if (this.field23236 != 0) {
            this.field23238 = this.field23236 + 1;
            this.field23240 = Class5710.field23225[this.field23236];
            this.field23241 = Class5710.field23226[this.field23236];
        }
    }
    
    @Override
    public void method16955(final Class2341 class2341, final Class8664 class2342) {
        if (this.field23229 != 0) {
            this.field23230 = Class5710.field23168[class2341.method9474(6)];
        }
        if (this.field23236 != 0) {
            this.field23237 = Class5710.field23168[class2341.method9474(6)];
        }
    }
    
    @Override
    public boolean method16956(final Class2341 class2341) {
        final boolean method16956 = super.method16956(class2341);
        if (this.field23236 != 0) {
            this.field23239 = (float)class2341.method9474(this.field23238);
        }
        return method16956;
    }
    
    @Override
    public boolean method16957(final int n, final Class8560 class8560, final Class8560 class8561) {
        super.method16957(n, class8560, class8561);
        if (this.field23236 != 0) {
            if (n != 1) {
                final float n2 = (this.field23239 * this.field23240 + this.field23241) * this.field23237;
                if (n != 0) {
                    class8560.method28754(n2, this.field23227);
                }
                else {
                    class8561.method28754(n2, this.field23227);
                }
            }
        }
        return true;
    }
}
