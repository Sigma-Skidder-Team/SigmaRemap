// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonArray;

public class Class8745 implements Class8746
{
    private static String[] field36728;
    private final short[] field36729;
    
    private Class8745(final JsonArray jsonArray, final JsonArray jsonArray2) {
        Arrays.fill(this.field36729 = new short[662], (short)(-1));
        Class9526.method35570(this.field36729, jsonArray, jsonArray2);
    }
    
    @Override
    public int method30238(final int n) {
        return (n >= 0 && n < this.field36729.length) ? this.field36729[n] : -1;
    }
}
