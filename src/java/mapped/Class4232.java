// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4232 extends Class4211
{
    private final Class8061 field19040;
    
    public Class4232(final Class8061 field19040) {
        super(Class4617.method13753());
        this.field19040 = field19040;
    }
    
    public static Class4232 method12726() {
        return new Class4232((Class8061)null);
    }
    
    public boolean method12727(final Class8061 class8061) {
        return this.field19040 == null || this.field19040 == class8061;
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field19040 != null) {
            jsonObject.addProperty("potion", Class90.field212.method503(this.field19040).toString());
        }
        return (JsonElement)jsonObject;
    }
}
