// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.Maps;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;

public class Class8818 implements TypeAdapterFactory
{
    private static String[] field37030;
    
    @Nullable
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Class rawType = typeToken.getRawType();
        if (rawType.isEnum()) {
            final HashMap hashMap = Maps.newHashMap();
            for (final Object o : rawType.getEnumConstants()) {
                hashMap.put(this.method30760(o), o);
            }
            return (TypeAdapter<T>)new Class7905(this, hashMap);
        }
        return null;
    }
    
    private String method30760(final Object o) {
        return (o instanceof Enum) ? ((Enum)o).name().toLowerCase(Locale.ROOT) : o.toString().toLowerCase(Locale.ROOT);
    }
}
