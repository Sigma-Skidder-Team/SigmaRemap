// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4631 extends Class4611<Class4231>
{
    private static final Class1932 field20097;
    
    @Override
    public Class1932 method13717() {
        return Class4631.field20097;
    }
    
    public Class4231 method13807(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4231(Class9342.method34628(jsonObject.get("rod")), Class8172.method27017(jsonObject.get("entity")), Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13808(final Class513 class513, final ItemStack class514, final Class425 class515, final Collection<ItemStack> collection) {
        this.method13726(class513.method2957(), class519 -> class519.method12725(class516, class517, class518, collection2));
    }
    
    static {
        field20097 = new Class1932("fishing_rod_hooked");
    }
}
