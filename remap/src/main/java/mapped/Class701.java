// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class701 extends Class698
{
    private Class527 field3859;
    private Class5760 field3860;
    private Class8297 field3861;
    
    public Class701(final Class527 field3859, final Class5760 field3860) {
        super(new Class2260(Class8822.method30773("of.options.otherTitle", new Object[0])));
        this.field3861 = new Class8297(this, new Class7298());
        this.field3859 = field3859;
        this.field3860 = field3860;
    }
    
    @Override
    public void method2969() {
        this.field3842.clear();
        final Class6473 class6473 = new Class6473(this.field3150.method5332());
        final Class6469[] array = { Class6469.field25763, Class6469.field25786, Class6469.field25764, Class6469.field25814, Class6469.field25771, Class6469.field25778, Class6469.field25747, Class6469.field25765, Class6469.field25815, Class6469.field25818, class6473, null };
        for (int i = 0; i < array.length; ++i) {
            final Class6469 class6474 = array[i];
            final Class573 method3029 = this.method3029(class6474.method19362(this.field3150.field4648, this.field3152 / 2 - 155 + i % 2 * 160, this.field3153 / 6 + 21 * (i / 2) - 12, 150));
            if (class6474 == class6473) {
                method3029.method3365(310);
                ++i;
            }
        }
        this.method3029(new Class673(210, this.field3152 / 2 - 100, this.field3153 / 6 + 168 + 11 - 44, Class8822.method30773("of.options.other.reset", new Object[0])));
        this.method3029(new Class673(200, this.field3152 / 2 - 100, this.field3153 / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.field3150.field4648.method17121();
                    this.field3150.method5332().method7683();
                    this.field3150.method5244(this.field3859);
                }
                if (class574.field3708 == 210) {
                    this.field3150.field4648.method17121();
                    this.field3150.method5244(new Class546(this::method3902, new Class2260(Class8822.method30773("of.message.other.reset", new Object[0])), new Class2260("")));
                }
            }
        }
    }
    
    @Override
    public void method2971() {
        this.field3150.field4648.method17121();
        this.field3150.method5332().method7683();
        super.method2971();
    }
    
    public void method3902(final boolean b) {
        if (b) {
            this.field3150.field4648.method17137();
        }
        this.field3150.method5244(this);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3843, this.field3148.method8461(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
        this.field3861.method27577(n, n2, this.field3842);
    }
}
