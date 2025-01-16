// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.util.math.Vec3d;

public class Class4634 extends Class4611<Class4221>
{
    private static final ResourceLocation field20100;
    
    @Override
    public ResourceLocation method13717() {
        return Class4634.field20100;
    }
    
    public Class4221 method13822(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4221(Class8817.method30758(jsonObject.get("distance")), Class8685.method29756(jsonObject.get("duration")));
    }
    
    public void method13823(final Class513 class513, final Vec3d class514, final int n) {
        this.method13726(class513.method2957(), class517 -> class517.method12704(class515, class516, n2));
    }
    
    static {
        field20100 = new ResourceLocation("levitation");
    }
}
