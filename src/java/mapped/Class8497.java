// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonObject;

public class Class8497 implements Class8496
{
    private static String[] field34886;
    private short[] field34887;
    
    private Class8497(final JsonObject jsonObject, final JsonObject jsonObject2) {
        Arrays.fill(this.field34887 = new short[4084], (short)(-1));
        Class9526.method35569(this.field34887, jsonObject, jsonObject2);
        if (Class8563.method28792().method23303()) {
            this.field34887[1248] = 3416;
        }
        if (Class8563.method28792().method23304()) {
            this.field34887[1552] = 1;
            this.field34887[1553] = 14;
            this.field34887[1554] = 3983;
            this.field34887[1555] = 3984;
            this.field34887[1556] = 3985;
            this.field34887[1557] = 3986;
        }
    }
    
    @Override
    public int method28390(final int n) {
        return (n >= 0 && n < this.field34887.length) ? this.field34887[n] : -1;
    }
}
