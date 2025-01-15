// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;

public class Class4240 extends Class4211
{
    private final Class9342 field19055;
    private final Class8685 field19056;
    
    public Class4240(final Class9342 field19055, final Class8685 field19056) {
        super(Class4612.method13732());
        this.field19055 = field19055;
        this.field19056 = field19056;
    }
    
    public static Class4240 method12745() {
        return new Class4240(Class9342.field40107, Class8685.field36500);
    }
    
    public boolean method12746(final ItemStack class8321, final int n) {
        return this.field19055.method34627(class8321) && this.field19056.method29755(n);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("item", this.field19055.method34629());
        jsonObject.add("levels", this.field19056.method29745());
        return (JsonElement)jsonObject;
    }
}
