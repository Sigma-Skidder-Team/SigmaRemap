// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3797 extends Class3703
{
    private long[] field17297;
    private long[][] field17298;
    private int[][] field17299;
    private boolean[][] field17300;
    
    public Class3797() {
        super("Sub Sample Information Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (this.field17026 != 1) ? 2 : 4;
        final int n2 = (int)class9131.method33137(4);
        this.field17297 = new long[n2];
        this.field17298 = new long[n2][];
        this.field17299 = new int[n2][];
        this.field17300 = new boolean[n2][];
        for (int i = 0; i < n2; ++i) {
            this.field17297[i] = class9131.method33137(4);
            final int n3 = (int)class9131.method33137(2);
            this.field17298[i] = new long[n3];
            this.field17299[i] = new int[n3];
            this.field17300[i] = new boolean[n3];
            for (int j = 0; j < n3; ++j) {
                this.field17298[i][j] = class9131.method33137(n);
                this.field17299[i][j] = class9131.method33135();
                this.field17300[i][j] = ((class9131.method33135() & 0x1) == 0x1);
                class9131.method33144(4L);
            }
        }
    }
    
    public long[] method11634() {
        return this.field17297;
    }
    
    public long[][] method11635() {
        return this.field17298;
    }
    
    public int[][] method11636() {
        return this.field17299;
    }
    
    public boolean[][] method11637() {
        return this.field17300;
    }
}
