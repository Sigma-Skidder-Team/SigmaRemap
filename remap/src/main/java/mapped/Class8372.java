// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class8372<P extends Class373>
{
    public static final Class8372<Class375> field34331;
    public static final Class8372<Class374> field34332;
    public static final Class8372<Class376> field34333;
    private final Function<Dynamic<?>, P> field34334;
    
    private static <P extends Class373> Class8372<P> method27914(final String s, final Function<Dynamic<?>, P> function) {
        return Registry.register(Registry.field219, s, new Class8372<P>(function));
    }
    
    private Class8372(final Function<Dynamic<?>, P> field34334) {
        this.field34334 = field34334;
    }
    
    public P method27915(final Dynamic<?> dynamic) {
        return this.field34334.apply(dynamic);
    }
    
    static {
        field34331 = method27914("simple_block_placer", Class375::new);
        field34332 = method27914("double_plant_placer", Class374::new);
        field34333 = method27914("column_placer", Class376::new);
    }
}
