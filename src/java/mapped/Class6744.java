// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonObject;

public class Class6744 implements Class6745
{
    private static String[] field26537;
    private short[] field26538;
    
    public Class6744(final JsonObject jsonObject, final JsonObject jsonObject2) {
        Arrays.fill(this.field26538 = new short[jsonObject.entrySet().size()], (short)(-1));
        Class7504.method23413(this.field26538, jsonObject, jsonObject2);
    }
    
    @Override
    public int method20533(final int n) {
        return (n >= 0 && n < this.field26538.length) ? this.field26538[n] : -1;
    }
}
