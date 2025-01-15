// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.EnumSet;

public class Class3496 extends Class3446
{
    private static String[] field16444;
    public final Class787 field16445;
    private double field16446;
    private double field16447;
    private double field16448;
    private final double field16449;
    private final Class1847 field16450;
    
    public Class3496(final Class787 field16445, final double field16446) {
        this.field16445 = field16445;
        this.field16449 = field16446;
        this.field16450 = field16445.field2391;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return this.field16445.method4152() == null && this.field16450.method6703() && this.field16445.method1804() && this.field16450.method6994(new Class354(this.field16445)) && this.field16445.method2718(Class2215.field13605).method27620() && this.method11059();
    }
    
    public boolean method11059() {
        final Class5487 method11060 = this.method11060();
        if (method11060 != null) {
            this.field16446 = method11060.field22770;
            this.field16447 = method11060.field22771;
            this.field16448 = method11060.field22772;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16445.method4150().method24731();
    }
    
    @Override
    public void method11015() {
        this.field16445.method4150().method24724(this.field16446, this.field16447, this.field16448, this.field16449);
    }
    
    @Nullable
    public Class5487 method11060() {
        final Random method2633 = this.field16445.method2633();
        final Class354 class354 = new Class354(this.field16445);
        for (int i = 0; i < 10; ++i) {
            final Class354 method2634 = class354.method1134(method2633.nextInt(20) - 10, method2633.nextInt(6) - 3, method2633.nextInt(20) - 10);
            if (!this.field16450.method6994(method2634) && this.field16445.method4345(method2634) < 0.0f) {
                return new Class5487(method2634);
            }
        }
        return null;
    }
}
