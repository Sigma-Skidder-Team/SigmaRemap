// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonObject;

public class Class5834 implements Class5833
{
    private static String[] field23920;
    private final byte[] field23921;
    
    private Class5834(final JsonObject jsonObject, final JsonObject jsonObject2) {
        Arrays.fill(this.field23921 = new byte[72], (byte)(-1));
        Class9526.method35571(this.field23921, jsonObject, jsonObject2);
    }
    
    @Override
    public int method17536(final int n) {
        return (n >= 0 && n < this.field23921.length) ? this.field23921[n] : -1;
    }
}
