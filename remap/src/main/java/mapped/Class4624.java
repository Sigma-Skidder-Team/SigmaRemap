// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4624 extends Class4611<Class4223>
{
    private static final ResourceLocation field20090;
    
    @Override
    public ResourceLocation method13717() {
        return Class4624.field20090;
    }
    
    public Class4223 method13776(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4223(Class8003.method26196(jsonObject.get("effects")));
    }
    
    public void method13777(final Class513 class513) {
        this.method13726(class513.method2957(), class515 -> class515.method12708(class514));
    }
    
    static {
        field20090 = new ResourceLocation("effects_changed");
    }
}
