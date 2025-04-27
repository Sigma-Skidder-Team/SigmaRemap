// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.util.DamageSource;

public class Class4237 extends Class4211
{
    private final Class8439 field19051;
    
    public Class4237(final Class8439 field19051) {
        super(Class4627.method13794());
        this.field19051 = field19051;
    }
    
    public static Class4237 method12739(final Class9504 class9504) {
        return new Class4237(class9504.method35397());
    }
    
    public boolean method12740(final Class513 class513, final DamageSource class514, final float n, final float n2, final boolean b) {
        return this.field19051.method28170(class513, class514, n, n2, b);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("damage", this.field19051.method28172());
        return jsonObject;
    }
}
