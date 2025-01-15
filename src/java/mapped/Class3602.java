// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3602 extends Class3446
{
    private static String[] field16776;
    private int field16777;
    public final /* synthetic */ Class839 field16778;
    
    private Class3602(final Class839 field16778) {
        this.field16778 = field16778;
    }
    
    @Override
    public boolean method11013() {
        final Class511 method2634 = this.field16778.method2634();
        return this.field16778.method1706() && method2634 != null && this.field16778.method1734(method2634) < 100.0;
    }
    
    @Override
    public void method11015() {
        this.field16777 = 0;
    }
    
    @Override
    public void method11016() {
        ++this.field16777;
        final Class511 method2634 = this.field16778.method2634();
        if (method2634 != null) {
            Class5487 class5487 = new Class5487(this.field16778.method1938() - method2634.method1938(), this.field16778.method1941() - method2634.method1941(), this.field16778.method1945() - method2634.method1945());
            final Class7096 method2635 = this.field16778.field2391.method6701(new Class354(this.field16778.method1938() + class5487.field22770, this.field16778.method1941() + class5487.field22771, this.field16778.method1945() + class5487.field22772));
            if (this.field16778.field2391.method6702(new Class354(this.field16778.method1938() + class5487.field22770, this.field16778.method1941() + class5487.field22771, this.field16778.method1945() + class5487.field22772)).method21793(Class7324.field28319) || method2635.method21706()) {
                final double method2636 = class5487.method16752();
                if (method2636 > 0.0) {
                    class5487.method16738();
                    float n = 3.0f;
                    if (method2636 > 5.0) {
                        n -= (float)((method2636 - 5.0) / 5.0);
                    }
                    if (n > 0.0f) {
                        class5487 = class5487.method16748(n);
                    }
                }
                if (method2635.method21706()) {
                    class5487 = class5487.method16742(0.0, class5487.field22771, 0.0);
                }
                this.field16778.method4999((float)class5487.field22770 / 20.0f, (float)class5487.field22771 / 20.0f, (float)class5487.field22772 / 20.0f);
            }
            if (this.field16777 % 10 == 5) {
                this.field16778.field2391.method6709(Class8432.field34601, this.field16778.method1938(), this.field16778.method1941(), this.field16778.method1945(), 0.0, 0.0, 0.0);
            }
        }
    }
}
