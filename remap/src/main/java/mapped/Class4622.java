// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

public class Class4622 extends Class4611<Class4213>
{
    private static final Class1932 field20088;
    
    @Override
    public Class1932 method13717() {
        return Class4622.field20088;
    }
    
    public Class4213 method13768(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4213(Class8439.method28171(jsonObject.get("damage")), Class8172.method27017(jsonObject.get("entity")));
    }
    
    public void method13769(final Class513 class513, final Entity class514, final Class7929 class515, final float n, final float n2, final boolean b) {
        this.method13726(class513.method2957(), class519 -> class519.method12687(class516, class517, class518, n3, n4, b2));
    }
    
    static {
        field20088 = new Class1932("player_hurt_entity");
    }
}
