// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import net.minecraft.util.text.ITextComponent;

public final class Class5965 implements JsonDeserializer<ITextComponent>
{
    public ITextComponent deserialize(final JsonElement obj, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (obj.isJsonPrimitive()) {
            return new Class2260(obj.getAsString());
        }
        if (!obj.isJsonArray()) {
            throw new JsonParseException("Don't know how to turn " + obj + " into a Component");
        }
        final JsonArray asJsonArray = obj.getAsJsonArray();
        ITextComponent class2250 = null;
        for (final JsonElement jsonElement : asJsonArray) {
            final ITextComponent deserialize = this.deserialize(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
            if (class2250 != null) {
                class2250.method8458(deserialize);
            }
            else {
                class2250 = deserialize;
            }
        }
        return class2250;
    }
}
