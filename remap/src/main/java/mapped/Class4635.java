// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4635 extends Class4611<Class4217>
{
    private static String[] field20101;
    private final ResourceLocation field20102;
    
    public Class4635(final ResourceLocation field20102) {
        this.field20102 = field20102;
    }
    
    @Override
    public ResourceLocation method13717() {
        return this.field20102;
    }
    
    public Class4217 method13826(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4217(this.field20102, Class8697.method29814((JsonElement)jsonObject));
    }
    
    public void method13827(final Class513 class513) {
        this.method13726(class513.method2957(), class515 -> class515.method12698(class514.method2940(), class514.method1938(), class514.method1941(), class514.method1945()));
    }
}
