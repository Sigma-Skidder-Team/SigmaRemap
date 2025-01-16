// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.world.dimension.DimensionType;

public class Class4628 extends Class4611<Class4225>
{
    private static final ResourceLocation field20094;
    
    @Override
    public ResourceLocation method13717() {
        return Class4628.field20094;
    }
    
    public Class4225 method13795(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4225(jsonObject.has("from") ? DimensionType.method1275(new ResourceLocation(Class9583.method35895(jsonObject, "from"))) : null, jsonObject.has("to") ? DimensionType.method1275(new ResourceLocation(Class9583.method35895(jsonObject, "to"))) : null);
    }
    
    public void method13796(final Class513 class513, final DimensionType class514, final DimensionType class515) {
        this.method13726(class513.method2957(), class518 -> class518.method12713(class516, class517));
    }
    
    static {
        field20094 = new ResourceLocation("changed_dimension");
    }
}
