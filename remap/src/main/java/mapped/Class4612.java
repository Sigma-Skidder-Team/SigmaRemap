// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4612 extends Class4611<Class4240>
{
    private static final Class1932 field20078;
    
    @Override
    public Class1932 method13717() {
        return Class4612.field20078;
    }
    
    public Class4240 method13729(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4240(Class9342.method34628(jsonObject.get("item")), Class8685.method29756(jsonObject.get("levels")));
    }
    
    public void method13730(final Class513 class513, final ItemStack class514, final int n) {
        this.method13726(class513.method2957(), class516 -> class516.method12746(class515, n2));
    }
    
    static {
        field20078 = new Class1932("enchanted_item");
    }
}
