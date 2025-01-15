// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7074 extends Class7075
{
    private static String[] field27547;
    public Class354 field27548;
    public boolean field27549;
    
    public Class7074(final Class7075 class7075) {
        this(class7075.method21654(), class7075.method21652(), class7075.method21653(), class7075.method21651(), class7075.field27553);
    }
    
    public Class7074(final Class1847 class1847, final Class512 class1848, final Class316 class1849, final Class8321 class1850, final Class7005 class1851) {
        super(class1847, class1848, class1849, class1850, class1851);
        this.field27549 = true;
        this.field27548 = class1851.method21447().method1149(class1851.method21448());
        this.field27549 = class1847.method6701(class1851.method21447()).method21750(this);
    }
    
    public static Class7074 method21647(final Class7074 class7074, final Class354 class7075, final Class179 class7076) {
        return new Class7074(class7074.method21654(), class7074.method21652(), class7074.method21653(), class7074.method21651(), new Class7005(new Class5487(class7075.method1074() + 0.5 + class7076.method785() * 0.5, class7075.method1075() + 0.5 + class7076.method786() * 0.5, class7075.method1076() + 0.5 + class7076.method787() * 0.5), class7076, class7075, false));
    }
    
    @Override
    public Class354 method21639() {
        return this.field27549 ? super.method21639() : this.field27548;
    }
    
    public boolean method21640() {
        return this.field27549 || this.method21654().method6701(this.method21639()).method21750(this);
    }
    
    public boolean method21641() {
        return this.field27549;
    }
    
    public Class179 method21642() {
        return Class179.method775(this.field27551)[0];
    }
    
    public Class179[] method21643() {
        final Class179[] method775 = Class179.method775(this.field27551);
        if (!this.field27549) {
            Class179 method776;
            int n;
            for (method776 = this.method21648(), n = 0; n < method775.length && method775[n] != method776.method782(); ++n) {}
            if (n > 0) {
                System.arraycopy(method775, 0, method775, 1, n);
                method775[0] = method776.method782();
            }
            return method775;
        }
        return method775;
    }
}
