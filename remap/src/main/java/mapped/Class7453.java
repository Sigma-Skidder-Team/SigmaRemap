// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

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
        jsonObject.addProperty("item", Registry.field211.getKey(this.field28755.getItem()).toString());
        return jsonObject;
    }
}
