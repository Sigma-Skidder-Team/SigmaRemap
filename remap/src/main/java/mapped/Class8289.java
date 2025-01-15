// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.stream.Stream;
import java.util.Set;

public class Class8289
{
    private static final Set<Class8289> field34084;
    public static final Class8289 field34085;
    public static final Class8289 field34086;
    public static final Class8289 field34087;
    public static final Class8289 field34088;
    public static final Class8289 field34089;
    public static final Class8289 field34090;
    private final String field34091;
    
    public Class8289(final String field34091) {
        this.field34091 = field34091;
    }
    
    private static Class8289 method27555(final Class8289 class8289) {
        Class8289.field34084.add(class8289);
        return class8289;
    }
    
    public static Stream<Class8289> method27556() {
        return Class8289.field34084.stream();
    }
    
    public String method27557() {
        return this.field34091;
    }
    
    static {
        field34084 = (Set)new ObjectArraySet();
        field34085 = method27555(new Class8289("oak"));
        field34086 = method27555(new Class8289("spruce"));
        field34087 = method27555(new Class8289("birch"));
        field34088 = method27555(new Class8289("acacia"));
        field34089 = method27555(new Class8289("jungle"));
        field34090 = method27555(new Class8289("dark_oak"));
    }
}
