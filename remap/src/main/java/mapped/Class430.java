// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class430 extends Class428
{
    private static String[] field2641;
    
    public Class430(final Class7499<?> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class430(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field28999, class1847, n, n2, n3);
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        if (class512.method2804()) {
            return false;
        }
        if (!this.method1806()) {
            if (!this.field2391.field10067) {
                class512.method1778(this);
            }
            return true;
        }
        return true;
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.method1806()) {
                this.method1783();
            }
            if (this.method2136() == 0) {
                this.method2137(-this.method2138());
                this.method2135(10);
                this.method2133(50.0f);
                this.method1739();
            }
        }
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12024;
    }
}
