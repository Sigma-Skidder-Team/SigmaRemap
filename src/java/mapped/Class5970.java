// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import java.util.Iterator;
import java.util.EnumMap;
import com.google.common.collect.Maps;
import java.util.Locale;
import javax.annotation.Nullable;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5970 implements JsonDeserializer<Class9219>
{
    public Class9219 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Class9138 method17889 = this.method17889(asJsonObject);
        final Class9138 method17890 = this.method17888(asJsonObject);
        final Class8225 method17891 = this.method17882(asJsonObject);
        final Map<Class179, Class8111> method17892 = this.method17885(jsonDeserializationContext, asJsonObject);
        if (asJsonObject.has("shade") && !Class9583.method35890(asJsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        return new Class9219(method17889, method17890, method17892, method17891, Class9583.method35901(asJsonObject, "shade", true));
    }
    
    @Nullable
    private Class8225 method17882(final JsonObject jsonObject) {
        Class8225 class8225 = null;
        if (jsonObject.has("rotation")) {
            final JsonObject method35914 = Class9583.method35914(jsonObject, "rotation");
            final Class9138 method35915 = this.method17890(method35914, "origin");
            method35915.method33314(0.0625f);
            class8225 = new Class8225(method35915, this.method17884(method35914), this.method17883(method35914), Class9583.method35901(method35914, "rescale", false));
        }
        return class8225;
    }
    
    private float method17883(final JsonObject jsonObject) {
        final float method35903 = Class9583.method35903(jsonObject, "angle");
        if (method35903 != 0.0f) {
            if (Class9546.method35647(method35903) != 22.5f) {
                if (Class9546.method35647(method35903) != 45.0f) {
                    throw new JsonParseException("Invalid rotation " + method35903 + " found, only -45/-22.5/0/22.5/45 allowed");
                }
            }
        }
        return method35903;
    }
    
    private Class111 method17884(final JsonObject jsonObject) {
        final String method35895 = Class9583.method35895(jsonObject, "axis");
        final Class111 method35896 = Class111.method598(method35895.toLowerCase(Locale.ROOT));
        if (method35896 != null) {
            return method35896;
        }
        throw new JsonParseException("Invalid rotation axis: " + method35895);
    }
    
    private Map<Class179, Class8111> method17885(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final Map<Class179, Class8111> method17886 = this.method17886(jsonDeserializationContext, jsonObject);
        if (!method17886.isEmpty()) {
            return method17886;
        }
        throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
    }
    
    private Map<Class179, Class8111> method17886(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final EnumMap enumMap = Maps.newEnumMap((Class)Class179.class);
        for (final Map.Entry<String, V> entry : Class9583.method35914(jsonObject, "faces").entrySet()) {
            enumMap.put((Object)this.method17887(entry.getKey()), jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), (Type)Class8111.class));
        }
        return enumMap;
    }
    
    private Class179 method17887(final String str) {
        final Class179 method791 = Class179.method791(str);
        if (method791 != null) {
            return method791;
        }
        throw new JsonParseException("Unknown facing: " + str);
    }
    
    private Class9138 method17888(final JsonObject jsonObject) {
        final Class9138 method17890 = this.method17890(jsonObject, "to");
        if (method17890.method33311() >= -16.0f) {
            if (method17890.method33312() >= -16.0f) {
                if (method17890.method33313() >= -16.0f) {
                    if (method17890.method33311() <= 32.0f) {
                        if (method17890.method33312() <= 32.0f) {
                            if (method17890.method33313() <= 32.0f) {
                                return method17890;
                            }
                        }
                    }
                }
            }
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + method17890);
    }
    
    private Class9138 method17889(final JsonObject jsonObject) {
        final Class9138 method17890 = this.method17890(jsonObject, "from");
        if (method17890.method33311() >= -16.0f) {
            if (method17890.method33312() >= -16.0f) {
                if (method17890.method33313() >= -16.0f) {
                    if (method17890.method33311() <= 32.0f) {
                        if (method17890.method33312() <= 32.0f) {
                            if (method17890.method33313() <= 32.0f) {
                                return method17890;
                            }
                        }
                    }
                }
            }
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + method17890);
    }
    
    private Class9138 method17890(final JsonObject jsonObject, final String s) {
        final JsonArray method35917 = Class9583.method35917(jsonObject, s);
        if (method35917.size() == 3) {
            final float[] array = new float[3];
            for (int i = 0; i < array.length; ++i) {
                array[i] = Class9583.method35902(method35917.get(i), s + "[" + i + "]");
            }
            return new Class9138(array[0], array[1], array[2]);
        }
        throw new JsonParseException("Expected 3 " + s + " values, found: " + method35917.size());
    }
}
