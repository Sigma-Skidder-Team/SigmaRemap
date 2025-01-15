// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

public class Class4614 extends Class4611<Class4233>
{
    private final Class1932 field20080;
    
    public Class4614(final Class1932 field20080) {
        this.field20080 = field20080;
    }
    
    @Override
    public Class1932 method13717() {
        return this.field20080;
    }
    
    public Class4233 method13737(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4233(this.field20080, Class8172.method27017(jsonObject.get("entity")), Class9089.method32838(jsonObject.get("killing_blow")));
    }
    
    public void method13738(final Class513 class513, final Entity class514, final DamageSource class515) {
        this.method13726(class513.method2957(), class519 -> class519.method12732(class516, class517, class518));
    }
}
