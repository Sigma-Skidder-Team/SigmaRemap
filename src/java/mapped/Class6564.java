// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6564
{
    private static String[] field26065;
    public final Class759 field26066;
    public double field26067;
    public double field26068;
    public double field26069;
    public double field26070;
    public float field26071;
    public float field26072;
    public Class2198 field26073;
    
    public Class6564(final Class759 field26066) {
        this.field26073 = Class2198.field13375;
        this.field26066 = field26066;
    }
    
    public boolean method19905() {
        return this.field26073 == Class2198.field13376;
    }
    
    public double method19906() {
        return this.field26070;
    }
    
    public void method19907(final double field26067, final double field26068, final double field26069, final double field26070) {
        this.field26067 = field26067;
        this.field26068 = field26068;
        this.field26069 = field26069;
        this.field26070 = field26070;
        if (this.field26073 != Class2198.field13378) {
            this.field26073 = Class2198.field13376;
        }
    }
    
    public void method19908(final float field26071, final float field26072) {
        this.field26073 = Class2198.field13377;
        this.field26071 = field26071;
        this.field26072 = field26072;
        this.field26070 = 0.25;
    }
    
    public void method19904() {
        if (this.field26073 != Class2198.field13377) {
            if (this.field26073 != Class2198.field13376) {
                if (this.field26073 != Class2198.field13378) {
                    this.field26066.method4162(0.0f);
                }
                else {
                    this.field26066.method2733((float)(this.field26070 * this.field26066.method2710(Class8107.field33408).method23950()));
                    if (this.field26066.field2404) {
                        this.field26073 = Class2198.field13375;
                    }
                }
            }
            else {
                this.field26073 = Class2198.field13375;
                final double n = this.field26067 - this.field26066.method1938();
                final double n2 = this.field26069 - this.field26066.method1945();
                final double n3 = this.field26068 - this.field26066.method1941();
                if (n * n + n3 * n3 + n2 * n2 >= 2.500000277905201E-7) {
                    this.field26066.field2399 = this.method19909(this.field26066.field2399, (float)(Class9546.method35693(n2, n) * 57.2957763671875) - 90.0f, 90.0f);
                    this.field26066.method2733((float)(this.field26070 * this.field26066.method2710(Class8107.field33408).method23950()));
                    final Class354 class354 = new Class354(this.field26066);
                    final Class7096 method6701 = this.field26066.field2391.method6701(class354);
                    final Class3833 method6702 = method6701.method21696();
                    final Class7702 method6703 = method6701.method21727(this.field26066.field2391, class354);
                    Label_0593: {
                        if (n3 > this.field26066.field2420 && n * n + n2 * n2 < Math.max(1.0f, this.field26066.method1930())) {
                            break Label_0593;
                        }
                        if (!method6703.method24540()) {
                            if (this.field26066.method1941() < method6703.method24536(Class111.field352) + class354.method1075()) {
                                if (!method6702.method11785(Class7188.field27891)) {
                                    if (!method6702.method11785(Class7188.field27911)) {
                                        break Label_0593;
                                    }
                                }
                            }
                        }
                        return;
                    }
                    this.field26066.method4149().method22382();
                    this.field26073 = Class2198.field13378;
                    return;
                }
                this.field26066.method4162(0.0f);
            }
        }
        else {
            final float n4 = (float)this.field26066.method2710(Class8107.field33408).method23950();
            float n5 = (float)this.field26070 * n4;
            final float field26071 = this.field26071;
            final float field26072 = this.field26072;
            float method6704 = Class9546.method35640(field26071 * field26071 + field26072 * field26072);
            if (method6704 < 1.0f) {
                method6704 = 1.0f;
            }
            final float n6 = n5 / method6704;
            final float n7 = field26071 * n6;
            final float n8 = field26072 * n6;
            final float method6705 = Class9546.method35638(this.field26066.field2399 * 0.017453292f);
            final float method6706 = Class9546.method35639(this.field26066.field2399 * 0.017453292f);
            final float n9 = n7 * method6706 - n8 * method6705;
            final float n10 = n8 * method6706 + n7 * method6705;
            final Class7746 method6707 = this.field26066.method4150();
            if (method6707 != null) {
                final Class4654 method6708 = method6707.method24740();
                if (method6708 != null) {
                    if (method6708.method13913(this.field26066.field2391, Class9546.method35644(this.field26066.method1938() + n9), Class9546.method35644(this.field26066.method1941()), Class9546.method35644(this.field26066.method1945() + n10)) != Class257.field1207) {
                        this.field26071 = 1.0f;
                        this.field26072 = 0.0f;
                        n5 = n4;
                    }
                }
            }
            this.field26066.method2733(n5);
            this.field26066.method4162(this.field26071);
            this.field26066.method4164(this.field26072);
            this.field26073 = Class2198.field13375;
        }
    }
    
    public float method19909(final float n, final float n2, final float n3) {
        float method35668 = Class9546.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        float n4 = n + method35668;
        if (n4 >= 0.0f) {
            if (n4 > 360.0f) {
                n4 -= 360.0f;
            }
        }
        else {
            n4 += 360.0f;
        }
        return n4;
    }
    
    public double method19910() {
        return this.field26067;
    }
    
    public double method19911() {
        return this.field26068;
    }
    
    public double method19912() {
        return this.field26069;
    }
}
