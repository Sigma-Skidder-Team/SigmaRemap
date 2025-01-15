// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5793 extends Class5791
{
    private static String[] field23790;
    private int field23791;
    private int field23792;
    private Class426 field23793;
    
    public Class5793(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17246() {
        ++this.field23791;
        if (this.field23791 % 2 == 0) {
            if (this.field23791 < 10) {
                final Class5487 method16738 = this.field23764.method5125(1.0f).method16738();
                method16738.method16755(-0.7853982f);
                final double method16739 = this.field23764.field4535.method1938();
                final double method16740 = this.field23764.field4535.method1942(0.5);
                final double method16741 = this.field23764.field4535.method1945();
                for (int i = 0; i < 8; ++i) {
                    final double n = method16739 + this.field23764.method2633().nextGaussian() / 2.0;
                    final double n2 = method16740 + this.field23764.method2633().nextGaussian() / 2.0;
                    final double n3 = method16741 + this.field23764.method2633().nextGaussian() / 2.0;
                    for (int j = 0; j < 6; ++j) {
                        this.field23764.field2391.method6709(Class8432.field34605, n, n2, n3, -method16738.field22770 * 0.07999999821186066 * j, -method16738.field22771 * 0.6000000238418579, -method16738.field22772 * 0.07999999821186066 * j);
                    }
                    method16738.method16755(0.19634955f);
                }
            }
        }
    }
    
    @Override
    public void method17247() {
        ++this.field23791;
        if (this.field23791 < 200) {
            if (this.field23791 == 10) {
                final Class5487 method16738 = new Class5487(this.field23764.field4535.method1938() - this.field23764.method1938(), 0.0, this.field23764.field4535.method1945() - this.field23764.method1945()).method16738();
                final double n = this.field23764.field4535.method1938() + method16738.field22770 * 5.0 / 2.0;
                final double n2 = this.field23764.field4535.method1945() + method16738.field22772 * 5.0 / 2.0;
                double method16739;
                final double n3 = method16739 = this.field23764.field4535.method1942(0.5);
                final Class385 class385 = new Class385(n, n3, n2);
                while (this.field23764.field2391.method6961(class385)) {
                    --method16739;
                    if (method16739 < 0.0) {
                        method16739 = n3;
                        break;
                    }
                    class385.method1286(n, method16739, n2);
                }
                (this.field23793 = new Class426(this.field23764.field2391, n, Class9546.method35644(method16739) + 1, n2)).method2097(this.field23764);
                this.field23793.method2081(5.0f);
                this.field23793.method2093(200);
                this.field23793.method2089(Class8432.field34605);
                this.field23793.method2085(new Class1948(Class9439.field40480));
                this.field23764.field2391.method6886(this.field23793);
            }
        }
        else if (this.field23792 < 4) {
            this.field23764.method5127().method33696(Class7193.field27954);
        }
        else {
            this.field23764.method5127().method33696(Class7193.field27952);
        }
    }
    
    @Override
    public void method17249() {
        this.field23791 = 0;
        ++this.field23792;
    }
    
    @Override
    public void method17250() {
        if (this.field23793 != null) {
            this.field23793.method1652();
            this.field23793 = null;
        }
    }
    
    @Override
    public Class7193<Class5793> method17253() {
        return Class7193.field27953;
    }
    
    public void method17265() {
        this.field23792 = 0;
    }
}
