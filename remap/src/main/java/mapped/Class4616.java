// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4616 extends Class4611<Class4230>
{
    private static final ResourceLocation field20082;
    
    @Override
    public ResourceLocation method13717() {
        return Class4616.field20082;
    }
    
    public Class4230 method13745(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4230(Class9342.method34628(jsonObject.get("item")), Class8685.method29756(jsonObject.get("durability")), Class8685.method29756(jsonObject.get("delta")));
    }
    
    public void method13746(final Class513 class513, final ItemStack class514, final int n) {
        this.method13726(class513.method2957(), class516 -> class516.method12723(class515, n2));
    }
    
    static {
        field20082 = new ResourceLocation("item_durability_changed");
    }
}