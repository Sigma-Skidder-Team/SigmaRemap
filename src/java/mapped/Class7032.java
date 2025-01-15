// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7032 extends Class7020<Class161>
{
    public Class7032() {
        super(new Class1932("alternative"), Class161.class);
    }
    
    public void method21511(final JsonObject jsonObject, final Class161 class161, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("terms", jsonSerializationContext.serialize((Object)Class161.method762(class161)));
    }
    
    public Class161 method21512(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class161(Class9583.method35920(jsonObject, "terms", jsonDeserializationContext, (Class<? extends Class122[]>)Class122[].class), null);
    }
}
