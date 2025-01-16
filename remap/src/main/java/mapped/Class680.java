// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class680 extends Class654
{
    private final boolean field3720;
    private final boolean field3721;
    
    public Class680(final int n, final int n2, final boolean field3720, final Class6887 class6887, final boolean field3721) {
        super(n, n2, 23, 13, "", class6887);
        this.field3720 = field3720;
        this.field3721 = field3721;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.method5277().method5290().method5849(Class723.field3947);
        int n4 = 0;
        int n5 = 192;
        if (this.method3360()) {
            n4 += 23;
        }
        if (!this.field3720) {
            n5 += 13;
        }
        this.method3186(this.field3426, this.field3427, n4, n5, 23, 13);
    }
    
    @Override
    public void method3363(final Class1784 class1784) {
        if (this.field3721) {
            class1784.method6422(Class6836.method20933(Class8520.field35034, 1.0f));
        }
    }
}
