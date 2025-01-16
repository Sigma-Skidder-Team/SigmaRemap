// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

public class Class4610 extends Class4611<Class4238>
{
    private static final ResourceLocation field20076;
    
    @Override
    public ResourceLocation method13717() {
        return Class4610.field20076;
    }
    
    public Class4238 method13718(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4238(Class8172.method27018(jsonObject.get("victims")));
    }
    
    public void method13719(final Class513 class513, final Collection<? extends Entity> collection) {
        this.method13726(class513.method2957(), class515 -> class515.method12742(class514, collection2));
    }
    
    static {
        field20076 = new ResourceLocation("channeled_lightning");
    }
}
