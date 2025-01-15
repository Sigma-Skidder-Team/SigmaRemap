// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7025 extends Class7020<Class155>
{
    public Class7025() {
        super(new Class1932("inverted"), Class155.class);
    }
    
    public void method21495(final JsonObject jsonObject, final Class155 class155, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("term", jsonSerializationContext.serialize((Object)Class155.method744(class155)));
    }
    
    public Class155 method21496(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class155(Class9583.method35920(jsonObject, "term", jsonDeserializationContext, (Class<? extends Class122>)Class122.class), null);
    }
}
