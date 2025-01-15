// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7749 extends Class7747
{
    private static String[] field31677;
    private Class354 field31680;
    
    public Class7749(final Class759 class759, final Class1847 class760) {
        super(class759, class760);
    }
    
    @Override
    public Class9468 method24721(final Class354 field31680, final int n) {
        this.field31680 = field31680;
        return super.method24721(field31680, n);
    }
    
    @Override
    public Class9468 method24722(final Class399 class399, final int n) {
        this.field31680 = new Class354(class399);
        return super.method24722(class399, n);
    }
    
    @Override
    public boolean method24725(final Class399 class399, final double field31660) {
        final Class9468 method24722 = this.method24722(class399, 0);
        if (method24722 == null) {
            this.field31680 = new Class354(class399);
            this.field31660 = field31660;
            return true;
        }
        return this.method24726(method24722, field31660);
    }
    
    @Override
    public void method24728() {
        if (this.method24731()) {
            if (this.field31680 != null) {
                if (!this.field31680.method1082(this.field31657.method1934(), this.field31657.method1930()) && (this.field31657.method1941() <= this.field31680.method1075() || !new Class354(this.field31680.method1074(), this.field31657.method1941(), this.field31680.method1076()).method1082(this.field31657.method1934(), this.field31657.method1930()))) {
                    this.field31657.method4148().method19907(this.field31680.method1074(), this.field31680.method1075(), this.field31680.method1076(), this.field31660);
                }
                else {
                    this.field31680 = null;
                }
            }
        }
        else {
            super.method24728();
        }
    }
}
