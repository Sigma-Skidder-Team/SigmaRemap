// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry;
import java.util.function.BiConsumer;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;

public class Class171 implements Class170
{
    private static String[] field493;
    private final Object2BooleanMap<String> field494;
    
    public Class171(final Object2BooleanMap<String> field494) {
        this.field494 = field494;
    }
    
    @Override
    public JsonElement method770() {
        final JsonObject jsonObject = new JsonObject();
        this.field494.forEach((BiConsumer)jsonObject::addProperty);
        return (JsonElement)jsonObject;
    }
    
    @Override
    public boolean test(final Class348 class348) {
        for (final Object2BooleanMap$Entry object2BooleanMap$Entry : this.field494.object2BooleanEntrySet()) {
            final Class8000 method1037 = class348.method1037((String)object2BooleanMap$Entry.getKey());
            if (method1037 != null && method1037.method26167() == object2BooleanMap$Entry.getBooleanValue()) {
                continue;
            }
            return false;
        }
        return true;
    }
}
