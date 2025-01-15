// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7024 extends Class7020<Class123>
{
    public Class7024() {
        super(new Class1932("time_check"), Class123.class);
    }
    
    public void method21493(final JsonObject jsonObject, final Class123 class123, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("period", (Number)Class123.method633(class123));
        jsonObject.add("value", jsonSerializationContext.serialize((Object)Class123.method634(class123)));
    }
    
    public Class123 method21494(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class123(jsonObject.has("period") ? Long.valueOf(Class9583.method35906(jsonObject, "period")) : null, Class9583.method35920(jsonObject, "value", jsonDeserializationContext, (Class<? extends Class5772>)Class5772.class), null);
    }
}
