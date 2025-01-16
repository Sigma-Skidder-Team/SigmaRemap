// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7019 extends Class7020<Class151>
{
    public Class7019() {
        super(new ResourceLocation("weather_check"), Class151.class);
    }
    
    public void method21480(final JsonObject jsonObject, final Class151 class151, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("raining", Class151.method731(class151));
        jsonObject.addProperty("thundering", Class151.method732(class151));
    }
    
    public Class151 method21481(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class151(jsonObject.has("raining") ? Boolean.valueOf(Class9583.method35900(jsonObject, "raining")) : null, jsonObject.has("thundering") ? Boolean.valueOf(Class9583.method35900(jsonObject, "thundering")) : null, null);
    }
}
