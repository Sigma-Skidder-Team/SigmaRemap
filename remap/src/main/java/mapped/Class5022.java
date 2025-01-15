// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import java.util.Random;

public final class Class5022 implements Class5020
{
    public static final Class1932 field21530;
    
    private Class5022() {
    }
    
    @Override
    public int method15235(final Random random, final int n, final int n2) {
        if (n2 <= 0) {
            return n;
        }
        int n3 = random.nextInt(n2 + 2) - 1;
        if (n3 < 0) {
            n3 = 0;
        }
        return n * (n3 + 1);
    }
    
    @Override
    public void method15236(final JsonObject jsonObject, final JsonSerializationContext jsonSerializationContext) {
    }
    
    public static Class5020 method15240(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class5022();
    }
    
    @Override
    public Class1932 method15238() {
        return Class5022.field21530;
    }
    
    static {
        field21530 = new Class1932("ore_drops");
    }
}
