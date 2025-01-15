// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class717 extends Class698
{
    private Class527 field3924;
    private Class5760 field3925;
    private static Class6469[] field3926;
    private Class8297 field3927;
    
    public Class717(final Class527 field3924, final Class5760 field3925) {
        super(new StringTextComponent(Class8822.method30773("of.options.performanceTitle", new Object[0])));
        this.field3927 = new Class8297(this, new Class7298());
        this.field3924 = field3924;
        this.field3925 = field3925;
    }
    
    @Override
    public void method2969() {
        this.field3842.clear();
        for (int i = 0; i < Class717.field3926.length; ++i) {
            final Class6469 class6469 = Class717.field3926[i];
            final Class573 method3029 = this.method3029(class6469.method19362(this.field3150.field4648, this.field3152 / 2 - 155 + i % 2 * 160, this.field3153 / 6 + 21 * (i / 2) - 12, 150));
            if (class6469 == Class6469.field25817) {
                method3029.field3431 = false;
            }
        }
        this.method3029(new Class673(200, this.field3152 / 2 - 100, this.field3153 / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.field3150.field4648.method17121();
                    this.field3150.method5244(this.field3924);
                }
            }
        }
    }
    
    @Override
    public void method2971() {
        this.field3150.field4648.method17121();
        super.method2971();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3843, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
        this.field3927.method27577(n, n2, this.field3842);
    }
    
    static {
        Class717.field3926 = new Class6469[] { Class6469.field25753, Class6469.field25779, Class6469.field25808, Class6469.field25807, Class6469.field25776, Class6469.field25777, Class6469.field25817, Class6469.field25805, Class6469.field25819 };
    }
}
