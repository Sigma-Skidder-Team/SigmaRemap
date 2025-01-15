// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.Map;

public class Class9167
{
    public static final Class9167 field38834;
    public static final Class9167[] field38835;
    private final Class6257 field38836;
    private final Class8685 field38837;
    
    public Class9167() {
        this.field38836 = null;
        this.field38837 = Class8685.field36500;
    }
    
    public Class9167(final Class6257 field38836, final Class8685 field38837) {
        this.field38836 = field38836;
        this.field38837 = field38837;
    }
    
    public boolean method33464(final Map<Class6257, Integer> map) {
        if (this.field38836 == null) {
            if (this.field38837 != null) {
                final Iterator<Integer> iterator = map.values().iterator();
                while (iterator.hasNext()) {
                    if (!this.field38837.method29755(iterator.next())) {
                        continue;
                    }
                    return true;
                }
                return false;
            }
        }
        else {
            if (!map.containsKey(this.field38836)) {
                return false;
            }
            final int intValue = map.get(this.field38836);
            if (this.field38837 != null && !this.field38837.method29755(intValue)) {
                return false;
            }
        }
        return true;
    }
    
    public JsonElement method33465() {
        if (this != Class9167.field38834) {
            final JsonObject jsonObject = new JsonObject();
            if (this.field38836 != null) {
                jsonObject.addProperty("enchantment", Class90.field209.method503(this.field38836).toString());
            }
            jsonObject.add("levels", this.field38837.method29745());
            return (JsonElement)jsonObject;
        }
        return (JsonElement)JsonNull.INSTANCE;
    }
    
    public static Class9167 method33466(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "enchantment");
            Class6257 class6257 = null;
            if (method35913.has("enchantment")) {
                class6257 = Class90.field209.method506(new Class1932(Class9583.method35895(method35913, "enchantment"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown enchantment '" + obj + "'");
                    return;
                });
            }
            return new Class9167(class6257, Class8685.method29756(method35913.get("levels")));
        }
        return Class9167.field38834;
    }
    
    public static Class9167[] method33467(final JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            final JsonArray method35916 = Class9583.method35916(jsonElement, "enchantments");
            final Class9167[] array = new Class9167[method35916.size()];
            for (int i = 0; i < array.length; ++i) {
                array[i] = method33466(method35916.get(i));
            }
            return array;
        }
        return Class9167.field38835;
    }
    
    static {
        field38834 = new Class9167();
        field38835 = new Class9167[0];
    }
}
