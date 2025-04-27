// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import java.util.Collections;
import java.util.Map;

public class Class9352
{
    public static final Map<Class9334, Int2ObjectMap<Class7954[]>> field40128 = Collections.emptyMap();
    public static final Int2ObjectMap<Class7954[]> field40129 = null;
    
    private static Int2ObjectMap<Class7954[]> method34667(final ImmutableMap<Integer, Class7954[]> immutableMap) {
        return (Int2ObjectMap<Class7954[]>)new Int2ObjectOpenHashMap(immutableMap);
    }
}
