// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class7271<C>
{
    private static final Logger field28165;
    public static final Class7271<Class394> field28166;
    private final Map<Class1932, Class6810<C, ?>> field28167;
    private final Map<Class<?>, Class6810<C, ?>> field28168;
    
    public Class7271() {
        this.field28167 = Maps.newHashMap();
        this.field28168 = Maps.newHashMap();
    }
    
    public Class7271<C> method22277(final Class6810<C, ?> class6810) {
        this.field28167.put(class6810.method20844(), class6810);
        this.field28168.put(class6810.method20845(), class6810);
        return this;
    }
    
    private <T extends Class8183<C>> Class6810<C, T> method22278(final Class<?> clazz) {
        return (Class6810)this.field28168.get(clazz);
    }
    
    public <T extends Class8183<C>> Class51 method22279(final T t) {
        final Class6810<C, Class8183> method22278 = this.method22278(t.getClass());
        final Class51 class51 = new Class51();
        method22278.method20843(class51, t);
        class51.method306("Type", method22278.method20844().toString());
        return class51;
    }
    
    @Nullable
    public Class8183<C> method22280(final Class51 class51) {
        final Class6810 class52 = this.field28167.get(Class1932.method7795(class51.method323("Type")));
        if (class52 == null) {
            Class7271.field28165.error("Failed to deserialize timer callback: " + class51);
            return null;
        }
        try {
            return class52.method20842(class51);
        }
        catch (final Exception ex) {
            Class7271.field28165.error("Failed to deserialize timer callback: " + class51, (Throwable)ex);
            return null;
        }
    }
    
    static {
        field28165 = LogManager.getLogger();
        field28166 = new Class7271<Class394>().method22277(new Class6811()).method22277(new Class6809());
    }
}
