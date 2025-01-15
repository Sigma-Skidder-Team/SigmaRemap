// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4619 extends Class4611<Class4212>
{
    private static final Class1932 field20085;
    
    @Override
    public Class1932 method13717() {
        return Class4619.field20085;
    }
    
    public Class4212 method13756(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4212(Class8172.method27017(jsonObject.get("villager")), Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13757(final Class513 class513, final Class819 class514, final ItemStack class515) {
        this.method13726(class513.method2957(), class519 -> class519.method12685(class516, class517, class518));
    }
    
    static {
        field20085 = new Class1932("villager_trade");
    }
}
