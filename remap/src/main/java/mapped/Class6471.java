// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Class6471 extends Class6470
{
    public Class6471(final String s, final double n, final double n2, final float n3, final Function<Class5760, Double> function, final BiConsumer<Class5760, Double> biConsumer, final BiFunction<Class5760, Class6470, String> biFunction) {
        super(s, n, n2, n3, function, biConsumer, biFunction);
    }
    
    @Override
    public double method19469(final double n) {
        return Math.log(n / this.field25824) / Math.log(this.field25825 / this.field25824);
    }
    
    @Override
    public double method19470(final double n) {
        return this.field25824 * Math.pow(2.718281828459045, Math.log(this.field25825 / this.field25824) * n);
    }
}
