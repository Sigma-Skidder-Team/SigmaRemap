// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class4218 extends Class4211
{
    private final Class8172 field19013;
    private final Class8172 field19014;
    private final Class8172 field19015;
    
    public Class4218(final Class8172 field19013, final Class8172 field19014, final Class8172 field19015) {
        super(Class4630.method13806());
        this.field19013 = field19013;
        this.field19014 = field19014;
        this.field19015 = field19015;
    }
    
    public static Class4218 method12699() {
        return new Class4218(Class8172.field33663, Class8172.field33663, Class8172.field33663);
    }
    
    public static Class4218 method12700(final Class5754 class5754) {
        return new Class4218(class5754.method17082(), Class8172.field33663, Class8172.field33663);
    }
    
    public boolean method12701(final Class513 class513, final Class789 class514, final Class789 class515, final Class788 class516) {
        return this.field19015.method27015(class513, class516) && ((this.field19013.method27015(class513, class514) && this.field19014.method27015(class513, class515)) || (this.field19013.method27015(class513, class515) && this.field19014.method27015(class513, class514)));
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("parent", this.field19013.method27019());
        jsonObject.add("partner", this.field19014.method27019());
        jsonObject.add("child", this.field19015.method27019());
        return jsonObject;
    }
}
