// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7035 extends Class7020<Class159>
{
    public Class7035() {
        super(new Class1932("random_chance_with_looting"), Class159.class);
    }
    
    public void method21517(final JsonObject jsonObject, final Class159 class159, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("chance", (Number)Class159.method756(class159));
        jsonObject.addProperty("looting_multiplier", (Number)Class159.method757(class159));
    }
    
    public Class159 method21518(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class159(Class9583.method35903(jsonObject, "chance"), Class9583.method35903(jsonObject, "looting_multiplier"), null);
    }
}
