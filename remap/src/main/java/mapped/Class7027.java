// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7027 extends Class7020<Class149>
{
    public Class7027() {
        super(new ResourceLocation("random_chance"), Class149.class);
    }
    
    public void method21499(final JsonObject jsonObject, final Class149 class149, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("chance", (Number)Class149.method725(class149));
    }
    
    public Class149 method21500(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class149(Class9583.method35903(jsonObject, "chance"), null);
    }
}
