// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import net.minecraft.item.crafting.IRecipeSerializer;

public class Class5766 implements Class5763
{
    public final /* synthetic */ String field23580;
    public final /* synthetic */ Class8176 field23581;
    
    public Class5766(final Class8176 field23581, final String field23582) {
        this.field23581 = field23581;
        this.field23580 = field23582;
    }
    
    @Override
    public void method17153(final JsonObject jsonObject) {
    }
    
    @Override
    public IRecipeSerializer<?> method17156() {
        return Class8176.method27074(this.field23581);
    }
    
    @Override
    public ResourceLocation method17155() {
        return new ResourceLocation(this.field23580);
    }
    
    @Nullable
    @Override
    public JsonObject method17157() {
        return null;
    }
    
    @Override
    public ResourceLocation method17158() {
        return new ResourceLocation("");
    }
}
