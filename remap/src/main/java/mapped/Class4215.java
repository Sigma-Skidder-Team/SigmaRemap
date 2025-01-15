// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4215 extends Class4211
{
    private final Class9342 field19009;
    
    public Class4215(final Class9342 field19009) {
        super(Class4638.method13844());
        this.field19009 = field19009;
    }
    
    public static Class4215 method12691(final Class3832 class3832) {
        return new Class4215(Class9425.method35024().method35025(class3832).method35029());
    }
    
    public boolean method12692(final ItemStack class8321) {
        return this.field19009.method34627(class8321);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19009.method34629());
        return (JsonElement)jsonObject;
    }
}
