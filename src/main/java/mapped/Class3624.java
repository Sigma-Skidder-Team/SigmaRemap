// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3624 extends Class3446
{
    private static String[] field16835;
    private final Class844 field16836;
    private int field16837;
    private final boolean field16838;
    
    public Class3624(final Class844 field16836) {
        this.field16836 = field16836;
        this.field16838 = (field16836 instanceof Class845);
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final Class511 method4152 = this.field16836.method4152();
        return method4152 != null && method4152.method1768();
    }
    
    @Override
    public boolean method11017() {
        return super.method11017() && (this.field16838 || this.field16836.method1734(this.field16836.method4152()) > 9.0);
    }
    
    @Override
    public void method11015() {
        this.field16837 = -10;
        this.field16836.method4150().method24733();
        this.field16836.method4147().method24667(this.field16836.method4152(), 90.0f, 90.0f);
        this.field16836.field2448 = true;
    }
    
    @Override
    public void method11018() {
        Class844.method5065(this.field16836, 0);
        this.field16836.method4153(null);
        this.field16836.field4507.method11072();
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16836.method4152();
        this.field16836.method4150().method24733();
        this.field16836.method4147().method24667(method4152, 90.0f, 90.0f);
        if (this.field16836.method2747(method4152)) {
            ++this.field16837;
            if (this.field16837 != 0) {
                if (this.field16837 >= this.field16836.method5056()) {
                    float n = 1.0f;
                    if (this.field16836.field2391.method6954() == Class2113.field12293) {
                        n += 2.0f;
                    }
                    if (this.field16838) {
                        n += 2.0f;
                    }
                    method4152.method1740(Class7929.method25700(this.field16836, this.field16836), n);
                    method4152.method1740(Class7929.method25693(this.field16836), (float)this.field16836.method2710(Class8107.field33410).method23950());
                    this.field16836.method4153(null);
                }
            }
            else {
                Class844.method5065(this.field16836, this.field16836.method4152().method1643());
                this.field16836.field2391.method6761(this.field16836, (byte)21);
            }
            super.method11016();
        }
        else {
            this.field16836.method4153(null);
        }
    }
}
