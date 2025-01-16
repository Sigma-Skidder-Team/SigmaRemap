// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4617 extends Class4611<Class4232>
{
    private static final ResourceLocation field20083;
    
    @Override
    public ResourceLocation method13717() {
        return Class4617.field20083;
    }
    
    public Class4232 method13749(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        Class8061 class8061 = null;
        if (jsonObject.has("potion")) {
            class8061 = Registry.field212.method506(new ResourceLocation(Class9583.method35895(jsonObject, "potion"))).orElseThrow(() -> {
                new JsonSyntaxException("Unknown potion '" + obj + "'");
                return;
            });
        }
        return new Class4232(class8061);
    }
    
    public void method13750(final Class513 class513, final Class8061 class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12727(class515));
    }
    
    static {
        field20083 = new ResourceLocation("brewed_potion");
    }
}
