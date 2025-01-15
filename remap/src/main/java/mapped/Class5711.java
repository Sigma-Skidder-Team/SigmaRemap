// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.DecoderException;

public class Class5711 extends Class5709
{
    private static String[] field23242;
    public float field23243;
    
    public Class5711(final int n) {
        super(n);
    }
    
    @Override
    public void method16954(final Class2341 class2341, final Class8664 class2342, final Class9410 class2343) throws DecoderException {
        super.method16954(class2341, class2342, class2343);
    }
    
    @Override
    public void method16955(final Class2341 class2341, final Class8664 class2342) {
        if (this.field23229 != 0) {
            this.field23230 = Class5711.field23168[class2341.method9474(6)];
            this.field23243 = Class5711.field23168[class2341.method9474(6)];
        }
    }
    
    @Override
    public boolean method16956(final Class2341 class2341) {
        return super.method16956(class2341);
    }
    
    @Override
    public boolean method16957(final int n, final Class8560 class8560, final Class8560 class8561) {
        if (this.field23229 != 0) {
            this.field23232 = this.field23232 * this.field23233 + this.field23234;
            if (n != 0) {
                if (n != 1) {
                    class8560.method28754(this.field23232 * this.field23243, this.field23227);
                }
                else {
                    class8560.method28754(this.field23232 * this.field23230, this.field23227);
                }
            }
            else {
                final float n2 = this.field23232 * this.field23230;
                final float n3 = this.field23232 * this.field23243;
                class8560.method28754(n2, this.field23227);
                class8561.method28754(n3, this.field23227);
            }
        }
        return true;
    }
}
