// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.util.DamageSource;

public class Class4627 extends Class4611<Class4237>
{
    private static final ResourceLocation field20093;
    
    @Override
    public ResourceLocation method13717() {
        return Class4627.field20093;
    }
    
    public Class4237 method13791(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4237(Class8439.method28171(jsonObject.get("damage")));
    }
    
    public void method13792(final Class513 class513, final DamageSource class514, final float n, final float n2, final boolean b) {
        this.method13726(class513.method2957(), class517 -> class517.method12740(class515, class516, n3, n4, b2));
    }
    
    static {
        field20093 = new ResourceLocation("entity_hurt_player");
    }
}
