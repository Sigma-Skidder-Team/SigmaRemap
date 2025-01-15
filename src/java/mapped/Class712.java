// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class712 extends Class698
{
    private Class527 field3888;
    private Class5760 field3889;
    private static Class6469[] field3890;
    
    public Class712(final Class527 field3888, final Class5760 field3889) {
        super(new Class2260(Class8822.method30773("of.options.animationsTitle", new Object[0])));
        this.field3888 = field3888;
        this.field3889 = field3889;
    }
    
    @Override
    public void method2969() {
        this.field3842.clear();
        for (int i = 0; i < Class712.field3890.length; ++i) {
            this.method3029(Class712.field3890[i].method19362(this.field3150.field4648, this.field3152 / 2 - 155 + i % 2 * 160, this.field3153 / 6 + 21 * (i / 2) - 12, 150));
        }
        this.method3029(new Class673(210, this.field3152 / 2 - 155, this.field3153 / 6 + 168 + 11, 70, 20, Class4647.method13876("of.options.animation.allOn")));
        this.method3029(new Class673(211, this.field3152 / 2 - 155 + 80, this.field3153 / 6 + 168 + 11, 70, 20, Class4647.method13876("of.options.animation.allOff")));
        this.method3029(new Class678(200, this.field3152 / 2 + 5, this.field3153 / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.field3150.field4648.method17121();
                    this.field3150.method5244(this.field3888);
                }
                if (class574.field3708 == 210) {
                    this.field3150.field4648.method17140(true);
                }
                if (class574.field3708 == 211) {
                    this.field3150.field4648.method17140(false);
                }
                this.field3150.method5248();
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
        this.method3295(this.field3150.field4643, this.field3148.method8461(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
    }
    
    static {
        Class712.field3890 = new Class6469[] { Class6469.field25758, Class6469.field25759, Class6469.field25760, Class6469.field25761, Class6469.field25767, Class6469.field25768, Class6469.field25769, Class6469.field25770, Class6469.field25780, Class6469.field25781, Class6469.field25782, Class6469.field25783, Class6469.field25784, Class6469.field25787, Class6469.field25789, Class6469.field25800, Class6469.field25785, Class6469.field25727 };
    }
}
