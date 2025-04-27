// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonArray;

public class Class6308 implements Class6307
{
    private static String[] field25220;
    private final short[] field25221;
    
    public Class6308(final JsonArray jsonArray, final JsonArray jsonArray2, final boolean b) {
        Arrays.fill(this.field25221 = new short[jsonArray.size()], (short)(-1));
        Class7504.method23412(this.field25221, jsonArray, jsonArray2, b);
    }
    
    public Class6308(final JsonArray jsonArray, final JsonArray jsonArray2) {
        this(jsonArray, jsonArray2, true);
    }
    
    @Override
    public int method18670(final int n) {
        return (n >= 0 && n < this.field25221.length) ? this.field25221[n] : -1;
    }
}
