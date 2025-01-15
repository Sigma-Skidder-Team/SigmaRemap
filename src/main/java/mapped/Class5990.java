// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5990 implements JsonDeserializer<Class8111>
{
    public Class8111 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new Class8111(this.method17918(asJsonObject), this.method17916(asJsonObject), this.method17917(asJsonObject), (Class8435)jsonDeserializationContext.deserialize((JsonElement)asJsonObject, (Type)Class8435.class));
    }
    
    public int method17916(final JsonObject jsonObject) {
        return Class9583.method35910(jsonObject, "tintindex", -1);
    }
    
    private String method17917(final JsonObject jsonObject) {
        return Class9583.method35895(jsonObject, "texture");
    }
    
    @Nullable
    private Class179 method17918(final JsonObject jsonObject) {
        return Class179.method791(Class9583.method35896(jsonObject, "cullface", ""));
    }
}
