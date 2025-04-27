// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import java.util.Map;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5985 implements JsonDeserializer<Class7685>
{
    public Class7685 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final List<Class9219> method17915 = this.method17915(jsonDeserializationContext, asJsonObject);
        final String method17916 = this.method17913(asJsonObject);
        final Map<String, Either<Class3687, String>> method17917 = this.method17911(asJsonObject);
        final boolean method17918 = this.method17914(asJsonObject);
        Class7503 field29079 = Class7503.field29079;
        if (asJsonObject.has("display")) {
            field29079 = jsonDeserializationContext.deserialize(Class9583.method35914(asJsonObject, "display"), Class7503.class);
        }
        final List<Class6559> method17919 = this.method17910(jsonDeserializationContext, asJsonObject);
        Class240 method17920 = null;
        if (asJsonObject.has("gui_light")) {
            method17920 = Class240.method888(Class9583.method35895(asJsonObject, "gui_light"));
        }
        return new Class7685(method17916.isEmpty() ? null : new ResourceLocation(method17916), method17915, method17917, method17918, method17920, field29079, method17919);
    }
    
    public List<Class6559> method17910(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("overrides")) {
            final Iterator iterator = Class9583.method35917(jsonObject, "overrides").iterator();
            while (iterator.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), Class6559.class));
            }
        }
        return arrayList;
    }
    
    private Map<String, Either<Class3687, String>> method17911(final JsonObject jsonObject) {
        final ResourceLocation field9853 = Class1774.field9853;
        final HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            for (final Map.Entry<Object, V> entry : Class9583.method35914(jsonObject, "textures").entrySet()) {
                hashMap.put(entry.getKey(), method17912(field9853, ((JsonElement)entry.getValue()).getAsString()));
            }
        }
        return hashMap;
    }
    
    private static Either<Class3687, String> method17912(final ResourceLocation class1932, final String str) {
        if (Class7685.method24403(str)) {
            return (Either<Class3687, String>)Either.right((Object)str.substring(1));
        }
        final ResourceLocation method7795 = ResourceLocation.method7795(str);
        if (method7795 != null) {
            return (Either<Class3687, String>)Either.left((Object)new Class3687(class1932, method7795));
        }
        throw new JsonParseException(str + " is not valid resource location");
    }
    
    private String method17913(final JsonObject jsonObject) {
        return Class9583.method35896(jsonObject, "parent", "");
    }
    
    public boolean method17914(final JsonObject jsonObject) {
        return Class9583.method35901(jsonObject, "ambientocclusion", true);
    }
    
    public List<Class9219> method17915(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            final Iterator iterator = Class9583.method35917(jsonObject, "elements").iterator();
            while (iterator.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), Class9219.class));
            }
        }
        return arrayList;
    }
}
