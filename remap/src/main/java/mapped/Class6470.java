// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Class6470 extends Class6469
{
    public final float field25823;
    public final double field25824;
    public double field25825;
    public Function<Class5760, Double> field25826;
    public BiConsumer<Class5760, Double> field25827;
    public BiFunction<Class5760, Class6470, String> field25828;
    
    public Class6470(final String s, final double field25824, final double field25825, final float field25826, final Function<Class5760, Double> field25827, final BiConsumer<Class5760, Double> field25828, final BiFunction<Class5760, Class6470, String> field25829) {
        super(s);
        this.field25824 = field25824;
        this.field25825 = field25825;
        this.field25823 = field25826;
        this.field25826 = field25827;
        this.field25827 = field25828;
        this.field25828 = field25829;
    }
    
    @Override
    public Class573 method19362(final Class5760 class5760, final int n, final int n2, final int n3) {
        return new Class661(class5760, n, n2, n3, 20, this);
    }
    
    public double method19469(final double n) {
        return Class9546.method35654((this.method19471(n) - this.field25824) / (this.field25825 - this.field25824), 0.0, 1.0);
    }
    
    public double method19470(final double n) {
        return this.method19471(Class9546.method35701(Class9546.method35654(n, 0.0, 1.0), this.field25824, this.field25825));
    }
    
    private double method19471(double n) {
        if (this.field25823 > 0.0f) {
            n = this.field25823 * Math.round(n / this.field25823);
        }
        return Class9546.method35654(n, this.field25824, this.field25825);
    }
    
    public double method19472() {
        return this.field25824;
    }
    
    public double method19473() {
        return this.field25825;
    }
    
    public void method19474(final float n) {
        this.field25825 = n;
    }
    
    public void method19475(final Class5760 class5760, final double d) {
        this.field25827.accept(class5760, d);
    }
    
    public double method19476(final Class5760 class5760) {
        return this.field25826.apply(class5760);
    }
    
    public String method19477(final Class5760 class5760) {
        return this.field25828.apply(class5760, this);
    }
}
