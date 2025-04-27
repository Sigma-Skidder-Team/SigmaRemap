// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.Validate;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5981 implements JsonDeserializer<Class8722>
{
    public Class8722 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "entry");
        return new Class8722(this.method17902(method35913), Class9583.method35901(method35913, "replace", false), Class9583.method35896(method35913, "subtitle", null));
    }
    
    private List<Class7832> method17902(final JsonObject jsonObject) {
        final ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("sounds")) {
            final JsonArray method35917 = Class9583.method35917(jsonObject, "sounds");
            for (int i = 0; i < method35917.size(); ++i) {
                final JsonElement value = method35917.get(i);
                if (!Class9583.method35888(value)) {
                    arrayList.add(this.method17903(Class9583.method35913(value, "sound")));
                }
                else {
                    arrayList.add(new Class7832(Class9583.method35894(value, "sound"), 1.0f, 1.0f, 1, Class2158.field12815, false, false, 16));
                }
            }
        }
        return arrayList;
    }
    
    private Class7832 method17903(final JsonObject jsonObject) {
        final String method35895 = Class9583.method35895(jsonObject, "name");
        final Class2158 method35896 = this.method17904(jsonObject, Class2158.field12815);
        final float method35897 = Class9583.method35904(jsonObject, "volume", 1.0f);
        Validate.isTrue(method35897 > 0.0f, "Invalid volume");
        final float method35898 = Class9583.method35904(jsonObject, "pitch", 1.0f);
        Validate.isTrue(method35898 > 0.0f, "Invalid pitch");
        final int method35899 = Class9583.method35910(jsonObject, "weight", 1);
        Validate.isTrue(method35899 > 0, "Invalid weight");
        return new Class7832(method35895, method35897, method35898, method35899, method35896, Class9583.method35901(jsonObject, "stream", false), Class9583.method35901(jsonObject, "preload", false), Class9583.method35910(jsonObject, "attenuation_distance", 16));
    }
    
    private Class2158 method17904(final JsonObject jsonObject, final Class2158 class2158) {
        Class2158 method8324 = class2158;
        if (jsonObject.has("type")) {
            method8324 = Class2158.method8324(Class9583.method35895(jsonObject, "type"));
            Validate.notNull((Object)method8324, "Invalid type");
        }
        return method8324;
    }
}
