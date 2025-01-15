// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3574 extends Class3446
{
    private static String[] field16684;
    public final Class787 field16685;
    public int field16686;
    private final double field16687;
    private final boolean field16688;
    private Class9468 field16689;
    private int field16690;
    private double field16691;
    private double field16692;
    private double field16693;
    public final int field16694 = 20;
    private long field16695;
    
    public Class3574(final Class787 field16685, final double field16686, final boolean field16687) {
        this.field16685 = field16685;
        this.field16687 = field16686;
        this.field16688 = field16687;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final long method6754 = this.field16685.field2391.method6754();
        if (method6754 - this.field16695 < 20L) {
            return false;
        }
        this.field16695 = method6754;
        final Class511 method6755 = this.field16685.method4152();
        if (method6755 == null) {
            return false;
        }
        if (method6755.method1768()) {
            this.field16689 = this.field16685.method4150().method24722(method6755, 0);
            return this.field16689 != null || this.method11117(method6755) >= this.field16685.method1733(method6755.method1938(), method6755.method1941(), method6755.method1945());
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        final Class511 method4152 = this.field16685.method4152();
        if (method4152 == null) {
            return false;
        }
        if (!method4152.method1768()) {
            return false;
        }
        if (this.field16688) {
            return this.field16685.method4197(new BlockPos(method4152)) && (!(method4152 instanceof Class512) || (!method4152.method1639() && !((Class512)method4152).method2889()));
        }
        return !this.field16685.method4150().method24731();
    }
    
    @Override
    public void method11015() {
        this.field16685.method4150().method24726(this.field16689, this.field16687);
        this.field16685.method4213(true);
        this.field16690 = 0;
    }
    
    @Override
    public void method11018() {
        if (!Class9170.field38849.test(this.field16685.method4152())) {
            this.field16685.method4153(null);
        }
        this.field16685.method4213(false);
        this.field16685.method4150().method24733();
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16685.method4152();
        this.field16685.method4147().method24667(method4152, 30.0f, 30.0f);
        final double method4153 = this.field16685.method1733(method4152.method1938(), method4152.method1941(), method4152.method1945());
        --this.field16690;
        Label_0068: {
            if (this.field16688 || this.field16685.method4151().method34143(method4152)) {
                if (this.field16690 <= 0) {
                    Label_0143: {
                        if (this.field16691 == 0.0) {
                            if (this.field16692 == 0.0) {
                                if (this.field16693 == 0.0) {
                                    break Label_0143;
                                }
                            }
                        }
                        if (method4152.method1733(this.field16691, this.field16692, this.field16693) < 1.0) {
                            if (this.field16685.method2633().nextFloat() >= 0.05f) {
                                break Label_0068;
                            }
                        }
                    }
                    this.field16691 = method4152.method1938();
                    this.field16692 = method4152.method1941();
                    this.field16693 = method4152.method1945();
                    this.field16690 = 4 + this.field16685.method2633().nextInt(7);
                    if (method4153 <= 1024.0) {
                        if (method4153 > 256.0) {
                            this.field16690 += 5;
                        }
                    }
                    else {
                        this.field16690 += 10;
                    }
                    if (!this.field16685.method4150().method24725(method4152, this.field16687)) {
                        this.field16690 += 15;
                    }
                }
            }
        }
        this.field16686 = Math.max(this.field16686 - 1, 0);
        this.method11116(method4152, method4153);
    }
    
    public void method11116(final Class511 class511, final double n) {
        if (n <= this.method11117(class511)) {
            if (this.field16686 <= 0) {
                this.field16686 = 20;
                this.field16685.method2707(Class316.field1877);
                this.field16685.method2734(class511);
            }
        }
    }
    
    public double method11117(final Class511 class511) {
        return this.field16685.method1930() * 2.0f * this.field16685.method1930() * 2.0f + class511.method1930();
    }
}
