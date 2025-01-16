// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

public class Class4626 extends Class4611<Class4216>
{
    private static final ResourceLocation field20092;
    
    @Override
    public ResourceLocation method13717() {
        return Class4626.field20092;
    }
    
    public Class4216 method13787(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4216(Class8172.method27017(jsonObject.get("entity")));
    }
    
    public void method13788(final Class513 class513, final Entity class514) {
        this.method13726(class513.method2957(), class517 -> class517.method12694(class515, class516));
    }
    
    static {
        field20092 = new ResourceLocation("summoned_entity");
    }
}
