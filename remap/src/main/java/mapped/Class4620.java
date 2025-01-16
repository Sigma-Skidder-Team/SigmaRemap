// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4620 extends Class4611<Class4219>
{
    private static final ResourceLocation field20086;
    
    @Override
    public ResourceLocation method13717() {
        return Class4620.field20086;
    }
    
    public Class4219 method13760(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4219(new ResourceLocation(Class9583.method35895(jsonObject, "recipe")));
    }
    
    public void method13761(final Class513 class513, final Class3662<?> class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12702(class515));
    }
    
    static {
        field20086 = new ResourceLocation("recipe_unlocked");
    }
}
