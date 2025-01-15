// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3519 extends Class3514
{
    private static String[] field16509;
    private final Class793 field16520;
    
    private Class3519(final Class793 field16520, final double n, final int n2) {
        super(field16520, n, n2);
        this.field16520 = field16520;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16510.method1706()) {
            if (!Class793.method4468(this.field16520)) {
                if (!this.field16520.method4456()) {
                    return super.method11013();
                }
            }
        }
        return false;
    }
}
