// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonElement;
import net.minecraft.entity.EntityType;

public class Class8152 extends Class8150
{
    private static String[] field33563;
    private final EntityType<?> field33564;
    
    public Class8152(final EntityType<?> field33564) {
        this.field33564 = field33564;
    }
    
    @Override
    public boolean method26845(final EntityType<?> class7499) {
        return this.field33564 == class7499;
    }
    
    @Override
    public JsonElement method26846() {
        return (JsonElement)new JsonPrimitive(Registry.field210.getKey(this.field33564).toString());
    }
}
