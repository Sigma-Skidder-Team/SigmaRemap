// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4224 extends Class4211
{
    private final Class9342 field19021;
    
    public Class4224(final Class9342 field19021) {
        super(Class4633.method13821());
        this.field19021 = field19021;
    }
    
    public static Class4224 method12709() {
        return new Class4224(Class9342.field40107);
    }
    
    public static Class4224 method12710(final Class3832 class3832) {
        return new Class4224(new Class9342(null, class3832.method11704(), Class8685.field36500, Class8685.field36500, Class9167.field38835, Class9167.field38835, null, Class7103.field27707));
    }
    
    public boolean method12711(final Class8321 class8321) {
        return this.field19021.method34627(class8321);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19021.method34629());
        return (JsonElement)jsonObject;
    }
}
