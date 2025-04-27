// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonNull;
import java.util.ArrayList;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.List;

public class Class9357
{
    public static final Class9357 field40141;
    private final List<Class7591> field40142;
    
    private static Class7591 method34686(final String s, final JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "value");
            final String s2 = method35913.has("min") ? method34687(method35913.get("min")) : null;
            final String anObject = method35913.has("max") ? method34687(method35913.get("max")) : null;
            return (s2 != null && s2.equals(anObject)) ? new Class7590(s, s2) : new Class7592(s, s2, anObject);
        }
        return new Class7590(s, jsonElement.getAsString());
    }
    
    @Nullable
    private static String method34687(final JsonElement jsonElement) {
        return jsonElement.isJsonNull() ? null : jsonElement.getAsString();
    }
    
    private Class9357(final List<Class7591> list) {
        this.field40142 = (List<Class7591>)ImmutableList.copyOf((Collection)list);
    }
    
    public <S extends IStateHolder<S>> boolean method34688(final StateContainer<?, S> class9104, final S n) {
        final Iterator<Class7591> iterator = this.field40142.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method23885(class9104, n)) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public boolean method34689(final BlockState class7096) {
        return this.method34688(class7096.getBlock().getStateContainer(), class7096);
    }
    
    public boolean method34690(final IFluidState IFluidState) {
        return this.method34688(IFluidState.getFluid().getStateContainer(), IFluidState);
    }
    
    public void method34691(final StateContainer<?, ?> class9104, final Consumer<String> consumer) {
        this.field40142.forEach(class9106 -> class9106.method23887(class9105, consumer2));
    }
    
    public static Class9357 method34692(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "properties");
            final ArrayList arrayList = Lists.newArrayList();
            for (final Map.Entry<String, V> entry : method35913.entrySet()) {
                arrayList.add(method34686(entry.getKey(), (JsonElement)entry.getValue()));
            }
            return new Class9357(arrayList);
        }
        return Class9357.field40141;
    }
    
    public JsonElement method34693() {
        if (this != Class9357.field40141) {
            final JsonObject jsonObject = new JsonObject();
            if (!this.field40142.isEmpty()) {
                this.field40142.forEach(class7591 -> jsonObject2.add(class7591.method23886(), class7591.method23884()));
            }
            return jsonObject;
        }
        return JsonNull.INSTANCE;
    }
    
    static {
        field40141 = new Class9357(ImmutableList.of());
    }
}
