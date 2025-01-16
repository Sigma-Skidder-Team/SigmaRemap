// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

public class Class4636 extends Class4611<Class4210>
{
    private static final ResourceLocation field20103;
    
    @Override
    public ResourceLocation method13717() {
        return Class4636.field20103;
    }
    
    public Class4210 method13830(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4210(Class8172.method27018(jsonObject.get("victims")), Class8685.method29756(jsonObject.get("unique_entity_types")));
    }
    
    public void method13831(final Class513 class513, final Collection<Entity> collection, final int n) {
        this.method13726(class513.method2957(), class515 -> class515.method12681(class514, collection2, n2));
    }
    
    static {
        field20103 = new ResourceLocation("killed_by_crossbow");
    }
}
