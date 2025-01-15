// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5979 implements JsonDeserializer<Class7503>
{
    public Class7503 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Class6429 method17901 = this.method17901(jsonDeserializationContext, asJsonObject, "thirdperson_righthand");
        Class6429 method17902 = this.method17901(jsonDeserializationContext, asJsonObject, "thirdperson_lefthand");
        if (method17902 == Class6429.field25537) {
            method17902 = method17901;
        }
        final Class6429 method17903 = this.method17901(jsonDeserializationContext, asJsonObject, "firstperson_righthand");
        Class6429 method17904 = this.method17901(jsonDeserializationContext, asJsonObject, "firstperson_lefthand");
        if (method17904 == Class6429.field25537) {
            method17904 = method17903;
        }
        return new Class7503(method17902, method17901, method17904, method17903, this.method17901(jsonDeserializationContext, asJsonObject, "head"), this.method17901(jsonDeserializationContext, asJsonObject, "gui"), this.method17901(jsonDeserializationContext, asJsonObject, "ground"), this.method17901(jsonDeserializationContext, asJsonObject, "fixed"));
    }
    
    private Class6429 method17901(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject, final String s) {
        return (Class6429)(jsonObject.has(s) ? jsonDeserializationContext.deserialize(jsonObject.get(s), (Type)Class6429.class) : Class6429.field25537);
    }
}
