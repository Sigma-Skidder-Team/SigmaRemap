// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4613 extends Class4611<Class4239>
{
    private static final ResourceLocation field20079;
    
    @Override
    public ResourceLocation method13717() {
        return Class4613.field20079;
    }
    
    public Class4239 method13733(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4239(Class8172.method27017(jsonObject.get("zombie")), Class8172.method27017(jsonObject.get("villager")));
    }
    
    public void method13734(final Class513 class513, final Class827 class514, final Class824 class515) {
        this.method13726(class513.method2957(), class519 -> class519.method12744(class516, class517, class518));
    }
    
    static {
        field20079 = new ResourceLocation("cured_zombie_villager");
    }
}
