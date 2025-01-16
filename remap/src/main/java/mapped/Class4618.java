// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4618 extends Class4611<Class4244>
{
    public static final ResourceLocation field20084;
    
    @Override
    public ResourceLocation method13717() {
        return Class4618.field20084;
    }
    
    public Class4244 method13754(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4244();
    }
    
    public void method13755(final Class513 class513) {
        this.method13727(class513.method2957());
    }
    
    static {
        field20084 = new ResourceLocation("tick");
    }
}
