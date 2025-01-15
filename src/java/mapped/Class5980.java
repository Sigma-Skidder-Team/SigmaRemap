// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5980 implements JsonDeserializer<Class9320>, JsonSerializer<Class9320>
{
    public Class9320 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "loot pool");
        return new Class9320((Class6368[])Class9583.method35920(method35913, "entries", jsonDeserializationContext, (Class<?>)Class6368[].class), Class9583.method35921(method35913, "conditions", new Class122[0], jsonDeserializationContext, Class122[].class), Class9583.method35921(method35913, "functions", new Class125[0], jsonDeserializationContext, Class125[].class), Class9411.method35007(method35913.get("rolls"), jsonDeserializationContext), Class9583.method35921(method35913, "bonus_rolls", new Class5772(0.0f, 0.0f), jsonDeserializationContext, Class5772.class), null);
    }
    
    public JsonElement serialize(final Class9320 class9320, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("rolls", Class9411.method35008(Class9320.method34516(class9320), jsonSerializationContext));
        jsonObject.add("entries", jsonSerializationContext.serialize((Object)Class9320.method34517(class9320)));
        if (Class9320.method34518(class9320).method17167() != 0.0f) {
            if (Class9320.method34518(class9320).method17168() != 0.0f) {
                jsonObject.add("bonus_rolls", jsonSerializationContext.serialize((Object)Class9320.method34518(class9320)));
            }
        }
        if (!ArrayUtils.isEmpty((Object[])Class9320.method34519(class9320))) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)Class9320.method34519(class9320)));
        }
        if (!ArrayUtils.isEmpty((Object[])Class9320.method34520(class9320))) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)Class9320.method34520(class9320)));
        }
        return (JsonElement)jsonObject;
    }
}
