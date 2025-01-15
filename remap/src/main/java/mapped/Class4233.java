// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;

public class Class4233 extends Class4211
{
    private final Class8172 field19041;
    private final Class9089 field19042;
    
    public Class4233(final Class1932 class1932, final Class8172 field19041, final Class9089 field19042) {
        super(class1932);
        this.field19041 = field19041;
        this.field19042 = field19042;
    }
    
    public static Class4233 method12728(final Class5754 class5754) {
        return new Class4233(Class4614.method13740(Class7770.field31776), class5754.method17082(), Class9089.field38484);
    }
    
    public static Class4233 method12729() {
        return new Class4233(Class4614.method13740(Class7770.field31776), Class8172.field33663, Class9089.field38484);
    }
    
    public static Class4233 method12730(final Class5754 class5754, final Class8135 class5755) {
        return new Class4233(Class4614.method13740(Class7770.field31776), class5754.method17082(), class5755.method26815());
    }
    
    public static Class4233 method12731() {
        return new Class4233(Class4614.method13740(Class7770.field31777), Class8172.field33663, Class9089.field38484);
    }
    
    public boolean method12732(final Class513 class513, final Entity class514, final Class7929 class515) {
        return this.field19042.method32836(class513, class515) && this.field19041.method27015(class513, class514);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("entity", this.field19041.method27019());
        jsonObject.add("killing_blow", this.field19042.method32840());
        return (JsonElement)jsonObject;
    }
}
