// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class8039
{
    private static Class6208<EntityType<?>> field33097;
    private static int field33098;
    public static final Class7909<EntityType<?>> field33099;
    public static final Class7909<EntityType<?>> field33100;
    public static final Class7909<EntityType<?>> field33101;
    public static final Class7909<EntityType<?>> field33102;
    
    public static void method26370(final Class6208<EntityType<?>> field33097) {
        Class8039.field33097 = field33097;
        ++Class8039.field33098;
    }
    
    public static Class6208<EntityType<?>> method26371() {
        return Class8039.field33097;
    }
    
    private static Class7909<EntityType<?>> method26372(final String s) {
        return new Class7908(new Class1932(s));
    }
    
    static {
        Class8039.field33097 = new Class6208<EntityType<?>>(p0 -> Optional.empty(), "", false, "");
        field33099 = method26372("skeletons");
        field33100 = method26372("raiders");
        field33101 = method26372("beehive_inhabitors");
        field33102 = method26372("arrows");
    }
}
