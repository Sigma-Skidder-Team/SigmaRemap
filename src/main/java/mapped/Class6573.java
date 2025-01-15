// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6573 extends Class6564
{
    private static String[] field26093;
    private final Class844 field26094;
    
    public Class6573(final Class844 field26094) {
        super(field26094);
        this.field26094 = field26094;
    }
    
    @Override
    public void method19904() {
        if (this.field26073 == Class2198.field13376 && !this.field26094.method4150().method24731()) {
            final Class5487 class5487 = new Class5487(this.field26067 - this.field26094.method1938(), this.field26068 - this.field26094.method1941(), this.field26069 - this.field26094.method1945());
            final double method16752 = class5487.method16752();
            final double n = class5487.field22770 / method16752;
            final double n2 = class5487.field22771 / method16752;
            final double n3 = class5487.field22772 / method16752;
            this.field26094.field2399 = this.method19909(this.field26094.field2399, (float)(Class9546.method35693(class5487.field22772, class5487.field22770) * 57.2957763671875) - 90.0f, 90.0f);
            this.field26094.field2951 = this.field26094.field2399;
            final float method16753 = Class9546.method35700(0.125f, this.field26094.method2732(), (float)(this.field26070 * this.field26094.method2710(Class8107.field33408).method23950()));
            this.field26094.method2733(method16753);
            final double n4 = Math.sin((this.field26094.field2424 + this.field26094.method1643()) * 0.5) * 0.05;
            final double cos = Math.cos(this.field26094.field2399 * 0.017453292f);
            final double sin = Math.sin(this.field26094.field2399 * 0.017453292f);
            this.field26094.method1936(this.field26094.method1935().method16744(n4 * cos, Math.sin((this.field26094.field2424 + this.field26094.method1643()) * 0.75) * 0.05 * (sin + cos) * 0.25 + method16753 * n2 * 0.1, n4 * sin));
            final Class7727 method16754 = this.field26094.method4147();
            final double n5 = this.field26094.method1938() + n * 2.0;
            final double n6 = this.field26094.method1944() + n2 / method16752;
            final double n7 = this.field26094.method1945() + n3 * 2.0;
            double method16755 = method16754.method24672();
            double method16756 = method16754.method24673();
            double method16757 = method16754.method24674();
            if (!method16754.method24671()) {
                method16755 = n5;
                method16756 = n6;
                method16757 = n7;
            }
            this.field26094.method4147().method24669(Class9546.method35701(0.125, method16755, n5), Class9546.method35701(0.125, method16756, n6), Class9546.method35701(0.125, method16757, n7), 10.0f, 40.0f);
            Class844.method5066(this.field26094, true);
        }
        else {
            this.field26094.method2733(0.0f);
            Class844.method5066(this.field26094, false);
        }
    }
}
