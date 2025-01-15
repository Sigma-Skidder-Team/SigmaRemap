// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4229 extends Class4211
{
    private final Class9342 field19033;
    
    public Class4229(final Class9342 field19033) {
        super(Class4639.method13848());
        this.field19033 = field19033;
    }
    
    public static Class4229 method12720(final Class3832 class3832) {
        return new Class4229(Class9425.method35024().method35025(class3832).method35029());
    }
    
    public boolean method12721(final Class8321 class8321) {
        return this.field19033.method34627(class8321);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19033.method34629());
        return (JsonElement)jsonObject;
    }
}
