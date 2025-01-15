// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import java.util.Random;

public final class Class5021 implements Class5020
{
    public static final Class1932 field21527;
    private final int field21528;
    private final float field21529;
    
    public Class5021(final int field21528, final float field21529) {
        this.field21528 = field21528;
        this.field21529 = field21529;
    }
    
    @Override
    public int method15235(final Random random, int n, final int n2) {
        for (int i = 0; i < n2 + this.field21528; ++i) {
            if (random.nextFloat() < this.field21529) {
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public void method15236(final JsonObject jsonObject, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("extra", (Number)this.field21528);
        jsonObject.addProperty("probability", (Number)this.field21529);
    }
    
    public static Class5020 method15239(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class5021(Class9583.method35909(jsonObject, "extra"), Class9583.method35903(jsonObject, "probability"));
    }
    
    @Override
    public Class1932 method15238() {
        return Class5021.field21527;
    }
    
    static {
        field21527 = new Class1932("binomial_with_bonus_count");
    }
}
