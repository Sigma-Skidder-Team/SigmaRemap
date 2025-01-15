// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3790 extends Class3703
{
    private int[] field17285;
    private int[] field17286;
    private long[] field17287;
    private long[][] field17288;
    private long[][] field17289;
    
    public Class3790() {
        super("Item Location Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final long method33137 = class9131.method33137(2);
        final int n = (int)(method33137 >> 12) & 0xF;
        final int n2 = (int)(method33137 >> 8) & 0xF;
        final int n3 = (int)(method33137 >> 4) & 0xF;
        final int n4 = (int)class9131.method33137(2);
        this.field17286 = new int[n4];
        this.field17287 = new long[n4];
        this.field17288 = new long[n4][];
        this.field17289 = new long[n4][];
        for (int i = 0; i < n4; ++i) {
            this.field17285[i] = (int)class9131.method33137(2);
            this.field17286[i] = (int)class9131.method33137(2);
            this.field17287[i] = class9131.method33137(n3);
            final int n5 = (int)class9131.method33137(2);
            this.field17288[i] = new long[n5];
            this.field17289[i] = new long[n5];
            for (int j = 0; j < n5; ++j) {
                this.field17288[i][j] = class9131.method33137(n);
                this.field17289[i][j] = class9131.method33137(n2);
            }
        }
    }
    
    public int[] method11622() {
        return this.field17285;
    }
    
    public int[] method11623() {
        return this.field17286;
    }
    
    public long[] method11624() {
        return this.field17287;
    }
    
    public long[][] method11625() {
        return this.field17288;
    }
    
    public long[][] method11626() {
        return this.field17289;
    }
}
