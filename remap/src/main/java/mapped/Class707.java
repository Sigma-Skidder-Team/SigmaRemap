// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class707 extends Class703
{
    private static final Class6469[] field3880;
    private Class573 field3881;
    private Class8297 field3882;
    
    public Class707(final Class527 class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.chat.title", new Object[0]));
        this.field3882 = new Class8297(this, new Class7298());
    }
    
    @Override
    public void method2969() {
        int n = 0;
        for (final Class6469 class6469 : Class707.field3880) {
            final Class573 method3029 = this.method3029(class6469.method19362(this.field3150.field4648, this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 + 24 * (n >> 1) - 12, 150));
            if (class6469 == Class6469.field25726) {
                this.field3881 = method3029;
                method3029.field3431 = Class7895.field32404.method25560();
            }
            ++n;
        }
        this.method3029(new Class654(this.field3152 / 2 - 100, -12 + this.field3153 / 6 + 24 * (n + 1) / 2, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3868)));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
        this.field3882.method27577(n, n2, this.field3154);
    }
    
    public void method3913() {
        this.field3881.method3367(Class6469.field25726.method19486(this.field3869));
    }
    
    static {
        field3880 = new Class6469[] { Class6469.field25722, Class6469.field25732, Class6469.field25733, Class6469.field25734, Class6469.field25708, Class6469.field25719, Class6469.field25709, Class6469.field25710, Class6469.field25706, Class6469.field25707, Class6469.field25820, Class6469.field25821, Class6469.field25741, Class6469.field25731, Class6469.field25726 };
    }
}