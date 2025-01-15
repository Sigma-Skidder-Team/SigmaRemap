// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3714 extends Class3703
{
    private int field17063;
    private int field17064;
    private int field17065;
    private int field17066;
    private int field17067;
    private int field17068;
    private int field17069;
    private String field17070;
    private int[] field17071;
    private long[] field17072;
    
    public Class3714() {
        super("File Partition Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17063 = (int)class9131.method33137(2);
        this.field17064 = (int)class9131.method33137(2);
        class9131.method33144(1L);
        this.field17065 = class9131.method33135();
        this.field17066 = (int)class9131.method33137(2);
        this.field17067 = (int)class9131.method33137(2);
        this.field17068 = (int)class9131.method33137(2);
        this.field17069 = (int)class9131.method33137(2);
        this.field17070 = new String(Class6901.method21247(class9131.method33142((int)this.method11491(class9131), 0)));
        final int n = (int)class9131.method33137(2);
        this.field17071 = new int[n];
        this.field17072 = new long[n];
        for (int i = 0; i < n; ++i) {
            this.field17071[i] = (int)class9131.method33137(2);
            this.field17072[i] = (int)class9131.method33137(4);
        }
    }
    
    public int method11418() {
        return this.field17063;
    }
    
    public int method11419() {
        return this.field17064;
    }
    
    public int method11420() {
        return this.field17065;
    }
    
    public int method11421() {
        return this.field17066;
    }
    
    public int method11422() {
        return this.field17067;
    }
    
    public int method11423() {
        return this.field17068;
    }
    
    public int method11424() {
        return this.field17069;
    }
    
    public String method11425() {
        return this.field17070;
    }
    
    public int[] method11426() {
        return this.field17071;
    }
    
    public long[] method11427() {
        return this.field17072;
    }
}
