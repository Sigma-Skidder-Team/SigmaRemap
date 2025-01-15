// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3829 extends Class3820
{
    private static String[] field17382;
    private static final Map<Class181, Class3829> field17383;
    private final Class181 field17384;
    
    public Class3829(final Class181 field17384, final Class8959 class8959) {
        super(class8959);
        this.field17384 = field17384;
        Class3829.field17383.put(field17384, this);
    }
    
    @Override
    public boolean method11714(final ItemStack class8321, final Class512 class8322, final Class511 class8323, final Class316 class8324) {
        if (!(class8323 instanceof Class802)) {
            return false;
        }
        final Class802 class8325 = (Class802)class8323;
        if (class8325.method1768()) {
            if (!class8325.method4636()) {
                if (class8325.method4634() != this.field17384) {
                    class8325.method4635(this.field17384);
                    class8321.method27693(1);
                }
            }
        }
        return true;
    }
    
    public Class181 method11767() {
        return this.field17384;
    }
    
    public static Class3829 method11768(final Class181 class181) {
        return Class3829.field17383.get(class181);
    }
    
    static {
        field17383 = Maps.newEnumMap((Class)Class181.class);
    }
}
