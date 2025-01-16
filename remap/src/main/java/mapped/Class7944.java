// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7944<P extends Class378>
{
    public static final Class7944<Class379> field32619;
    public static final Class7944<Class382> field32620;
    public static final Class7944<Class381> field32621;
    public static final Class7944<Class380> field32622;
    private final Function<Dynamic<?>, P> field32623;
    
    private static <P extends Class378> Class7944<P> method25766(final String s, final Function<Dynamic<?>, P> function) {
        return Registry.method511(Registry.field220, s, new Class7944<P>(function));
    }
    
    private Class7944(final Function<Dynamic<?>, P> field32623) {
        this.field32623 = field32623;
    }
    
    public P method25767(final Dynamic<?> dynamic) {
        return this.field32623.apply(dynamic);
    }
    
    static {
        field32619 = method25766("blob_foliage_placer", Class379::new);
        field32620 = method25766("spruce_foliage_placer", Class382::new);
        field32621 = method25766("pine_foliage_placer", Class381::new);
        field32622 = method25766("acacia_foliage_placer", Class380::new);
    }
}
