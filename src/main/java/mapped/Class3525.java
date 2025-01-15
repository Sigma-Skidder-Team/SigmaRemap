// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3525 extends Class3446
{
    private static String[] field16534;
    private final Class761 field16535;
    public int field16536;
    
    public Class3525(final Class761 field16535) {
        this.field16535 = field16535;
    }
    
    @Override
    public boolean method11013() {
        return this.field16535.method4152() != null;
    }
    
    @Override
    public void method11015() {
        this.field16536 = 0;
    }
    
    @Override
    public void method11018() {
        this.field16535.method4223(false);
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16535.method4152();
        if (method4152.method1734(this.field16535) < 4096.0 && this.field16535.method2747(method4152)) {
            final Class1847 field2391 = this.field16535.field2391;
            ++this.field16536;
            if (this.field16536 == 10) {
                field2391.method6839(null, 1015, new Class354(this.field16535), 0);
            }
            if (this.field16536 == 20) {
                final Class5487 method4153 = this.field16535.method1741(1.0f);
                final double n = method4152.method1938() - (this.field16535.method1938() + method4153.field22770 * 4.0);
                final double n2 = method4152.method1942(0.5) - (0.5 + this.field16535.method1942(0.5));
                final double n3 = method4152.method1945() - (this.field16535.method1945() + method4153.field22772 * 4.0);
                field2391.method6839(null, 1016, new Class354(this.field16535), 0);
                final Class417 class417 = new Class417(field2391, this.field16535, n, n2, n3);
                class417.field2525 = this.field16535.method4224();
                class417.method1656(this.field16535.method1938() + method4153.field22770 * 4.0, this.field16535.method1942(0.5) + 0.5, class417.method1945() + method4153.field22772 * 4.0);
                field2391.method6886(class417);
                this.field16536 = -40;
            }
        }
        else if (this.field16536 > 0) {
            --this.field16536;
        }
        this.field16535.method4223(this.field16536 > 10);
    }
}
