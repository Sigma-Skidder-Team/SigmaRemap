// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class649 extends Class648
{
    private boolean field3673;
    
    public Class649(final int n, final int n2) {
        super(n, n2, 22, 22, "");
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        Minecraft.method5277().method5290().method5849(Class748.method4080());
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = 0;
        if (this.field3431) {
            if (!this.field3673) {
                if (this.method3360()) {
                    n4 += this.field3424 * 3;
                }
            }
            else {
                n4 += this.field3424 * 1;
            }
        }
        else {
            n4 += this.field3424 * 2;
        }
        this.method3186(this.field3426, this.field3427, n4, 219, this.field3424, this.field3425);
        this.method3706();
    }
    
    public abstract void method3706();
    
    public boolean method3707() {
        return this.field3673;
    }
    
    public void method3708(final boolean field3673) {
        this.field3673 = field3673;
    }
}
