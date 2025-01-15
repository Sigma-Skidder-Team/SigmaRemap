// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.time.temporal.TemporalField;
import java.time.temporal.ChronoField;
import java.time.LocalDate;
import java.util.Random;
import javax.annotation.Nullable;

public class Class856 extends Class855
{
    private static final Class8810<Byte> field4562;
    private static final Class7843 field4563;
    private Class354 field4564;
    
    public Class856(final Class7499<? extends Class856> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.method5145(true);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class856.field4562, (Byte)0);
    }
    
    @Override
    public float method2720() {
        return 0.1f;
    }
    
    @Override
    public float method2721() {
        return super.method2721() * 0.95f;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return (this.method5144() && this.field2423.nextInt(4) != 0) ? null : Class8520.field35005;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35007;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35006;
    }
    
    @Override
    public boolean method1750() {
        return false;
    }
    
    @Override
    public void method2741(final Class399 class399) {
    }
    
    @Override
    public void method2739() {
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(6.0);
    }
    
    public boolean method5144() {
        return (this.field2432.method33568(Class856.field4562) & 0x1) != 0x0;
    }
    
    public void method5145(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class856.field4562);
        if (!b) {
            this.field2432.method33569(Class856.field4562, (byte)(byteValue & 0xFFFFFFFE));
        }
        else {
            this.field2432.method33569(Class856.field4562, (byte)(byteValue | 0x1));
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.method5144()) {
            this.method1936(this.method1935().method16751(1.0, 0.6, 1.0));
        }
        else {
            this.method1936(Class5487.field22769);
            this.method1948(this.method1938(), Class9546.method35644(this.method1941()) + 1.0 - this.method1931(), this.method1945());
        }
    }
    
    @Override
    public void method4172() {
        super.method4172();
        final Class354 class354 = new Class354(this);
        final Class354 method1137 = class354.method1137();
        if (!this.method5144()) {
            if (this.field4564 != null) {
                if (!this.field2391.method6961(this.field4564) || this.field4564.method1075() < 1) {
                    this.field4564 = null;
                }
            }
            Label_0319: {
                if (this.field4564 != null) {
                    if (this.field2423.nextInt(30) != 0) {
                        if (!this.field4564.method1082(this.method1934(), 2.0)) {
                            break Label_0319;
                        }
                    }
                }
                this.field4564 = new Class354(this.method1938() + this.field2423.nextInt(7) - this.field2423.nextInt(7), this.method1941() + this.field2423.nextInt(6) - 2.0, this.method1945() + this.field2423.nextInt(7) - this.field2423.nextInt(7));
            }
            final double d = this.field4564.method1074() + 0.5 - this.method1938();
            final double d2 = this.field4564.method1075() + 0.1 - this.method1941();
            final double d3 = this.field4564.method1076() + 0.5 - this.method1945();
            final Class5487 method1138 = this.method1935();
            final Class5487 method1139 = method1138.method16744((Math.signum(d) * 0.5 - method1138.field22770) * 0.10000000149011612, (Math.signum(d2) * 0.699999988079071 - method1138.field22771) * 0.10000000149011612, (Math.signum(d3) * 0.5 - method1138.field22772) * 0.10000000149011612);
            this.method1936(method1139);
            final float method1140 = Class9546.method35668((float)(Class9546.method35693(method1139.field22772, method1139.field22770) * 57.2957763671875) - 90.0f - this.field2399);
            this.field2970 = 0.5f;
            this.field2399 += method1140;
            if (this.field2423.nextInt(100) == 0) {
                if (this.field2391.method6701(method1137).method21713(this.field2391, method1137)) {
                    this.method5145(true);
                }
            }
        }
        else if (!this.field2391.method6701(method1137).method21713(this.field2391, class354)) {
            this.method5145(false);
            this.field2391.method6839(null, 1025, class354, 0);
        }
        else {
            if (this.field2423.nextInt(200) == 0) {
                this.field2953 = (float)this.field2423.nextInt(360);
            }
            if (this.field2391.method7135(Class856.field4563, this) != null) {
                this.method5145(false);
                this.field2391.method6839(null, 1025, class354, 0);
            }
        }
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final Class354 class7097) {
    }
    
    @Override
    public boolean method1861() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (!this.field2391.field10067) {
                if (this.method5144()) {
                    this.method5145(false);
                }
            }
            return super.method1740(class7929, n);
        }
        return false;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field2432.method33569(Class856.field4562, class51.method317("BatFlags"));
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method296("BatFlags", this.field2432.method33568(Class856.field4562));
    }
    
    public static boolean method5146(final Class7499<Class856> class7499, final Class1851 class7500, final Class2101 class7501, final Class354 class7502, final Random random) {
        if (class7502.method1075() < class7500.method6743()) {
            final int method6969 = class7500.method6969(class7502);
            int bound = 4;
            if (!method5147()) {
                if (random.nextBoolean()) {
                    return false;
                }
            }
            else {
                bound = 7;
            }
            return method6969 <= random.nextInt(bound) && Class759.method4178(class7499, class7500, class7501, class7502, random);
        }
        return false;
    }
    
    private static boolean method5147() {
        final LocalDate now = LocalDate.now();
        final int value = now.get(ChronoField.DAY_OF_MONTH);
        final int value2 = now.get(ChronoField.MONTH_OF_YEAR);
        return (value2 == 10 && value >= 20) || (value2 == 11 && value <= 3);
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return class291.field34098 / 2.0f;
    }
    
    static {
        field4562 = Class9184.method33564(Class856.class, Class7709.field30653);
        field4563 = new Class7843().method25337(4.0).method25339();
    }
}
