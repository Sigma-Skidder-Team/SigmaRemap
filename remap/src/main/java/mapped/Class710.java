// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class710 extends Class703
{
    private static final Class6469[] field3883;
    private Class573 field3884;
    
    public Class710(final Class527 class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.accessibility.title", new Object[0]));
    }
    
    @Override
    public void method2969() {
        int n = 0;
        for (final Class6469 class6469 : Class710.field3883) {
            final Class573 method3029 = this.method3029(class6469.method19362(this.field3150.field4648, this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 + 24 * (n >> 1), 150));
            if (class6469 == Class6469.field25726) {
                this.field3884 = method3029;
                method3029.field3431 = Class7895.field32404.method25560();
            }
            ++n;
        }
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 6 + 144, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3868)));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 20, 16777215);
        super.method2975(n, n2, n3);
    }
    
    public void method3922() {
        this.field3884.method3367(Class6469.field25726.method19486(this.field3869));
    }
    
    static {
        field3883 = new Class6469[] { Class6469.field25726, Class6469.field25742, Class6469.field25719, Class6469.field25729, Class6469.field25708, Class6469.field25730, Class6469.field25744, Class6469.field25745 };
    }
}
