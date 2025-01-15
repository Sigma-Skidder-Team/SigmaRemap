// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public interface Class7807
{
    default Class7808 method25212(final Class4148 class4148) {
        return method25213((Map<Class6332, Class4148>)ImmutableMap.of(), class4148);
    }
    
    default Class7808 method25213(final Map<Class6332, Class4148> map, final Class4148 class4148) {
        return new Class7808(class4148, map);
    }
    
    Class4150 method25214(final Class6332 p0);
}
