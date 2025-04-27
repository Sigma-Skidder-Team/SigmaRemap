// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;

public class Class4216 extends Class4211
{
    private final Class8172 field19010;
    
    public Class4216(final Class8172 field19010) {
        super(Class4626.method13790());
        this.field19010 = field19010;
    }
    
    public static Class4216 method12693(final Class5754 class5754) {
        return new Class4216(class5754.method17082());
    }
    
    public boolean method12694(final Class513 class513, final Entity class514) {
        return this.field19010.method27015(class513, class514);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("entity", this.field19010.method27019());
        return jsonObject;
    }
}
