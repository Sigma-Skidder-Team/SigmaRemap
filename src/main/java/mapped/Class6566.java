// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6566 extends Class6564
{
    private static String[] field26065;
    private final Class792 field26076;
    private double field26077;
    
    public Class6566(final Class792 field26076) {
        super(field26076);
        this.field26076 = field26076;
    }
    
    @Override
    public void method19904() {
        Label_0017: {
            if (this.field26076.field2404) {
                if (!this.field26076.field2967) {
                    if (!((Class7295)Class792.method4449(this.field26076)).method22378()) {
                        this.field26076.method4434(0.0);
                        break Label_0017;
                    }
                }
            }
            if (this.method19905()) {
                this.field26076.method4434(this.field26077);
            }
        }
        super.method19904();
    }
    
    @Override
    public void method19907(final double n, final double n2, final double n3, double field26077) {
        if (this.field26076.method1706()) {
            field26077 = 1.5;
        }
        super.method19907(n, n2, n3, field26077);
        if (field26077 > 0.0) {
            this.field26077 = field26077;
        }
    }
}
