// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class8804<P extends Class357>
{
    public static final Class8804<Class360> field37004;
    public static final Class8804<Class358> field37005;
    public static final Class8804<Class359> field37006;
    public static final Class8804<Class362> field37007;
    private final Function<Dynamic<?>, P> field37008;
    
    private static <P extends Class357> Class8804<P> method30717(final String s, final Function<Dynamic<?>, P> function) {
        return Class90.method511(Class90.field218, s, new Class8804<P>(function));
    }
    
    private Class8804(final Function<Dynamic<?>, P> field37008) {
        this.field37008 = field37008;
    }
    
    public P method30718(final Dynamic<?> dynamic) {
        return this.field37008.apply(dynamic);
    }
    
    static {
        field37004 = method30717("simple_state_provider", Class360::new);
        field37005 = method30717("weighted_state_provider", Class358::new);
        field37006 = method30717("plain_flower_provider", Class359::new);
        field37007 = method30717("forest_flower_provider", Class362::new);
    }
}
