// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import java.util.Random;

public final class Class5019 implements Class5020
{
    public static final Class1932 field21525;
    private final int field21526;
    
    public Class5019(final int field21526) {
        this.field21526 = field21526;
    }
    
    @Override
    public int method15235(final Random random, final int n, final int n2) {
        return n + random.nextInt(this.field21526 * n2 + 1);
    }
    
    @Override
    public void method15236(final JsonObject jsonObject, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("bonusMultiplier", (Number)this.field21526);
    }
    
    public static Class5020 method15237(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class5019(Class9583.method35909(jsonObject, "bonusMultiplier"));
    }
    
    @Override
    public Class1932 method15238() {
        return Class5019.field21525;
    }
    
    static {
        field21525 = new Class1932("uniform_bonus_count");
    }
}
