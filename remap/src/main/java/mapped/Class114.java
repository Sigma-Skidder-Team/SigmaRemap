// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class114 implements Predicate<Class7096>
{
    private static String[] field357;
    private static final Class114 field358;
    private final Material field359;
    
    private Class114(final Material field359) {
        this.field359 = field359;
    }
    
    public static Class114 method607(final Material class8059) {
        return (class8059 != Material.AIR) ? new Class114(class8059) : Class114.field358;
    }
    
    @Override
    public boolean test(final Class7096 class7096) {
        return class7096 != null && class7096.method21697() == this.field359;
    }
    
    static {
        field358 = new Class115(Material.AIR);
    }
}