// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import net.minecraft.util.math.Vec3d;

public class Class4221 extends Class4211
{
    private final Class8817 field19017;
    private final Class8685 field19018;
    
    public Class4221(final Class8817 field19017, final Class8685 field19018) {
        super(Class4634.method13825());
        this.field19017 = field19017;
        this.field19018 = field19018;
    }
    
    public static Class4221 method12703(final Class8817 class8817) {
        return new Class4221(class8817, Class8685.field36500);
    }
    
    public boolean method12704(final Class513 class513, final Vec3d class514, final int n) {
        return this.field19017.method30757(class514.x, class514.y, class514.z, class513.getPosX(), class513.getPosY(), class513.getPosZ()) && this.field19018.method29755(n);
    }
    
    @Override
    public JsonElement method12682() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("distance", this.field19017.method30759());
        jsonObject.add("duration", this.field19018.method29745());
        return (JsonElement)jsonObject;
    }
}
