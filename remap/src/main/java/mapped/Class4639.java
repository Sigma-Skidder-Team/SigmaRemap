// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4639 extends Class4611<Class4229>
{
    private static final ResourceLocation field20106;
    
    @Override
    public ResourceLocation method13717() {
        return Class4639.field20106;
    }
    
    public Class4229 method13845(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4229(Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13846(final Class513 class513, final ItemStack class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12721(class515));
    }
    
    static {
        field20106 = new ResourceLocation("used_totem");
    }
}