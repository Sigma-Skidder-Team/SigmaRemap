// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6092
{
    private static String[] field24704;
    private boolean field24705;
    private Class1855 field24706;
    private Class399 field24707;
    private Class5487 field24708;
    private final Class385 field24709;
    private final Class9138 field24710;
    private final Class9138 field24711;
    private final Class9138 field24712;
    private float field24713;
    private float field24714;
    private final Class9389 field24715;
    private boolean field24716;
    private boolean field24717;
    private float field24718;
    private float field24719;
    
    public Class6092() {
        this.field24708 = Class5487.field22769;
        this.field24709 = new Class385();
        this.field24710 = new Class9138(0.0f, 0.0f, 1.0f);
        this.field24711 = new Class9138(0.0f, 1.0f, 0.0f);
        this.field24712 = new Class9138(1.0f, 0.0f, 0.0f);
        this.field24715 = new Class9389(0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    public void method18154(final Class1855 field24706, final Class399 field24707, final boolean field24708, final boolean field24709, final float n) {
        this.field24705 = true;
        this.field24706 = field24706;
        this.field24707 = field24707;
        this.field24716 = field24708;
        this.field24717 = field24709;
        this.method18158(field24707.method1743(n), field24707.method1742(n));
        this.method18159(Class9546.method35701(n, field24707.field2392, field24707.method1938()), Class9546.method35701(n, field24707.field2393, field24707.method1941()) + Class9546.method35700(n, this.field24719, this.field24718), Class9546.method35701(n, field24707.field2394, field24707.method1945()));
        if (!field24708) {
            if (field24707 instanceof Class511) {
                if (((Class511)field24707).method2783()) {
                    final Class179 method2788 = ((Class511)field24707).method2788();
                    this.method18158((method2788 == null) ? 0.0f : (method2788.method797() - 180.0f), 0.0f);
                    this.method18157(0.0, 0.3, 0.0);
                }
            }
        }
        else {
            if (field24709) {
                this.method18158(this.field24714 + 180.0f, -this.field24713);
            }
            this.method18157(-this.method18156(4.0), 0.0, 0.0);
        }
    }
    
    public void method18155() {
        if (this.field24707 != null) {
            this.field24719 = this.field24718;
            this.field24718 += (this.field24707.method1892() - this.field24718) * 0.5f;
        }
    }
    
    private double method18156(double n) {
        for (int i = 0; i < 8; ++i) {
            final float n2 = (float)((i & 0x1) * 2 - 1);
            final float n3 = (float)((i >> 1 & 0x1) * 2 - 1);
            final float n4 = (float)((i >> 2 & 0x1) * 2 - 1);
            final float n5 = n2 * 0.1f;
            final float n6 = n3 * 0.1f;
            final float n7 = n4 * 0.1f;
            final Class7005 method6987 = this.field24706.method6987(new Class8478(this.field24708.method16744(n5, n6, n7), new Class5487(this.field24708.field22770 - this.field24710.method33311() * n + n5 + n7, this.field24708.field22771 - this.field24710.method33312() * n + n6, this.field24708.field22772 - this.field24710.method33313() * n + n7), Class2040.field11632, Class2191.field13325, this.field24707));
            if (method6987.method21449() != Class2165.field12880) {
                final double method6988 = method6987.method21451().method16745(this.field24708);
                if (method6988 < n) {
                    if (!Class9463.method35173().method35189().method21551(Class3193.class).method9906()) {
                        n = method6988;
                    }
                }
            }
        }
        return n;
    }
    
    public void method18157(final double n, final double n2, final double n3) {
        this.method18160(new Class5487(this.field24708.field22770 + (this.field24710.method33311() * n + this.field24711.method33311() * n2 + this.field24712.method33311() * n3), this.field24708.field22771 + (this.field24710.method33312() * n + this.field24711.method33312() * n2 + this.field24712.method33312() * n3), this.field24708.field22772 + (this.field24710.method33313() * n + this.field24711.method33313() * n2 + this.field24712.method33313() * n3)));
    }
    
    public void method18158(final float field24714, final float field24715) {
        this.field24713 = field24715;
        this.field24714 = field24714;
        this.field24715.method34906(0.0f, 0.0f, 0.0f, 1.0f);
        this.field24715.method34903(Class9138.field38718.method33328(-field24714));
        this.field24715.method34903(Class9138.field38716.method33328(field24715));
        this.field24710.method33317(0.0f, 0.0f, 1.0f);
        this.field24710.method33325(this.field24715);
        this.field24711.method33317(0.0f, 1.0f, 0.0f);
        this.field24711.method33325(this.field24715);
        this.field24712.method33317(1.0f, 0.0f, 0.0f);
        this.field24712.method33325(this.field24715);
    }
    
    public void method18159(final double n, final double n2, final double n3) {
        this.method18160(new Class5487(n, n2, n3));
    }
    
    public void method18160(final Class5487 field24708) {
        this.field24708 = field24708;
        this.field24709.method1286(field24708.field22770, field24708.field22771, field24708.field22772);
    }
    
    public Class5487 method18161() {
        return this.field24708;
    }
    
    public Class354 method18162() {
        return this.field24709;
    }
    
    public float method18163() {
        return this.field24713;
    }
    
    public float method18164() {
        return this.field24714;
    }
    
    public Class9389 method18165() {
        return this.field24715;
    }
    
    public Class399 method18166() {
        return this.field24707;
    }
    
    public boolean method18167() {
        return this.field24705;
    }
    
    public boolean method18168() {
        return this.field24716;
    }
    
    public Class7099 method18169() {
        if (this.field24705) {
            final Class7099 method6702 = this.field24706.method6702(this.field24709);
            return (!method6702.method21781() && this.field24708.field22771 >= this.field24709.method1075() + method6702.method21782(this.field24706, this.field24709)) ? Class7558.field29974.method22148() : method6702;
        }
        return Class7558.field29974.method22148();
    }
    
    public Class7096 method18170() {
        if (this.field24705) {
            return this.field24706.method6701(this.field24709);
        }
        return Class7521.field29147.method11878();
    }
    
    public void method18171(final float field24714, final float field24715) {
        this.field24714 = field24714;
        this.field24713 = field24715;
    }
    
    public Class7096 method18172() {
        if (this.field24705) {
            Class7096 method6701 = this.field24706.method6701(this.field24709);
            if (Class9570.field41245.method22605()) {
                method6701 = (Class7096)Class9570.method35826(method6701, Class9570.field41245, this.field24706, this.field24709, this.field24708);
            }
            return method6701;
        }
        return Class7521.field29147.method11878();
    }
    
    public final Class9138 method18173() {
        return this.field24710;
    }
    
    public final Class9138 method18174() {
        return this.field24711;
    }
    
    public void method18175() {
        this.field24706 = null;
        this.field24707 = null;
        this.field24705 = false;
    }
}
