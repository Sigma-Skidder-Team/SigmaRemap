// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.Collection;

public class Class7453 implements Class7452
{
    private final ItemStack field28755;
    
    private Class7453(final ItemStack field28755) {
        this.field28755 = field28755;
    }
    
    @Override
    public Collection<ItemStack> method22938() {
        return Collections.singleton(this.field28755);
    }
    
    @Override
    public JsonObject method22939() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item", Class90.field211.method503(this.field28755.method27622()).toString());
        return jsonObject;
    }
}
