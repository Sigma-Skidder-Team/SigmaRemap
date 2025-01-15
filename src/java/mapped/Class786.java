// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class786 extends Class785
{
    public static final Class8810<Byte> field4195;
    private int field4196;
    private int field4197;
    
    public Class786(final Class7499<? extends Class786> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2420 = 1.0f;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3574(this, 1.0, true));
        this.field4114.method22062(2, new Class3466(this, 0.9, 32.0f));
        this.field4114.method22062(2, new Class3520(this, 0.6));
        this.field4114.method22062(3, new Class3573(this, 0.6, false, 4, () -> false));
        this.field4114.method22062(5, new Class3639(this));
        this.field4114.method22062(6, new Class3517(this, 0.6));
        this.field4114.method22062(7, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3546(this));
        this.field4115.method22062(2, new Class3547(this, (Class<?>[])new Class[0]));
        this.field4115.method22062(3, new Class3555<Object>(this, Class759.class, 5, false, false, class511 -> class511 instanceof Class762 && !(class511 instanceof Class765)));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class786.field4195, (Byte)0);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(100.0);
        this.method2710(Class8107.field33408).method23941(0.25);
        this.method2710(Class8107.field33407).method23941(1.0);
        this.method2711().method20873(Class8107.field33410).method23941(15.0);
    }
    
    @Override
    public int method2629(final int n) {
        return n;
    }
    
    @Override
    public void method2741(final Class399 class399) {
        if (class399 instanceof Class762) {
            if (!(class399 instanceof Class765)) {
                if (this.method2633().nextInt(20) == 0) {
                    this.method4153((Class511)class399);
                }
            }
        }
        super.method2741(class399);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.field4196 > 0) {
            --this.field4196;
        }
        if (this.field4197 > 0) {
            --this.field4197;
        }
        if (Class399.method1680(this.method1935()) > 2.500000277905201E-7) {
            if (this.field2423.nextInt(5) == 0) {
                final Class7096 method6701 = this.field2391.method6701(new Class354(Class9546.method35644(this.method1938()), Class9546.method35644(this.method1941() - 0.20000000298023224), Class9546.method35644(this.method1945())));
                if (!method6701.method21706()) {
                    this.field2391.method6709(new Class6911(Class8432.field34600, method6701), this.method1938() + (this.field2423.nextFloat() - 0.5) * this.method1930(), this.method1941() + 0.1, this.method1945() + (this.field2423.nextFloat() - 0.5) * this.method1930(), 4.0 * (this.field2423.nextFloat() - 0.5), 0.5, (this.field2423.nextFloat() - 0.5) * 4.0);
                }
            }
        }
    }
    
    @Override
    public boolean method2620(final Class7499<?> class7499) {
        return (!this.method4341() || class7499 != Class7499.field29058) && class7499 != Class7499.field28969 && super.method2620(class7499);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("PlayerCreated", this.method4341());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4342(class51.method329("PlayerCreated"));
    }
    
    private float method4336() {
        return (float)this.method2710(Class8107.field33410).method23950();
    }
    
    @Override
    public boolean method2734(final Class399 class399) {
        this.field4196 = 10;
        this.field2391.method6761(this, (byte)4);
        final float method4336 = this.method4336();
        final boolean method4337 = class399.method1740(Class7929.method25693(this), (method4336 <= 0.0f) ? 0.0f : (method4336 / 2.0f + this.field2423.nextInt((int)method4336)));
        if (method4337) {
            class399.method1936(class399.method1935().method16744(0.0, 0.4000000059604645, 0.0));
            this.method1900(this, class399);
        }
        this.method1695(Class8520.field35313, 1.0f, 1.0f);
        return method4337;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        final Class2195 method4337 = this.method4337();
        final boolean method4338 = super.method1740(class7929, n);
        if (method4338) {
            if (this.method4337() != method4337) {
                this.method1695(Class8520.field35314, 1.0f, 1.0f);
            }
        }
        return method4338;
    }
    
    public Class2195 method4337() {
        return Class2195.method8369(this.method2664() / this.method2701());
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 4) {
            if (b != 11) {
                if (b != 34) {
                    super.method1798(b);
                }
                else {
                    this.field4197 = 0;
                }
            }
            else {
                this.field4197 = 400;
            }
        }
        else {
            this.field4196 = 10;
            this.method1695(Class8520.field35313, 1.0f, 1.0f);
        }
    }
    
    public int method4338() {
        return this.field4196;
    }
    
    public void method4339(final boolean b) {
        if (!b) {
            this.field4197 = 0;
            this.field2391.method6761(this, (byte)34);
        }
        else {
            this.field4197 = 400;
            this.field2391.method6761(this, (byte)11);
        }
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35316;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35315;
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() != Class7739.field31284) {
            return false;
        }
        final float method2716 = this.method2664();
        this.method2663(25.0f);
        if (this.method2664() != method2716) {
            this.method1695(Class8520.field35317, 1.0f, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f);
            if (!class512.field3025.field27304) {
                method2715.method27693(1);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(Class8520.field35318, 1.0f, 1.0f);
    }
    
    public int method4340() {
        return this.field4197;
    }
    
    public boolean method4341() {
        return (this.field2432.method33568(Class786.field4195) & 0x1) != 0x0;
    }
    
    public void method4342(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class786.field4195);
        if (!b) {
            this.field2432.method33569(Class786.field4195, (byte)(byteValue & 0xFFFFFFFE));
        }
        else {
            this.field2432.method33569(Class786.field4195, (byte)(byteValue | 0x1));
        }
    }
    
    @Override
    public void method2673(final Class7929 class7929) {
        super.method2673(class7929);
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        final Class354 class1853 = new Class354(this);
        final Class354 method1139 = class1853.method1139();
        if (class1852.method6701(method1139).method21731(class1852, method1139, this)) {
            for (int i = 1; i < 3; ++i) {
                final Class354 method1140 = class1853.method1138(i);
                final Class7096 method1141 = class1852.method6701(method1140);
                if (!Class8532.method28620(class1852, method1140, method1141, method1141.method21756())) {
                    return false;
                }
            }
            return Class8532.method28620(class1852, class1853, class1852.method6701(class1853), Class7558.field29974.method22148()) && class1852.method6975(this);
        }
        return false;
    }
    
    static {
        field4195 = Class9184.method33564(Class786.class, Class7709.field30653);
    }
}
