// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7742<P extends Class367>
{
    public static final Class7742<Class371> field31647;
    public static final Class7742<Class370> field31648;
    public static final Class7742<Class369> field31649;
    public static final Class7742<Class372> field31650;
    public static final Class7742<Class368> field31651;
    private final Function<Dynamic<?>, P> field31652;
    
    private static <P extends Class367> Class7742<P> method24706(final String s, final Function<Dynamic<?>, P> function) {
        return Registry.method511(Registry.field221, s, new Class7742<P>(function));
    }
    
    private Class7742(final Function<Dynamic<?>, P> field31652) {
        this.field31652 = field31652;
    }
    
    public P method24707(final Dynamic<?> dynamic) {
        return this.field31652.apply(dynamic);
    }
    
    static {
        field31647 = method24706("trunk_vine", Class371::new);
        field31648 = method24706("leave_vine", Class370::new);
        field31649 = method24706("cocoa", Class369::new);
        field31650 = method24706("beehive", Class372::new);
        field31651 = method24706("alter_ground", Class368::new);
    }
}
