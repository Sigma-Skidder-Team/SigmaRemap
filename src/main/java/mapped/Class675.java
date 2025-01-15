// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class675 extends Class674
{
    private static String[] field3709;
    private float field3711;
    public boolean field3712;
    private Class5601 field3710;
    
    public Class675(final int n, final int n2, final int n3, final int n4, final int n5, final Class5601 field3710, final String s) {
        super(n, n2, n3, n4, n5, field3710, s);
        this.field3710 = null;
        this.field3711 = 1.0f;
        this.field3710 = field3710;
        this.field3711 = field3710.method16885();
        this.method3367(Class713.method3931(field3710, this.field3424));
    }
    
    @Override
    public int method3350(final boolean b) {
        return 0;
    }
    
    @Override
    public void method3354(final Class869 class869, final int n, final int n2) {
        if (this.field3432) {
            if (this.field3712) {
                if (!Class527.method3047()) {
                    this.field3711 = (n - (this.field3426 + 4)) / (float)(this.field3424 - 8);
                    this.field3711 = Class9546.method35653(this.field3711, 0.0f, 1.0f);
                    this.field3710.method16886(this.field3711);
                    this.field3711 = this.field3710.method16885();
                    this.method3367(Class713.method3931(this.field3710, this.field3424));
                }
            }
            class869.method5290().method5849(Class675.field3421);
            Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
            final int n3 = (this.method3360() ? 2 : 1) * 20;
            this.method3186(this.field3426 + (int)(this.field3711 * (this.field3424 - 8)), this.field3427, 0, 46 + n3, 4, 20);
            this.method3186(this.field3426 + (int)(this.field3711 * (this.field3424 - 8)) + 4, this.field3427, 196, 46 + n3, 4, 20);
        }
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (!super.method2982(n, n2, n3)) {
            return false;
        }
        this.field3711 = (float)(n - (this.field3426 + 4)) / (this.field3424 - 8);
        this.field3711 = Class9546.method35653(this.field3711, 0.0f, 1.0f);
        this.field3710.method16886(this.field3711);
        this.method3367(Class713.method3931(this.field3710, this.field3424));
        return this.field3712 = true;
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        this.field3712 = false;
        return true;
    }
    
    @Override
    public void method3737() {
        this.field3711 = this.field3710.method16885();
    }
    
    @Override
    public boolean method3738() {
        return false;
    }
}
