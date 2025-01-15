// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3588 extends Class3587
{
    private static String[] field16717;
    private final Class793 field16725;
    
    public Class3588(final Class793 field16725, final double n) {
        super(field16725, n);
        this.field16725 = field16725;
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && !this.field16725.method4456();
    }
    
    @Override
    public void method11119() {
        Class513 class513 = this.field16719.method4362();
        if (class513 == null) {
            if (this.field16722.method4362() != null) {
                class513 = this.field16722.method4362();
            }
        }
        if (class513 != null) {
            class513.method2857(Class8276.field34018);
            Class7770.field31789.method13804(class513, this.field16719, this.field16722, null);
        }
        Class793.method4472(this.field16725, true);
        this.field16719.method4364();
        this.field16722.method4364();
        final Random method2633 = this.field16719.method2633();
        if (this.field16721.method6765().method31216(Class8878.field37319)) {
            this.field16721.method6886(new Class508(this.field16721, this.field16719.method1938(), this.field16719.method1941(), this.field16719.method1945(), method2633.nextInt(7) + 1));
        }
    }
}
