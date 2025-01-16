// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4645 extends Class4611<Class4228>
{
    private static final ResourceLocation field20111;
    
    @Override
    public ResourceLocation method13717() {
        return Class4645.field20111;
    }
    
    public Class4228 method13865(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject method35915 = Class9583.method35915(jsonObject, "slots", new JsonObject());
        return new Class4228(Class8685.method29756(method35915.get("occupied")), Class8685.method29756(method35915.get("full")), Class8685.method29756(method35915.get("empty")), Class9342.method34630(jsonObject.get("items")));
    }
    
    public void method13866(final Class513 class513, final Class464 class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12719(class515));
    }
    
    static {
        field20111 = new ResourceLocation("inventory_changed");
    }
}
