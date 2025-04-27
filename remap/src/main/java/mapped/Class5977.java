// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.util.HashSet;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonDeserializer;

public class Class5977 implements JsonDeserializer<Class7266>
{
    private static final JsonParser field24457;
    private static final Gson field24458;
    public static final ThreadLocal<HashSet<Class7266>> field24459;
    
    public static Class7266[] method17900(final String s) {
        final JsonElement parse = Class5977.field24457.parse(s);
        if (!parse.isJsonArray()) {
            return new Class7266[] { (Class7266)Class5977.field24458.fromJson(parse, (Class)Class7266.class) };
        }
        return (Class7266[])Class5977.field24458.fromJson(parse, (Class)Class7266[].class);
    }
    
    public static String toString(final Class7266 class7266) {
        return Class5977.field24458.toJson(class7266);
    }
    
    public static String toString(final Class7266... array) {
        if (array.length != 1) {
            return Class5977.field24458.toJson(new Class7270(array));
        }
        return Class5977.field24458.toJson(array[0]);
    }
    
    public Class7266 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive()) {
            return new Class7270(jsonElement.getAsString());
        }
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("translate")) {
            return jsonDeserializationContext.deserialize(jsonElement, Class7265.class);
        }
        if (asJsonObject.has("keybind")) {
            return jsonDeserializationContext.deserialize(jsonElement, Class7268.class);
        }
        if (asJsonObject.has("score")) {
            return jsonDeserializationContext.deserialize(jsonElement, Class7269.class);
        }
        if (!asJsonObject.has("selector")) {
            return jsonDeserializationContext.deserialize(jsonElement, Class7270.class);
        }
        return jsonDeserializationContext.deserialize(jsonElement, Class7267.class);
    }
    
    static {
        field24457 = new JsonParser();
        field24458 = new GsonBuilder().registerTypeAdapter(Class7266.class, new Class5977()).registerTypeAdapter(Class7270.class, new Class5962()).registerTypeAdapter(Class7265.class, new Class5959()).registerTypeAdapter(Class7268.class, new Class5964()).registerTypeAdapter(Class7269.class, new Class5961()).registerTypeAdapter(Class7267.class, new Class5963()).create();
        field24459 = new ThreadLocal<HashSet<Class7266>>();
    }
}
