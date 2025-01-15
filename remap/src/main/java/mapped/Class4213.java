// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;

public class Class4213 extends Class4211
{
    private final Class8439 field19006;
    private final Class8172 field19007;
    
    public Class4213(final Class8439 field19006, final Class8172 field19007) {
        super(Class4622.method13771());
        this.field19006 = field19006;
        this.field19007 = field19007;
    }
    
    public static Class4213 method12686(final Class9504 class9504) {
        return new Class4213(class9504.method35397(), Class8172.field33663);
    }
    
    public boolean method12687(final Class513 class513, final Entity class514, final Class7929 class515, final float n, final float n2, final boolean b) {
        return this.field19006.method28170(class513, class515, n, n2, b) && this.field19007.method27015(class513, class514);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("damage", this.field19006.method28172());
        jsonObject.add("entity", this.field19007.method27019());
        return (JsonElement)jsonObject;
    }
}
