// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4642 extends Class4611<Class4222>
{
    private static final ResourceLocation field20108;
    
    @Override
    public ResourceLocation method13717() {
        return Class4642.field20108;
    }
    
    public Class4222 method13851(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4222(Class8685.method29756(jsonObject.get("level")));
    }
    
    public void method13852(final Class513 class513, final Class490 class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12706(class515));
    }
    
    static {
        field20108 = new ResourceLocation("construct_beacon");
    }
}
