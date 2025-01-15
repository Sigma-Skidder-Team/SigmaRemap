// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5992 implements JsonDeserializer<Class9032>
{
    public Class9032 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "rewards");
        final int method35914 = Class9583.method35910(method35913, "experience", 0);
        final JsonArray method35915 = Class9583.method35918(method35913, "loot", new JsonArray());
        final Class1932[] array = new Class1932[method35915.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Class1932(Class9583.method35894(method35915.get(i), "loot[" + i + "]"));
        }
        final JsonArray method35916 = Class9583.method35918(method35913, "recipes", new JsonArray());
        final Class1932[] array2 = new Class1932[method35916.size()];
        for (int j = 0; j < array2.length; ++j) {
            array2[j] = new Class1932(Class9583.method35894(method35916.get(j), "recipes[" + j + "]"));
        }
        Class9360 field40145;
        if (!method35913.has("function")) {
            field40145 = Class9360.field40145;
        }
        else {
            field40145 = new Class9360(new Class1932(Class9583.method35895(method35913, "function")));
        }
        return new Class9032(method35914, array, array2, field40145);
    }
}
