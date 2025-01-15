// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3458 extends Class3446
{
    private static String[] field16305;
    private int field16306;
    public final /* synthetic */ Class841 field16307;
    
    public Class3458(final Class841 field16307) {
        this.field16307 = field16307;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final Class511 method4152 = this.field16307.method4152();
        return method4152 != null && method4152.method1768() && this.field16307.field2391.method6954() != Class2113.field12290;
    }
    
    @Override
    public void method11015() {
        this.field16306 = 20;
        this.field16307.method5022(100);
    }
    
    @Override
    public void method11018() {
        this.field16307.method5022(0);
    }
    
    @Override
    public void method11016() {
        if (this.field16307.field2391.method6954() != Class2113.field12290) {
            --this.field16306;
            final Class511 method4152 = this.field16307.method4152();
            this.field16307.method4147().method24667(method4152, 180.0f, 180.0f);
            if (this.field16307.method1734(method4152) >= 400.0) {
                this.field16307.method4153(null);
            }
            else if (this.field16306 <= 0) {
                this.field16306 = 20 + Class841.method5028(this.field16307).nextInt(10) * 20 / 2;
                this.field16307.field2391.method6886(new Class509(this.field16307.field2391, this.field16307, method4152, this.field16307.method5018().method790()));
                this.field16307.method1695(Class8520.field35558, 2.0f, (Class841.method5029(this.field16307).nextFloat() - Class841.method5030(this.field16307).nextFloat()) * 0.2f + 1.0f);
            }
            super.method11016();
        }
    }
}
