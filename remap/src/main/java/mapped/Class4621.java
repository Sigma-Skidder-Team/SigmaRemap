// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4621 extends Class4611<Class4227>
{
    private final ResourceLocation field20087;
    
    public Class4621(final ResourceLocation field20087) {
        this.field20087 = field20087;
    }
    
    @Override
    public ResourceLocation method13717() {
        return this.field20087;
    }
    
    public Class4227 method13764(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4227(this.field20087, Class7854.method25399(jsonObject.get("block")), Class9357.method34692(jsonObject.get("state")), Class9342.method34628(jsonObject.get("item")));
    }
    
    public void method13765(final Class513 class517, final BlockPos class514, final ItemStack class515) {
        this.method13726(class517.method2957(), class522 -> {
            class517.method2940().getBlockState(class519);
            return class522.method12716(class516, class518.method2940(), class520, class521);
        });
    }
}
