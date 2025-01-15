// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4243 extends Class4211
{
    private final Class9342 field19061;
    
    public Class4243(final Class9342 field19061) {
        super(Class4644.method13864());
        this.field19061 = field19061;
    }
    
    public static Class4243 method12749(final Class9342 class9342) {
        return new Class4243(class9342);
    }
    
    public boolean method12750(final Class8321 class8321) {
        return this.field19061.method34627(class8321);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19061.method34629());
        return (JsonElement)jsonObject;
    }
}
