// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class714 extends Class698
{
    private Screen field3900;
    private Class5760 field3901;
    private static Class6469[] field3902;
    private Class8297 field3903;
    
    public Class714(final Screen field3900, final Class5760 field3901) {
        super(new StringTextComponent(Class8822.method30773("of.options.qualityTitle", new Object[0])));
        this.field3903 = new Class8297(this, new Class7298());
        this.field3900 = field3900;
        this.field3901 = field3901;
    }
    
    @Override
    public void init() {
        this.field3842.clear();
        for (int i = 0; i < Class714.field3902.length; ++i) {
            final Class6469 class6469 = Class714.field3902[i];
            final Class573 method3029 = this.method3029(class6469.method19362(this.minecraft.field4648, this.width / 2 - 155 + i % 2 * 160, this.height / 6 + 21 * (i / 2) - 12, 150));
            if (class6469 == Class6469.field25799 || class6469 == Class6469.field25798) {
                method3029.field3431 = false;
            }
        }
        this.method3029(new Class673(200, this.width / 2 - 100, this.height / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.minecraft.field4648.method17121();
                    this.minecraft.method5244(this.field3900);
                }
            }
        }
    }
    
    @Override
    public void removed() {
        this.minecraft.field4648.method17121();
        super.removed();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3295(this.field3843, this.field3148.getFormattedText(), this.width / 2, 15, 16777215);
        super.method2975(n, n2, n3);
        this.field3903.method27577(n, n2, this.field3842);
    }
    
    static {
        Class714.field3902 = new Class6469[] { Class6469.field25714, Class6469.field25752, Class6469.field25799, Class6469.field25798, Class6469.field25802, Class6469.field25791, Class6469.field25766, Class6469.field25788, Class6469.field25793, Class6469.field25794, Class6469.field25796, Class6469.field25801, Class6469.field25806, Class6469.field25797, Class6469.field25813, Class6469.field25816 };
    }
}
