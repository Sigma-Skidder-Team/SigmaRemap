// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6565 extends Class6564
{
    private static String[] field26074;
    public final /* synthetic */ Class843 field26075;
    
    public Class6565(final Class843 field26075, final Class843 class843) {
        this.field26075 = field26075;
        super(class843);
    }
    
    @Override
    public void method19904() {
        if (this.field26073 == Class2198.field13376) {
            final Class5487 class5487 = new Class5487(this.field26067 - this.field26075.method1938(), this.field26068 - this.field26075.method1941(), this.field26069 - this.field26075.method1945());
            final double method16752 = class5487.method16752();
            if (method16752 >= this.field26075.method1886().method18507()) {
                this.field26075.method1936(this.field26075.method1935().method16743(class5487.method16748(this.field26070 * 0.05 / method16752)));
                if (this.field26075.method4152() != null) {
                    this.field26075.field2399 = -(float)Class9546.method35693(this.field26075.method4152().method1938() - this.field26075.method1938(), this.field26075.method4152().method1945() - this.field26075.method1945()) * 57.295776f;
                    this.field26075.field2951 = this.field26075.field2399;
                }
                else {
                    final Class5487 method16753 = this.field26075.method1935();
                    this.field26075.field2399 = -(float)Class9546.method35693(method16753.field22770, method16753.field22772) * 57.295776f;
                    this.field26075.field2951 = this.field26075.field2399;
                }
            }
            else {
                this.field26073 = Class2198.field13375;
                this.field26075.method1936(this.field26075.method1935().method16748(0.5));
            }
        }
    }
}
