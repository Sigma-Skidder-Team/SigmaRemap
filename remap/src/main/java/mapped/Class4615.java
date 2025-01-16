// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.util.math.BlockPos;

public class Class4615 extends Class4611<Class4226>
{
    private static final ResourceLocation field20081;
    
    @Override
    public ResourceLocation method13717() {
        return Class4615.field20081;
    }
    
    public Class4226 method13741(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4226(Class8683.method29738(jsonObject.get("distance")));
    }
    
    public void method13742(final Class513 class513, final BlockPos class514) {
        final double n = class513.getPosX() - class514.getX();
        final double n2 = class513.getPosZ() - class514.getZ();
        this.method13726(class513.method2957(), class515 -> class515.method12714(n3));
    }
    
    static {
        field20081 = new ResourceLocation("used_ender_eye");
    }
}
