// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5989 implements JsonDeserializer<Class6022<Object>>, JsonSerializer<Class6022<Object>>
{
    private static String[] field24463;
    public final /* synthetic */ Class8006 field24464;
    
    private Class5989(final Class8006 field24464) {
        this.field24464 = field24464;
    }
    
    public JsonElement serialize(final Class6022<Object> class6022, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        class6022.method17944(jsonObject);
        return (JsonElement)jsonObject;
    }
    
    public Class6022<Object> deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        return this.field24464.method26215(jsonElement.getAsJsonObject());
    }
}
