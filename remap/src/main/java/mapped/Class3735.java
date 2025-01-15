// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3735 extends Class3703
{
    private long[] field17132;
    private long[] field17133;
    private double[] field17134;
    
    public Class3735() {
        super("Edit List Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (int)class9131.method33137(4);
        final int n2 = (this.field17026 != 1) ? 4 : 8;
        this.field17132 = new long[n];
        this.field17133 = new long[n];
        this.field17134 = new double[n];
        for (int i = 0; i < n; ++i) {
            this.field17132[i] = class9131.method33137(n2);
            this.field17133[i] = class9131.method33137(n2);
            this.field17134[i] = class9131.method33143(16, 16);
        }
    }
    
    public long[] method11487() {
        return this.field17132;
    }
    
    public long[] method11488() {
        return this.field17133;
    }
    
    public double[] method11489() {
        return this.field17134;
    }
}
