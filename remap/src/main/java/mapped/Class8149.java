// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonElement;
import net.minecraft.entity.EntityType;

public class Class8149 extends Class8150
{
    private final Class7909<EntityType<?>> field33560;
    
    public Class8149(final Class7909<EntityType<?>> field33560) {
        this.field33560 = field33560;
    }
    
    @Override
    public boolean method26845(final EntityType<?> class7499) {
        return this.field33560.method25618(class7499);
    }
    
    @Override
    public JsonElement method26846() {
        return new JsonPrimitive("#" + this.field33560.method25621().toString());
    }
}
