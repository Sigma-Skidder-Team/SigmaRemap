// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7022 extends Class7020<Class156>
{
    public Class7022() {
        super(new Class1932("reference"), Class156.class);
    }
    
    public void method21488(final JsonObject jsonObject, final Class156 class156, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("name", Class156.method745(class156).toString());
    }
    
    public Class156 method21489(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class156(new Class1932(Class9583.method35895(jsonObject, "name")));
    }
}
